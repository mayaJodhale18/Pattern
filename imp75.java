package pattern1;

public class imp75 {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
for(int i=2 ;i<9;i=i+2)
{
for(int j=0;j<9;j++)
{
	if(j-i<=0)
	{
		if(j==i/2)
			System.out.print(" ");
		else
			System.out.print("*");
	}
	else
		System.out.print(" ");
}
System.out.println();
}
	}

}
