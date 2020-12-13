
public class Demo4_04 {
	public static void printScore(int score) throws Exception{
		if(score<0||score>100){
			throw new Exception("输入的成绩有误,必须在0__100之间的整数");
		} else{
			System.out.println("该生的成绩是；"+score);
		}
	}
	


	public static void main(String[] args) {
		int score=-1;
		try{
			printScore(score);
		}catch(Exception e){
			System.out.println("捕获的异常信息为；"+e.getMessage());
		}
	}
	}
	