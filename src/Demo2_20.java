import java.util.Scanner;


public class Demo2_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dArray[][]=new double[4][5];
		Scanner sc=new Scanner(System.in);
		//�����鸳ֵ
		for(int i=0;i<4;i++){
			for(int j=0;j<5;j++){
				dArray[i][j]=sc.nextDouble();
			}
		}
		//���������ҳ�����ֵ
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
		System.out.println("���������ֵ�ǣ�"+max);
		System.out.println("���������ֵ��Ӧ���кţ�"+iIndex+","+"�кţ�"+jIndex);

	}

}
