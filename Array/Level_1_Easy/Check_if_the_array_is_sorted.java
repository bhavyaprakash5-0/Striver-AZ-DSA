import java.util.Scanner;

public class Check_if_the_array_is_sorted {

    public static int isSorted(int n, int []a) {
        for(int i=1; i<n; i++){
            if(a[i-1]>a[i]){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length of array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.print("enter the element of array: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Largest Element in an Array: ");
        System.out.println(isSorted(arr.length,arr));
        sc.close();
    }
}
