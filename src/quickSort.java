
public class quickSort {

	static int partition(int[] arr, int start, int end) {
		int pivotIndex = start;
		int pivot = arr[end];
		int temp;
		for(int i = pivotIndex; i < end; i++) {
//			if(arr[i] <= pivot) {
//				// swap arr[i] and arr[pivotIndex]
//				temp = arr[i];
//				arr[i] = arr[pivotIndex];
//				arr[pivotIndex] = temp;
//				
//				pivotIndex++;
//			}
			if(arr[i] <= pivot) {
				swap(arr, i, pivotIndex);
				pivotIndex++;
			}
		}
		// put pivot in the pivot index
		temp = arr[pivotIndex];
		arr[pivotIndex] = arr[end];
		arr[end] = temp;
		
		return pivotIndex;
	}
	
	static void sort(int[] arr, int start, int end) {
		if(end > start) {
			int pivotIndex = partition(arr, start, end);
			
			sort(arr, start, pivotIndex - 1);
			sort(arr, pivotIndex + 1, end);
		}
	}
	
	static void swap(int arr[], int pos1, int pos2) {
		int temp = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = temp;
	}
	
}
