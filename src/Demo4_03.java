class Maths{
	public int div(int i,int j) throws Exception{
		//定义除法操作，如果有异常，则交给被调用处处理
		int temp = i/j;        //计算，但是此处有可能出现异常
		return temp;
	}
}

public class Demo4_03 {

	public static void main(String[] args) throws Exception {
		Maths m = new Maths();  //实例化Math类对象
		System.out.println("除法操作；"+ m.div(10,0));

	}

}
