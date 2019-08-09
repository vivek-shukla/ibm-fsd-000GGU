import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserComponent } from './user/user.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { HomeComponent } from './home/home.component';
import { NavigationComponent } from './navigation/navigation.component';
import { PowerPipe } from './power.pipe';
import { QueryparamComponent } from './queryparam/queryparam.component';
import { ProjectModule } from './project/project.module';
import { DummyComponent } from './dummy/dummy.component';
import { FormsModule } from "@angular/forms";

@NgModule({
  declarations: [
    AppComponent,
    UserComponent,
    AboutusComponent,
    HomeComponent,
    NavigationComponent,
    PowerPipe,
    QueryparamComponent,
    DummyComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ProjectModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
