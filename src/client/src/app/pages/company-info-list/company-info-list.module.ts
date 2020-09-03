import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CompanyInfoListComponent } from './company-info-list.component';
import { CompanyInfoListRoutingModule } from './company-info-list-routing.module';
import { FormsModule } from '@angular/forms';
import { SharedModule } from '../../shared/shared.module';


@NgModule({
  imports: [
    CommonModule,
    CompanyInfoListRoutingModule,
    FormsModule,
    SharedModule
  ],
  declarations: [
    CompanyInfoListComponent
  ]
})
export class CompanyInfoListModule { }
