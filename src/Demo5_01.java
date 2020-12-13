
public class Demo5_01 {

	public static void main(String[] args) {
	   byte[] b = {'a','b','c','d','e','f','g','h'};
	   char[] c = {'0','1','2','3','4','5','6','7','8','9'};
	   String sb = new String(b);
	   String sb_b = new String(b,2,4);
	   String sc = new String(c);
	   String sc_c = new String(c,2,4);
	   String sb_copy = new String(sb);
	   System.out.println("sb:"+sb);
	   System.out.println("sb_b:"+sb_b);
	   System.out.println("sc:"+sc);
	   System.out.println("sc_c:"+sc_c);
	   System.out.println("sb_copy:"+sb_copy);
	   }

}
