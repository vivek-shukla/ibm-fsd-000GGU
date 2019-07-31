const userClass = require('../services/userService').userClass
const userObj = new userClass()
const server = require('express').Router()

server.get('/',(req,res)=>{
    userObj.getAllUser((error,response)=>{
        if(error)
        {
            res.status(200).json({
                response: error
            })
        }
        else {
            res.status(200).json({
                response: response
            })
        }
    })
})

server.post('/add',(req,res)=>{
    userObj.addUser(req.body,(error,response)=>{
        if(error)
        {
            res.status(200).json({
                response: error
            })
        }
        else {
            res.status(200).json({
                response: response
            })
        }
    })
})

server.post('/token',(req,res)=>{
    userObj.findUser(req.body,(error,response)=>{
        if(error)
        {
            res.status(200).json({
                response: "Enter Valid Credential"
            })
        }
        else
        {
            if(response)
            {   let token = userObj.generateToken(req.body)
                // let id = userObj.findIdByEmail(req.body.email)
                userObj.findIdByEmail(req.body.email,(errFind,resFind)=>{
                    let id = resFind[0]._id
                    // console.log(resFind[0]._id) 
                    let tokenObj = {
                        _id: id,
                        email: req.body.email,
                        token: token
                    } 
                    userObj.saveTokenToDatabase(tokenObj,(errSave,resSave)=>{
                        if(errSave) {
                            console.log("sorry couldn't save user to Database ")
                        }
                        else{
                            // console.log("Saved user detail ")
                        }
                    })
    
                    res.status(200).json({
                        message: "Token is generated",
                        _token: token,
                        _tokenObj: tokenObj
                    })
                })
    
            }
            else
            {
                res.status(200).json({
                    response: "Given Credential didn't match"
                })
            }
        }
    })
})

server.post('/validate',(req,res)=>{
   let isValid = userObj.validateToken(req.headers.token) 
   if(isValid) {
       res.status(200).json({
           message: "Token is validate"
       })
   }
   else
   {  res.status(200).json({
            message: "Invalid Token"
        })

   }
}) 
module.exports.userRouter = server
