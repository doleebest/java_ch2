
public class VarEx1 {

	public static void main(String[] args) {
	 final int score = 100;
	 boolean power = false;
	 
	 byte b = 127; // byte : -128~127
	 int oct = 010; // 8���� 10������ 8
	 int hex = 0x10; // 16����, 10������ 16
	 System.out.println(oct);
	 System.out.println(hex);
	 System.out.println(power);
	 
	 //long l = 1000_000_000; // int�� ���� < long ����
	 long l = 10_000_000_000L; // int�� ~20000000000(20��)
	 
	 float f = 3.14f; // f���� �Ұ�
	 double d = 3.14f; // f �ᵵ ok �ֳĸ� double>float
	
	 
	 System.out.println(10.);
	 System.out.println(.10);
	 System.out.println(10f);
	 System.out.println(1e3);
	 
	 char ch = 'A';
	 int i = 'a'; //�ڵ� ��ȣ ���
	 String string = "";
	 String str2 = "ABCD";
	 String str3 = "123";
	 String str4 = str2+str3;
	 System.out.println(str4);
	 System.out.println(i);
	 
	}

}
