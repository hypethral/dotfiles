class Worker implements Runnable{
    BlockingQueue<coolingRack> coolingRacks;
    BlockingQueue<shelf> shelfs;
    ScheduledExecutorService sched = Executors.newScheduledThreadPool(2);
    sched.scheduleAtFixedRate(new logic;,
                4, 1, TimeUnit.SECONDS);


}