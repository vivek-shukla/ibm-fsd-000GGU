const mongoClient = require('mongodb').MongoClient
const dbDetails = require('../utills/utils').dbDetails 

class userClass {
    fetchUser(callback) { 
        mongoClient.connect(dbDetails.mongo.url,(err,connectionObj)=>{
            connectionObj.db(dbDetails.mongo.db).collection('users').find().toArray((err,users)=>{
                if(!err) {
                    console.log(users)
                    callback(users)
                }
            })
        })
    }
    addUser(user,callback) {
        mongoClient.connect(dbDetails.mongo.url,(err,connectionObj)=>{
            connectionObj.db(dbDetails.mongo.db).collection('users').insert(user,(error,result)=>{
                { 
               console.log(connectionObj.db(dbDetails.mongo.db).collection('users').find().toArray()) 
                callback(result)
            }
        })
    } )
}
    updateUser(user,callback)
    {
        mongoClient.connect(dbDetails.mongo.url,(err,connectionObj)=>{
            connectionObj.db(dbDetails.mongo.db).collection('users').findOneAndUpdate({name:user.name},{$set:user },(error,result)=>{
                callback(error,result)
            })
        })
    }
    deleteUser(user,callback)
    {
        mongoClient.connect(dbDetails.mongo.url,(err,connectionObj)=>{
            connectionObj.db(dbDetails.mongo.db).collection('users').deleteOne({name:user.name},(error,result)=>{
                callback(error,result)
            })
        })
    }
}



module.exports = {
    userClass
}