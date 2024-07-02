import java.util.*;
public class MaxSubarraysum{
    public static void MaxSubArraySum(int[] numbers){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currSum=0;
                for(int k=start;k<=end;k++){
                    currSum+=numbers[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max Sum = "+maxSum);
    }
    public static void main(String[] args){
        int numbers[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(Arrays.toString(numbers));
        MaxSubArraySum(numbers);
    }
}