class Baker implements Runnable {
    BlockingQueue<coolingRack> coolingRacks = new LinkedBlockingQueue<coolingRack>(18);
    int cores = Runtime.getRuntime().availableProcessors();
    ExecutorService coolingRackThreadPool = Executors.newFixedThreadPool(cores);

    ScheduledExecutorService sched = Executors.newScheduledThreadPool(2);

    for (int i = 1; i <= 12; i++) {
        sched.scheduleAtFixedRate(coolingRacks.add(new bun(i));,
                i, 5, TimeUnit.SECONDS);
    }
    coolingRackThreadPool.shutdown();
}