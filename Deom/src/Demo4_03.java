class Maths{
	public int div(int i,int j) throws Exception{
		//�������������������쳣���򽻸������ô�����
		int temp = i/j;        //���㣬���Ǵ˴��п��ܳ����쳣
		return temp;
	}
}

public class Demo4_03 {

	public static void main(String[] args) throws Exception {
		Maths m = new Maths();  //ʵ����Math�����
		System.out.println("����������"+ m.div(10,0));

	}

}
