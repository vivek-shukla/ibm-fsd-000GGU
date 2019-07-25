class Cart {
     constructor() {
         this.cart = []
     }
     getCart() {
         return this.cart
     }
     addToCart(item) { 
         let itemExist = this.serachInCart(item)
         if(itemExist != null && itemExist !== undefined)  
         {
             this.updateCart(item)
         }
         else {
            this.cart.push(item) 
         }
         // it was working fine
        //  this.cart.push(item) 
         return this.cart
     }
     serachInCart(itm) {
        return this.cart.find(item=>{
              return item.name == itm.name
         })
     }
     updateCart(itm) {
         var i = 0
         this.cart.forEach(item=>{
             if(item.name==itm.name)
             {
                 this.cart[i].quantity = this.cart[i].quantity+itm.quantity
                //  this.cart[i].basePrice = this.cart[i].basePrice+itm.basePrice
                 this.cart[i].totlPrice = this.cart[i].totlPrice+itm.totlPrice
             }
             i++ 
         })
     }
} 

module.exports.cartClass = Cart