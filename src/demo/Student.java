package demo;

public	class Student {
		// �����Ա����
		String strName;       //ѧ������
		String strNo;         
		int iAge;
		double dScore;
		void display(){
			System.out.println("ѧ�������� ��"+strName+"�ĳɼ�"+dScore+"ѧ�������"+iAge);
		}
		void display(String abc){
			System.out.println(abc);
		}
//		���� ���
		/**
		 * �ж�����Ƿ���ڵ�ǰѧ������� ������ڷ�true ����false
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
