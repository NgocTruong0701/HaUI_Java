/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Copy_Array_n;

public class App {
    public static void main(String[] args) {        
        int [][][] arr = new int[4][4][4];
        
        for(int i = 0 ;i < 4;i++){
            for(int j = 0; j < 4;j++){
                for(int k = 0 ; k < 4;k++){
                    arr[i][j][k] = (int)(Math.random()*100);
                }
            }
        }
        
        int [][][] arrCopy;
        arrCopy = arr.clone();
        
        for(int[][] arr2D: arrCopy){
            for(int[] arr1D: arr2D){
                for(int item : arr1D){
                    System.out.print(item + " ");
                }
                System.out.print("  ");
            }
            System.out.println("");
        }
    }
}
