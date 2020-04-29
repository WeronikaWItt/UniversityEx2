package com.company;

import com.company.geometry.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResultTest {


    @Test
    public void checkAnswers() {
        Rectangle photoSize = new Rectangle(2, 2);
        Rectangle areaSize = new Rectangle(5, 5);
        assertEquals(
                9,
                getActual(photoSize, areaSize)
        );
    }

    @Test
    public void simpleOne() {
        Rectangle photoSize = new Rectangle(40, 40);
        Rectangle areaSize = new Rectangle(80, 80);
        assertEquals(
                getActual(photoSize, areaSize),
                Result.getNumberOfCameraShots(photoSize, areaSize)
        );
    }

    @Test
    public void wholeParts() {
        Rectangle photoSize = new Rectangle(40, 40);
        Rectangle areaSize = new Rectangle(400, 200);
        assertEquals(
                getActual(photoSize, areaSize),
                Result.getNumberOfCameraShots(photoSize, areaSize)
        );
    }

    @Test
    public void test() {
        Rectangle photoSize = new Rectangle(2, 2);
        Rectangle areaSize = new Rectangle(5, 4);
        assertEquals(
                getActual(photoSize, areaSize),
                Result.getNumberOfCameraShots(photoSize, areaSize)
        );
    }

    @Test
    public void widthOverflow() {
        Rectangle photoSize = new Rectangle(40, 40);
        Rectangle areaSize = new Rectangle(420, 200);
        assertEquals(
                getActual(photoSize, areaSize),
                Result.getNumberOfCameraShots(photoSize, areaSize)
        );
    }


    @Test
    public void finalTask() {
        Rectangle photoSize = new Rectangle(40, 40);
        Rectangle areaSize = new Rectangle(500, 600);
        assertEquals(
                getActual(photoSize, areaSize),
                Result.getNumberOfCameraShots(photoSize, areaSize)
        );
    }


    @Test
    public void hardTask() {
        Rectangle photoSize = new Rectangle(13, 11);
        Rectangle areaSize = new Rectangle(967, 1619);
        assertEquals(
                getActual(photoSize, areaSize),
                Result.getNumberOfCameraShots(photoSize, areaSize)
        );
    }

    private int getActual(Rectangle photoSize, Rectangle areaSize) {
        return (int) (Math.ceil(areaSize.height / photoSize.height) * Math.ceil(areaSize.width / photoSize.width));
    }
}