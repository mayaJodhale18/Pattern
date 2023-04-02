package pattern1;

public class a120{

	public static void main(String[] args) {
		for(int i=0;i<7;i++)
		{
		
			for(int j=0;j<6;j++)
			{
				if((i==0 || j==0  ||i==6 && j!=5 ||i==3 && j!=1 && j!=2 || j==4 &&i!=1 && i!=2 ))			
					System.out.print("*");
				else
					System.out.print(" ");
					
			}
					System.out.println();
		}

	}

}
