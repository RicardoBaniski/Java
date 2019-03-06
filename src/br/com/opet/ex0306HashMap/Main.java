package br.com.opet.ex0306HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {

		HashMap<String, Pessoa> col = new HashMap<String, Pessoa>();

		Pessoa p1 = new Pessoa("Fabio", "040123345345");
		Pessoa p2 = new Pessoa("Dias", "342525244");

		col.put(p1.getCpf(), p1);
		col.put(p2.getCpf(), p2);
//		col.put(p1.getCpf(), p2);

		System.out.println(col.size());

		for (Entry<String, Pessoa> e : col.entrySet()) {
			System.out.println(e.getValue().getNome());
		}
	}
}