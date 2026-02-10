import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class ReadFileData
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File f = new File("c:/Users/itsbh/Desktop/Capgemini/test.txt");
		Scanner sc = new Scanner(f);
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
	}
}
