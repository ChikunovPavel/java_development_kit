package lesson5.lesson.task2;

public class Thread2 implements Runnable {

    private  int COUNTER  = 100;
    private volatile boolean SWITCHER;


    public Thread2(boolean SWITCHER) {
        this.SWITCHER = SWITCHER;
    }

    @Override
    public void run() {
        while (COUNTER >= 0){
            if(SWITCHER){
                System.out.println(COUNTER--);
            }
        }
    }
}

