import { Component, OnInit } from '@angular/core';
import { Photo } from '../model/photo';
import { MatDialog } from '@angular/material/dialog';
import { DialogReadComponent } from '../dialog-read/dialog-read.component';
import { Service } from '../service/service.service';

@Component({
  selector: 'app-photos',
  templateUrl: './photos.component.html',
  styleUrls: ['./photos.component.css'],
})
export class PhotosComponent implements OnInit {
  photos: Photo[];
  columnas: number;

  constructor(public dialog: MatDialog, public service: Service) {}

  ngOnInit(): void {
    this.getAllPhotos();
    this.columnas = window.innerWidth <= 600 ? 1 : 6;
  }
  handleSize(event) {
    this.columnas = event.target.innerWidth <= 600 ? 1 : 6;
  }

  private getAllPhotos() {
    this.service.findAll().subscribe((data) => {
      this.photos = data;
    });
  }

  openDialogRead(photo: Photo) {
    const dialogRef = this.dialog.open(DialogReadComponent, { data: photo });
  }
}
