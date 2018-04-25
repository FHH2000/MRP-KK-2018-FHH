package Quicksort;

public class Quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Quicksort();
	}
	//
	int links = 0;
	int rechts = 0;
	int temp = 0;
	int[] Nummern = {4,9,3,2,6,7,5,8,1};
	//
	public Quicksort() {
		links = 0;
		rechts = Nummern.length-1;
		sort(links, rechts);
		for(int i = 0; i < Nummern.length;i++) {
			System.out.println(Nummern[i] + ", ");
		}
	}
	//
	public void sort(int l, int r) {
		
		if (l < r) {
			int pivot = split(l, r);
			sort(l, pivot);
			sort(pivot+1, r);
		}
	}
	//
	public int split(int l, int r) {
		int i = l;
		int j = r -1;
		int piv = Nummern[r];
		while(i < j) {
			while(Nummern[i]< piv && i < r-1) {
				i = i+1;
			}
			while(Nummern[j] >= piv && j > l) {
				j = j-1;
			}
			if (i < j) {
				temp = Nummern[i];
				Nummern[i] = Nummern[j];
				Nummern[j] = temp;
			}
		}
		if(Nummern[i] > piv) {
			temp = Nummern[i];
			Nummern[i] = Nummern[r];
			Nummern[r] = temp;
		}
		return i;
	}
}
