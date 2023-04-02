package pattern1;

public class imp57{

	public static void main(String[] args) {
		//int num=0;
		int num=1;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j-i<=0)
					System.out.print(i+j-1+" ");
					//System.out.print((char)(num++ +65));
				else
					System.out.print(" ");

			}

			System.out.println();
		}
	}
}

