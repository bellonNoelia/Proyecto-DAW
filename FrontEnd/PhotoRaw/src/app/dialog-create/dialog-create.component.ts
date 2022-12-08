import { Component, OnInit,Inject } from '@angular/core';
import {MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { Photo} from '../model/photo';
import { User} from '../model/user';
import { Service } from '../service/service.service';
@Component({
  selector: 'app-dialog-create',
  templateUrl: './dialog-create.component.html',
  styleUrls: ['./dialog-create.component.css']
})
export class DialogCreateComponent implements OnInit {

  constructor(public service:Service,public dialogRef: MatDialogRef<DialogCreateComponent>,
    @Inject(MAT_DIALOG_DATA)
    public data: Photo) { }

  ngOnInit(): void {
  }
  createPhoto(photo: Photo) {
    this.service.createPhoto(photo).subscribe(() => {
      this.close();
    });
  }
  close() {
    this.dialogRef.close();
  }
}
