class Worker implements Runnable{
    BlockingQueue<coolingRack> coolingRacks = new LinkedBlockingQueue<coolingRack>(18);
    BlockingQueue<shelf> shelfs = new LinkedBlockingQueue<shelf>(10);
    ScheduledExecutorService sched = Executors.newScheduledThreadPool(2);
    sched.scheduleAtFixedRate(coolingRacks.remove();,
                4, 1, TimeUnit.SECONDS);

                
}