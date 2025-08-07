import java.util.*;

public class Largestnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the array");

        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        int largest = sort(arr);
        System.out.println("Largest number in the array is: "+largest);
    }

    static int sort(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-1];

    }

    
}
