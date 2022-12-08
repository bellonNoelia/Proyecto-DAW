import { Component, OnInit } from '@angular/core';
import { Photo} from '../model/photo';
import { MatDialog } from '@angular/material/dialog';
import { DialogReadComponent } from '../dialog-read/dialog-read.component';
@Component({
  selector: 'app-photos',
  templateUrl: './photos.component.html',
  styleUrls: ['./photos.component.css']
})
export class PhotosComponent implements OnInit {
  photos=Photo;
  constructor(public dialog: MatDialog) { }

  ngOnInit(): void {
  }
  openDialogRead() {
    const dialogRef = this.dialog.open(DialogReadComponent, { data: new Object});
  }
}
