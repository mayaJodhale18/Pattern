package pattern1;

public class patter50recursion {

	public static void main(String[] args) {
		int i=0;
		loopi(i);
	}

	private static void loopi(int i) 
	{
		if(i<7)
		{
			int j=0;
			loopj(i,j);
			System.out.println();
			i++;
			loopi(i);
		}
	}

	private static void loopj(int i, int j)
	{
		if(j<10)
		{
			int k=0;
			System.out.print("");
			loopk(k,j);
			j++;
			loopj(i,j);
		}
	}

	private static void loopk(int k, int j) {
		if(k<3)
		{
			System.out.print(j);
			k++;
			loopk(k,j);
		}
	}

}
