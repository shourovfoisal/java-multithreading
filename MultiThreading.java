public class MultiThreading {
    public static void main(String[] args) {

////        Extend test
//        for(int i = 0; i < 5; i++) {
//            MultiThreadExtend multiThreadExtend = new MultiThreadExtend(i);
//            multiThreadExtend.start();
//        }

//        Implement Test
        for(int i = 0; i < 5; i++) {
            MultiThreadImplement multiThreadImplement = new MultiThreadImplement(i);
            Thread myThread = new Thread(multiThreadImplement); // this line gives the start() method, as the class Thread has it.

            myThread.start();
        }

//        Even if the main thread throws an exception, the other threads will continue running normally
        throw new RuntimeException();

    }
}
