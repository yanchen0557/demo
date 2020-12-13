class MyException extends Exception{
	//自定义异常类继承 Exception类
	public MyException(String msg){
		super(msg);             //调用Exception类中有一个参数的构造方法
	}
};
public class Demo4_05 {

	public static void main(String[] args) {
		try{
			throw new MyException("自定义异常。");
			//抛出异常
		}catch(Exception e){
			System.out.println(e);  //打印错误信息
		}

	}

}
