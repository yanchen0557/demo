import java.util.Scanner;


public class Demo2_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dArray[][]=new double[4][5];
		Scanner sc=new Scanner(System.in);
		//给数组赋值
		for(int i=0;i<4;i++){
			for(int j=0;j<5;j++){
				dArray[i][j]=sc.nextDouble();
			}
		}
		//从数组中找出最大的值
		double max=dArray[0][0];
		int iIndex=0,jIndex=0;
		for(int i=0;i<4;i++){
			for(int j=0;j<5;j++){
				if(dArray[i][j]>max){
					max=dArray[i][j];
					iIndex=i;
					iIndex=j;
				}
			}
		}
		System.out.println("该数组最大值是："+max);
		System.out.println("该数组最大值对应的行号："+iIndex+","+"列号；"+jIndex);

	}

}
