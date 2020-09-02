package coreJavaExample; 

class Min{
	Min(int arr[]) {
		 int m1=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(m1>arr[i]) {
				m1=arr[i];
			}
		}
		System.out.println( "the smallest num in the array is : "+m1);
	}
}

public class ArrayExmpl {

	public static void main(String[] args) {
		// An array is a collection of similar type of elements
		//Array in Java is index-based, the first element of the array is stored at the 0th index,
		//2nd element is stored on 1st index and so on.
		
		
		//ADVANTAGES
		/*Code Optimization: It makes the code optimized, we can retrieve or sort the data efficiently.
		  Random access: We can get any data located at an index position.*/
		
		//DISADVANTAGES
		/*Size Limit: We can store only the fixed size of elements in the array. It doesn't grow its size at runtime.
		 *  To solve this problem, collection framework is used in Java which grows automatically.
		 */
		
		//SYNTAX
		/*
		 * 	dataType[] arr; (or)  
		 *  dataType []arr; (or)  
		 *	dataType arr[];
		 */
		/*
		 * arrayRefVar=new datatype[size];
		 */
	//-----------------------------------------------------------------------------------------------------	
		int ary[];
		ary = new int[4];			//SINGLE DIMENTION ARRAY
		ary[0]= 22;
		ary[1]= 28;
		ary[2]= 30;
		ary[3]= 1;
		for (int i=0;i<4;i++) {
			System.out.println("the value of array at "+i+" is "+ary[i]);
		}
		
		int ary1[]= {22,32,34,35,43,8}; //initiating, declaring, and Traversing
		for (int j=0;j<4;j++) {
			System.out.println("the value of array at "+j+" is "+ary1[j]);
		}
		
		for (int k:ary) {
			System.out.println(k);   //For-Each loop
		}
		
		
		new Min(ary); // Passing Array in Methods 
		
		printary(new int[]{22,21,1,2}); // Anonymous Array 
	//------------------------------------------------------------------------------------------------------
		
		int mda[][]= {{11,22,33},{12,13,14},{44,55,66}};	//MULTIDIMENTION ARRAY
		for (int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(mda[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		int jgd[][]= new int[3][];							//JAGGED ARRAY
		jgd[0]=new int[8];
		jgd[1]=new int[5];
		jgd[2]=new int[2];
		
		int count=0;
		for(int i=0;i<jgd.length;i++)
			for(int j=0;j<jgd[i].length;j++)
				jgd[i][j]=count++;
		
		for(int i=0;i<jgd.length;i++) {
			for(int j=0;j<jgd[i].length;j++) {
				System.out.print(jgd[i][j]+" "); 
			}
			System.out.println(" ");
		}
		
	}

	private static void printary(int[] is) {
		// TODO Auto-generated method stub
		int b=is[0];
		for (int j=0;j<is.length;j++) {
			if(b>is[j]) {
				b=is[j];
			}
		}
		System.out.println(b);
	}

}
