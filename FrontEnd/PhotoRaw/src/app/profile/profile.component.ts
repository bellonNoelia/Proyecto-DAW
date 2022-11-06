import { Component, OnInit } from '@angular/core';
import { PHOTOS } from 'collection-photo';
@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {
photos=PHOTOS;
  constructor() { }

  ngOnInit(): void {
  }

}
