package br.com.opet.atividades;

public class Aluno {

	private String nome;
	private int idade;
	private String sexo;
	private double altura;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	boolean validaIdade() {
		if (idade < 18) {
			return true;
		}
		return false;
	}
}