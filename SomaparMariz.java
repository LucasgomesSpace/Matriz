package iniciomatrix;

public class SomaparMariz {

	public static void main(String[] args) {

		int par, soma= 0;
		int cinco [] [] = new int [5][5];


		for(int i=0; i<5; i++) {
			for(int t=0; t<5; t++) {
				par = (int) Math.round(Math.random()*100);
				if (par % 2 == 0) {
					soma +=par;
					if(par != 0) {
						cinco[i][t] = par;		
					}

				}
			}

		}
		for(int i=0; i<5; i++) {
			for(int t=0; t<5; t++) {
				System.out.print("  [" + cinco[i][t]+"]");
			}
			System.out.println("\n|. ---- . ---- . ---- .|");
		}
		System.out.println("A soma da matriz é: " + soma);

	}

}