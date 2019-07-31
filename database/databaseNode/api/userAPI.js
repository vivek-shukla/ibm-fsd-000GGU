const server = require('express').Router()
const userClass = require('../services/userService').userClass
const userObj = new userClass()

server.get('/',(req,res)=>{
    userObj.fetchUser((user)=>{
        res.status(200).json({
            Users: user
        })
    })
})

server.post('/add',(req,res)=>{
    userObj.addUser(req.body,(err,Response)=>{
        if(!err)
        {
            res.status(200).json({
                message: Response
            })
        }
        else
        {
            res.status(200).json({
                message: err
            })
        }
    })
})


server.post('/update',(req,res)=>{
    userObj.updateUser(req.body,(err,Response)=>{
        if(!err)
        {
            res.status(200).json({
                message: Response
            })
        }
        else
        {
            res.status(200).json({
                message: err
            })
        }
    })
})

server.post('/delete',(req,res)=>{
    userObj.deleteUser(req.body,(err,Response)=>{
        if(!err)
        {
            res.status(200).json({
                message: Response
            })
        }
        else
        {
            res.status(200).json({
                message: err
            })
        }
    })
})


module.exports.userRoute = server