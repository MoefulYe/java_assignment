package firstHomework.myArraysUtil;

import java.util.Random;

public class mainProcess {
    public static void main(String[] args) {
        int size = 10;
        int[] array = new int[size];
        Random rd= new Random();
        for(int i= 0; i < size; i++) {
            array[i] = rd.nextInt(100);
        }
        AdvancedArray aa= new AdvancedArray(array);
        System.out.println("The original Array: ");
        aa.printArray();
        System.out.println("The sorted Array: ");
        aa.quickSort(0,aa.getSize()-1);
        aa.printArray();
        int key= rd.nextInt(100);
        System.out.println("The key: "+key);
        System.out.println("The index of the key: "+aa.binarySearch(key));
        System.out.println("The Max value: "+aa.getMaxValue());
        System.out.println("The Min value: "+aa.getMinValue());
        aa.shuffle();
        System.out.println("The shuffled Array: ");
        aa.printArray();
        int offset= rd.nextInt(aa.getSize());
        aa.move(offset);
        System.out.println("move the array to right by "+offset+" positions");
        aa.printArray();
        System.out.println("The array is reset to the original array");
        aa.move(-offset);
        offset=rd.nextInt(aa.getSize());
        aa.move(-offset);
        System.out.println("move the array to left by "+offset+" positions");
        aa.printArray();
        System.out.println("The array is reset to the original array");
        aa.move(offset);
        aa.printArray();
        key= rd.nextInt(100);
        int index= rd.nextInt(aa.getSize());
        aa.insert(index,key);
        System.out.println("Insert the key "+key+" at index "+index);
        aa.printArray();
    }
}
