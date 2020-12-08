package demenagement;

public class Algorythme {
	public static void main(String[] args) {
		int quantite_ancien_local = 34;
		int caisses_en_transport = 0;
		int caisses_max_transport = 9;
		while (quantite_ancien_local > 0) {
			System.out.println(" ");
			while (caisses_en_transport < caisses_max_transport && quantite_ancien_local > 0) {
				quantite_ancien_local--;
				caisses_en_transport++;
			}
			System.out.print("|Un voyage de " + caisses_en_transport + " cartons.|");
			while (caisses_en_transport > 0) {
				caisses_en_transport--;
			}
		}
	}
}