import { Component } from '@angular/core';
// it include metadata for component 
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',  // points to respetive field 
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title:string = 'traversy-angular';
  constructor()
  {
    console.log("1234")
  }
}
