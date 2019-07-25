const jwt = require('jsonwebtoken')
const user =
    {
        username: 'Vivek',
        pass: 'pass@123'
    }
var token = jwt.sign({username: 'Vivek',
pass: 'pass@123'},"HiJosefinAnderson")
console.log("Token: ",token) 

console.log(jwt.verify(token,"HiJosefinAnderson"))

