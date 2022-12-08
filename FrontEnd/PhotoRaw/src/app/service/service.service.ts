import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from '../model/user';
import { Photo } from '../model/photo';
import { Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})

export class Service {

  constructor(private http: HttpClient) {}

  private urlApi = 'http://localhost:8080/api/login'
  private urlApiRegister = 'http://localhost:8080/api/register'
  private urlApiListado = 'http://localhost:8080/api/user/artists'
  private urlApiPhotos = 'http://localhost:8080/api/photos'
  private urlApiImg = 'http://localhost:8080/api/img'

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
public getImg(idImg:number): Observable<User[]>{
  return this.http.get<User[]>(`${this.urlApiImg}/${idImg}`);

}

public findAll(): Observable<Photo[]> {
  return this.http.get<Photo[]>(`${this.urlApiPhotos}/findAllPhotos`, {
      headers: new HttpHeaders().set('Type-content', 'aplication/json')
  });
}

public updatePhoto (Photo: Photo): Observable<{}>{
  const headers = { 'content-type': 'application/json'}
  const body=JSON.stringify(Photo);
  console.log(body)
  return this.http.post(`${this.urlApiPhotos}/updatePhoto`, body,{'headers':headers})
}

public createPhoto (Photo: Photo): Observable<{}>{
  const headers = { 'content-type': 'application/json'}
  const body=JSON.stringify(Photo);
  console.log(body)
  return this.http.post(`${this.urlApiPhotos}/createPhoto`, body,{'headers':headers})
}

public deletePhoto (idPhoto: number): Observable<{}>{
  return this.http.delete(`${this.urlApiPhotos}/deletePhotos/${idPhoto}`, {
    headers: new HttpHeaders().set('Type-content', 'aplication/json')
  });
}
}
