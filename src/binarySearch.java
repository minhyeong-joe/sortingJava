public class binarySearch {
	
	static int find(int[] arr, int target, int start, int end) {
		if(end >= start) {
			int mid = start + (end - start) / 2;
			if(arr[mid] == target) {
				return mid;
			} 
			if(arr[mid] > target) {
				return find(arr, target, start, mid - 1);
			}
			return find(arr, target, mid + 1, end);		
		} else {
			return -1;
		}
	}
	
}
