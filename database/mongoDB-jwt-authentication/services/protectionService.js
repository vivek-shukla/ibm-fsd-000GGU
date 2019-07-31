const userClass = require('./userService').userClass
const userObj = new userClass()

function validate(req,res,next) 
{
    let token = req.headers.token
    if(!token)
    {
        res.redirect('/unauth')
    }
    else
    {
        let isValid = userObj.validateToken(token) 
        let path =  req.baseUrl + req.path
        console.log(isValid.access)
        console.log(path)
        if(isValid.access == path)
        {   console.log("protected path")
            next();
        }
        else 
        {
            res.redirect('/unauth')
        }
    }
}

module.exports.validate = validate
