
public class VarEx1 {

	public static void main(String[] args) {
	 final int score = 100;
	 boolean power = false;
	 
	 byte b = 127; // byte : -128~127
	 int oct = 010; // 8진수 10진수로 8
	 int hex = 0x10; // 16진수, 10진수로 16
	 System.out.println(oct);
	 System.out.println(hex);
	 System.out.println(power);
	 
	 //long l = 1000_000_000; // int의 범위 < long 범위
	 long l = 10_000_000_000L; // int는 ~20000000000(20억)
	 
	 float f = 3.14f; // f생략 불가
	 double d = 3.14f; // f 써도 ok 왜냐면 double>float
	
	 
	 System.out.println(10.);
	 System.out.println(.10);
	 System.out.println(10f);
	 System.out.println(1e3);
	 
	 char ch = 'A';
	 int i = 'a'; //코드 번호 출력
	 String string = "";
	 String str2 = "ABCD";
	 String str3 = "123";
	 String str4 = str2+str3;
	 System.out.println(str4);
	 System.out.println(i);
	 
	}

}
