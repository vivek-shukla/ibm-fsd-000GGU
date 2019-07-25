const users = require('./userDetails').users

class userDetail {
    getUserDetail(id,pass) {
        return users.find(u=>{
            return u.id === id && u.pass === pass
        })

    }
}

module.exports = {
    userDetail
}