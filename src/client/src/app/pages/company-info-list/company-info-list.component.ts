import { Component } from '@angular/core';
import { OnInit } from '@angular/core';
// Import Services
import { CompanyInfoService } from '../../services/company-info.service';
// Import Models
import { CompanyInfo } from '../../domain/testapp_db/company-info';

// START - USED SERVICES
/**
* CompanyInfoService.delete
*	@description CRUD ACTION delete
*	@param ObjectId id Id
*
* CompanyInfoService.list
*	@description CRUD ACTION list
*
*/
// END - USED SERVICES

/**
 * This component shows a list of CompanyInfo
 * @class CompanyInfoListComponent
 */
@Component({
    selector: 'app-company-info-list',
    templateUrl: './company-info-list.component.html',
    styleUrls: ['./company-info-list.component.css']
})
export class CompanyInfoListComponent implements OnInit {
    list: CompanyInfo[];
    search: any = {};
    idSelected: string;
    constructor(
        private companyinfoService: CompanyInfoService,
    ) { }

    /**
     * Init
     */
    ngOnInit(): void {
        this.companyinfoService.list().subscribe(list => this.list = list);
    }

    /**
     * Select CompanyInfo to remove
     *
     * @param {string} id Id of the CompanyInfo to remove
     */
    selectId(id: string) {
        this.idSelected = id;
    }

    /**
     * Remove selected CompanyInfo
     */
    deleteItem() {
        this.companyinfoService.remove(this.idSelected).subscribe(data => this.list = this.list.filter(el => el._id !== this.idSelected));
    }

}
