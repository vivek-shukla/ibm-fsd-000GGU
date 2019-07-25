const userDatabase = require('../database/userDatabase').userDatabase;

class userClass {
    constructor() {
        this.userDatabase = userDatabase;
    }
    getUser() {
        return this.userDatabase;
    }
    addUser(user) {
        this.userDatabase.push(user);
        return this.userDatabase;

    }
    update(user) { 
        var i=0
        this.userDatabase.forEach(u=>{
            if(u.id==user.id) {
                this.userDatabase[i] = user
            }
            i++;
        })
        return this.userDatabase
    }
    search(user) { 
        return this.userDatabase.find(u=>{
            return u.id == user;
        })
    }
    nextId() {
        return this.userDatabase.length + 1  
    }
}

module.exports.userClass = userClass