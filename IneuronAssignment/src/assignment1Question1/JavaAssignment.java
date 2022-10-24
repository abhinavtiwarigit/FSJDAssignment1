package assignment1Question1;

public class JavaAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(
						(j==(n-1)/2 && i>=0) 
						 )   // I
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++ )
			{
				if(j==0 && i>=0 
						||
						j==(n-1) && i>=0
						||
						i==j)  //N
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++)
			{
				if(
						(j==(n-1)/2 && i>=0) || (j>=(n-1)/2 && i==0) ||  (j>=(n-1)/2 && i==(n-1)/2)
						|| (j>=(n-1)/2 && i==(n-1))
						 )   // E
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++)	//spaces
			{
				if((j>=0 && j<=n/4 && i>=0) )
				{
					System.out.print(" ");
				}

			}
			for(int j=0;j<n;j++ )
			{
				if(j==0 && i>=0 && i<(n-1)
						||
						j==(n-1) && i>=0 && i<(n-1)
						||
						i>(n-1) && i !=0 && j>(n-1)
						|| i==(n-1) && j>0 && j<(n-1))  // U
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++)	//spaces
			{
				if((j>=0 && j<=n/4 && i>=0) )
				{
					System.out.print(" ");
				}

			}
			for(int j=0;j<n;j++ )
			{
				if(j==0 && i>=0 
					|| (i==0 && j!=(n-1))
					|| (j==(n-1) && i!=0 && i<(n-1)/2)
					|| (i==(n-1)/2 && j!=(n-1))
					|| i==j && i>(n-1)/2 && j>(n-1)/2
						)  //R
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++)	//spaces
			{
				if((j>=0 && j<=n/4 && i>=0) )
				{
					System.out.print(" ");
				}

			}
			for(int j=0;j<n;j++ )
			{
				if(j==0 && i>0 && i<(n-1)
						||
						j==(n-1) && i>0 && i<(n-1)
						||
						i>(n-1) && i !=0 && j>(n-1)
						|| i==(n-1) && j>0 && j<(n-1)
						||i==0 && j>0 && j<(n-1))  // O
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++)	//spaces
			{
				if((j>=0 && j<=n/4 && i>=0) )
				{
					System.out.print(" ");
				}

			}
			for(int j=0;j<n;j++ )
			{
				if(j==0 && i>=0 
						||
						j==(n-1) && i>=0
						||
						i==j)  //N
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			
			System.out.println();
		}


	}

}
