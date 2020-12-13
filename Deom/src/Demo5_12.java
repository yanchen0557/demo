import java.util.HashMap;
import java.util.Map;


public class Demo5_12 {

	public static void main(String[] args) throws Exception  {
	Map<Integer,String>map = new HashMap<Integer,String>();
	map.put(1,"a");
	map.put(null,"Пе");
	map.put(2,"c");
	map.put(3,"d");
	System.out.println(map.get(1));
	map.put(1,"b");
	System.out.println(map.get(1));
	System.out.println(map.get(null));
	}

}
