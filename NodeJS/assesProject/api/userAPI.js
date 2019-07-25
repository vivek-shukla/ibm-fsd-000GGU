const server = require('express').Router();
const userClass = require('../service/userService').userClass;
const userObj = new userClass();

server.get('/',(req,res)=>{
    res.setHeader('content-type','application/json');
    res.end(JSON.stringify({
        users: userObj.getUser()
    }))
})

server.post('/add',(req,res)=>{
    res.setHeader('content-type','application/json');
    res.end(JSON.stringify({
        usersUpdated: userObj.addUser(req.body)
    }))

})
server.post('/update',(req,res)=>{
    res.setHeader('content-type','application/json');
    res.end(JSON.stringify({
        usersUpdated: userObj.update(req.body)
    }))
})

server.get('/nextId',(req,res)=>{
    res.setHeader('content-type','application/json');
    res.end(JSON.stringify({
        nextId: userObj.nextId()
    }))
})

module.exports.userDetail = server