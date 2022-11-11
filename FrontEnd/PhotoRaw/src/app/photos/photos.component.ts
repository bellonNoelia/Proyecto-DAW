import { Component, OnInit } from '@angular/core';
import { PHOTOS } from 'collection-photo';
@Component({
  selector: 'app-photos',
  templateUrl: './photos.component.html',
  styleUrls: ['./photos.component.css']
})
export class PhotosComponent implements OnInit {
  photos=PHOTOS;
  constructor() { }

  ngOnInit(): void {
  }

}
