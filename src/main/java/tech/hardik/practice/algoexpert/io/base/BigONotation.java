package tech.hardik.practice.algoexpert.io.base;

import java.util.ArrayList;
import java.util.List;

public class BigONotation {

    public static void main(String[] args) {

        Integer[] array;
        List<Integer> arrayList = new ArrayList<>();
        List<Pair<Integer, Integer>> pairs;
        BigONotation object = new BigONotation();

        for(int i=0;i<1000;i++){
            arrayList.add(i);
        }

        array = arrayList.toArray(new Integer[1000]);

        long startTime1 = System.nanoTime();
        int f1Result = object.plusOne(array, 1);
        long endTime1 = System.nanoTime();
        long duration1 = endTime1 - startTime1;

        long startTime2 = System.nanoTime();
        int f2Result = object.sumOfArray(array);
        long endTime2 = System.nanoTime();
        long duration2 = endTime2 - startTime2;

        long startTime3 = System.nanoTime();
        pairs = object.pairOfArrayElements(array);
        long endTime3 = System.nanoTime();
        long duration3 = endTime3 - startTime3;

        int[] abc = new int[]{1,2,3};

        System.out.println(f1Result);
        System.out.println(f2Result);
        pairs.forEach(integerIntegerPair -> {
            System.out.println(integerIntegerPair.key + " , " + integerIntegerPair.value);
        });
        System.out.println("**********************************");
        System.out.println("Taken Time : " + duration1 / 100);
        System.out.println("Taken Time : " + duration2 / 100);
        System.out.println("Taken Time : " + duration3 / 100);
        System.out.println("**********************************");
    }

    private int plusOne(Integer[] array, int index) {
        return 1 + array[index];
    }

    private int sumOfArray(Integer[] array) {
        int sum = 0;
        for (int index = 0; index < array.length; index++) {
            sum = sum + array[index];
        }
        return sum;
    }

    private List<Pair<Integer, Integer>> pairOfArrayElements(Integer[] array) {
        List<Pair<Integer, Integer>> pairs = new ArrayList<>();
        for (int index = 0; index < array.length; index++) {
            for (int index2 = 0; index2 < array.length; index2++) {
                pairs.add(new Pair(array[index], array[index2]));
            }
        }
        return pairs;
    }
}

class Pair<T, U> {
    public final T key;
    public final U value;

    public Pair(T key, U value) {
        this.key = key;
        this.value = value;
    }
}