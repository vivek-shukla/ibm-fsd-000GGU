import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
  message:string
  imageUrl:string
  tableDetail:object
  constructor() { }
  // only global attribute will be accessible 
  ngOnInit() { 
    this.message = "This is sparta "
    this.imageUrl = 'https://cdn.onebauer.media/one/empire-images/reviews_films/5702397fb602bb802e1faefe/midnight-special-image.0.jpg?quality=50&width=1800&ratio=16-9&resizeStyle=aspectfill&format=jpg'
    this.tableDetail = [["Name","Email"],["John","joe@ee.com"]];
  }   

}
