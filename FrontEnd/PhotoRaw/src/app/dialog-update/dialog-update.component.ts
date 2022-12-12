import { Component, OnInit,Inject } from '@angular/core';
import {MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { Photo} from '../model/photo';
import { Img} from '../model/img';

import { Service } from '../service/service.service';
@Component({
  selector: 'app-dialog-update',
  templateUrl: './dialog-update.component.html',
  styleUrls: ['./dialog-update.component.css']
})
export class DialogUpdateComponent implements OnInit {
  photo: Photo;


  constructor(public service:Service,public dialogRef: MatDialogRef<DialogUpdateComponent>,
    @Inject(MAT_DIALOG_DATA)
      public data: Photo) { this.photo = data; }

  ngOnInit(): void {
  }
  updatePhoto(photo: Photo) {
    this.service.updatePhoto(photo).subscribe(() => {
      this.close();
    });
  }

  close() {
    this.dialogRef.close();
  }
}
