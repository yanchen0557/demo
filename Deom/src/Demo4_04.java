
public class Demo4_04 {
	public static void printScore(int score) throws Exception{
		if(score<0||score>100){
			throw new Exception("����ĳɼ�����,������0__100֮�������");
		} else{
			System.out.println("�����ĳɼ��ǣ�"+score);
		}
	}
	


	public static void main(String[] args) {
		int score=-1;
		try{
			printScore(score);
		}catch(Exception e){
			System.out.println("������쳣��ϢΪ��"+e.getMessage());
		}
	}
	}
	