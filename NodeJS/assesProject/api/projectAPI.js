const server = require('express').Router();
const projectClass = require('../service/projectServices').projectClass;
const projectObj = new projectClass();

server.get('/',(req,res)=>{
    res.setHeader('content-type','application/json');
    res.end(JSON.stringify({
        projects: projectObj.getProject()
    }))
})

server.post('/add',(req,res)=>{
    res.setHeader('content-type','application/json');
    res.end(JSON.stringify({
        projectsUpdated: projectObj.addProject(req.body)
    }))

})
server.post('/update',(req,res)=>{
    res.setHeader('content-type','application/json');
    res.end(JSON.stringify({
        projectsUpdated: projectObj.update(req.body)
    }))
})

module.exports.projectDetail = server