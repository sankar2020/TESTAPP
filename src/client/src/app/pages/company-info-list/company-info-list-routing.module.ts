import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CompanyInfoListComponent } from './company-info-list.component';

const routes: Routes = [
  {
    path: '',
    component: CompanyInfoListComponent
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CompanyInfoListRoutingModule { }
