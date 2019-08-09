import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {
   userArray: any[]=[
     {
       id:1,
       name: 'vivek'
     }
   ]
  constructor() { }
  getUser()
  {
    return this.userArray
  }
  addUser(user) {
    return this.userArray.push(user)
  }

}
