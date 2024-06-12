package iniciomatrix;

public class NumerosparesMatriz {

	public static void main(String[] args) {

		int par;
		int cinco [] [] = new int [5][5];

		for(int i=0; i<5; i++) {
			for(int t=0; t<5; t++) {
				par = (int) Math.round(Math.random()*100);
				if (par % 2 == 0) {
					if(par != 0) {
						cinco[i][t] = par;
						System.out.println(" Os valores são " + cinco[i][t]);
					}

				}
			}

		}

	}

}