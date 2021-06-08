package br.com.caicaielevetor.modelo;

public class Elevador {

	private String nome;
	private int capacidadeMaxPessoas;
	private int andarMaximo;
	private int andarMinimo;
	private int andarAtual;
	private int qtdePessoas;

	// <modificador> <tipo do retorno> <nome do método> (<tipo do param> <nome do param>)

public String sair() {
	if (qtdePessoas>0) {
		qtdePessoas-=1;
		return "OK!";
	}
	return "Não há ninguém no elevador";
}
	public String entrar(int qtde) {
		if ((qtdePessoas+qtde)<=capacidadeMaxPessoas) {
			qtdePessoas+=qtde;
			return "OK!";
		}
		return "A capacidade foi excediada";
	}
	public String entrar() {
		if (qtdePessoas<capacidadeMaxPessoas) {
			qtdePessoas+=1;
			return "OK!";
		}
		return "A capacidade foi excediada";
	}
	public void descer() {
		if (andarAtual>andarMinimo) {
			andarAtual-=1;
		}
	}
	public void subir() {
		if (andarAtual<andarMaximo) {
			andarAtual+=1;
		}

	}
	public String toString() {
		return
				"Nome................: " + nome + "\n"+
				"Capacidade Máxima...: " + capacidadeMaxPessoas + "\n"+
				"Andar Atual.........: " + andarAtual + "\n"+
				"Andar Mais Alto.....: " + andarMaximo + "\n"+
				"Andar Mais Baixo....: " + andarMinimo + "\n"+
				"Número de Pessoas...: " + qtdePessoas;

	}
	public void preencherNome(String param) {
		nome = param.toUpperCase();
	}
	public void inicializar(int cmp, int andarMax, int andarMin) {
		capacidadeMaxPessoas = cmp;
		andarMaximo = andarMax;
		andarMinimo = andarMin;	
	}

}
