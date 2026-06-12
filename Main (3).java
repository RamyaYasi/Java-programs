import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int arr[] = {10,25,7,89,45};
        
        int largest = arr[0];
        
        for(int i = 1;i<arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}