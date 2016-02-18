import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FilePrint {
	public static void main(String[] args){
		try{
			new FilePrint().print("/tmp/log");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void print(String filepath) throws IOException{
		File inputFile = new File(filepath);
		InputStream inputStream = new FileInputStream(inputFile);
		try{
			while(inputStream.available()>0){
				System.out.print((char)inputStream.read());
			}
		}catch(IOException e){
			inputStream.close();
		}finally{
			inputStream.close();
		}
		
	}

}
