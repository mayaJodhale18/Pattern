package pattern1;

public class a37 {

	public static void main(String[] args) {
int num=0;	// TODO Auto-generated method stub
for(int i=0;i<6;i++)
	{
		int num2=num;
		int def=5;
			for(int j=0;j<6;j++)
			{
				if(j-i<=0)
				{
					System.out.print((char)(num2+65));
					num2 =def+ num2;
					
				}
			}
			num++;
			System.out.println();
 
	}
			
	}

}
