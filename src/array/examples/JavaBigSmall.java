package array.examples;
class Jbigsmall{
	public void JSmallest(int a[]) {
		int b=a[0];
		for(int i=1;i<a.length;i++) {
			
			if(b>a[i]) {
				b=a[i];
			}
		}
		System.out.println(b);
	}
	public void JBiggest(int a[]) {
		int b=a[0];
		for(int i=1;i<a.length;i++) {
			
			if(b<a[i]) {
				b=a[i];
			}
		}
		System.out.println(b);
	}
}

public class JavaBigSmall {

	public static void main(String[] args) {
		int a1 []= {9,4,5,7,8,3,2,5,4,6,3,4,5,3,4,2,3,6};
		Jbigsmall jbs= new Jbigsmall();
		jbs.JSmallest(a1);
		jbs.JBiggest(a1);


	}

}
