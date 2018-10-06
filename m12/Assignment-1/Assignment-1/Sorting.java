class Sorting {
	Sorting(){

	}
	public boolean LessThan(Comparable element1, Comparable element2) {
		return element1.compareTo(element2) < 0;
	}
	public void exchange(Comparable[] a,int index1, int index2) {
		Comparable temp = a[index1];
		a[index1] = a[index2];
		a[index2] = temp;
	}
	public void sort(Comparable a[]) {
		int N = a.length;
		for(int i = 0; i < N; i++) {
			int min = i;
			for (int j = i + 1; j < N; j++) {
				if (LessThan(a[j], a[min])) {
					min = j;
				}
			}
			exchange(a, i, min);
		}
	}
}