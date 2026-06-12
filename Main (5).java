import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int smallest = arr[0];
        
        for(int i = 1;i<arr.length;i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println(smallest);
    } 
}