package br.com.opet.cadastro;

import com.opet.util.Reader;

public class Main {

	public static void main(String[] args) throws Exception {

		Pessoas p = new Pessoas();

		int opc = -1;
		opc = menu();

		while (opc != 0) {
			switch (opc) {
			case 1:

				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 0:

				break;
			default:
				System.out.println("opção inválida");
			}
			System.out.println("");
			opc = menu();
		}
	}

	public static int menu() throws Exception {
		int opc = -1;

		System.out.println("MENU PRINCIPAL:\n");
		System.out.println("1 - CADASTRAR");
		System.out.println("2 - LISTAR");
		System.out.print("\nOPÇÃO: ");

		opc = Reader.readInt();
		System.out.println("");

		return opc;
	}
}