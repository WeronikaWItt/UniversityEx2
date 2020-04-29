package com.company;

import com.company.geometry.Point;
import com.company.geometry.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class Result {

    private static final boolean DEBUG = false;

    public static double getNumberOfCameraShots(Rectangle photoSize, Rectangle areaSize) {
        List<Rectangle> cameraShots = new ArrayList<>();

        int row = 0;
        for (double y = 0; y < areaSize.height; y += photoSize.height) {
            row++;
            if(DEBUG) System.out.println("row: " + row);

            if (row % 2 == 0) {
                for (double x = areaSize.width - photoSize.width; x > -photoSize.width; x -= photoSize.width) {
                    Rectangle cameraShot = new Rectangle(photoSize.width, photoSize.height);
                    cameraShot.setPosition(new Point(x, y));
                    cameraShots.add(cameraShot);
                    if(DEBUG) System.out.println("x = " + cameraShot.getPosition().x + " y = " + cameraShot.getPosition().y);
                }
            } else {
                for (double x = 0; x < areaSize.width; x += photoSize.width) {
                    Rectangle cameraShot = new Rectangle(photoSize.width, photoSize.height);
                    cameraShot.setPosition(new Point(x, y));
                    cameraShots.add(cameraShot);
                    if(DEBUG) System.out.println("x = " + cameraShot.getPosition().x + " y = " + cameraShot.getPosition().y);
                }
            }
        }

        return cameraShots.size();
    }
}
