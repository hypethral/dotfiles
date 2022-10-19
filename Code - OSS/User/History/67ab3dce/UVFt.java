class Baker implements Runnable {
    BlockingQueue<coolingRack> coolingRacks = new LinkedBlockingQueue<coolingRack>(18);
    int cores = Runtime.getRuntime().availableProcessors();
    ExecutorService coolingRackThreadPool = Executors.newFixedThreadPool(cores);





}