const express = require('express')
const server = new express()
const serviceRoute = require('./api/serviceAPI').serviceRoute
const empRoute = require('./api/employeeAPI').empRoutes
const validate = require('./services/securityService').validate
const parser = require('body-parser') 
server.use(parser.json())
server.get('/',(req,res)=>{
    res.status(200).json({
        message: "server is running "
    })
}) 
server.use('/employee',(rq,rs,next)=>{
    validate(rq,rs,next);
});

server.use('/user',serviceRoute)
server.use('/employee',empRoute)

server.listen(1269,()=>{

    console.log(`Server Started at 1269`);

})