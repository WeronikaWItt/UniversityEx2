package com.company;

import com.company.geometry.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle areaToPhotography = new Rectangle(500, 600);
        Rectangle photoSize = new Rectangle(40, 40);
        System.out.println("The number of taken photos is equal: " + Result.getNumberOfCameraShots(photoSize, areaToPhotography));
    }
}
