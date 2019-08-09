import { Component, OnInit } from '@angular/core';
import { ActivatedRouteSnapshot, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-queryparam',
  templateUrl: './queryparam.component.html',
  styleUrls: ['./queryparam.component.css']
})
export class QueryparamComponent implements OnInit {
  id:any
  name:any
  constructor(private route:ActivatedRoute) { }

  ngOnInit() {  

    this.id = this.route.snapshot.queryParams.id
    this.name = this.route.snapshot.queryParams.name
  }

}
