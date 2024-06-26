package Sorting_Based_Problems_Arrays;


import java.util.Scanner;

public class Non_decreasing_problem {
    static int [] result(int []  arr ){
        int n = arr.length;
        int [] ans = new int[n];
        int left = 0, right = n-1, k = 0;
        while(left<=right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++] = arr[left] * arr[left];
                left++;
            }
            else{
                ans[k++] = arr[right]*arr[right];
                right--;
            }
        }
        return ans;
    }

    static  void swap(int [] arr , int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverse(int [] arr){
        int i =0;
        int j = arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    static void printArray(int [] arr){
        for( int i= 0 ; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the input: ");
        for(int i = 0; i < arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int ans [] = result(arr);
        reverse(ans);
        printArray(ans);
    }
}
