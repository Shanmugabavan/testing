public class Main {
    public static void main(String[] args) {
        System.out.println("From main");
        AnotherThread anotherThread=new AnotherThread();
        anotherThread.start();
        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                super.run();
            }
        });
        myRunnableThread.start();
        System.out.println("main2");
        MyRunnable myRunnable = new MyRunnable();
        Thread t=new Thread(myRunnable);
        t.start();
        new Thread(){
            public void run() {
                System.out.println("shanmu");
            }
        }.start();

    }
}
