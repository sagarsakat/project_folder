package Day7Assignment03;
import java.util.Arrays;
public class ReverseArray {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60,70,80,90,100};
		System.out.println("First Array:"+Arrays.toString(arr));
		int newArray[]= new int[10];
		int m=0;
		for(int i=arr.length-1;m<newArray.length&&i>=0;i--,m++)
		{  
			newArray[m]=arr[i];
		}
		System.out.println("Revrse Array:"+Arrays.toString(newArray));
	}

}
