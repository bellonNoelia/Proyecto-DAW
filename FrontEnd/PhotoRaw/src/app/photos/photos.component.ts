import { Component, OnInit } from '@angular/core';
import { Photo} from '../model/photo';
import { MatDialog } from '@angular/material/dialog';
import { DialogReadComponent } from '../dialog-read/dialog-read.component';
import { Service } from '../service/service.service';

@Component({
  selector: 'app-photos',
  templateUrl: './photos.component.html',
  styleUrls: ['./photos.component.css']
})

export class PhotosComponent implements OnInit {
  photos: Photo[];

  constructor(public dialog: MatDialog, public service:Service) { }

  ngOnInit(): void {
    this.getAllPhotos()
  }

  private getAllPhotos(){
    this.service.findAll().subscribe(data => {
      this.photos = data;
    });
  }

  openDialogRead() {
    const dialogRef = this.dialog.open(DialogReadComponent, { data: new Object});
  }
}
