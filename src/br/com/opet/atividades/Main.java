package br.com.opet.atividades;

import com.opet.util.Reader;

public class Main {

	public static void main(String[] args) throws Exception {

		Aluno a = new Aluno();
		Escola e = new Escola();

		// a.setNome("Viviane");
		// a.setIdade(16);
		// a.setSexo("Feminino");
		// a.setAltura(69.5);

		System.out.print("DADOS DO ALUNO\nDigite o nome: ");
		a.setNome(Reader.readString());
		System.out.print("Digite a Idade:");
		a.setIdade(Reader.readInt());
		System.out.print("Digite o sexo:");
		a.setSexo(Reader.readString());
		System.out.print("Digite a altura:");
		a.setAltura(Reader.readDouble());

		System.out.println();

		e.nomeEscola = "Opet";
		e.nivel = "Superior";

		boolean valida = a.validaIdade();

		if (valida == true) {
			System.out.println("Idade insuficiente para ingressar na Faculdade!");
		}

		System.out.println(
				e.nomeEscola + " - " + e.nivel + " - " + a.getNome() + " - " + a.getIdade() + " - " + a.getSexo() + " - " + a.getAltura());

	}
}