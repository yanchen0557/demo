import java.util.InputMismatchException;
import java.util.Scanner;
public class Demo4_02 {

	public static void main(String[] args) {
	try{
		Scanner sc =new Scanner(System.in);
		  System.out.println("�����һ������");
	      int a =sc.nextInt();
	      System.out.println("����ڶ�������");
	      int b =sc.nextInt();
	      System.out.println("��������Ľ��Ϊ��"+a/b);
	} catch(InputMismatchException e) {  //���벻ƥ���쳣
		System.out.println("��Ӧ����������");
	} catch(ArithmeticException e) {     //�����쳣
		System.out.println("��������Ϊ0");
	} catch(Exception e) {               //�����쳣
		System.out.println("δ֪������");
	} finally {
		System.out.println("�������н�����");
	
	
	}

	}

}
