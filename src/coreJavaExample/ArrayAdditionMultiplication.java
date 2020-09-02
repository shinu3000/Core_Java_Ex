package coreJavaExample;
class Operation{
	public void addMe(int[][] array1, int[][] array2){
		int array[][]=new int[2][2];
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					array[i][j]= array1[i][j]+array2[i][j];
					System.out.print(array[i][j] +" ");
				}
				System.out.println(" ");
			}
	}
	public void mulMe(int[][] array1, int[][] array2) {
		int array[][]=new int[2][2];
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				array[i][j]= array1[i][j]*array2[i][j];
				System.out.print(array[i][j] +" ");
			}
			System.out.println(" ");
		}
	}
}

public class ArrayAdditionMultiplication {
	public static void main(String arg[]) {
		int array1[][]= {{2,3},{3,4}};
		int array2[][]= {{2,3},{3,4}};
		
		Operation op= new Operation();
		op.addMe(array1, array2);
		
	//--------------------------------------------------------------------------
		@SuppressWarnings("unused")
		Operation op1= new Operation();
		op.mulMe(array1, array2);

		
		
	}
}
