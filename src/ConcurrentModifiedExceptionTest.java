import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModifiedExceptionTest extends Thread {


    public static void main(String[] args) {
//        Thread t1 = new ConcurrentModifiedExceptionTest();
//        Thread t2 = new ConcurrentModifiedExceptionTest();
//        t1.start();
//        t2.start();
        test();

    }

    @Override
    public void run() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        for (int i = 10; i < 50; i++) {
            list.remove(i);
        }
    }

    private static void test() {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<100;i++){
            list.add(i);
        }
        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()){
            int i = iterator.next();
            if(i==5){
                list.remove(i);
            }

        }
    }
}
