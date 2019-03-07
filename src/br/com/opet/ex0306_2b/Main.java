package br.com.opet.ex0306_2b;

import java.util.HashMap;
import java.util.Random;

import com.opet.util.Reader;

public class Main {

	public static void main(String[] args) throws Exception {
		HashMap<Integer, Valor> col = new HashMap<Integer, Valor>();

		random(col);

		System.out.println("Tamanho:" + col.size());

		System.out.print("Informe um valor inteiro de 0 a 199: ");
		int val = Reader.readInt();

		if (col.containsKey(val)) {
			System.out.println("Valor " + col.get(val).getValor()
					+ " encontrado, e foi gerado na iteracao " 
					+ col.get(val).getInteracao());
		} else {
			System.out.println("Nao encontrou o valor " + val);
		}
	}

	public static void random(HashMap<Integer, Valor> col) {
		Random r = new Random();

		int idx = 0;
		while (col.size() != 100) {
			int IntLido = r.nextInt(200);
			
			Valor val = new Valor(IntLido,idx);

			if (!col.containsKey(val))
				col.put(val.getValor(), val);
			idx++;
		}
	}
}