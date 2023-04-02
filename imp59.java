package pattern1;

public class imp59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=0;i<9;i++)
{
for(int j=0;j<5;j++)
{
if(j-i>=0)
System.out.print(j-i+1);
else if(j+i>=8)
	System.out.print(j+i-7);
else
	System.out.print(" ");
}
System.out.println();
}
	}

}
