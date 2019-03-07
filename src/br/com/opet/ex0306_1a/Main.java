package br.com.opet.ex0306_1a;

import java.util.ArrayList;
import java.util.Random;

import com.opet.util.Reader;

public class Main {

	public static void main(String[] args) throws Exception {
		ArrayList<Integer> col = new ArrayList<Integer>();

		random(col);

		System.out.print("Informe um valor inteiro de 0 a 199: ");
		int val = Reader.readInt();

		if (col.contains(val)) {
			System.out.println("Valor " + val + " encontrado!");
		} else {
			System.out.println("Nao encontrou o valor " + val);
		}
	}

	public static void random(ArrayList<Integer> col) {
		Random r = new Random();

		for (int i = 0; i < 100; i++) {
			col.add(r.nextInt(200));
		}
	}
}