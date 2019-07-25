const event = require('events').EventEmitter;
const emitFromLog = new event()

//console.log("Warning:",request)
emitFromLog.addListener('print',console.log)

module.exports = {
    emitFromLog
}