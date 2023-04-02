package pattern1;

public class vip {

	public static void main(String[] args) {
		for(int i=0;i<9;i=i+1)
		{
			for(int j=0;j<9;j++)
			{
				if(i==8 || i==0 && j==3 || i==2 && j==2 ||i==4 && j==1||
						i==6 && j==0 || i==2 && j==5|| i==4 && j==6||
						i==6 && j==7)	
						System.out.print(2);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}