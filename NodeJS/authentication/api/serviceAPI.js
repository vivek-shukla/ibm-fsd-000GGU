const server = require('express').Router()
const serviceClass = require('../services/userService').Service
const serviceObj = new serviceClass()

server.get('/',(req,res)=>{
    res.status(200).json({
        Users: serviceObj.getAllUser()
    })
})
server.post('/add',(req,res)=>{
    console.log(req.body)
    serviceObj.register(req.body)
    res.status(200).json({
        message: req.body
    })
})

server.post('/token',(req,res)=>{
     let token = serviceObj.generateToken(req.body)
     res.status(200).json({
         token: token
     })
})

module.exports.serviceRoute = server;