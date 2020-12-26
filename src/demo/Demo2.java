package demo;

public class Demo2 {
    /**
     * 常量
     * <p>
     * final：不可变
     * 成员变量
     */
    private static final int ABC = 18;

    public int test88 = 88;

    /**
     * public:公开
     * protected 默认 本包内部可以调用
     * private：私有 只有本类才能调用
     * 修饰符
     * <p>
     * static:静态
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(ABC);
        if (ABC < 19) {
            System.out.println("-sdfdskjfds");
        }

    }

    public static void test() {
        System.out.println("test");
    }

    private void test2() {
//
        System.out.println("test2");

    }

    protected void test3() {
        System.out.println("test3");
    }

    //        test4(1)=1;
//        test4(2)=test4(1)*2=1*2;
//        test4(3)=test4(2)*3=1*2*3
//    n!=n*(n-1)*(n-2)...*1
//    假设 f(n)=n*(n-1)*(n-2)...*1
//   那么 f(n-1)=(n-1)*(n-2)...*1
//   那么 f(n)=n*f(n - 1)
//    1+2...n 算法和数学
    int digui(int n) {
        if (n <= 1) return 1;
        return digui(n - 1) * n;
    }

    public void test5(String str) {
        System.out.println(str);
    }
}
