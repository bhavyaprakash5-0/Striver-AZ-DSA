import java.util.Scanner;

public class Second_Largest_Element_in_an_Array_without_sorting {

    public static int getSecondLargest(int[] arr) {
        int max = arr[0];
        int secondMax = -1;
        for(int i=1; i<arr.length; i++){
            if(max<arr[i]){
                secondMax= max;
                max = arr[i];
            }
            else if(arr[i]>secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        return secondMax;
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
        System.out.println(getSecondLargest(arr));
        sc.close();
    }
}
