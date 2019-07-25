const EventEmitter = require('events').EventEmitter;
const emitFromFile2 = new EventEmitter();
class identify {
    func(request){
        let requestObj = JSON.parse(request);
        console.log(requestObj)
        if(requestObj.type=='animal') {
            console.log("You are an animal ")
        }
        if(requestObj.type=='human') 
        {
            console.log("Hello Human")
            if(requestObj.age>18) {
                console.log("Hello Adult ")
            }
            else {
                console.log("Hello Kiddo")
            }

    }
}
}
const IdListner = new identify();



emitFromFile2.addListener('typeListener',IdListner.func);

module.exports = {
    emitFromFile2
}