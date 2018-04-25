package Bubblesort;

public class Bubblesort {
	public static void main(String[] args) {
		new Bubblesort();
	}
	
	public Bubblesort() {
		int temp = 0;
		int[] zahlen = {4,7,9,12,44,3,2,76,5,1};
		for(int n = zahlen.length; n>1; n--) {
			for(int i=0; i<n-1;i++) {
				if(zahlen[i+1] < zahlen[i]) {
					temp = zahlen[i+1];
					zahlen[i+1] = zahlen[i];
					zahlen[i] = temp;
					temp = 0;
				}
			}
		}
		for(int f = 0; f < zahlen.length; f++) {
			System.out.print(zahlen[f] + ", ");
		}
	}
}
