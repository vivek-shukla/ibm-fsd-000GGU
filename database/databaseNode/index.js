const express = require('express')
const server = express()
const parser = require('body-parser')
const cors = require('cors')
const userRoute = require('./api/userAPI').userRoute

server.use(parser.json())
server.use(cors())
server.use('/user',userRoute)
server.get('/',(req,res)=>{
    res.status(200).json({
        message: "server is running "
    })
})

server.listen(1140, ()=>{
    console.log("server is running at 1140")
})