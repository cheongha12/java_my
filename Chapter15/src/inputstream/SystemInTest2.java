package inputstream;

import java.io.IOException;

public class SystemInTest2 {
	public static void main(String[] args) {
		
		System.out.println("���ĺ� ���� ���� ���� [Enter]�� ��������");
		int i;
		try {
				while((i=System.in.read()) != '\n') {
					System.out.println((char)i);
				}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}