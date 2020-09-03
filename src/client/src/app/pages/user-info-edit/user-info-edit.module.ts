import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { UserInfoEditComponent } from './user-info-edit.component';
import { UserInfoEditRoutingModule } from './user-info-edit-routing.module';
import { FormsModule } from '@angular/forms';
import { SharedModule } from '../../shared/shared.module';


@NgModule({
  imports: [
    CommonModule,
    UserInfoEditRoutingModule,
    FormsModule,
    SharedModule
  ],
  declarations: [
    UserInfoEditComponent
  ]
})
export class UserInfoEditModule { }
