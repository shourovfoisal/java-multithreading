public class MultiThreading {
    public static void main(String[] args) {

        for(int i = 0; i < 5; i++) {
            MultiThreadExtend multiThreadExtend = new MultiThreadExtend(i);
            multiThreadExtend.start();
        }
//        Even if the main thread throws an exception, the other threads will continue running normally
        throw new RuntimeException();
    }
}
