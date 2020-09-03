import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserInfoEditComponent } from './user-info-edit.component';

const routes: Routes = [
  {
    path: '',
    component: UserInfoEditComponent
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class UserInfoEditRoutingModule { }
