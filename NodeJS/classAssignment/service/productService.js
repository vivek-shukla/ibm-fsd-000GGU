const productDatabase = require('../database/productDatabase').productDatabase

class Product {
    constructor() {
        this.productDatabase = productDatabase
    }
     getAllProduct() {
         return this.productDatabase
     }
     addProduct(product) {
         this.productDatabase.push(product)
         return this.productDatabase
     }
     searchProduct(product) {
         return this.productDatabase.find((p)=>{
             return p.name == product.name
         })
     }
     updateProduct(product) {
         var i =0
         this.productDatabase.forEach(prod=>{
             if(prod.name==product.name) {
                 this.productDatabase[i] = product
             }
             i++
         })
         this.productDatabase
     }

}

module.exports.productClass = Product