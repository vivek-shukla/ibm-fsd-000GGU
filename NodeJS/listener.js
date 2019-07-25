const emitFromFile1 = require('./log').emitFromFile2;

let _type = process.argv[2];

let _age = process.argv[3];

console.log(_type)


emitFromFile1.emit('typeListener',JSON.stringify({

    type : _type,

    age: _age

}));