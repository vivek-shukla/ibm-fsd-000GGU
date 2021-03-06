import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private previousRoute: ActivatedRoute ,private router: Router) { }

  ngOnInit() { 
    
  }
  redirect(routeTo)
  {  
      if(routeTo=='user')
     {
      this.router.navigate(['user','10'])
     } 
     else if(routeTo=='aboutus')
     {
      this.router.navigate(['aboutus'])
     }
     else
     {
       this.router.navigate(['/query'],{ queryParams: {id:7 , name:'ibm' }})
     }
  }
}
