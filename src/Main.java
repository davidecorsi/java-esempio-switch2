
public class Main {
	public static void main(String[] args) {
		int m = 3;

		switch(m) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("Mese di 31 giorni");
				break;
			case 2:
				System.out.println("Mese di 28 giorni");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("Mese di 30 giorni");
				break;
			default:
				System.out.println("Mese non valido");
				break;
		}
	}
}
