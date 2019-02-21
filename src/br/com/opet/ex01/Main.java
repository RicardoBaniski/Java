package br.com.opet.ex01;

public class Main {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		Carro c = new Carro();

		p.setIdade(9999);
		p.setProfissao("Tira");

		c.ano = 1966;
		c.modelo = "Mini";

		boolean atendida = p.solicitarParada(c);

		if (atendida == false) {
			// Iniciar perseguicao
		}
	}
}