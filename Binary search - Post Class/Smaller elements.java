static int smallerElements(int a[], int n, int k){
	return countGreater(a, n, k);
    }
static int countGreater(int arr[], int n, int k)
{
	int l = 0;
	int r = n - 1;
	int leftGreater = -1;
	while (l <= r) {
		int m = l + (r - l) / 2;
		if (arr[m] <= k) {
			leftGreater = m;
			l = m + 1;
		}
		else
			r = m - 1;
	}
	return (leftGreater+1);
}
