package array.examples;

class ArrayOprt{
	int a[];
	public void addUs(int []a,int []b) {
		this.a= new int[a.length];
		for(int i=0;i<a.length;i++) {
			//for(int j=0;j<b.length;j++) {
				this.a[i]= a[i]+b[i];
				System.out.print(this.a[i]+" ");
			//}
		}
	}
	public void copyUs(int []a,int[]b) {
		this.a= new int[a.length];
		for(int i=0;i<a.length;i++) {
			
		}
	}
}

public class ArrayCopy {

	public static void main(String[] args) {
		int a[]= {2,4,5,6,7};
		@SuppressWarnings("unused")
		int b[]= {9,7,5,4,3};
		
		int c[];
		c= new int[a.length];
		System.out.println("the elements of Array a:");
		for(int i=0;i<c.length;i++) {
			c[i]=a[i];
			System.out.println(a[i]+" ");
		}
		
		System.out.println("the elements of  Array b is ");
		for(int i=0;i<c.length;i++) {	
		System.out.println(c[i]+" ");
		}
		
		//ArrayOprt ao=new ArrayOprt();
		//ao.addUs(a, b);

	}

}
