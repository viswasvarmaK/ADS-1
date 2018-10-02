class Selection	{
	public boolean LessThan(Comparable element1, Comparable element2) {
		return element1.compareTo(element2) < 0;
	}
	public void exchange(Comparable []a, int index1, int index2) {
		Comparable temp = a[index1];
		a[index1] = a[index2];
		a[index2] = temp;
	}
	public void sort(Comparable a[]) {
		// Comparable min = a[i];
		int N = a.length;
		for(int i = 0; i < N; i++) {
			for (int j = i; j > 0; j--) {
				if (LessThan(a[j], a[j-1])) {
					exchange(a, j, j-1);
				}
				else {
					break;
				}
			}
		}
	}
	public int min(Comparable []a, int i) {
		Comparable min = a[i];
		int minIndex = i;
		for (i = i+1; i < a.length; i++) {
			if (LessThan(a[i], min)) {
				min = a[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
}	