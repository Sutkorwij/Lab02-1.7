import java.util.Arrays;

public class TrojkatNewton {
	
	private boolean znakNewton = true;

	public TrojkatNewton()
	{
	}
	
	public void znakSetter(boolean a){
		znakNewton = a;
	}
	
	public boolean znakGetter() {
		return znakNewton;
	}
	
	public String toString(int[] a) {
		return Arrays.toString(a);
	}
	
	
	private static int silnia(int a)
	{
		int ret = 1;
		for(int i=1; i<=a; i++)
		{
			ret *= i;
		}
		return ret;
	}
	public int[] dajWspolczynniki(int wiersz) {
		int[] ret = new int[wiersz+1];
		for(int i=0; i<=wiersz; i++)
		{
			ret[i] = silnia(wiersz)/(silnia(i)*silnia(wiersz-i));
		}
		if(znakNewton == false)
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
