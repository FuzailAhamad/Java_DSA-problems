public class MergeSort {
    public static void MergeSort(int[] nums1, int m, int[] nums2, int n){
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(i>=0 && j>=0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }
            else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while(j>=0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        MergeSort(nums1, m, nums2, n);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
    }
}
