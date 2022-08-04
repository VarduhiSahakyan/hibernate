import {Component, OnInit} from '@angular/core';

import {ActivatedRoute} from '@angular/router';
import {ServiceService} from "../../services/service.service";

@Component({
  selector: 'app-view-registration',
  templateUrl: './view-registration.component.html',
  styleUrls: ['./view-registration.component.css']
})
export class ViewRegistrationComponent implements OnInit {

  public bikeReg: any;

  constructor(private bikeService: ServiceService, private route: ActivatedRoute) { }

  ngOnInit() {
    const {id} = this.route.snapshot.params;
    this.getBikeReg(id);
  }

  getBikeReg(id:number) {
    this.bikeService.getBike(id).subscribe(
      data => {
        this.bikeReg = data;
      },
      err => console.error(err),
      () => console.log('bikes loaded')
    );
  }

}
