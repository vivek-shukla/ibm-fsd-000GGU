const express = require('express');
const server = express();
const parser = require('body-parser');
server.use(parser.json());

server.get('/calculate/:op/:first/:second',(req,res)=>{ 
    console.log(req.params.op)
    switch(req.params.op) {
        case '+': {
            res.end(JSON.stringify({

                result : parseInt(req.params.first) + parseInt(req.params.second)
        
            }));

        }
        case '-': {
            res.end(JSON.stringify({

                result : parseInt(req.params.first) - parseInt(req.params.second)
        
            }));

        }
        case '*': {
            res.end(JSON.stringify({

                result : parseInt(req.params.first) * parseInt(req.params.second)
        
            }));

        }
        case '/': {
            res.end(JSON.stringify({

                result : parseInt(req.params.first) / parseInt(req.params.second)
        
            }));

        }
    }
    
})

server.post('/calculate',(req,res)=>{
    res.setHeader('content-type','application/json');
    switch(req.body.op) { 
        case '+': {
            res.end(JSON.stringify({

                result : parseInt(req.body.first) + parseInt(req.body.second)
        
            }));

        }
        case '-': {
            res.end(JSON.stringify({

                result : parseInt(req.body.first) - parseInt(req.body.second)
        
            }));

        }
        case '*': {
            res.end(JSON.stringify({

                result : parseInt(req.body.first) * parseInt(req.body.second)
        
            }));

        }
        case '/': {
            res.end(JSON.stringify({

                result : parseInt(req.body.first) / parseInt(req.body.second)
        
            }));

        }

    }

    
    // res.end(JSON.stringify({
    //     user :{
    //         name : req.body.name,
    //         email: req.body.email
    //     }
    // }));

});

const PORT = 1224;
server.listen(PORT,()=>{
    console.log(`Server Started at ${PORT}`);
});