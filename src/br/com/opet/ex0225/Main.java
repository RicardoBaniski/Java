package br.com.opet.ex0225;

public class Main {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa(66,"Tira");
		Carro c = new Carro(1966, "Mini");
		
		c.funcX();
		
		boolean atendida = p.solicitarParada(c);
		
		if(atendida == false){
			//Inicar perseguicao
		}
		
	}

}
