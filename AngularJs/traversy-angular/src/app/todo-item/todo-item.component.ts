import { Component, OnInit, Input } from '@angular/core';
import { ToDo } from '../model/toDo';
import { TodoService } from '../services/todo.service';

@Component({
  selector: 'app-todo-item',
  templateUrl: './todo-item.component.html',
  styleUrls: ['./todo-item.component.css']
})
export class TodoItemComponent implements OnInit {
  @Input() todo: ToDo
  constructor(private todoService: TodoService) { }

  ngOnInit() {
  } 
  setClasses()
  {
    let classes = {
       todo:true,
      'is-completed': this.todo.completed
    }
    return classes
  }
  onToggle(todo)
  { 
    // toggle in ui
    this.todo.completed = !this.todo.completed

  }
  onDelete()
  {
    console.log('Delete')
  }

}
