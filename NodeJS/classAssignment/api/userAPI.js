const userClass = require('../service/userService').userClass
const server = require('express').Router()
const userObj = new userClass()
server.post('/',(req,res)=>{
    userObj.getUserDetail(req.body.name,req.body.email,req.body.address,req.body.cartSummary)
    res.status(200).json({
        UsersDetail: userObj.fetchUser()
    })
})


module.exports.userRoute = server
