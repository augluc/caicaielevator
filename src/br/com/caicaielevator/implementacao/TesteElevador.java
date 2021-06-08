package br.com.caicaielevator.implementacao;

import br.com.caicaielevetor.modelo.Elevador;

public class TesteElevador {

	public static void main(String[] args) {
		Elevador elevador = new Elevador();
		elevador.inicializar(10, 20, 0);
		elevador.preencherNome("Empate Estaite");
		elevador.descer();
		elevador.entrar(8);
		elevador.descer();
		elevador.sair();
		elevador.descer();
		elevador.toString();
		System.out.println(elevador.toString());
	}

}
