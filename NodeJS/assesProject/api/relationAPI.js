const server = require('express').Router();
const projectClass = require('../service/projectServices').projectClass;
const userClass = require('../service/userService').userClass;
const relationClass = require('../service/relationService').relationClass;
const userObj = new userClass();
const projectObj = new projectClass();
const relationObj = new relationClass()
const parser = require('body-parser');
server.use(parser.json())

server.get('/',(req,res)=>{
    res.setHeader('content-type','application/json');
    res.end(JSON.stringify({
        relation: relationObj.getRelation()
    }))
})

server.post('/add',(req,res)=>{
    res.setHeader('content-type','application/json');
    console.log(req.body);
    const foundProject = projectObj.search(req.body.pId);
    const foundUser = userObj.search(req.body.uId) 
    relationObj.setRelation(foundUser.id,foundProject.id)
    console.log(relationObj)
    res.end(JSON.stringify({
        Relation: relationObj.getRelation()
    }))

})
module.exports.relationDetail = server;
