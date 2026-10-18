package test;
//StringBuffer和StringBuilder都是可以直接修改的长度自动扩展的char数组（新=旧*2+2,如果扩展完依然放不下本次所要存的，直接取所需要的最小值）
//区别：线程、synchronized(StringBuffer有)--同步锁
public class test2 {
    public static void main(String[] args)  throws Exception {
//        StringBuilder s1=new StringBuilder();
//        System.out.println(s1.capacity());
////        for (int i = 0; i < 32; i++) {
////            s1.append(i);
////            System.out.println(s1.capacity());
////        }
//        StringBuffer s2=new StringBuffer();
//        System.out.println(s2.capacity());
//        for (int i = 0; i < 32; i++) {
//            s2.append(i);
//            System.out.println(s2.capacity());
//        }
//        StringBuilder ss=new StringBuilder();
//        Runnable r=()->{
//            for (int i = 0; i < 1000; i++) {
//                ss.append('x');
//            }
//        };
//        Thread t1=new Thread(r);
//        Thread t2=new Thread(r);
//        t1.start();
//        t2.start();
//        t1.join();
//        t2.join();
//        System.out.println("实际长度:"+ss.length());//t1和t2会打架，导致最终长度不够
          StringBuffer sb=new StringBuffer();
          Runnable r=()->{
              for (int i = 0; i < 1000; i++) {
                  sb.append('x');
              }
          };
          Thread t1=new Thread(r);
          Thread t2=new Thread(r);
          t1.start();
          t2.start();
          t1.join();
          t2.join();
          System.out.println("实际长度:"+sb.length());//t1 跑几次 append，切到 t2 跑几次 append，来回交替，**只是 append 内部不会打架**。
    }
}
