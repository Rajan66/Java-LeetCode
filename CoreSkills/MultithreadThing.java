package CoreSkills;

public class MultithreadThing extends Thread {
    private int threadNumber;

    public MultithreadThing(String name, int threadNumber) {
        this.threadNumber = threadNumber;
        super.setName(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + ": " + i);
            if(threadNumber == 0) throw new RuntimeException();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MultithreadThing myThread = new MultithreadThing("Thread " + (i), i);
            myThread.start();
        }

        throw new RuntimeException(); // to demonstrate multithreading doesn't block other threads
        // even if there is an exception in the main thread
    }
}
