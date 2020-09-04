package array.examples;
class ArrayTran {
	int a[][];
	public void transpose(int [][]a) {
		this.a= new int[a.length][a[0].length];
		int row= a.length;
		int col= a[0].length;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				this.a[j][i]=a[i][j];
		}
	}
		System.out.println("After the Transpose");
	for(int i = 0; i < col; i++){    
        for(int j = 0; j < row; j++){    
           System.out.print(this.a[i][j] + " ");    
            }    
           System.out.println();    
        }    
}
}

public class ArrayTranspose {
	public static void main(String args[]) {
		
		int a[][]= {{1,2,3},{1,2,3},{1,2,3}};
		System.out.println("Before the Transpose"); 
		for(int i = 0; i < a.length; i++){    
	        for(int j = 0; j < a[0].length; j++){    
	           System.out.print(a[i][j] + " ");    
	            }    
	           System.out.println();    
	        } 
		
		ArrayTran at=new ArrayTran();
		at.transpose(a);
		
	}
}
