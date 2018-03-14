import java.util.Scanner;
class BinarySearch 
{
	public static void main(String[] args) 
	{
		int c,n,search,first,middle,last,array[];
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the no of elements");
		n = scan.nextInt();
		array = new int[n];

		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			array[i] = scan.nextInt();
		}

		System.out.println("Enter the  key");
		search = scan.nextInt();

		first = 0;
		last = n-1;
		middle = (first + last)/2;

		while(first <= last)
		{
			if(middle < search)
			{
				first = middle + 1;
			}
			else if(middle == search)
			{
				System.out.println(search + " found at index " + (middle -1) );
				break;
			}
			else
				last = middle - 1;

			middle = (first + last)/2;
		}
		if(first > last)
			System.out.println(search + " not found");

	}
}
