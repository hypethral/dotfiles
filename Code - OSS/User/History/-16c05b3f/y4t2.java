package benchmark;

import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.*;


public class Example {
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @Measurement(iterations = 2,time = 5,timeUnit = TimeUnit.SECONDS)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    @Warmup(iterations = 1)
    @Fork(1)
    public int testMethod(){
        int number = 1000;
        for(int i=0; i<1000000;i++){
            number+=i;
        }
        return number;
    }
}



