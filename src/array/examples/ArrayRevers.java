package array.examples;
class Arevers{
	public void arrayRevers(int a3[]) {
		for(int i=a3.length-1;i>0;i--) {
				System.out.print(a3[i]+" ");
		}
	}
	public void evenOrder(int a3[]) {
		for(int j=0;j<a3.length;j++)
		{
			if((j*2)<a3.length)
			System.out.print(a3[j*2]+" ");
		}
		
	}
	public void oddOrder(int a3[]) {
		for(int j=0;j<a3.length;j++)
		{
			if(((j*2)-1<a3.length)&&((j*2)-1>0)) {
			System.out.print(a3[(j*2)-1]+" ");
			}
		}
		
	}

}

public class ArrayRevers {

	public static void main(String[] args) {
		int a3[]= {2,3,54,332,23,55,99};
		Arevers ar= new Arevers();
		ar.arrayRevers(a3);
		System.out.println(" ");
		ar.oddOrder(a3);
		System.out.println(" ");
		ar.evenOrder(a3);
	}

}
