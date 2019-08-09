import { NgModule  } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserComponent } from './user/user.component';
import { HomeComponent } from './home/home.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { QueryparamComponent } from './queryparam/queryparam.component';
// import { UserComponent } from './user/user.component';


const routes: Routes = [
  {
    path:"user/:id",
    component: UserComponent
  },
  {
    path:"home",
    component: HomeComponent
  },
  {
    path:"aboutus",
    component: AboutusComponent
  },
  {
    path:"query",
    component: QueryparamComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
