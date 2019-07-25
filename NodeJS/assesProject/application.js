const express = require('express');
const server = express();
const parser = require('body-parser');
const cors = require('cors');
const userRoutes = require('./api/userAPI').userDetail;
const projectRoutes = require('./api/projectAPI').projectDetail;
const relationRoutes = require('./api/relationAPI').relationDetail;
// apply json parser
server.use(parser.json());
// apply cors
server.use(cors());
server.get('/status',(req,res)=>{
    res.end(JSON.stringify({
        message: "Hello there"
    }));

});
// add routes to server
server.use('/user',userRoutes);
server.use('/project',projectRoutes);
server.use('/relation',relationRoutes);
// PORT Binding
server.listen(1269,()=>{
    console.log('Server is running at 1269');

});