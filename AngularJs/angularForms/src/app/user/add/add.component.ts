import { Component, OnInit } from '@angular/core';
import { userService } from '../service.service';
import { userTemplate } from '../structure/userStructure';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {
  userObjArray:userTemplate[] =[]
  constructor(private userService: userService) { }

  ngOnInit() {
  } 
  showUser()
   {
     console.log(this.userObjArray)
   } 
  addUser(userObj)
  {
   this.userObjArray = this.userService.addUser(userObj)
   console.log(this.userObjArray)
  }
}

// interface userTemplate {
//   name:string,
//   email: string,
//   password: string
// }