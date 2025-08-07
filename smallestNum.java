import java.util.*;
public class smallestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        
        int[] arr = new int[size];
        System.out.println("Enter the array");
        
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        
        
        int smallest = sort(arr);
        System.out.println("Smallest element is: " + smallest);

        sc.close();
    }



       




        
    

    static int sort(int arr[]){
        Arrays.sort(arr);
        return arr[0];
    }
    
}
