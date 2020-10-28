import java.util.Arrays;

public class Trojkat {
private boolean znak = true; // je¿eli znak == true - znak to +

public Trojkat()
{	
}
public void znakSetter(boolean a){
	znak = a;
}

public boolean znakGetter() {
	return znak;
}

public String toString(int[] a) {
	return Arrays.toString(a);
}

public int[] dajWspolczynniki(int wiersz){
	int wspolczynnik = 1;
	int[][] wsp;
	wsp = new int[wiersz+1][wiersz+1];
	int[] ret;
	ret = new int[wiersz+1];
	for(int i = 0; i<= wiersz; i++){
		for(int j = 0; j <= i; j++)
		{
			if(j == 0 || i == 0) {
				wspolczynnik = 1;
			}
			else {
				wspolczynnik = wspolczynnik * (i - j + 1) / j;
			}
			wsp[i][j] = wspolczynnik;
		}
	}	
	for(int i = 0; i<=wiersz; i++)
	{
		ret[i] = wsp[wiersz][i];
	}
	if(znak == false)
	{
		for(int i = 0; i<=wiersz; i++)
		{
			if(i%2 == 1)
			{
				ret[i] = -ret[i];
			}
		}
	}
	return ret;
}

}
