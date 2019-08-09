import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
  userObj:object = { 
    id:1,
    name:'vivek'
  } 
   paersedUser = JSON.stringify(this.userObj)
  idFromParam:any
  constructor(private route: ActivatedRoute) { }

  ngOnInit() { 
    console.log('ID is ' +this.route.snapshot.params.id); 
    this.idFromParam = this.route.snapshot.params.id
  }

}
