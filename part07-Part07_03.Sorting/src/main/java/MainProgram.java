import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }
    
    public static int smallest(int[] array) {
        int small = 999;
        for (int i=0; i<array.length; i++) {
            if (small>array[i]) {
                small = array[i];
            }
        }
        return small;
    }
    
    public static int indexOfSmallest(int[] array) {
        int small = 999;
        int count = 0;
        for (int i=0; i<array.length; i++) {
            if (small>array[i]) {
                small = array[i];
                count = i;
            }
        }
        return count;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int small = 999;
        int count = 0;
        for (int i=startIndex; i<table.length; i++) {
            if (small>table[i]) {
                small = table[i];
                count = i;
            }
        }
        return count;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int fill = 0;
        fill = array[index1];
        array[index1] = array[index2];
        array[index2] = fill;
    }
    
    public static void sort(int[] array) {
        for (int i=0; i<array.length; i++) {
            MainProgram.swap(array, MainProgram.indexOfSmallestFrom(array,i), i);
            System.out.println(Arrays.toString(array));
        }
    }

}
