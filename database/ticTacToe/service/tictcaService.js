const mongoClient = require('mongodb').MongoClient


class tictacService
{
    getState(callback)
    {   
        mongoClient.connect('mongodb://localhost:27017',(err,connectionObj)=>{
            connectionObj.db('ticTacDatabase').collection('gameState').find().toArray((error,state)=>{
                if(!error) {
                    callback(state)
                }
            })
        })
        
    }
    saveState(state,callback)
    {
        mongoClient.connect('mongodb://localhost:27017',(err,connectionObj)=>{
            const _id = state._id;
            delete state._id;
            connectionObj.db('ticTacDatabase').collection('gameState').update({_id:_id},{$set:state},{upsert: true},(error,result)=>{
                callback(error,result)
            })
        })
    }
}


module.exports.ticTacClass = tictacService

