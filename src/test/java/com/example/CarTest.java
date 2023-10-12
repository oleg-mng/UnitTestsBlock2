package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * - Проверить, что экземпляр объекта Car также является экземпляром
 * транспортного средства (используя оператор instanceof).
 * - Проверить, что объект Car создается с 4-мя колесами.
 * - Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
 * - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
 * машина останавливается (speed = 0).
 */

class CarTest {

    @Test
    public void checkCarExtendVehicle() {

        Car car1 = new Car("Toyota", "Rav-4", 3);

        var i = car1 instanceof Vehicle ? 1 : 0;
        assertEquals(1, i);

    }

    @Test
    public void checkCreateCarWith4Wheels() {

        Car car1 = new Car("Toyota", "Rav-4", 3);

        var i = car1.getNumWheels();
        assertEquals(4, i);

    }

    @Test
    public void checkSpeedInTestDrive() {

        Car car1 = new Car("Toyota", "Rav-4", 3);

        car1.testDrive();
        var t = car1.getSpeed();
        assertEquals(60, t, "Скорость не равна 60");

    }

    @Test
    public void checkSpeedInPark() {

        Car car1 = new Car("Toyota", "Rav-4", 3);

        car1.testDrive();
        var t = car1.getSpeed();
        assertEquals(60, t, "Скорость не равна 60");
        car1.park();
        var k = car1.getSpeed();
        assertEquals(0, k, "Скорость не равна 60");

    }
}