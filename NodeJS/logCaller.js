const emitByCaller  = require('./logListener').emitFromLog; 

    var user = {
        name: "Vivek",
        age: 12,
        email: "Shukla4saunter"
    }
    emitByCaller.emit('print',user.name)
    emitByCaller.emit('print',user.age)
    emitByCaller.emit('print',user.email)
