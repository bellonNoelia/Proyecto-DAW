import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { DialogLoginComponent } from '../dialog-login/dialog-login.component';
import { DialogRegisterComponent } from '../dialog-register/dialog-register.component';

@Component({
  selector: 'app-login-controller',
  templateUrl: './login-controller.component.html',
  styleUrls: ['./login-controller.component.css']
})
export class LoginControllerComponent implements OnInit {

  constructor( public dialog: MatDialog) { }

  ngOnInit(): void {
  }

  openDialog() {
    const dialogRef = this.dialog.open(DialogLoginComponent, { })

  }
  openDialogRegister(){
    const dialogRef = this.dialog.open(DialogRegisterComponent, { })
  }
}
