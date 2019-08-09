import { Component, OnInit } from '@angular/core';
import { userService } from '../service.service';
import { ActivatedRoute, Router } from '@angular/router';
import { userTemplate } from '../structure/userStructure';
import { FormGroup,FormControl,Validators,RequiredValidator} from '@angular/forms'
@Component({
  selector: 'app-view',
  templateUrl: './view.component.html',
  styleUrls: ['./view.component.css']
})
export class ViewComponent implements OnInit {
  reactiveForm: FormGroup
  userObjArray: userTemplate[]
  constructor(private userService: userService, private route: Router) { }

  ngOnInit() { 
    this.userObjArray = this.userService.viewUser() 
    console.log(this.userObjArray)
    this.createReactiveForm()
  }  
  delete(userObj)
  {  
    this.route.navigate(['user/delete'],{ queryParams: {
      email: userObj.email
    }})
  }
  update(userObj)
  {  
    this.route.navigate(['user/update'],{ queryParams: {
      email: userObj.email
    }})
  } 
  createReactiveForm()
  {
    this.reactiveForm = new FormGroup( 
      {  
        name: new FormControl(
          'Vivek',
            Validators.required
        ),
        email: new FormControl(
           'Vivek@pp.com',
            Validators.required
        )
      }
    )
    console.log(this.reactiveForm)
  }
  submitReactiveForm()
  {
    console.log(this.reactiveForm)
  }
}
