import { Component, OnInit, Inject } from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { Service } from '../service/service.service';
import { User } from '../model/user';
import { MatDialog } from '@angular/material/dialog';
import { DialogRegisterComponent } from '../dialog-register/dialog-register.component';
import { Token } from '../model/token';



@Component({
  selector: 'app-dialog-login',
  templateUrl: './dialog-login.component.html',
  styleUrls: ['./dialog-login.component.css'],
})
export class DialogLoginComponent implements OnInit {
  hide = true;
  constructor(
    public dialog: MatDialog,
    public service:Service,
    public dialogRef: MatDialogRef<DialogLoginComponent>,
    @Inject(MAT_DIALOG_DATA)
    public data: User
  ) {}

  ngOnInit(): void {}

  login(user: User) {
    this.service.login(user).subscribe({
      next: (data: Token) => {
        localStorage.setItem("token", data.token)
        this.close();
      },
      error: (error) => {
        if (error.status == 500) {
          localStorage.clear();
          alert('Error al realizar el loging');
        }
      },
    });
  }

  //Cerrar diálogo login
  close() {
    this.dialogRef.close();
  }
  openDialogRegister() {
    const dialogRef = this.dialog.open(DialogRegisterComponent, {
      data: new Object(),
    });
  }
}
