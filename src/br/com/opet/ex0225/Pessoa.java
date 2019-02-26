package br.com.opet.ex0225;

public class Pessoa {
	
	//Atributos
	private int idade;
	private String profissao;
	
	public Pessoa(){
	}
	
	public Pessoa(int idade, String profissao){
		this.idade = idade;
		this.profissao = profissao;
	}
	
	//Metodos
	boolean solicitarParada(Carro c){
		boolean atendida = c.desacelera();
		
		if(atendida == true){
			return true;
		}else{
			return false;
		}
	}
	
	private boolean validaIdade(int idade){
		if(idade < 0 || idade > 150){
			System.out.println("Idade invalida ["+idade+"]");
			return false;
		}
		return true;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if(validaIdade(idade)==false)
			return;
		
		this.idade = idade;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
}
