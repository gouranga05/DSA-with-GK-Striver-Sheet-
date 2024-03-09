package practisee.JavaGeeks;

public class Q21_Pivotindex {
    public static void main(String[] args) {
        int[] arr={2,-2,5};
//        int[] arr2={1,-1,4};
        int right=0;
        int ans=0;
        int sum=0;
        for(int i=0;i< arr.length-1;i++){
            sum+=arr[i];
        }
//        System.out.println(sum);
        boolean flag= false;
        if(sum==0){
            System.out.println(arr.length-1);
            return;
        }

        for(int i=arr.length-2;i>0;i--){
            sum-=arr[i];
            right+=arr[i+1];
//            System.out.println(sum + " " + right);

            if(sum==right){
                System.out.println(i);
                flag=true;
            }
        }
        if(!flag) System.out.println(-1);
        //Brute Force approach
        int n = arr.length;
        int leftSum, rightSum;
        for (int i = 0; i < n ; i++) {
            leftSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            rightSum = 0;
            for (int j = i + 1; j < n; j++) {
                rightSum += arr[j];
            }
            if (leftSum == rightSum) {
                System.out.println(i);
            }
        }
        System.out.println(-1);



    }
}
