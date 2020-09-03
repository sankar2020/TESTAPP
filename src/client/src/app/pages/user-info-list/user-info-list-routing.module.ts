import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserInfoListComponent } from './user-info-list.component';

const routes: Routes = [
  {
    path: '',
    component: UserInfoListComponent
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class UserInfoListRoutingModule { }
