package demo;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		������Ϣ10����
	Student student =	new Student();  
	student.iAge=18;
	student.dScore=100;
	student.strName="����";
	student.strNo="1";
	Student student2 =	new Student();  
	student2.iAge=25;
	student2.dScore=60;
	student2.strName="��Ц";
	student2.strNo="2";
	student.display("chen");
	boolean result=student.compare(18);
	if(result){
		System.out.println("ѧ��"+student.strName+"�ǳ�����");
	}
	student2.display();
	boolean result2=student2.compare(18);
	if(result2){
		System.out.println("ѧ��"+student2.strName+"�ǳ�����");
	}
	String acb = "����";
	boolean s=student.compare(18, acb);
	System.out.print(s);
	}

}
