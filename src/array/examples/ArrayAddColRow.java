package array.examples;
	class Aarc{
		int row;
		int col;
		int a[][];
		public void addCol(int a[][]) {
			this.a=new int[a.length][a[0].length];
			//this.row=0;
			int row= a.length;
			int col= a[0].length;
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					this.row = this.row + a[j][i];
			}
				System.out.println("the sum of col "+i+" is "+this.row);
				
		}
	}
		public void addRow(int a[][]) {
			this.a=new int[a.length][a[0].length];
			int row= a.length;
			int col= a[0].length;
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					this.col=this.col+a[i][j];
				}
				System.out.println("the sum of row "+i+" is "+this.col);
			}
		}
	}
public class ArrayAddColRow {
	public static void main(String args[]) {
		int a[][]= {{1,2,3},{1,2,3},{1,2,3}};
		Aarc arc= new Aarc();
		arc.addRow(a);
		arc.addCol(a);
	}
}
