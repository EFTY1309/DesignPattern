public class DemoSingleThread {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");

        // Create two threads with different values
        Thread thread1 = new Thread(() -> {
            Singleton singleton = Singleton.getInstance("FOO");
            System.out.println(singleton.value);
        });

        Thread thread2 = new Thread(() -> {
            Singleton anotherSingleton = Singleton.getInstance("BAR");
            System.out.println(anotherSingleton.value);
        });

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
