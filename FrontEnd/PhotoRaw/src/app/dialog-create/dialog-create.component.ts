import { Component, OnInit,Inject } from '@angular/core';
import {MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { Photo} from '../model/photo';
import { User} from '../model/user';
import { Img} from '../model/img';
import { Service } from '../service/service.service';
@Component({
  selector: 'app-dialog-create',
  templateUrl: './dialog-create.component.html',
  styleUrls: ['./dialog-create.component.css']
})
export class DialogCreateComponent implements OnInit {
img:Img;
imgBase64 :string;

  constructor(public service:Service,public dialogRef: MatDialogRef<DialogCreateComponent>,
    @Inject(MAT_DIALOG_DATA)
    public data: Photo) { }

  ngOnInit(): void {
  }
  createPhoto(photo: Photo) {
    if(this.imgBase64 != null){
      photo.infoPhotobase64 = this.imgBase64;
      this.service.createPhoto(photo).subscribe(() => {
        this.close();
      });
    }
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
