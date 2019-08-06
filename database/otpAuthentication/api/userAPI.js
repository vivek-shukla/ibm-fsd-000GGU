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
                    userObj.removeUser(responseCreate[0].otp,(errorRemove,responseRemove)=>{
                        if(errorRemove)
                        {
                            res.status(200).json({
                                message: "could't remove existing otp"
                            })
                        }
                        else
                        {
                            res.status(200).json({
                                message: "Otp timeout"
                            })
                        }
                    })
                    //  res.status(200).json({
                    // message: "Otp timeout"
                  }
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
    })
})

module.exports.userRoute = server