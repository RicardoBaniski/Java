package br.com.opet.ex0306_2c;

public class Valor {
	private int valor;
	private int posicao;
	private int interacao;

	public Valor(int valor, int posicao, int interacao) {
		this.valor = valor;
		this.posicao = posicao;
		this.interacao = interacao;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getInteracao() {
		return interacao;
	}

	public void setInteracao(int interacao) {
		this.interacao = interacao;
	}

	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
}