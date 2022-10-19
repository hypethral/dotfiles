class Worker implements Runnable{
    BlockingQueue<coolingRack> coolingRacks = new LinkedBlockingQueue<coolingRack>(18);
    BlockingQueue<shelf> shelfs = new LinkedBlockingQueue<shelf>(10);
}