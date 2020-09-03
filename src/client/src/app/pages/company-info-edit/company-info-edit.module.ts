import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CompanyInfoEditComponent } from './company-info-edit.component';
import { CompanyInfoEditRoutingModule } from './company-info-edit-routing.module';
import { FormsModule } from '@angular/forms';
import { SharedModule } from '../../shared/shared.module';


@NgModule({
  imports: [
    CommonModule,
    CompanyInfoEditRoutingModule,
    FormsModule,
    SharedModule
  ],
  declarations: [
    CompanyInfoEditComponent
  ]
})
export class CompanyInfoEditModule { }
