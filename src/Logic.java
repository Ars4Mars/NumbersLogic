import com.sun.jdi.Value;

import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalInt;
import java.util.Scanner;

/**
 * Created by Arsen on 2019
 */

public class Logic {
    int i;

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        int[] age ={20,203,12,34,45,67,12};
        OptionalInt max = Arrays.stream(age).max();
        System.out.println(max.getAsInt());

        //найти мин число в массиве
        int [] array = new int[100]; //{12,34,23,11,10,24,34,50,90};

        int minValue = array[0];
        int maxValue = array[0];
        //int minIndex = 0;

        for (int i = 1;i < array.length; i++) {
            if (array[i] > minValue){
                maxValue = array[i];
                //minIndex = i;

            }
        }
        System.out.println(maxValue);

        //сколько чисел в массиве
        int[] arrayx = {1, -4, 3, 5};
        int length = arrayx.length;

        System.out.println(length);



    }
}
