public class SearchInMatrix {
    public static boolean searchinMatrix(int[][] matrix, int target){
        int i, j;
        for(i=0; i<matrix.length; i++){
            for(j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==target){
                    System.out.println("Target Found");
                    return true;
                }
            }
        }
        System.out.println("Target Not Found");
        return false;
    }
    public static void main(String[] args){
        int[][] matrix = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};
        searchinMatrix(matrix, 18);
    }
}
