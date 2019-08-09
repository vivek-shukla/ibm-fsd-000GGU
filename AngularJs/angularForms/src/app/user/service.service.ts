import { Injectable } from '@angular/core';
import { userTemplate } from './structure/userStructure';

@Injectable({
  providedIn: 'root'
})
export class userService {
  userServiceArray: userTemplate[]
  constructor() {
    this.userServiceArray=[{
      name: 'xyz',
      email: 'ann',
      password: '124'
    }];
   } 

  addUser(userObj)
  {
   this.userServiceArray.push(userObj)
   return this.userServiceArray
  } 
  viewUser()
  {
    console.log(this.userServiceArray);
    return this.userServiceArray
  }
  deleteUser(userObj)
  { let index = 0
    this.userServiceArray.find((user,i)=>{
          index = i
          return user.email == userObj.email
    })
    this.userServiceArray.splice(index,1)
    return this.userServiceArray
  } 
  findUser(email)
  {
    let index = 0
    return this.userServiceArray.find((user,i)=>{
      index = i
      return user.email == email
    })
  }
  editUser(userObj) 
  {   
    let index = 0
    this.userServiceArray.find((user,i)=>{
          index = i
          return user.email == userObj.email
    })
    this.userServiceArray[index]= userObj
    
  }
}
