package demo;
 
public	class Student {
		// 定义成员变量
		String strName;       //学生姓名
		String abc;
		String strNo;         
		int iAge;
		double dScore;
		void display(){
			System.out.println("学生的姓名 ："+strName+"的成绩"+dScore+"学生的年纪"+iAge);
		}
		void display(String abc){
			System.out.println(abc);
		}
//		反参 入参
		/**
		 * 判断入参是否大于当前学生的年纪 如果大于放true 否则false
		 * @param age
		 * @return 
		 */
		boolean compare(int age){
			if(iAge>=age){
				return true;
			}else{
				return false;
			}
		
		}
		boolean compare(int age,String acb){
			System.out.println(acb);
			if(iAge>=age){
				return true;
			}else{
				return false;
			}
		
		}
	}
