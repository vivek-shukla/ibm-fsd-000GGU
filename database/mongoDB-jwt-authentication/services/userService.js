const mongoClient = require('mongodb').MongoClient
const bcrypt = require('bcrypt') 
const jwt = require('jsonwebtoken')


class userClass {
    getAllUser(callback)
    {
        mongoClient.connect('mongodb://localhost:27017',(err,connectionObj)=>{
            connectionObj.db('jwtDatabase').collection('user').find().toArray((error,response)=>{
                callback(error,response)
            })
        })
    }
    addUser(user,callback) 
    {   
        user.password = bcrypt.hashSync(user.password,12)
        mongoClient.connect('mongodb://localhost:27017',(err,connectionObj)=>{
            connectionObj.db('jwtDatabase').collection('user').insert(user,(error,response)=>{
                callback(error,response)
            })
        })
    }
    findUser(user,callback)
    {    
        mongoClient.connect('mongodb://localhost:27017',(err,connectionObj)=>{
            connectionObj.db('jwtDatabase').collection('user').find({email: user.email},(error,response)=>{
                callback(error,response)
            })
        })

    }
    generateToken(user)
    {
        let token = jwt.sign({email: user.email, access: user.access },"ThisIsASecretKey",{
            expiresIn: "12000000ms"
        })
        return token
    }
    validateToken(token)
    {
        let validUser=false
        try 
        {
             if(jwt.verify(token,"ThisIsASecretKey"))
             {
                 validUser = jwt.verify(token,"ThisIsASecretKey")
             }
        }
        catch(error)
        {
            console.log("message: ",error)
        }
        return validUser
    }
    saveTokenToDatabase(tokenObj,callback) { 
       
        mongoClient.connect('mongodb://localhost:27017',{ useNewUrlParser: true } ,(err,connectionObj)=>{
            let id = tokenObj._id
            // delete tokenObj._id
            connectionObj.db('jwtDatabase').collection('tokenCollection').update({_id:id},{$set: tokenObj},{upsert: true},(error,response)=>{
                callback(error,response)
            })
        })

    }
    findIdByEmail(_email,callback)
    {
        mongoClient.connect('mongodb://localhost:27017',(err,connectionObj)=>{
            connectionObj.db('jwtDatabase').collection('user').find({email:_email}).toArray((error,response)=>{
                callback(error,response)
            })
        })
    }
    findToken(tokenObj,callback) {

    }
}

module.exports.userClass = userClass