package demo;

public class Demo2_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<10;i++){
			for(int j=1;j<10;j++){
				System.out.println(i+"*"+j+"="+i*j+"");
				if(i==j){
					System.out.println();
					return;
				}
			}
		}

	}

}
