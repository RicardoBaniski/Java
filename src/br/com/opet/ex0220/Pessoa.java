package br.com.opet.ex0220;

public class Pessoa {
	// Atributos
	private int idade;
	private String profissao;

	// Metodos
	boolean solicitarParada(Carro c) {
		boolean atendida = c.desacelera();

		if (atendida == true) {
			return true;
		} else {
			return false;
		}
	}

	private boolean validaIdade() {
		if (idade < 0 || idade > 150) {
			System.out.println("Idade invalida [" + idade + "]");
		}
		return false;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (validaIdade() == false) {

		}
		this.idade = idade;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
}