const express = require('express')
const server = new express()
const parser = require('body-parser')
const cors = require('cors')
const productRoute = require('./api/productAPI').productRoute
const cartRoute = require('./api/cartAPI').cartRoute
const userRoute = require('./api/userAPI').userRoute
server.use(parser.json())
server.use(cors())

server.get('/',(req,res)=>{
    res.status(200).json({
        message: "Hello There \n You're inside base URL"
    })
})

server.use('/product',productRoute)
server.use('/cart',cartRoute)
server.use('/user',userRoute)

server.listen(1220,()=>{
    console.log("Server is Running ")
})

