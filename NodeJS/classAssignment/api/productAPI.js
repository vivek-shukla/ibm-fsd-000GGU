const server = require('express').Router()
const productClass = require('../service/productService').productClass
const productObj = new productClass()

server.get('/',(req,res)=>{
    res.status(200).json({
        Products: productObj.getAllProduct()
    })
})

server.post('/add',(req,res)=>{
    res.status(200).json({
        Products: productObj.addProduct(req.body)
    })
})

server.post('/search',(req,res)=>{
    const foundItem = productObj.searchProduct(req.body)
    if(foundItem !=null && foundItem !=undefined) 
    {
        res.status(200).json({
            Item: foundItem
        })
    }
})

server.post('/update',(req,res)=>{
    const updateProduct = productObj.updateProduct(req.body)
    res.status(200).json({
        Products: updateProduct
    })
})

module.exports.productRoute = server
