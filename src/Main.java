
public class Main {

	public static void main(String[] args) {
		int a[][] = new int[(int) (1.0 + Math.random() * 10)][(int) (1.0 + Math.random() * 10)];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 101);
			}
		}

		int min = a[0][0];
		int max = a[0][0];
		int minI = 0;
		int minJ = 0;
		int maxI = 0;
		int maxJ = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] < min) {
					min = a[i][j];
					minI = i;
					minJ = j;
				}
				if (a[i][j] > max) {
					max = a[i][j];
					maxI = i;
					maxJ = j;
				}
			}
		}

		System.out.println(min);
		System.out.println(minI + " " + minJ);
		System.out.println(max);
		System.out.println(maxI + " " + maxJ);
	}

}
