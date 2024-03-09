package practisee.JavaGeeks;

public class Q16_Symmetric_Pair {
    public static void main(String[] args) {
        int[][] arr={{1,5},{2,1},{3,4},{4,5},{5,4},{5,1},{4,3}};
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i][0]==arr[j][1] && arr[i][1]==arr[j][0]){
                    System.out.print(arr[j][0] +" " +arr[j][1]);
                    System.out.println();
                }
            }
        }
    }
}
