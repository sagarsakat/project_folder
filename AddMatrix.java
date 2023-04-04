package Day8;

public class AddMatrix {

	public static void main(String[] args) {
		int arr1[][]= {{10,20},{20,30,},{10,50}};
        int arr2[][]= {{5,2},{3,6},{7,8}};
        int arr[][]=new int[3][2];
        for(int i=0;i<3;i++)
        {
        	for(int j=0;j<2;j++)
        	{ 
        		arr[i][j]=arr1[i][j]+arr2[i][j];
        	}
        }
        for(int i=0;i<3;i++)
        {
        	for(int j=0;j<2;j++)
        	{ 
        		System.out.print(" "+arr[i][j]);
        	}
        	System.out.println();
        }
        
	}

}
