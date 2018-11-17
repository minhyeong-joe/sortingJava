
public class bubbleSort {
	
	void sort(int[] arr) {
		for(int i = 0; i < arr.length - 2; i++) {
			for(int j = 0; j < arr.length - 1; j++) {
				if(arr[j] > arr[j+1]) {
					// swap
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}			
		}
	}
	
}
