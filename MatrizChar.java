package matrizV2;

public class MatrizChar {

	public static void main(String[] args) {
		
		char miter[][] = {  {'a', 'b', 'c' ,'d' ,'e'},
				            {'f', 'g', 'h' ,'i' ,'j'},
				            {'l', 'm', 'n' ,'o' ,'p'},
				            {'q', 'r', 's' ,'t' ,'u'}};
	

		
		for (char [] i: miter){
			for(char coluna : i ) {
				System.out.print(coluna + "\t");
			
			
			}
			System.out.println();
		}
	}

}