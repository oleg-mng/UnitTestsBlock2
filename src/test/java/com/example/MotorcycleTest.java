package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * - Проверить, что объект Motorcycle создается с 2-мя колесами.
 * - Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
 * - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция
 * движения транспорта) мотоцикл останавливается (speed = 0).
 */

class MotorcycleTest {
    private Motorcycle motorcycle1;

    @BeforeEach
    public void create() {
        motorcycle1 = new Motorcycle("Ducatti", "RX-1100", 5);
    }


    @Test
    public void checkCreateMotorcycleWith2Wheels() {

        var i = motorcycle1.getNumWheels();
        assertEquals(2, i);

    }


    @Test
    public void checkSpeedInTestDrive() {

        motorcycle1.testDrive();
        var t = motorcycle1.getSpeed();
        assertEquals(75, t, "Скорость не равна 75");

    }

    @Test
    public void checkSpeedInPark() {

        motorcycle1.testDrive();
        var t = motorcycle1.getSpeed();
        assertEquals(75, t, "Скорость не равна 75");
        motorcycle1.park();
        var k = motorcycle1.getSpeed();
        assertEquals(0, k, "Скорость не равна 0");

    }

}