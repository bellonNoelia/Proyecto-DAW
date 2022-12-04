import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from '../model/user';
import { Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})

export class UserService {

  constructor(private http: HttpClient) {}

  private urlApi = 'http://localhost:8080/api/login'

  public login(user: User):Observable<{}>{
    //prueba
      const header = {'content-type': 'application/json'}
      const body = JSON.stringify(user);
      return this.http.post(`${this.urlApi}`,body, {'headers': header})
    //OLD
    //return this.http.post(`${this.urlApi}`,user)
  }
  public register(user: User):Observable<{}>{
    //prueba
      const header = {'content-type': 'application/json'}
      const body = JSON.stringify(user);
      return this.http.post(`${this.urlApi}`,body, {'headers': header})
    //OLD
    //return this.http.post(`${this.urlApi}`,user)
  }
}
