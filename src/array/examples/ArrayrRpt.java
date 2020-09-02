package array.examples;
class Arrayrepeated{
	public void repet(int a[]) {
		for (int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				if (a[i]==a[j]) {
					System.out.println(a[j]);
				}
			}
		}
		
	}
}
public class ArrayrRpt {

	public static void main(String[] args) {
		int a[]= {1,9,3,2,5,3,4,2,5};
		Arrayrepeated ar=new Arrayrepeated();
		ar.repet(a);
	}

}
