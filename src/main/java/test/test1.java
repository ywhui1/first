package test;
public class test1 {
    public static void main(String[] args) {
        String s="hello";
        System.out.println(s);
        s.concat("world");
        System.out.println(s);
        System.out.println(s.concat("world"));


        String s1="abc";//常量池
        String s2=new String("abc");//直接在堆里面新建一个String对象
        System.out.println(s1==s2);//比较地址
        System.out.println(s1.equals(s2));//比较字符内容
    }
}
