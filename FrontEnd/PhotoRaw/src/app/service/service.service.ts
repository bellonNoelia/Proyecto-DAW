import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from '../model/user';
import { Photo } from '../model/photo';
import { Observable, of } from 'rxjs';
import { Token } from '../model/token';

@Injectable({
  providedIn: 'root'
})

export class Service {

  constructor(private http: HttpClient) {}

  private urlApi = 'http://localhost:8080/api/login'
  private urlApiRegister = 'http://localhost:8080/api/register'
  private urlApiListado = 'http://localhost:8080/api/user/artists'
  private urlApiUserLog = 'http://localhost:8080/api/user/userLog'
  private urlApiPhotos = 'http://localhost:8080/api/photos'


  public login(user: User):Observable<Token>{
      const body = JSON.stringify(user);
      const header = {'content-type': 'application/json'}
      return this.http.post<Token>(`${this.urlApi}`,
      body, {'headers': header}
      )
  }

  public register(user: User):Observable<{}>{
      const header = {'content-type': 'application/json'}
      const body = JSON.stringify(user);
      return this.http.post(`${this.urlApiRegister}`,body, {'headers': header})

  }
  public userLog(){
    return this.http.get(`${this.urlApiUserLog}`,{ headers: this.getHeader()});
}

public getArtistsAll(): Observable<User[]>{
    return this.http.get<User[]>(`${this.urlApiListado}`, { headers: this.getHeader() });
}

public getArtists(idArtista:number): Observable<User>{
  return this.http.get<User>(`${this.urlApiListado}/${idArtista}`, { headers: this.getHeader() });
}

public findAll(): Observable<Photo[]> {
  return this.http.get<Photo[]>(`${this.urlApiPhotos}/findAllPhotos`, {
      headers: new HttpHeaders().set('Type-content', 'aplication/json')
  });
}
public findPhotosByUser(idArtist:number): Observable<Photo[]> {
  return this.http.get<Photo[]>(`${this.urlApiPhotos}/findPhotosByUser/${idArtist}`, {
      headers: new HttpHeaders().set('Type-content', 'aplication/json')
  });
}

public readPhoto(idPhoto: number): Observable<{}>{
  return this.http.get(`${this.urlApiPhotos}/readPhoto/${idPhoto}`,{ headers: this.getHeader()});
}
public updatePhoto (Photo: Photo): Observable<{}>{
  const body=JSON.stringify(Photo);
  console.log(body)
  return this.http.post(`${this.urlApiPhotos}/updatePhoto`, body,{'headers':this.getHeader()})
}

public createPhoto (photo: Photo): Observable<{}>{
  const body=JSON.stringify(photo);
  console.log(body)
  return this.http.post(`${this.urlApiPhotos}/createPhoto`, body,{'headers':this.getHeader()})
}

public deletePhoto (idPhoto: number): Observable<{}>{
  return this.http.delete(`${this.urlApiPhotos}/deletePhoto/${idPhoto}`, {
    headers: new HttpHeaders().set('Type-content', 'aplication/json')
  });
}

private getHeader(){
  return { 'content-type': 'application/json', 'token': localStorage.getItem('token')}
}

}
