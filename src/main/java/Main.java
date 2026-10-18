public class Main {
    public static void main(String[] args) {
       //Singleton S1=new Singleton();
        Singleton1 s1=Singleton1.create();
        Singleton1 s2=Singleton1.create();
        System.out.println(s1==s2);
        System.out.println("---------------------------------");
        Singleton2 k1=Singleton2.create1();
        Singleton2 k2=Singleton2.create1();
        System.out.println(k1==k2);

        //懒汉式多线程不安全
        Thread t1=new Thread(()->{});
    }
}
class Singleton1{//饿汉单例测试
    private static Singleton1 instance=new Singleton1();//内部创建静态对象，先于调用
    public static Singleton1 create(){//提供公共的静态方法，返回类的对象
        return instance;
    }
    //私有化构造器
    private Singleton1(){}
}
class Singleton2{//懒汉单例
    private static Singleton2 instance=null;//声明当前对象，不初始化对象
    private  Singleton2(){}
    public static Singleton2 create1(){
        if(instance==null){
            instance=new Singleton2();//在调用时创建
        }
        return instance;
    }
}