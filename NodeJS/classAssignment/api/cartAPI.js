const server = require('express').Router()
const cartClass = require('../service/cartService').cartClass
const cartObj = new cartClass()

server.get('/',(req,res)=>{
    res.status(200).json({
        cartItems: cartObj.getCart()
    })
    console.log("cart is running lol")
})

server.post('/addItem',(req,res)=>{
    res.status(200).json({
        cartItems: cartObj.addToCart(req.body)
    })
    console.log("Cart is ruuning inside add ")
})


module.exports.cartRoute = server
