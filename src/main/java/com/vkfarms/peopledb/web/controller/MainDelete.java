package com.vkfarms.peopledb.web.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainDelete {
    public static void main(String[] args) {
        int[] integers = new int[] {1,0,1,0,1,0,1,0,1,0,1,0};
        int[] integersSorted = new int[integers.length];
        /*Stream.of(integers)
                .forEach(ints -> {
                    for (int i =0; i < ints.length; i++){
                        if (ints[i] == 0){
                            integersSorted[i]=0;
                        } else {
                            integersSorted[i]=1;

                        }
                    }
                });*/
        /*Stream.of(integers)
                .map(ints -> Arrays.stream(integers).sorted())
                .forEach(intStream -> System.out.println(integers));
                //.collect(Collectors.toList());
*/

        //collect.stream().forEach(intStream -> System.out.println(integers));
        IntStream sorted = Arrays.stream(integers).sorted();//.forEach(integers -> System.out.println());
        sorted.forEach(i -> System.out.print(i));
        /*for(int i =0 ; i<integersSorted.length;i++) {
            System.out(forEach());
        }*/
    }
}
