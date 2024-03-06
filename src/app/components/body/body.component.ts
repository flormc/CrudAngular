import { Component } from '@angular/core';
import { Notas } from 'src/app/models/Notas';
import { FormGroup, FormBuilder, Validators, FormControl } from '@angular/forms';

@Component({
    selector: 'app-body',
    templateUrl: './body.component.html',
    styleUrls: ['./body.component.css',]
})
export class BodyComponent {
    notas: Array<Notas>
    formularioNotas: FormGroup    

    constructor(private fb: FormBuilder){
        this.notas = new Array<Notas>()
        this.formularioNotas = fb.group({
            idNumber : new FormControl('', [Validators.required]),
            name : new FormControl('', [Validators.required]), 
            category: new FormControl('', [Validators.required]),
        })
    }
}
