import java.util.Random;
class RandomNumber 
{
	public static void main(String[] args) 
	{
		Random t = new Random();
		for(int i=0;i<5;i++)
			System.out.println(t.nextInt(10000000));
	}
}
