package test;
//第三个单例，DCL
public class test3 {

}
class zz{
    private volatile static zz zz1;
    public static zz getInstance(){
        if(zz1==null){
            synchronized (zz.class){
                if(zz1==null){
                    zz1=new zz();
                }
            }
        }
        return zz1;
    }
    private zz(){}
}
//对饿汉和懒汉单例的练习
//class sss{
//    private static sss s=new sss();
//    public static sss kk(){
//        return s;
//    }
//    private sss(){
//
//    }//私有化构造器
//}
//class sss2{
//    private static sss2 s2;
//    private sss2(){
//    }
//    public static sss2 s(){
//        if(s2==null){
//            s2=new sss2();
//        }
//        return s2;
//    }
//}