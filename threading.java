class CSThread extends Thread{
   public void run(){
    String name = Thread.currentThread().getName();
    try {
        for(int i=0;i<5;i++){
            System.out.print(name + " ");
            System.out.println(i);
            sleep(500);
        }
    } catch (Exception e) {
        System.out.println(e);
    }
   }
}

class ItThread extends Thread{
    public void run(){
        String name = Thread.currentThread().getName();
        try{
            for(int i=0;i<5;i++){
                System.out.print(name + " ");
                System.out.println(i);
                sleep(500);
            }
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
public class threading {
    public static void main(String args[]){
        CSThread t1 = new CSThread();
        ItThread t2 = new ItThread();

        t1.start();
        t2.start();
    }
}

