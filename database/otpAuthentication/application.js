const express = require('express')
const server = new express()
const parser = require('body-parser')
const cors = require('cors')
const userRoute = require('./api/userAPI').userRoute
server.use(parser.json())
server.use(cors())

server.get('/',(req,res)=>{
    res.status(200).json({
        message: "Server is running now"
    })
})
server.use('/user',userRoute)

server.listen(4404,()=>{
    console.log("sever is running at 4404")
})
