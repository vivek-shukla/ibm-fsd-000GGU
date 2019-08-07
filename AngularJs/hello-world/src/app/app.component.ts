import { Component } from '@angular/core'; 

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  messageFromApp = "Sending message from app" // binded it in app.component.html
  title = 'hello-world'; 
  eventVariable: any
  totalUser: any
  activeUser: any
  inactiveUser: any
  usingExportEvent($event) {
    this.eventVariable = $event
  }
  totalUserEvent($event)
  {
    this.totalUser = $event
  }
  showActiveStatus($event)
  {
      this.activeUser = $event.activeUsers
      this.inactiveUser = $event.inactiveUsers
  }

}
