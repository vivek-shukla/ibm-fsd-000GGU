const server = require('express').Router()
const userClass = require('../service/userService').userClass
const userObj = new userClass()
server.post('/',(req,res)=>{  
      userObj.getCredentialandMail(req.body.name,req.body.email,(errorCred,responseCred)=>{
          if(errorCred)
          {
              res.status(200).json({
                message: "Couldn't save details"
            })
          }
          else
          {
            res.status(200).json({
                message: "Save details to database"
            })
          }
      })
     
})

server.post('/verifyAPI',(req,res)=>{
    userObj.verifyUser(req.body,(errorVerify,responseVerify)=>{
        if(errorVerify)
        {
            res.status(200).json({
                message: "Error in verification of otp"
            })
        }
        else
        {
            if(responseVerify.length>0)
            {
                if(responseVerify[0].password!=null && responseVerify[0].password!=undefined ) 
                {
                    res.status(200).json({
                        message: "User Already Exist"
                    })
                }
                else
                {  
                    const d = new Date()
                    if(responseVerify[0].validity < d.getTime()) 
                   {   
                            res.status(200).json({
                                message: "Otp timeout"
                            })
                        }
                    //  res.status(200).json({
                    // message: "Otp timeout"
                   else 
                   {  
                       res.status(200).json({
                           message: "show password",
                           email:req.body.email
                       })
                   }

                }
            }
            else
            {
                res.status(200).json({
                    message:"Invalid Credential"
                })
            }
        }
    })
})
server.post('/createPassword',(req,res)=>{
    userObj.createPassword(req.body,(errorCreate,responseCreate)=>{
        if(req.body.password != req.body.confirmPassword)
        {
            res.status(200).json({
                message: "password didn't match"
            })
        }
        else if(errorCreate)
        { 
            res.status(200).json({
                message: "Couldn't create new password"
            })
        }
        else { 
            const d = new Date()
             if(responseCreate.length>0)
             {
                if(responseCreate[0].validity < d.getTime()) 
                   {   
                            res.status(200).json({
                                message: "Otp timeout"
                            })
                        }
                    //  res.status(200).json({
                    // message: "Otp timeout"
                   else 
                   {

                    userObj.saveUser(req.body,(err0rSave,responseSave)=>{
                        if(err0rSave)
                        {
                            res.status(200).json({
                                message: "Can't save details"
                            })
                        }
                        else {
                        res.status(200).json({
                            message: "Otp validated"
                        })
                        }
                        
                }) 
               } 
            } 
            else {
                res.status(200).json({
                    message: "User Can't find"
                })
            } 
             }
    })
})

module.exports.userRoute = server