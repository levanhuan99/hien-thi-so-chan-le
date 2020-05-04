public class OddThread extends Thread {
    @Override
    public void run(){
        for (int i=0;i<11;i++){
            if(i%2!=0){
                System.out.println("so thu "+i);
            }
            try {
                Thread.sleep(15);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
