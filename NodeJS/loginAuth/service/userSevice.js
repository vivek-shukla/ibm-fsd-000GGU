const userDatabase = require('../database/userDatabase').userDatabase
const jwt = require('jsonwebtoken')
class userService {
    constructor() {
        this.userDatabase = userDatabase
    }
    getUser()
    {
        return this.userDatabase
    }
    isValid(user)
    {
      return this.userDatabase.find(u=>{
           return u.username == user.username && u.pass == u.pass
        })
    }
    generateToken(user) 
    {  
        var isUser = this.isValid(user)
        if(isUser) {
            var token = jwt.sign({
                USER:user.username
            },"IaMgeNerATinsSEcreTKeY",{
                expiresIn: "7200ms"
            })
            return {token}
        }
        else {
            return {message:"Invalid Credential"}
        }
    }
    vaildateUser(token)
    {
        let validatedUser = false;
        try {
         validatedUser = jwt.verify(token,"IaMgeNerATinsSEcreTKeY")
        }catch(err) {
            console.error('Message: ',err)
        }
        return validatedUser
    }
} 

module.exports.userClass = userService