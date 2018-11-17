public class binarySearch {
	
	int search(int[] arr, int target, int start, int end) {
		if(end >= start) {
			int mid = start + (end - start) / 2;
			if(arr[mid] == target) {
				return mid;
			} 
			if(arr[mid] > target) {
				return search(arr, target, start, mid - 1);
			}
			return search(arr, target, mid + 1, end);		
		} else {
			return -1;
		}
	}
	
}
