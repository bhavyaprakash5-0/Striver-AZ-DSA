import java.util.Scanner;

public class Largest_Element_in_an_Array {
    public static int largest(int[] arr) {
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
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
        System.out.println(largest(arr));
        sc.close();
    }
}
