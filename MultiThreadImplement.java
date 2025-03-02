// This is the same as the class-based variation, but provides more flexibility of extending another class

public class MultiThreadImplement implements Runnable {

    private final int customId;

    public MultiThreadImplement(Integer customId) {
        this.customId = customId;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(i + " form thread " + customId);

//            Other threads don't get affected when one throws exception
            if(customId == 2) {
                throw new RuntimeException();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}