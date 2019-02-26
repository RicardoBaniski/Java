package br.com.opet.ex0225;

public class Carro extends Veiculo{
	// Atributos
	String modelo;

	//Construtor
	public Carro(int ano, String modelo){
		this.ano = ano;
		this.modelo = modelo;
	}
		
	// Metodos
	boolean desacelera(){
		return false;
	}
	
	public void funcX(){
		super.funcX(10);
	}

}
