import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { DialogLoginComponent } from '../dialog-login/dialog-login.component';
import { Observable, of } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) {

  }

  private urlApi = 'http://localhost:8080/api/login'

  public login(user: Any):Observable<any>{
    return this.http.post(urlApi,user)
  }
}
