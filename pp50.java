package pattern1;

public class pp50 {

	public static void main(String[] args) {
		int i=0;
		loopi(i);
	
	}

	private static void loopi(int i) {
		if(i<8)
		{
			int j=0;
			loopj(i,j);
			System.out.println();
			i++;
			loopi(i);
		}
	}

	private static void loopj(int i, int j) {
		if(j<30)
		{
			System.out.print(j/3);
			j++;
			loopj(i,j);
		}
	}
}


