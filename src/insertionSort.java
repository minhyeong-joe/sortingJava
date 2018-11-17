
public class insertionSort {
	
	void sort(int[] arr) {
		int temp;
		for(int i = 1; i < arr.length; i++) {
			for(int j = 0; j < i; j++) {
				if(arr[i-j] < arr[i-j-1]) {
					temp = arr[i-j];
					arr[i-j] = arr[i-j-1];
					arr[i-j-1] = temp;
				}
			}
		}
	}
	
}
