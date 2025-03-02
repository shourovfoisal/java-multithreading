public class MultiThreadExtend extends Thread {

    private final int customId;

    public MultiThreadExtend(Integer customId) {
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
