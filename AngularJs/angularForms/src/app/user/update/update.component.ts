import { Component, OnInit } from '@angular/core';
import { userService } from '../service.service';
import { ActivatedRoute, Router } from '@angular/router';
import { userTemplate } from '../structure/userStructure';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {
  email: any
  toUpdate: userTemplate 
  constructor(private userService: userService,private route: ActivatedRoute, private router:Router) { }
  ngOnInit() { 
    this.email = this.route.snapshot.queryParams.email
    this.toUpdate = this.userService.findUser(this.email)
    console.log(this.toUpdate)
  }
  editUser()
  {     
    console.log(this.toUpdate)
      this.userService.editUser(this.toUpdate)
      this.router.navigate(['user/view'])
  }
}
