import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class employeeService {
  empArray:any[] 
  activeCount:number = 0
  inactiveCount:number = 0
  constructor() { } 

  getEmployeesFromService() {
    return this.empArray = [
      {
        eid: 1,
        name: "Vivek",
        status: 1
      },
      {
        eid: 2,
        name: "Anuj",
        status: 1
      },
      {
        eid: 3,
        name: "Josefin",
        status: 0
      }
    ]
  } 
  delete(id)
  {  let i = 0
    this.empArray.forEach(emp=>{
      if(emp.eid==id)
      {
          this.empArray.splice(i,1)
      }
      i++
    })
  } 
  add()
  {
    this.empArray.push({
      eid: 4,
      name: "Shukla",
      status: 1
    })

    return this.empArray;
  }
  totalUser()
  {
    return this.empArray.length
  }
  activeUser()
  {
    this.activeCount = 0;
    this.inactiveCount = 0; 
    this.empArray.forEach(emp=>{
      if(emp.status==1)
      {
        this.activeCount++
      }
      else
      {
        this.inactiveCount++ 
      }
    }) 
    return {activeUsers: this.activeCount, inactiveUsers: this.inactiveCount }

  }

}
