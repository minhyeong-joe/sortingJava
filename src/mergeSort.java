
public class mergeSort {

	public static void sort(int[] arr, int start, int end) {
		if(end > start) {
			int mid = (start+end)/2;
			sort(arr, start, mid);
			sort(arr, mid+1, end);
			merge(arr, start, mid, end);
		}
	}
	
	private static void merge(int[] arr, int start, int mid, int end) {
		int[] tempArray = new int[arr.length];
		int start1 = start;
		int end1 = mid;
		int start2 = mid + 1;
		int end2 = end;
		
		int index = start;
		while((start1 <= end1) && (start2 <= end2)) {
			if(arr[start1] < arr[start2]) {
				tempArray[index] = arr[start1];
				start1++;
			}
			else {
				tempArray[index] = arr[start2];
				start2++;
			}
			index++;
		}
		
		while(start1 <= end1) {
			tempArray[index] = arr[start1];
			start1++;
			index++;
		}
		
		while(start2 <= end2) {
			tempArray[index] = arr[start2];
			start2++;
			index++;
		}
		
		for(int i = start; i <= end; i++) {
			arr[i] = tempArray[i];
		}
		
	}
	
}
