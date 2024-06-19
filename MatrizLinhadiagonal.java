package matrizV2;

public class MatrizLinhadiagonal {

	public static void main(String[] args) {

		char linha[][] = new char [4][4] ;

		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				if((j == 4 - 1 - i || j == 4 - 1 + i)) {
					linha [i][j] = '*';
				}
				else {
					linha [i][j] = ' ';
				}
			}
		}
		for (char [] l: linha){
			for(char coluna : l ) {
				System.out.print(coluna + "\t");


			}
			System.out.println('\n');
		}



	}

}
