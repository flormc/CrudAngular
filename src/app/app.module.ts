import {NgModule} from "@angular/core";
import {HttpClientModule} from "@angular/common/http";
import {ButtonModule} from 'primeng/button';
import {TableModule} from 'primeng/table';
import {HeaderComponent} from './components/header/header.component';
import {BodyComponent} from './components/body/body.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";

@NgModule({
  declarations: [
    HeaderComponent,
    BodyComponent
  ],
  imports: [
    HttpClientModule,
    ButtonModule,
    TableModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [],
  exports: [
    BodyComponent
  ]
})
export class AppModule {
}
