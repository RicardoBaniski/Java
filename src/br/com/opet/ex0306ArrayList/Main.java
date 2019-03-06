package br.com.opet.ex0306ArrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Pessoa> col = new ArrayList<Pessoa>();

		Pessoa p1 = new Pessoa("Fabio", "040123345345");
		Pessoa p2 = new Pessoa("Dias", "342525244");

		col.add(p1);
		col.add(p2);
		col.add(p1);

		System.out.println(col.size());
		
		for (Pessoa pessoa : col) {
			System.out.println(pessoa.getNome());
		}
	}
}