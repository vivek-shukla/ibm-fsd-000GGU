const express = require('express')
const server = new express()
const parser = require('body-parser')
server.use(parser.json())
const calculatorClass = require('./calculatorService').calculatorClass
const claculatorObj = new calculatorClass()

server.get('/',(req,res)=>{
    res.status(200).json({
        message: "Calculator is Running"
    })
})

server.post('/add',(req,res)=>{
    res.status(200).json({
        result: claculatorObj.add(req.body.i,req.body.j)
    })
})
server.post('/sub',(req,res)=>{
    res.status(200).json({
        result: claculatorObj.sub(req.body.i,req.body.j)
    })
})
server.post('/mul',(req,res)=>{
    res.status(200).json({
        result: claculatorObj.mul(req.body.i,req.body.j)
    })
})
server.post('/div',(req,res)=>{
    res.status(200).json({
        result: claculatorObj.div(req.body.i,req.body.j)
    })
})
server.post('/sqr',(req,res)=>{
    res.status(200).json({
        result: claculatorObj.sqr(req.body.i)
    })
})
server.post('/sqrt',(req,res)=>{
    res.status(200).json({
        result: claculatorObj.sqrt(req.body.i)
    })
})

server.listen(1220,()=>{
    console.log("server is running")
})

