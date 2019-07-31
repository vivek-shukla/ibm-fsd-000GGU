const express = require('express')
const server = express()
const parser = require('body-parser')
const cors = require('cors')
const userRouter = require('./api/userAPI').userRouter
const validate = require('./services/protectionService').validate
const productRoute = require('./api/productsAPI').productRoute

server.use(parser.json())
server.use(cors())

server.get('/',(req,res)=>{
    res.status(200).json({
        message: "Sever is running for dummy purpose"
    })
})
server.use('/product',(req,res,next)=>{
    validate(req,res,next)
})
server.use('/user',userRouter)

server.use('/product',productRoute)
server.get('/unauth',(req,res)=>{
    res.status(200).json({
        message: "unautherised"
    })
})

server.listen(4444,()=>{
    console.log("server is running at 4444")
})
