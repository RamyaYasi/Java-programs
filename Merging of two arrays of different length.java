
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		int a[] ={1,2,3};
		int b[] ={4,5,6,7};
		
		int c[] =new int [a.length + b.length];
		
		int x = 0,y = 0,z = 0;
		while(x<a.length && y<b.length){
		    c[z++] = a[x++];
		    c[z++] = b[y++];
		}
		while(x<a.length){
		    c[z++] = a[x++];
		}
		while(y<b.length){
		    c[z++] = b[y++];
		}
		System.out.println(Arrays.toString(c));
	}
}
