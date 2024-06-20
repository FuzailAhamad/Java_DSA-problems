import java.util.*;
public class Arraysorting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array :)");
        int size = sc.nextInt();
        
        int[] numbers = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        
        Arrays.sort(numbers);
        System.out.println("Sorted array is: " + Arrays.toString(numbers));
        sc.close();
    }
}