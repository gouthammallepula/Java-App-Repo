import java.util.*;

class Garbage
{
	public static void main(String[] args) throws Exception 
	{
		Runtime rs = Runtime.getRuntime();
		System.out.println("Free memory in jvm before garbage collection = " + rs.freeMemory());
		rs.gc();
		System.out.println("Free memory in jvm after garbage collection = " + rs.freeMemory());
	}
}
