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
        res.status(200).json({
            response: userObj.generateToken(req.body) 
        })

    // if(validUser != null && validUser != undefined) 
    // {
    //     res.status(200).json({

    //     })
    // }
})

module.exports.userRoute = server
