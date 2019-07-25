class Parent { 
    constructor(msg) {
        this.msg = msg;
    }
    message() {
        console.log('Parent Message')
    }
    static getMessage() {
        console.log("static mesthod")
    }
} 

class Child extends Parent {  
    constructor(msg)
    {  super(msg) 
        // must call a super constructor 
        console.log(msg)
    }
    message() { 
        console.log("parent attribute",this.msg)
        let msg = " updated " 
        console.log("child message")
        console.log(msg) 
        this.msg = ""
        super.message()
    }

}

chObj = new Child("parent msg")
chObj.message()
Parent.getMessage()


let _usr = {
    id: 1,
};

Object.seal(_usr)

const emp = {
    id: 10
}
// can modify the property  
emp.id = 12

Object.defineProperties()


