
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        int a[] = {5,2,4,5,1,7,9,2,9};
        System.out.println("Duplicate elements");
        
        for (int i = 0;i<a.length;i++){
            for(int j = i+1;j<a.length;j++){
                if (a[i] == a[j]){
                 System.out.println(a[i] + " is Duplicate");
                }
            }
        }
    }
}
