import { Component, OnInit,Inject } from '@angular/core';
import { MatDialogRef,MAT_DIALOG_DATA } from '@angular/material/dialog';
import { UserService } from '../service/user.service';
import { User } from '../model/user';


@Component({
  selector: 'app-dialog-register',
  templateUrl: './dialog-register.component.html',
  styleUrls: ['./dialog-register.component.css']

})
export class DialogRegisterComponent implements OnInit {

  pwdConfirm:string;

hide=true;
  constructor(public userService: UserService,public dialogRef: MatDialogRef<DialogRegisterComponent>,
  @Inject(MAT_DIALOG_DATA)
    public data: User) { }

  ngOnInit(): void {
  }
  register(user:User){
    this.userService.register(user).subscribe({
      next: (data) => {
        console.log(data)
        this.close();
      },
      error: (error) => {
        if (error.status == 500) {
          alert("Error al insertar los datos")
        }
      },
    });
  }

  close() {
    this.dialogRef.close();
  }


}
