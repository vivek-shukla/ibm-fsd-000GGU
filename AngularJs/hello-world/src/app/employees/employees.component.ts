import { Component, OnInit, Input ,Output, EventEmitter} from '@angular/core';
import { employeeService } from '../service.service';
import { EventManager } from '@angular/platform-browser';

@Component({
  selector: 'app-employees',
  templateUrl: './employees.component.html',
  styleUrls: ['./employees.component.css']
})
export class EmployeesComponent implements OnInit {
  empArray: any[]
  statusObj: object
  @Input() msgToEmployee
  @Output() exportFromEmp= new EventEmitter(); 
  @Output() exportTotalUser = new EventEmitter();
  @Output() exportActiveUser = new EventEmitter();
  constructor(private eService: employeeService ) { 
   }

  ngOnInit() {  
    this.empArray = this.eService.getEmployeesFromService()
    this.exportTotalUser.emit(this.showTotalUser())
    this.exportActiveUser.emit(this.activeUser())
  } 
  delete(id)
  {
    this.eService.delete(id)
    this.exportActiveUser.emit(this.activeUser())
    this.exportTotalUser.emit(this.showTotalUser())
  }
  add()
  {
    this.empArray = this.eService.add()
    this.exportTotalUser.emit(this.showTotalUser())
    this.exportActiveUser.emit(this.activeUser())
  }
  clickMe()
  {
    this.exportFromEmp.emit(this.empArray[0])
  } 
  
  showTotalUser()
  {
    return this.eService.totalUser()
  }
  activeUser()
  {
    this.statusObj = this.eService.activeUser()
    return this.statusObj
  }
}

interface employee {
  eid: number
  name: string
}
