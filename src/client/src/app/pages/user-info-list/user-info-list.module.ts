import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { UserInfoListComponent } from './user-info-list.component';
import { UserInfoListRoutingModule } from './user-info-list-routing.module';
import { FormsModule } from '@angular/forms';
import { SharedModule } from '../../shared/shared.module';


@NgModule({
  imports: [
    CommonModule,
    UserInfoListRoutingModule,
    FormsModule,
    SharedModule
  ],
  declarations: [
    UserInfoListComponent
  ]
})
export class UserInfoListModule { }
