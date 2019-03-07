package br.com.opet.ex0306_2;

import java.util.HashMap;
import java.util.Random;

import com.opet.util.Reader;

public class Main {

	public static void main(String[] args) throws Exception {
		HashMap<Integer, Integer> col = new HashMap<Integer, Integer>();

		random(col);

		System.out.println("Tamanho:" + col.size());

		System.out.print("Informe um valor inteiro de 0 a 199: ");
		int val = Reader.readInt();

		if (col.containsKey(val)) {
			System.out.println("Valor " + val + " encontrado, e foi gerado na iteracao " + col.get(val));
		} else {
			System.out.println("Nao encontrou o valor " + val);
		}
	}

	public static void random(HashMap<Integer, Integer> col) {
		Random r = new Random();

		int idx = 0;
		while (col.size() != 100) {
			int val = r.nextInt(200);

			if (!col.containsKey(val))
				col.put(val, idx);
			idx++;
		}
	}
}