package matrizV2;

public class EstrelinhaDiagonal {

	public static void main(String[] args) {

		String matriz[] [] = new String [4][4];
		for (int i= 0; i< 4; i++) {
			for (int j= 3; j>=0; j--) {
				if (i + j <= 3 ) {
					matriz[i][j] = "*";	
				}
				else {
					matriz[i][j] = " " ;	
				}	
			}

		}
		for (String [] l: matriz){
			for(String coluna : l ) {
				System.out.print(coluna + "\t");


			}
			System.out.println('\n');
		}
	}
}
//resposta no console

/*	 *	 *	 *	

 *	 *	 *	 	

 *	 *	 	 	

 */