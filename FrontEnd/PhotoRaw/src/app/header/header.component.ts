import { Component, OnInit } from '@angular/core';
import { User } from '../model/user';
import { Service } from '../service/service.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
user:User;
isLoging: boolean;

  constructor(public service:Service) { }

  ngOnInit(): void {
    this.isLoging = localStorage.getItem('token') != null;
  }
logout(){
  this.service.logout().subscribe (() =>{
      localStorage.removeItem('token');
      window.open("http://localhost:4200/home","_self");
  });
    }


}

