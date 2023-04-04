package Day7Assignment03;

public class ArrayEquality {

	public static void main(String[] args) {
		int arr[]= {20,110,50,20,70,80,90};
		int newarray[]={20,110,50,20,70,80,90};
		boolean flag=true;
		for(int i=0;i<arr.length;i++)
		{   
			if(arr[i]==newarray[i])
				continue;
			else
			{   flag=false;
		    	System.out.print("===Arrays Are Not Equal===");
				break;
			}
		}
		if(flag==true)
		System.out.print("===Arrays Are Equal===");
	}

}
