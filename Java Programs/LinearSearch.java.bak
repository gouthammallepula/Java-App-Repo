import java.util.Scanner;
class LinearSearch
{
	public static void main(String[] args) 
	{
		int c,n,key,array[],i=0,k=0;
		Scanner scan = new Scanner(System.in);
		
		//reading data
		//no of numbers
		System.out.println("Enter the no of elements");
		n = scan.nextInt();
		array = new int[n];

		//giving elements
		System.out.println("Enter the elements");
		for(i=0;i<n;i++)
			array[i] = scan.nextInt();

		//givng the key
		System.out.println("Enter the key");
		key = scan.nextInt();
		
		//searching the key
		for(i=0;i<n;i++){
			if(key == array[i]){
				System.out.println("Element found at index " + i);
				k = k + 1;
			}
		}
		
		//if element is not found
		if(k == 0)
			System.out.println(key + " not found");

	}
}
