package array.examples;

//its very simple just make an empty array of the main array 
//write a if statment to check if the the valus are same if same in that index of empty put -1 
//next just put the count of the number at the index of empty ..next travers through it 

class ArrayFrequency{
	public void frqncy(int []a1) {
    int frq []=new int[a1.length];
		int rptd=-1;
		for(int i=0;i<a1.length;i++) {
			int count=1;
			for(int j=i+1;j<a1.length;j++) {
				if(a1[i]==a1[j]) {
					count++;
					frq[j]=rptd;
				}
				if(frq[i]!=rptd) {
					frq[i]=count;
				}
			}
		}
		for(int l=0;l<frq.length;l++) {
			if(frq[l]!=rptd) {
				System.out.print(a1[l]+" is repeted "+frq[l]+"times");
				System.out.println("  ");
			}
		}
		
		
		/*for(int n:frq) {
			System.out.print (n+" ");
		}
		System.out.println(" ");
		for(int n:frq) {
			System.out.print (n+" ");
		}*/
		
	}
}

public class ArrayFrq {

	public static void main(String[] args) {
		int a1 []= {2,4,5,7,8,3,2,5,4,6,3,4,5,3,4,2,3,6};
		ArrayFrequency af= new ArrayFrequency();
		af.frqncy(a1);
	}

}
