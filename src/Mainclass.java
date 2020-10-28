public class Mainclass {

	public static void main(String[] args) {
		
		String str;
		int wiersz;
		int[] tablica;
		Trojkat trojkat = new Trojkat();
		TrojkatNewton trojkatNewton = new TrojkatNewton();


		System.out.println("Testy wersji rekurencyjnej\n\n");
		System.out.println("1) klasa ma pole znak, które domyœlnie jest ustawione na plus (true)");
			boolean zmienznak = trojkat.znakGetter();
			System.out.println(zmienznak);
		System.out.println("2) jeœli n<0 to zwracana jest pusta tablica i 7)");
			wiersz = -1;
			tablica = new int[wiersz+1];
			tablica = trojkat.dajWspolczynniki(wiersz);
			str = trojkat.toString(tablica);
			System.out.println(str);
		System.out.println("3) jeœli n=0, to wynikiem jest [1] i 8)");
			wiersz = 0;
			tablica = new int[wiersz+1];
			tablica = trojkat.dajWspolczynniki(wiersz);
			str = trojkat.toString(tablica);
			System.out.println(str);
		System.out.println("4) jeœli n=1, to wynikiem jest [1, 1]");
			wiersz = 1;
			tablica = new int[wiersz+1];
			tablica = trojkat.dajWspolczynniki(wiersz);
			str = trojkat.toString(tablica);
			System.out.println(str);
		System.out.println("5) jeœli n=1 i znak to minus to wynikiem jest [1, -1]");
			wiersz = 1;
			trojkat.znakSetter(zmienznak = false);
			tablica = new int[wiersz+1];
			tablica = trojkat.dajWspolczynniki(wiersz);
			str = trojkat.toString(tablica);
			System.out.println(str);
		System.out.println("6) jeœli n=3 i znak to plus to wynikiem jest [1, 3, 3, 1]");
			wiersz = 3;
			trojkat.znakSetter(zmienznak = true);
			tablica = new int[wiersz+1];
			tablica = trojkat.dajWspolczynniki(wiersz);
			str = trojkat.toString(tablica);
			System.out.println(str);
			
			
		System.out.println("\n\nTesty wersji z dwumianem Newtona\n\n");
		System.out.println("1) klasa ma pole znak, które domyœlnie jest ustawione na plus (true)");
			zmienznak = trojkatNewton.znakGetter();
			System.out.println(zmienznak);
		System.out.println("2) jeœli n<0 to zwracana jest pusta tablica i 7)");
			wiersz = -1;
			tablica = new int[wiersz+1];
			tablica = trojkatNewton.dajWspolczynniki(wiersz);
			str = trojkatNewton.toString(tablica);
			System.out.println(str);
		System.out.println("3) jeœli n=0, to wynikiem jest [1] i 8)");
			wiersz = 0;
			tablica = new int[wiersz+1];
			tablica = trojkatNewton.dajWspolczynniki(wiersz);
			str = trojkatNewton.toString(tablica);
			System.out.println(str);
		System.out.println("4) jeœli n=1, to wynikiem jest [1, 1]");
			wiersz = 1;
			tablica = new int[wiersz+1];
			tablica = trojkatNewton.dajWspolczynniki(wiersz);
			str = trojkatNewton.toString(tablica);
			System.out.println(str);
		System.out.println("5) jeœli n=1 i znak to minus to wynikiem jest [1, -1]");
			wiersz = 1;
			trojkatNewton.znakSetter(zmienznak = false);
			tablica = new int[wiersz+1];
			tablica = trojkatNewton.dajWspolczynniki(wiersz);
			str = trojkatNewton.toString(tablica);
			System.out.println(str);
		System.out.println("6) jeœli n=3 i znak to plus to wynikiem jest [1, 3, 3, 1]");
			wiersz = 3;
			trojkatNewton.znakSetter(zmienznak = true);
			tablica = new int[wiersz+1];
			tablica = trojkatNewton.dajWspolczynniki(wiersz);
			str = trojkatNewton.toString(tablica);
			System.out.println(str);
}
}
