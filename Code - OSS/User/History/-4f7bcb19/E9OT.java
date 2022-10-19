class Baker implements Runnable {
    BlockingQueue<bun> coolingRacks;
    int cores = Runtime.getRuntime().availableProcessors();
    ExecutorService coolingRackThreadPool = Executors.newFixedThreadPool(cores);

    ScheduledExecutorService sched = Executors.newScheduledThreadPool(2);

    sched.scheduleAtFixedRate(coolingRacks.add(new bun(i));,
                12, 5, TimeUnit.SECONDS);
    coolingRackThreadPool.shutdown();
    public void run(){
        for (int i=0;i<12;++){
            bun b = new bun();
            try {
                coolingRack.put();
                System.out.println("baker - bun added!")
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}