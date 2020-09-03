// Import Libraries
import { Component, OnInit } from '@angular/core';
import { Location } from '@angular/common';
import { ActivatedRoute } from '@angular/router';
// Import Services
import { CompanyInfoService } from '../../services/company-info.service';
// Import Models
import { CompanyInfo } from '../../domain/testapp_db/company-info';

// START - USED SERVICES
/**
* CompanyInfoService.create
*	@description CRUD ACTION create
*
* CompanyInfoService.update
*	@description CRUD ACTION update
*	@param ObjectId id Id
*
* CompanyInfoService.get
*	@description CRUD ACTION get
*	@param ObjectId id Id resource
*
*/
// END - USED SERVICES

/**
 * This component allows to edit a CompanyInfo
 */
@Component({
    selector: 'app-company-info-edit',
    templateUrl: 'company-info-edit.component.html',
    styleUrls: ['company-info-edit.component.css']
})
export class CompanyInfoEditComponent implements OnInit {
    item: CompanyInfo;
    model: CompanyInfo;
    formValid: Boolean;

    constructor(
    private companyinfoService: CompanyInfoService,
    private route: ActivatedRoute,
    private location: Location) {
        // Init item
        this.item = new CompanyInfo();
    }

    /**
     * Init
     */
    ngOnInit() {
        this.route.params.subscribe(param => {
            const id: string = param['id'];
            if (id !== 'new') {
                this.companyinfoService.get(id).subscribe(item => this.item = item);
            }
            // Get relations
        });
    }


    /**
     * Save CompanyInfo
     *
     * @param {boolean} formValid Form validity check
     * @param CompanyInfo item CompanyInfo to save
     */
    save(formValid: boolean, item: CompanyInfo): void {
        this.formValid = formValid;
        if (formValid) {
            if (item._id) {
                this.companyinfoService.update(item).subscribe(data => this.goBack());
            } else {
                this.companyinfoService.create(item).subscribe(data => this.goBack());
            } 
        }
    }

    /**
     * Go Back
     */
    goBack(): void {
        this.location.back();
    }


}



