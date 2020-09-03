// Import Libraries
import { Component, OnInit } from '@angular/core';
import { Location } from '@angular/common';
import { ActivatedRoute } from '@angular/router';
// Import Services
import { UserInfoService } from '../../services/user-info.service';
// Import Models
import { UserInfo } from '../../domain/testapp_db/user-info';

// START - USED SERVICES
/**
* UserInfoService.create
*	@description CRUD ACTION create
*
* UserInfoService.update
*	@description CRUD ACTION update
*	@param ObjectId id Id
*
* UserInfoService.get
*	@description CRUD ACTION get
*	@param ObjectId id Id resource
*
*/
// END - USED SERVICES

/**
 * This component allows to edit a UserInfo
 */
@Component({
    selector: 'app-user-info-edit',
    templateUrl: 'user-info-edit.component.html',
    styleUrls: ['user-info-edit.component.css']
})
export class UserInfoEditComponent implements OnInit {
    item: UserInfo;
    model: UserInfo;
    formValid: Boolean;

    constructor(
    private userinfoService: UserInfoService,
    private route: ActivatedRoute,
    private location: Location) {
        // Init item
        this.item = new UserInfo();
    }

    /**
     * Init
     */
    ngOnInit() {
        this.route.params.subscribe(param => {
            const id: string = param['id'];
            if (id !== 'new') {
                this.userinfoService.get(id).subscribe(item => this.item = item);
            }
            // Get relations
        });
    }


    /**
     * Save UserInfo
     *
     * @param {boolean} formValid Form validity check
     * @param UserInfo item UserInfo to save
     */
    save(formValid: boolean, item: UserInfo): void {
        this.formValid = formValid;
        if (formValid) {
            if (item._id) {
                this.userinfoService.update(item).subscribe(data => this.goBack());
            } else {
                this.userinfoService.create(item).subscribe(data => this.goBack());
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



