import { Component, OnInit,Inject } from '@angular/core';
import {MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { Photo} from '../model/photo';
import { User} from '../model/user';
import { Service } from '../service/service.service';
@Component({
  selector: 'app-dialog-update',
  templateUrl: './dialog-update.component.html',
  styleUrls: ['./dialog-update.component.css']
})
export class DialogUpdateComponent implements OnInit {

  constructor(public service:Service,public dialogRef: MatDialogRef<DialogUpdateComponent>,
    @Inject(MAT_DIALOG_DATA)
      public data: Photo) { }

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
