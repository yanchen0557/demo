import java.util.Arrays;
 class Person implements Comparable <Person> {
	private int id;
	private String name;
	private int age;
	public Person(int id,String name,int age){
		this.id=id;
		this.name = name ;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person[id="+id+"name="+name+",age="+age+"]";
	}
	@Override
	public int compareTo(Person o) {
		int i=this.age-o.age;
		if(i==0) {
			return this.id-o.id;
		}
		return i;
	}
}
public class Demo5_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person per[] = new Person[] { new Person(1,"张三",18),
				new Person(2,"李四",23),
				new Person(3,"王五",26),new Person(4,"赵六",23)};
		Arrays.sort(per); //排序
		for(int i=0;i<per.length;i++){
			System.out.println(per[i]);
		}

	}

}
