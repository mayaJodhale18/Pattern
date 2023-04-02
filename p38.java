package pattern1;

public class p38{

	public static void main(String[] args) {
int num=1;	// TODO Auto-generated method stub
for(int i=0;i<6;i++)
	{//int num2=num;
			for(int j=0;j<6;j++)
			{
				if(j-i<=0)
					System.out.print(num++);
				else
					System.out.print(" ");
 
			}
			
			System.out.println();
	}
	}
}

