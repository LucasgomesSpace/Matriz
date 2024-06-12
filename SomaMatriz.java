package iniciomatrix;

public class SomaMatriz {

	public static void main(String[] args) {

		int smA [][] = new int [3][3];
		int smB [][] = new int [3][3];
		int smC [][] = new int [3][3];

		for (int i =0; i <3 ; i++) {
			for (int t=0; t<3 ; t++) {
				smA[i][t] = (int) Math.round(Math.random()*100);
				smB[i][t] = (int) Math.round(Math.random()*100);

				smC[i][t] += smA[i][t] * smB[i][t];
			}
		}
		System.out.println("Matriz A :");
		
		for(int i=0; i<3; i++) {
			for(int t=0; t<3; t++) {
				System.out.print("  [" + smA[i][t]+"]");
				
			}
			System.out.println("\n|. ---- . ---- . ---- .|");
		}
		System.out.println("Matriz B :");
		
		for(int i=0; i<3; i++) {
			for(int t=0; t<3; t++) {
		System.out.print("  [" + smB[i][t]+"]");
			}
			System.out.println("\n|. ---- . ---- . ---- .|");
		}
		System.out.println("A soma das matrizes A e B é igaul :");
		
		for(int i=0; i<3; i++) {
			for(int t=0; t<3; t++) {
				System.out.print("  [" + smC[i][t]+"]");
			}
			System.out.println("\n|. ---- . ---- . ---- .|");
		}
	}
}