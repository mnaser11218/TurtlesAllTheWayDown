import PACKAGE_NAME.Turtles;
import org.junit.Assert;
import org.junit.Test;

import java.time.Duration;
import java.time.Instant;

import static org.junit.Assert.*;

/**
 * Created by kristofer on 7/14/20.
 */
public class TurtlesTest {

    @Test
    public void recursionFactorialTest(){
       Turtles turtles = new Turtles();
       long actual = turtles.factorial(5);
        long expected = 120;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void recursiongcdTest(){
        Turtles turtles = new Turtles();
        long actual = turtles.gcd(1440, 408);
        long expected = 24;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void recursiongcd2Test(){
        Turtles turtles = new Turtles();
        long actual = turtles.gcd2(1440, 408);
        long expected = 24;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void timingRecursionFactorial(){
        Instant start = Instant.now();
        Turtles turtles = new Turtles();
        long actual = turtles.factorial(5);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toNanos();
        System.out.println(timeElapsed);
    }

    @Test
    public void gcd2QuickerThangcdRecursion(){
        Instant start = Instant.now();
        Turtles turtles = new Turtles();
        long actual = turtles.gcd(1440, 408);
        Instant finish = Instant.now();
        long timeElapsedforGCD = Duration.between(start, finish).toNanos();


        Instant startgcd2 = Instant.now();
        long actualgcd2 = turtles.gcd2(1440, 408);
        Instant finishgcd2 = Instant.now();
        long timeElapsedforGCD2 = Duration.between(startgcd2, finishgcd2).toNanos();

        Assert.assertTrue(timeElapsedforGCD2 < timeElapsedforGCD);

    }




}