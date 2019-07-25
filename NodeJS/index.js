const calculate = require('./calc')
const obj = new calculate.Calculator()

let first = parseInt(process.argv[2] || '5');

let next = parseInt(process.argv[3] || '7');

let op = process.argv[4]

console.log(obj.operation(first,next,op))