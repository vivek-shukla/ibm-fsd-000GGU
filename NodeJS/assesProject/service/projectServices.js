const projectDatabase = require('../database/projectDatabase').projectDatabase;

class projectClass {
    constructor() {
        this.projectDatabase = projectDatabase;
    }
    getProject() {
        return this.projectDatabase;
    }
    addProject(project) {
        this.projectDatabase.push(project);
        return this.projectDatabase;

    }
    update(project) { 
        var i=0
        this.projectDatabase.forEach(p=>{
            if(p.id==project.id) {
                this.projectDatabase[i] = project
            }
            i++;
        })
        return this.projectDatabase
    }
    search(project) { 
        return this.projectDatabase.find(p=>{
            return p.id == project;
        })
    }
}

module.exports.projectClass = projectClass