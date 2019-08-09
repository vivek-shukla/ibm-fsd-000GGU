import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { userService } from '../service.service';

@Component({
  selector: 'app-delete',
  templateUrl: './delete.component.html',
  styleUrls: ['./delete.component.css']
})
export class DeleteComponent implements OnInit {
  email: any;
  constructor(private route: ActivatedRoute, private userService: userService , private router:Router) { }

  ngOnInit() {  
    this.email = this.route.snapshot.queryParams.email
    this.userService.deleteUser({email: this.email})
    this.router.navigate(['user/view'])

  }

}
