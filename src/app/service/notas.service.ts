import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Notas } from '../models/Notas';

@Injectable({
  providedIn: 'root'
})
export class NotasService {
  rutaGlobal = 'http://localhost:8080/notas/'
  
  constructor(private http: HttpClient) { }

  //Crear Nota
  createNotas(notas: Notas){
    return this.http.post<Notas>(this.rutaGlobal + 'new', notas, {
      observe: 'response'
    })
  }

  //Obtener Nota
  getNotas(){
    return this.http.get<Notas[]>(this.rutaGlobal + 'show')
  }

  //Actualizar Nota
  updateNota(notas: Notas){
    return this.http.post<Notas>(this.rutaGlobal + 'update', notas, {
      observe: 'response'
    })
  }

  //Eliminar Nota
  deleteNotas(idNumber: number){
    this.http.post<Boolean>(this.rutaGlobal + idNumber, {
      observe: 'response'
    })
  }
}
