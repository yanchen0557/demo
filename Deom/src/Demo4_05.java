class MyException extends Exception{
	//�Զ����쳣��̳� Exception��
	public MyException(String msg){
		super(msg);             //����Exception������һ�������Ĺ��췽��
	}
};
public class Demo4_05 {

	public static void main(String[] args) {
		try{
			throw new MyException("�Զ����쳣��");
			//�׳��쳣
		}catch(Exception e){
			System.out.println(e);  //��ӡ������Ϣ
		}

	}

}
