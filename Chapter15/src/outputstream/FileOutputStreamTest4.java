package outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest4  {
	public static void main(String[] args)throws IOException {
		
		FileOutputStream fos = null;
		fos = new FileOutputStream("output4.txt",true);
		
		fos.write(65);
		fos.write(66);
		fos.write(67);
		
		fos.flush();
		fos.close();
		
		System.out.println("출력이 완료되었습니다.");
	}

}
