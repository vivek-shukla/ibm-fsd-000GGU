const http = require('http');
const _url = require('url');
const userClass = require('./userClass').userDetail;
const userObj = new userClass();
const server = http.createServer((req,res)=>{
    res.setHeader('Access-Control-Allow-Origin', '*');
    const urlParameters = _url.parse(req.url,true);
    console.log(urlParameters)
    if(urlParameters.pathname== '/login') {
        res.setHeader('content-type','application/json')
        const uDetails = userObj.getUserDetail(urlParameters.query.user,urlParameters.query.pass)
        if(uDetails != undefined || uDetails != null){
            res.end(JSON.stringify(uDetails));
        }else{
            res.end(JSON.stringify({
                id: null,
                status : 'INVALID'
            }))
        }
    }
})

// create object for user service

// port
server.listen(5544,()=>{
    console.log(`Server Started at 5544`);
})
