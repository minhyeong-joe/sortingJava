
public class TestModule {
	
	static void printArray(int[] arr) {
		System.out.print("[ ");
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length-1)
				System.out.printf("%d ", arr[i]);
			else
				System.out.printf("%d, ", arr[i]);
		}
		System.out.println("] ");
	}
	
	static void resetArray(int[] arr) {
		arr[0] = 5;
		arr[1] = 3;
		arr[2] = 7;
		arr[3] = 9;
		arr[4] = 1;
		arr[5] = 8;
		arr[6] = 6;
		arr[7] = 2;
		arr[8] = 4;
	}

	public static void main(String[] args) {
		
		int[] arr =  {5, 3, 7, 9, 1, 8, 6, 2, 4};
		printArray(arr);
		
		// bubble sort test
		bubbleSort bubble = new bubbleSort();
		bubble.sort(arr);
		printArray(arr);
		
		// insertion sort test
		resetArray(arr);
		insertionSort insertion = new insertionSort();
		insertion.sort(arr);
		printArray(arr);
		
		// merge sort test
		resetArray(arr);
		mergeSort merge = new mergeSort();
		merge.sort(arr, 0, arr.length-1);
		printArray(arr);
		
		// quick sort test
		resetArray(arr);
		quickSort quick = new quickSort();
		quick.sort(arr, 0, arr.length - 1);
		printArray(arr);
		
		// binary search test
		binarySearch bin = new binarySearch();
		int target = 2;
		int index = bin.search(arr, target, 0, arr.length-1);
		if(index == -1)
			System.out.println("Not Found.");
		else
			System.out.printf("%d is Found at index: %d\n", target, index);
		
		
	}

}
