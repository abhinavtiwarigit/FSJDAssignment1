package yourName;

public class Abhinav {

	public static void main(String[] args) 
	{
		
		int n=10;

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((j==0 && i>0) ||
						(i==0 && j>0 && j<(n-1)/2) ||
						((j==(n-1)/2) && i>0) || 
						(i==(n-1)/2 && j<=(n-1)/2) )   // A
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
				if((j==0 && i>0) 
					||
					(i==0 && j>0 && j<(n-1)/2) 
						||
			(j==(n-1)/2 && i>0 && i!=(n-1)/2 && i<(n-1) ) 
			 || 
						(i==(n-1)/2 && j<(n-1)/2) ||
						(i==n-1 && j<(n-1)/2)
						)  // B
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
				if((j==0 && i>=0) ||
						(j==(n-1)/2 && i>=0) || 
						(i==(n-1)/2 && j<=(n-1)/2) )   // H
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
				if((j==(n-1)/2 && i>=0) || i==0 || i==(n-1) )   // I
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
				if((j==0 && i>=0) )
//						||
//						(j==(n-1)/2 && i>=0) || 
//						(i==(n-1)/2 && j<=(n-1)/2) )   // H
				{
					System.out.print(" ");
				}
//				else
//				{
//					System.out.print(" ");
//				}
			}
			for(int j=0;j<n;j++)
			{
				if((j==0 && i>=0) )
//						||
//						(j==(n-1)/2 && i>=0) || 
//						(i==(n-1)/2 && j<=(n-1)/2) )   // H
				{
					System.out.print(" ");
				}
//				else
//				{
//					System.out.print(" ");
//				}
			}
//			for(int j=0;j<n;j++)
//			{
//				if((j==0 && i>=0) )
//				{
//					System.out.print(" ");
//				}
//
//			}

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
				if((j==0 && i>=0) )
//						||
//						(j==(n-1)/2 && i>=0) || 
//						(i==(n-1)/2 && j<=(n-1)/2) )   // H
				{
					System.out.print(" ");
				}
//				else
//				{
//					System.out.print(" ");
//				}
			}
			for(int j=0;j<n;j++)
			{
				if((j==0 && i>=0) )
//						||
//						(j==(n-1)/2 && i>=0) || 
//						(i==(n-1)/2 && j<=(n-1)/2) )   // H
				{
					System.out.print(" ");
				}
//				else
//				{
//					System.out.print(" ");
//				}
			}
			for(int j=0;j<n;j++)
			{
				if((j==0 && i>=0) )
//						||
//						(j==(n-1)/2 && i>=0) || 
//						(i==(n-1)/2 && j<=(n-1)/2) )   // H
				{
					System.out.print(" ");
				}
//				else
//				{
//					System.out.print(" ");
//				}
			}
			for(int j=0;j<n;j++)
			{
				if((j==0 && i>0) ||
						(i==0 && j>0 && j<(n-1)/2) ||
						((j==(n-1)/2) && i>0) || 
						(i==(n-1)/2 && j<=(n-1)/2) )   // A
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
//V
			for(int j=0;j<n;j++)
            {
                // D1
                if(i==j)
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
                //D2
                if(i+j==n-1)
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
