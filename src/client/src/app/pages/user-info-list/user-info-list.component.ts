import { Component } from '@angular/core';
import { OnInit } from '@angular/core';
// Import Services
import { UserInfoService } from '../../services/user-info.service';
// Import Models
import { UserInfo } from '../../domain/testapp_db/user-info';

// START - USED SERVICES
/**
* UserInfoService.delete
*	@description CRUD ACTION delete
*	@param ObjectId id Id
*
* UserInfoService.list
*	@description CRUD ACTION list
*
*/
// END - USED SERVICES

/**
 * This component shows a list of UserInfo
 * @class UserInfoListComponent
 */
@Component({
    selector: 'app-user-info-list',
    templateUrl: './user-info-list.component.html',
    styleUrls: ['./user-info-list.component.css']
})
export class UserInfoListComponent implements OnInit {
    list: UserInfo[];
    search: any = {};
    idSelected: string;
    constructor(
        private userinfoService: UserInfoService,
    ) { }

    /**
     * Init
     */
    ngOnInit(): void {
        this.userinfoService.list().subscribe(list => this.list = list);
    }

    /**
     * Select UserInfo to remove
     *
     * @param {string} id Id of the UserInfo to remove
     */
    selectId(id: string) {
        this.idSelected = id;
    }

    /**
     * Remove selected UserInfo
     */
    deleteItem() {
        this.userinfoService.remove(this.idSelected).subscribe(data => this.list = this.list.filter(el => el._id !== this.idSelected));
    }

}
