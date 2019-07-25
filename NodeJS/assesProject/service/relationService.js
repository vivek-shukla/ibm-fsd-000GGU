class relationClass {
    constructor() {
        this.relationDatabase = []
    }
    getRelation() {
        return this.relationDatabase
    }
    setRelation(uId,pId) {
        if(this.relationDatabase !=null && this.relationDatabase !=undefined) { 
            // console.log("inside non empty database")
            if(this.association(uId)) {
                console.log("User Already Assigned")
            }
            else {
                this.relationDatabase.push(
                    {
                        userId: uId,
                        projectId: pId
                    })
            }
        }
        else {
            this.relationDatabase = [{userId: uId,
                                     projectId: pId}]
                    
            // this.relationDatabase.push(
            //     {
            //         userId: uId,
            //         projectId: pId
            //     })
        }
    }
    association(uId) {
        return this.relationDatabase.find(r=>{
            return r.userId == uId
        })
    }
}

module.exports.relationClass = relationClass;