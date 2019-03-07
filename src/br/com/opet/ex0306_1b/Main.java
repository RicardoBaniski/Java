package br.com.opet.ex0306_1b;

import java.util.HashSet;
import java.util.Random;

import com.opet.util.Reader;

public class Main {

	public static void main(String[] args) throws Exception {
		HashSet<Integer> col = new HashSet<Integer>();

		random(col);

		System.out.println("Tamanho:" + col.size());

		System.out.print("Informe um valor inteiro de 0 a 199: ");
		int val = Reader.readInt();

		if (col.contains(val)) {
			System.out.println("Valor " + val + " encontrado!");
		} else {
			System.out.println("Nao encontrou o valor " + val);
		}
	}

	public static void random(HashSet<Integer> col) {
		Random r = new Random();

		for (int i = 0; i < 100; i++) {
			col.add(r.nextInt(200));
		}
	}
}