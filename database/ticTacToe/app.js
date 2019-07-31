const express = require('express')
const server = express()
const parser = require('body-parser')
const cors = require('cors')
const gameRoute = require('./api/gameAPI').gameRoute
server.use(parser.json())
server.use(cors())
server.get('/',(req,res)=>{
    res.status(200).json({
        message: "server is running hurray!"
    })
})

server.use('/game',gameRoute)

server.listen(1140,()=>{
    console.log("server is running at 1140")
})