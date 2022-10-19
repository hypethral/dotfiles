class Worker implements Runnable{
    BlockingQueue<coolingRack> coolingRack;
    BlockingQueue<shelf> shelf;
    ScheduledExecutorService sched = Executors.newScheduledThreadPool(2);
    sched.scheduleAtFixedRate(new logic;,
                4, 1, TimeUnit.SECONDS);
    public void run(){

    }


}