import { Component, OnInit } from '@angular/core';
import { User } from '../model/user';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
user:User;

isLoging: boolean;

  constructor() { }

  ngOnInit(): void {
    this.isLoging = localStorage.getItem('token') != null;
  }
logout(){
  localStorage.removeItem("token")
  location.reload();
}
}
