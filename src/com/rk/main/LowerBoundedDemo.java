/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rk.main;

import com.rk.Circle;
import com.rk.Rectangle;

import java.util.*;

public class LowerBoundedDemo {

    public static void main(String[] args) {
        List<Rectangle> list1 = new ArrayList<>();
        list1.add(new Rectangle(2, 5));
        list1.add(new Rectangle(3.5, 6.2));
        list1.add(new Rectangle(6, 4));

        List<Circle> list2 = new ArrayList<>();
        list2.add(new Circle(4));
        list2.add(new Circle(5.4));
        list2.add(new Circle(1.8));

        System.out.println("**rectangle area**");
        calculateArea(list1);
        System.out.println("**circle area**");
        calculateArea(list2);
    }

    public static <T> void calculateArea(List<? super T> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
    }
}
