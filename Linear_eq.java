package CONAM;
import java.util.Scanner;

public class Linear_eq {
	public static void main(String args[])
	{
		int i=0,j=0,k,u;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of variables you want in the pair of equations: ");
		int n = sc.nextInt();
		int a[][]= new int [n][n+1];
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n+1;j++)
			{
				System.out.println("enter coefficient a["+i+"]["+j+"] : ");
				a[i][j]= sc.nextInt();
			}
		}

			for(i=2;i<=n;i++)
			{
					u=a[i][1]/a[1][1];
					for(i=1;i<=n+1;i++)
					{
						a[i][j]=a[i][j]-(u*a[1][j]);
				    }
			}
		
	}
	

}
