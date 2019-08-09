import { NgModule  } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ListComponent } from './list/list.component';
import { AddComponent } from './add/add.component';
import { EditComponent } from './edit/edit.component';
// import { UserComponent } from './user/user.component';


const routes: Routes = [
 { path: 'projectParent',
    children: [  
        {  
            path:'listChild',
            component: ListComponent

        },
        {
            path:'addChild',
            component: AddComponent
        },
        {
            path:'editChild',
            redirectTo:'addChild',
            // component: EditComponent
        },
        // {
        //     path: '',
        //     component: ListComponent
        // }
    ] 
}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class ProjectRoutingModule { 
 }