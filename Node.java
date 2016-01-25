

public class Node {
	
	int table[][],depth,utility;
	
	Node(){	
		table=new int[3][3];
		utility=depth=0;
	}
	
	Node(Node n){
		table=new int[3][3];
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				table[i][j]=n.table[i][j];	
		depth=n.depth;
		utility=n.utility;
		}
	
	Node(int t[][],int depth,int c){
		table=new int[3][3];
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				table[i][j]=t[i][j];	
		this.depth=depth;
		utility=c;
	}
	
	/**
	 * devolve a profundidade do elemento;
	 * @return depth	 profundidade 
	 */
		public int getDepth(){
			return depth;
		}

	/**
	 * devolve tabela
	 * @return table
	 */
		public int[][] getTable(){
			return table;
		}
		
	/**
	 * devolve o custo	
	 * @return cost
	 */
		public int getUtility(){
			return utility;
		}
}