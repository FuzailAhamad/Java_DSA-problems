//import java.util.*;
public class LinearSearch{
    public static int linearSearch(int[] numbers, int key){
        int n = numbers.length;
        for(int i=0;i<n;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] numbers = {2,4,6,8,10,12,14};
        int key = 14;
        int index = linearSearch(numbers,key);
        if(index == -1){
            System.out.println("Not Found");
        }else {
            System.out.println("Key Found: "+index);
        }
    }
}