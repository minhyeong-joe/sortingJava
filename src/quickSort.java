
public class quickSort {

	int partition(int[] arr, int start, int end) {
		int pivotIndex = start;
		int pivot = arr[end];
		int temp;
		for(int i = pivotIndex; i < end; i++) {
			if(arr[i] <= pivot) {
				// swap arr[i] and arr[pivotIndex]
				temp = arr[i];
				arr[i] = arr[pivotIndex];
				arr[pivotIndex] = temp;
				
				pivotIndex++;
			}
		}
		// put pivot in the pivot index
		temp = arr[pivotIndex];
		arr[pivotIndex] = arr[end];
		arr[end] = temp;
		
		return pivotIndex;
	}
	
	void sort(int[] arr, int start, int end) {
		if(end > start) {
			int pivotIndex = partition(arr, start, end);
			
			sort(arr, start, pivotIndex - 1);
			sort(arr, pivotIndex + 1, end);
		}
	}
	
}
