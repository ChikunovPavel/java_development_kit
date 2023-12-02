package lesson5.lesson.task2;

public class Thread1 implements Runnable {
    private  volatile boolean SWITCHER;


    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
                SWITCHER = !SWITCHER;
                System.out.println(SWITCHER);
            }catch (InterruptedException e){
                System.out.println("Конец");
                break;
            }
        }
    }

    public boolean isSWITCHER() {
        return SWITCHER;
    }
}
