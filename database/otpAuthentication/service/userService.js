const mongoClient = require('mongodb')
const otpGenerator = require('otp-generator')
const classEmail = require('./emailService').classEmail
const eObj = new classEmail() 
const d = new Date()
class userClass {
    getCredentialandMail(name,email,callback) {
        this.name = name;
        this.email = email;
        this.otp = otpGenerator.generate(6, { upperCase: false, specialChars: false, digits: true });
        this.validity = d.getTime()+600000;
        this.userObj = {
            name: this.name,
            email:this.email,
            otp: this.otp,
            validity: this.validity
        }
        this.sendMailToUser(this.userObj) 
        mongoClient.connect('mongodb://localhost:27017',(err,connectionObj)=>{
            connectionObj.db('otpDatabase').collection('user').insert(this.userObj,(error,response)=>{
                callback(error,response)
            })
        })
    }
    sendMailToUser (user) { 
        const emailObj = {
            from: null,
            to: user.email,
            subject: 'Successful First Time Login',
            body: `<div> Hello ${user.name}</div>
                   <p>You've login at our website </p>
                   <div> Enter this otp to generate password <h4> ${user.otp} </h4> </div>
                   <div> Note: It is valid for 15 minutes </div>`
        }
    eObj.email(emailObj)
    }
    createPassword(passCredential,callback)
    {
        mongoClient.connect('mongodb://localhost:27017',(err,connectionObj)=>{
            connectionObj.db('otpDatabase').collection('user').find({otp: passCredential.otp}).toArray((error,response)=>{
                callback(error,response)
            })
        })
    }

    saveUser(passCredential,callback) 
    {  
        mongoClient.connect('mongodb://localhost:27017',(err,connectionObj)=>{
            connectionObj.db('otpDatabase').collection('user').update({otp: passCredential.otp},{$set:{password:passCredential.password}},(error,response)=>{
                callback(error,response)
            })
        })

    } 
//     removeUser(passotp,callback) 
//     {
//         mongoClient.connect('mongodb://localhost:27017',(err,connectionObj)=>{
//             connectionObj.db('otpDatabase').collection('user').deleteOne({otp: passotp},(error,response)=>{
//                 callback(error,response)
//             })
//     })
//   }


}

module.exports.userClass = userClass