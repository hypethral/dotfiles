class Baker implements Runnable {
    BlockingQueue<coolingRack> coolingRacks = new LinkedBlockingQueue<coolingRack>(18);
    int cores = Runtime.getRuntime().availableProcessors();
    ExecutorService coolingRackThreadPool = Executors.newFixedThreadPool(cores);

    ScheduledExecutorService sched = Executors.newScheduledThreadPool(2);

    for (int i = 1; i <= 12; i++) {
        sched.scheduleAtFixedRate(coolingRackThreadPool.submit,
                i, 5, TimeUnit.SECONDS);
    }
    

    for (int i = 1; i <= 12; i++) {
        try { 
            Thread.sleep(random.nextInt(5001)); //In assignment Question
            runwayThreadPool.submit(new Plane(i, random.nextBoolean(), runways, gates));
            
        }catch (InterruptedException e) {
            e.printStackTrace(); //error handling method
            }	
    }
    gateThreadPool.shutdown(); 
    runwayThreadPool.shutdown();
}