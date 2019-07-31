const server = require('express').Router()
const ticTacClass = require('../service/tictcaService').ticTacClass
const ticTacObj = new ticTacClass()

server.get('/',(req,res)=>{
    ticTacObj.getState((state)=>{
        res.status(200).json({
            message: "Inside Tic Tac Toe",
            State: state
        })
    })
})

server.post('/save',(req,res)=>{
    ticTacObj.saveState(req.body,(err,Response)=>{
        if(!err)
        {
            res.status(200).json({
                message: Response
            })
        }
        else
        {
            res.status(200).json({
                message: err
            })
        }
    })
})

module.exports.gameRoute = server
