const express = require('express')
const server = new express()
const parser = require('body-parser')
const cors = require("cors")
const userRoute = require('./api/userAPI').userRoute
const validation = require('./service/validateService').validation
server.use(parser.json())
server.use(cors())

server.get('/',(req,res)=>{
    res.status(200).json({
        message: "Server is running lol"
    })
})

server.use('/register',(req,res,next)=>{ 
    validation(req,res,next)
})

server.get('/register',(req,res)=>{
    res.status(200).json({
        message: "Token is validated"
    })
})
server.get('/unauth',(req,res)=>{
    res.status(200).json({
        err: "Your session time out "
    })
})

server.use('/user',userRoute)

server.listen(1269,()=>{
    console.log("Server is running at faltu post ")
})
