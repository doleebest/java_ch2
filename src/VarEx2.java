import javax.net.ssl.CertPathTrustManagerParameters;

public class VarEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10/3);
		System.out.println(10.0/3);
		System.out.printf("%d\n",15);
		System.out.printf("%#o\n",15);
		System.out.printf("%#x\n",15);
		System.out.printf("%s\n",Integer.toBinaryString(15));

		double f=123.456789;
		System.out.printf("%f\n",f); //float�� 7�ڸ������� ��Ȯ
		System.out.printf("%e\n",f); //float�� 7�ڸ������� ��Ȯ
		System.out.printf("%g\n",f); //float�� 7�ڸ������� ��Ȯ
									// double�� 9�ڸ����� ��Ȯ
		
		System.out.println();
		System.out.printf("[%5d]\n",10);
		System.out.printf("[%-5d]\n",10); //��������
		System.out.printf("[%05d]\n",10); //��������
		System.out.printf("[%05d]\n",1234567); //�������ڸ�>�����ڸ� -> ������������
		
		System.out.println();
		double d = 1.23456789;
		
		System.out.printf("%f\n",d);
		System.out.printf("%14.10f",d);
		
		System.out.println();
		System.out.printf("[%s]\n","www.codechobo.com");
		System.out.printf("[%20s]\n","www.codechobo.com");
		System.out.printf("[%.10s]\n","www.codechobo.com"); //.+���� = �Ϻθ� ��°���	
	}

}
