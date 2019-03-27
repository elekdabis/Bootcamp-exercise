package parcela;

public class GlavniParcela {

	public static void main(String[] args) {
		Parcela[] parcela = new Parcela[4];
		Parcela n1 = new Njiva(800, 4);
		parcela[0] = n1;

		Parcela s1 = new Suma(2000, 10, 200, 2);
		parcela[1] = s1;

		for (int i = 0; i < parcela.length; i++) {
			if (parcela[i] == null)
				continue;
			System.out.println("Prinos " + parcela[i] + " je: " + parcela[i].prinos(3));

		}
		System.out.println(n1);
		System.out.println(s1);

	}

}
