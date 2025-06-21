import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  imports: [],
  templateUrl: './home.html',
  styleUrl: './home.css'
})
export class Home {
  meuBolleano = false;

  atualizaBolleano(valor: boolean){
    this.meuBolleano = valor;
  }
}
