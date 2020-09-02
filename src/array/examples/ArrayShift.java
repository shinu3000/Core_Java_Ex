package array.examples;
class ArrayShft{
	public void leftShft(int []a) {
		int shift=3;
		for(int i=0;i<3;i++) {
			int j, first;
			first=a[0];
			for( j=0;j<a.length-1;j++) {
				a[j]=a[j+1];
			}
			a[j]=first;
		}
		for(int t:a) {
			System.out.print(t+" ");
		}
			
	}
}

public class ArrayShift {

	public static void main(String[] args) {
		int a1 []= {2,4,5,7,8,3,2,5,4,6,3,4,5,3,4,2,3,6};
		ArrayShft as= new ArrayShft();
		as.leftShft(a1);

	}

}
