const classEmail = require('../service/emailService').classEmail
const eObj = new classEmail()
class userService { 

    getUserDetail(name,email,address,summary) {
        this.name = name,
        this.email = email,
        this.address = address,
        this.cartSummary = summary
    } 
    fetchUser()
    {
        this.userObj = {
            name: this.name,
            email: this.email,
            address: this.address,
            cartSummary: this.cartSummary
        } 
      this.sendMailToUser(this.userObj)
      return this.userObj
    }
    sendMailToUser (user) { 
        const emailObj = {
            from: null,
            to: user.email,
            subject: 'Successful Item Booking',
            body: `<div> Hello ${user.name}</div>
                   <p>You've Succsessfullt added item to Dummy Cart </p>
                   <div> Billing Adress: ${user.address} </div>
                   <div> Billing Details: ${user.cartSummary} </div>`
        }
    eObj.email(emailObj)
    }  
}

module.exports.userClass = userService