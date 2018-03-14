import java.io.File;
import java.io.IOException;

class CreateFile 
{
	public static void main(String[] args) 
	{
		for(int i =0;i<10;i++){
		try{
			File file = new File("F:/Java-App-Repo/Java-App-Repo/Java Programs/files/file"+ i +".txt");
			if(file.createNewFile())
				System.out.println("success");
			else
				System.out.println("The file already exists");
		}catch(IOException e){
			e.printStackTrace();
	}
		}
	}
}
