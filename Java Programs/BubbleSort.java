import java.util.Scanner;
class BubbleSort 
{
	public static void main(String[] args) 
	{
		int c,array[],n,temp=0;;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of elements");

		n = scan.nextInt();
		array = new int[n];

		System.out.println("enter the elements");
		
		for(int i=0;i<n;i++){
             array[i] = scan.nextInt();
		}

		for(int i =0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
                if(array[j] > array[j+1])
				{
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.println("The sorted elements are : ");
		for(int i =0;i<n;i++)
			System.out.println(array[i]);
	}
}
