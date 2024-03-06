import { Component } from '@angular/core';
import {AppModule} from "./app.module";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  imports: [
    AppModule
  ],
  standalone: true
})
export class AppComponent {
  title = 'Notes';
}
