package demo;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		你先休息10分钟
	Student student =	new Student();  
	student.iAge=18;
	student.dScore=100;
	student.strName="陈燕";
	student.strNo="1";
	Student student2 =	new Student();  
	student2.iAge=25;
	student2.dScore=60;
	student2.strName="陈笑";
	student2.strNo="2";
	student.display("chen");
	boolean result=student.compare(18);
	if(result){
		System.out.println("学生"+student.strName+"是成年人");
	}
	student2.display();
	boolean result2=student2.compare(18);
	if(result2){
		System.out.println("学生"+student2.strName+"是成年人");
	}
	String acb = "测试";
	boolean s=student.compare(18, acb);
	System.out.print(s);
	}

}
