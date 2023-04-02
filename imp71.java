package pattern1;

public class imp71 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		for(int i=0 ;i<9;i=i+2)
		{
			int cnt=1;
			for(int j=0;j<9;j++)
			{
				if(j-i<=0)
				{
					if(j<i/2)
						System.out.print(cnt++);
					else
						System.out.print(cnt--);
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
