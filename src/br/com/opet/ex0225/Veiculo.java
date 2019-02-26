package br.com.opet.ex0225;

public class Veiculo {
	int ano;
	
	protected void calcularPotencia(){
		System.out.println("Potencia estimada");
	}
	
	public void funcX(){
		System.out.println("Estou na classe Veiculo");
	}
	
	public void funcX(int X){
		System.out.println("Estou na classe Veiculo com variavel X = " + X);
	}
	
	public void funcX(String X){
		funcX(Integer.parseInt(X));
	}
}
