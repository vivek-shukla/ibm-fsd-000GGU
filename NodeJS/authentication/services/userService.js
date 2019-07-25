const userDatabase = require('../database/userDatabse').userDatabase
const classEmail = require('../services/emailService').classEmail
const jwt = require('jsonwebtoken')
const eObj = new classEmail()

class Service {
    constructor() { 
        this.tokes = new Map()
        this.userDatabase = userDatabase;
    }
    getAllUser() {
        return this.userDatabase
    }
    register(user) {
        this.sendMailToUser(user)
        this.userDatabase.push(user)
    }
    sendMailToUser (user) { 
        const emailObj = {
            from: null,
            to: user.email,
            subject: 'Successful User Registration',
            body: `<div> Hello ${user.name}</div>
                   <p>You've Succsessfullt registered to Dummy Server </p>`
        }
    eObj.email(emailObj)
    }
    isUser(user) {
        return this.userDatabase.find(u=>{
            return u.id == user.id && u.pass == user.pass
        })
    }
    generateToken(user) {
        if(this.isUser(user)) {
            let token = jwt.sign({user: user.name, email: user.email},"ThisIsAkEYfORtOKEN")
            return {token}
        }
        else {
            return { message: " Invallid Credential"}
        }
    }
    validateToken(token) 
    {   let validatedUser = false;
        try {
         validatedUser = jwt.verify(token,"ThisIsAkEYfORtOKEN")
        }catch(err) {
            console.error('Message: ',err)
        }
        return validatedUser
    }
}

module.exports.Service = Service