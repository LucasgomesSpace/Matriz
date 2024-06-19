package matrizV2;

public class MatrizCruz {

	public static void main(String[] args) {

		char cruz[][] = new char[5][5];

		for (int i= 0; i< 5; i++) {
			for (int j=0; j<5; j++) {
				if (i == 2 || j ==2 ) {
					cruz[i][j] = '*';	
				}
				else {
					cruz[i][j] = ' ' ;	
				}	
				
			}
			
		}
		for (char [] l: cruz){
			for(char coluna : l ) {
				System.out.print(coluna + "\t");
			}
			System.out.println("\n");
		}
	}
}