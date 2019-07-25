const nodemailer = require('nodemailer')
const utils = {
    smtp : {
        provider : 'gmail',
        address :  'ibmtechtraining007@gmail.com',
        password : 'India@786'
    }
}

class EmailService {
    constructor() { 
        this.smtpObj = {
            service: utils.smtp.provider,
            auth: {
                user: utils.smtp.address,
                pass: utils.smtp.password
            }
        }
        
        this.mailer = nodemailer.createTransport(this.smtpObj)
    }
    email(emailObj) { 
        if(emailObj.from == null ) {
            emailObj.from = utils.smtp.address
        } 
        console.log(this.mailer)
        this.mailer.sendMail({
            from: emailObj.from,
            to: emailObj.to,
            subject: emailObj.subject,
            html: emailObj.body
        },(err,response)=>{
            if(err){
               console.log(err);
                return "Unable to send email";
            }else{
                console.log('Email Sent');
                return "Email Sent Successfully";
            }
        })
        
    }
}

module.exports.classEmail = EmailService