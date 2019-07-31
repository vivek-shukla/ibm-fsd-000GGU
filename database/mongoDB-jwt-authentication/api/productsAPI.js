const server = require('express').Router()

server.get('/',(req,res)=>{
    res.json({
        message: "Product API is running"
    })
})

server.get('/add',(req,res)=>{
    res.json({
        message: "Product API Add is running"
    })
})

server.get('/get',(req,res)=>{
    res.json({
        message: "Product Get is running"
    })
})


module.exports.productRoute = server