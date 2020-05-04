public class TestThread {

    public static void main(String[] args) {
        EvenThread evenThread=new EvenThread();
        OddThread oddThread=new OddThread();

        Thread thread1=new Thread(evenThread);
        Thread thread2=new Thread(oddThread);
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread1.start();


    }

}
