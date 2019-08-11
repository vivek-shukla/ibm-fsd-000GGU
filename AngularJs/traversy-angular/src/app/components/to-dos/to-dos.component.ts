import { Component, OnInit } from '@angular/core';
import { ToDo } from '../../model/toDo';
import { TodoService } from 'src/app/services/todo.service';

@Component({
  selector: 'app-to-dos',
  templateUrl: './to-dos.component.html',
  styleUrls: ['./to-dos.component.css']
})
export class ToDosComponent implements OnInit {
  toDo: ToDo[];
  constructor(private todoService: TodoService) { }

  ngOnInit() { 
    this.todoService.getTodos().subscribe(todo => 
      { 
        console.log(todo)
        this.toDo = todo
      })
  }

}
