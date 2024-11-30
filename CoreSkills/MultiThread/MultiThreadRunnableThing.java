package CoreSkills.MultiThread;

public class MultiThreadRunnableThing implements Runnable {
    private int threadNumber;

    public MultiThreadRunnableThing(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " from thread " + threadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        MultiThreadRunnableThing myBlockThing = new MultiThreadRunnableThing(10);
        Thread myBlockThread = new Thread(myBlockThing);
        myBlockThread.start();
        try {
            myBlockThread.join(); // waits for a particular thread to finish running then only goes to the next thread
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }

        for (int i = 0; i < 5; i++) {
            MultiThreadRunnableThing myThing = new MultiThreadRunnableThing(i);
            Thread myThread = new Thread(myThing);
            myThread.start();
        }

        System.out.println("Message from the thread: " + Thread.currentThread().getName());
        System.out.println("Priority for main thread: " + Thread.currentThread().getPriority());
        if (myBlockThread.isAlive()) {
            System.out.println("Motheryucker don't block the line");
        } else {
            System.out.println("Oops... you dead already?");
        }

    }

}
