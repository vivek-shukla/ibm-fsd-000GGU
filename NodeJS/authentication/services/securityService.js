const userClass = require('./userService').Service
const userObj = new userClass()
function validate(req,res,next) {
    let token = req.headers.token
    console.log(token)
    if(token) { 
        var isToken = userObj.validateToken(token) 
        if(isToken) {
            next();
        }
        else {
            res.end(
                {message: "unauthorised access"}
            ) 
        }
    }
    else 
    {   res.end(console.log("you missed a token lol"))      
    }
    

}
module.exports.validate = validate