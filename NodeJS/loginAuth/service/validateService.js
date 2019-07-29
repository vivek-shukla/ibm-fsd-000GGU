const userClass = require('./userSevice').userClass
const userObj = new userClass()


function vaildation(req,res,next) {
    const token  = req.headers.token
    const validateUser = userObj.vaildateUser(token)
    if(validateUser)
    {   
        // alert('validated successfully')
        next();
    }
    else 
    {
        res.redirect('/unauth')
    }
}

module.exports.validation = vaildation 


