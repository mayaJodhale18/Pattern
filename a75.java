package pattern1;

public class a75 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++)
		{
			int cnt=0;
			for(int j=0;j<9;j++)
			{
				if(j+i>=4 && j-i<=4)
				{
					if(j<4)
						System.out.print((char)(cnt++ +65));
					else
						System.out.print((char)(cnt-- +65));
					
				}
				else
					System.out.print(" ");
					
			}
			System.out.println();
		}

	}

}
