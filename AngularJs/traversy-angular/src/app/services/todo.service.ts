import { Injectable } from '@angular/core';
import { ToDo } from '../model/toDo';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class TodoService {
  toDo:ToDo[]
  todoUrl = 'https://jsonplaceholder.typicode.com/todos'
  constructor(private http:HttpClient) { 
    this.toDo=[
      {
        id:1,
        title:"to do 1",
        completed: false
      },
      {
        id:2,
        title:"to do 2",
        completed: true
      },
      {
        id:1,
        title:"to do 3",
        completed: false
      }
  
    ]
  }
  getTodos(): Observable<ToDo[]>
  {
     return  this.http.get<ToDo[]>(this.todoUrl)
  }
  toggleCompleted(todo)
  {
    return this.http.put(this.todoUrl,todo,)
  }
}
