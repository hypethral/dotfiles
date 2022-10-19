class Baker implements Runnable {
    BlockingQueue<bun> coolingRacks = new LinkedBlockingQueue<bun>(18);
    int cores = Runtime.getRuntime().availableProcessors();
    ExecutorService coolingRackThreadPool = Executors.newFixedThreadPool(cores);

    ScheduledExecutorService sched = Executors.newScheduledThreadPool(2);

    sched.scheduleAtFixedRate(coolingRacks.add(new bun(i));,
                12, 5, TimeUnit.SECONDS);
    coolingRackThreadPool.shutdown();

    public void run(){

    }
}