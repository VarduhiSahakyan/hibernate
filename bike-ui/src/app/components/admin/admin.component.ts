import { Component, OnInit } from '@angular/core';
import {ServiceService} from "../../services/service.service";

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {
  public bikes: any ;

  constructor(private bikeService: ServiceService) { }

  ngOnInit(): void {
    this.getBikes()
  }

  getBikes(){
    this.bikeService.getBikes().subscribe(
      data => {this.bikes = data},
      err => console.error(err),
      () => console.log('bikes loaded')
    );
  }

}
