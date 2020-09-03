import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CompanyInfoEditComponent } from './company-info-edit.component';

const routes: Routes = [
  {
    path: '',
    component: CompanyInfoEditComponent
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CompanyInfoEditRoutingModule { }
