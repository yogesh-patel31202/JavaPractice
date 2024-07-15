import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExceptionThrowsKeywordExampleTwo {


	public static void name(String[] arg) {
		
		ReadAndWrite obj=new ReadAndWrite();
		
		
			try {
				obj.readFile();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
try {
			obj.saveFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}



class ReadAndWrite {

	void readFile() throws FileNotFoundException  {
		FileInputStream fis = new FileInputStream("d:abc.text");
	}
	
	void saveFile() throws FileNotFoundException {
		String text="good";
		FileOutputStream fos = new FileOutputStream("d:xyz.text");
	}

}
