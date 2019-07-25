const userClass = require('../service/userSevice').userClass
const server = require('express').Router()
const parser = require('body-parser')
server.use(parser.json())
const userObj =  new userClass()

server.get('/',(req,res)=>{
    res.status(200).json({
        Users: userObj.getUser()
    })
})

server.post('/login',(req,res)=>{
    var validUser = userObj.isValid(req.body)
    var
    // if(validUser != null && validUser != undefined) 
    // {
    //     res.status(200).json({

    //     })
    // }
})
