package tests;

import lombok.extern.log4j.Log4j2;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Log4j2
public class CarTest {

    @Test
    public void test() {
        log.fatal("fatal");
        log.error("error");
        log.warn("warn");
        log.info("info");
        log.debug("debug");
        log.trace("trace");

        Car car1 = new Car("bmw", "x5",200);
        //toString()
        //hashcode
        System.out.println(car1);
        Car car2 = new Car("bmw", "x5", 240);
        System.out.println(car2);

        Car car3 = Car.builder()
                .make("bmw")
                .model("x5")
                .build();
        //equals()
        assertEquals(car1, car3);
    }
}
