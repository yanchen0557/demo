import java.util.InputMismatchException;
import java.util.Scanner;
public class Demo4_02 {

	public static void main(String[] args) {
	try{
		Scanner sc =new Scanner(System.in);
		  System.out.println("输入第一个数；");
	      int a =sc.nextInt();
	      System.out.println("输入第二个数：");
	      int b =sc.nextInt();
	      System.out.println("两数相除的结果为；"+a/b);
	} catch(InputMismatchException e) {  //输入不匹配异常
		System.out.println("你应该输入整数");
	} catch(ArithmeticException e) {     //算数异常
		System.out.println("除数不能为0");
	} catch(Exception e) {               //其他异常
		System.out.println("未知名错误");
	} finally {
		System.out.println("程序运行结束了");
	
	
	}

	}

}
