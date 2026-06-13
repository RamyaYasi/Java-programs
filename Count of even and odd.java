import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        
        int arr[] = new int[5];
        
        int even = 0;
        int odd = 0;
        
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        
        if(arr[i] % 2 == 0){
            even++;
        }else{
            odd++;
        }
     }     
        System.out.println("even =" + even );
        System.out.println("odd =" + odd );

    }
}
