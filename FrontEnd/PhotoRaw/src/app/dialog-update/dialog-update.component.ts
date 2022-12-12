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
  update:Photo;
  img:Img;
 imgBase64 :string;
  constructor(public service:Service,public dialogRef: MatDialogRef<DialogUpdateComponent>,
    @Inject(MAT_DIALOG_DATA)
      public data: Photo) { this.photo = data; }

  ngOnInit(): void {
  }
  updatePhoto(update: Photo) {
    this.service.updatePhoto(update).subscribe(() => {
      this.close();
    });
  }
  changeFile(file) {
    return new Promise((resolve, reject) => {
        const reader = new FileReader();
        reader.readAsDataURL(file);
        reader.onload = () => resolve(reader.result);
        reader.onerror = error => reject(error);
    });
}

onChange(event) {
  if (event.target.value) {
    const file = event.target.files[0];
    const type = file.type;
    this.changeFile(file).then((base64: string): any => {
      this.imgBase64 = base64
    });
} else alert('Nothing')
}
  close() {
    this.dialogRef.close();
  }
}
