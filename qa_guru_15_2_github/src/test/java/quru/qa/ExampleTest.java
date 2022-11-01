package quru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.ClassOrderer;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.RandomAccess;
import java.util.random.RandomGenerator;

public class ExampleTest  {

    @Test
    void exampleTest0() {
        Assertions.assertTrue( new Random().nextInt() > 1 );
    }
    @Test
    void exampleTest1() {
        Assertions.assertTrue( new Random().nextInt() > 2 );
    }
}
