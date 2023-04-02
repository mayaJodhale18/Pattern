package pattern1;

public class imp77 {

	public static void main(String[] args) {
		int cnt=1;
		for(int i=0;i<5;i++)
		{
			int cnt2=cnt;
			int dif=4;
			for(int j=0;j<5;j++)
			{
				if(j-i<=0)
				{
					System.out.print(cnt2);
					cnt2=dif+cnt2;
					dif--;
					}
			}
			cnt++;
			System.out.println();
		}
	}

}
