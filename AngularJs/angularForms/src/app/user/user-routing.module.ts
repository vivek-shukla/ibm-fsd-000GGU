import { NgModule  } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddComponent } from './add/add.component';
import { DeleteComponent } from './delete/delete.component';
import { UpdateComponent } from './update/update.component';
import { ViewComponent } from './view/view.component';
// import { UserComponent } from './user/user.component';


const routes: Routes = [
    { path: 'user',
    children: [  
        {  
            path:'add',
            component: AddComponent

        },
        {
            path:'delete',
            component: DeleteComponent
        },
        {
            path:'update',
            component: UpdateComponent
            // component: EditComponent
        },
        {
            path:'view',
            component: ViewComponent
            // component: EditComponent
        },
        {
            path:'',
            component: ViewComponent
        }
    ] 
}
]


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class UserRoutingModule { }