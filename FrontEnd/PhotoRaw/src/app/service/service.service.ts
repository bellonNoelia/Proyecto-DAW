import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from '../model/user';
import { Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})

export class Service {

  constructor(private http: HttpClient) {}

  private urlApi = 'http://localhost:8080/api/login'
  private urlApiRegister = 'http://localhost:8080/api/register'
  private urlApiListado = 'http://localhost:8080/api/user/artists'

  public login(user: User):Observable<String>{
      const body = JSON.stringify(user);
      const header = {'content-type': 'application/json'}
      return this.http.post<String>(`${this.urlApi}`,
      body, {'headers': header}
      )

  }
  public register(user: User):Observable<{}>{
      const header = {'content-type': 'application/json'}
      const body = JSON.stringify(user);
      return this.http.post(`${this.urlApiRegister}`,body, {'headers': header})

  }

  public getArtists(): Observable<User[]>{
    return this.http.get<User[]>(`${this.urlApiListado}`);

}
}