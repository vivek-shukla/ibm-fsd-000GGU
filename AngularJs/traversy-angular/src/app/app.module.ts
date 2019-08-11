import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ToDosComponent } from './components/to-dos/to-dos.component';
import { TodoItemComponent } from './todo-item/todo-item.component';
import { HttpClient } from 'selenium-webdriver/http';
// entry point to angular 
@NgModule({
  declarations: [   //componenets will be added here 
    AppComponent, ToDosComponent, TodoItemComponent
  ],
  imports: [      // imports module here 
    BrowserModule,  // it include modules 
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],   // services you want to include 
  bootstrap: [AppComponent]  // bootstraping the main app componenet 
})
export class AppModule { }
