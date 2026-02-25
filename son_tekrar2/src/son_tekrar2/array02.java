package son_tekrar2;

public class array02 {

	public static void main(String[] args) {
		int[][] tablo = new int[][] {
			{2,45,8},
			{85,54,65},
			{74,52,66},
			{5,55,88},
			{74,32,65}
		};
		
		for(int i=0;i<tablo.length;i++) {
			for(int j=0;j<tablo[0].length;j++) {
				System.out.print(tablo[i][j]+" , ");
			}
			System.out.println();
		}
		
		//FOREACH YAPISI
		
		System.out.println("--------------------------");
		
		for(int[] sutun:tablo) {
			for(int value:sutun) {
				System.out.print(value+" , ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------");
		
		int[] liste = {1,2,8,4,6,4};
		
		for(int value:liste) {
			System.out.println(value);
		}
	}

}
