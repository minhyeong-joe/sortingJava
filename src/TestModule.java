
public class TestModule {
	
	static boolean enableArrayPrint = false;
	final static int ARRAY_SIZE = 100000;
	
	public static void main(String[] args) {
		long startTime, endTime;
		// Initialized array of randomly ordered integers
		int[] sortThis = new int[ARRAY_SIZE];
		int[] resetArr = new int[ARRAY_SIZE];
		generateRandomArray(sortThis);
		copyArray(resetArr, sortThis);
		
		// Print initial array
		System.out.println("********* Initial Array *********");
		printArray(sortThis);
		System.out.println();
		
		/************* insertionSort Test *************/
		System.out.println("********* InsertionSort Test *********");
		startTime = System.nanoTime();
		insertionSort.sort(sortThis);
		endTime = System.nanoTime();
		
		// print sorted array
		printArray(sortThis);
		// print Elapsed time
		System.out.printf("Elapsed Time: %f\n", (double)(endTime-startTime) / 1_000_000_000.0);
		System.out.println();
		
		// reset Array
		copyArray(sortThis, resetArr);
		
		/************* bubbleSort Test *************/
		System.out.println("********* BubbleSort Test *********");
		startTime = System.nanoTime();
		bubbleSort.sort(sortThis);
		endTime = System.nanoTime();
		
		// print sorted array
		printArray(sortThis);
		// print Elapsed time
		System.out.printf("Elapsed Time: %f\n", (double)(endTime-startTime) / 1_000_000_000.0);
		System.out.println();
		
		// reset Array
		copyArray(sortThis, resetArr);
		
		/************* mergeSort Test *************/
		System.out.println("********* MergeSort Test *********");
		startTime = System.nanoTime();
		mergeSort.sort(sortThis, 0, sortThis.length-1);
		endTime = System.nanoTime();
		
		// print sorted array
		printArray(sortThis);
		// print Elapsed time
		System.out.printf("Elapsed Time: %f\n", (double)(endTime-startTime) / 1_000_000_000.0);
		System.out.println();
		
		// reset Array
		copyArray(sortThis, resetArr);
		
		/************* quickSort Test *************/
		System.out.println("********* QuickSort Test *********");
		startTime = System.nanoTime();
		quickSort.sort(sortThis, 0, sortThis.length-1);
		endTime = System.nanoTime();
		
		// print sorted array
		printArray(sortThis);
		// print Elapsed time
		System.out.printf("Elapsed Time: %f\n", (double)(endTime-startTime) / 1_000_000_000.0);
		System.out.println();
		
		// reset Array
		copyArray(sortThis, resetArr);

		/************* heapSort Test *************/
		System.out.println("********* HeapSort Test *********");
		startTime = System.nanoTime();
		heapSort.sort(sortThis);
		endTime = System.nanoTime();
		
		// print sorted array
		printArray(sortThis);
		// print Elapsed time
		System.out.printf("Elapsed Time: %f\n", (double)(endTime-startTime) / 1_000_000_000.0);
		System.out.println();

		// reset Array
		copyArray(sortThis, resetArr);
		
		// searching comparison
		int target = sortThis[(int)(Math.random() * sortThis.length)];
		/************* linearSearch Test *************/
		System.out.println("********* LinearSearch Test *********");
		startTime = System.nanoTime();
		System.out.printf("%d is found at index %d\n", target, linearSearch.find(sortThis, target));
		endTime = System.nanoTime();

		// print Elapsed time
		System.out.printf("Elapsed Time: %f\n", (double)(endTime-startTime) / 1_000_000_000.0);
		System.out.println();
		
		/************* binarySearch Test *************/
		System.out.println("********* BinarySearch Test *********");
		quickSort.sort(sortThis, 0, sortThis.length-1);
		startTime = System.nanoTime();
		System.out.printf("%d is found at index %d\n", target, binarySearch.find(sortThis, target, 0, sortThis.length-1));
		endTime = System.nanoTime();

		// print Elapsed time
		System.out.printf("Elapsed Time: %f\n", (double)(endTime-startTime) / 1_000_000_000.0);
		System.out.println();
		
	}
	
	private static void generateRandomArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100000) + 1;
		}
	}
	
	static void printArray(int[] arr) {
		if(enableArrayPrint) {
			System.out.print("[");
			for(int i = 0; i < arr.length; i++) {
				if(i == arr.length-1)
					System.out.printf(" %d ", arr[i]);
				else
					System.out.printf(" %d,", arr[i]);
			}
			System.out.println("]");
		}
	}
	
	static void copyArray(int[] arr, int[] oldArr) {
		for(int i = 0; i < oldArr.length; i++)
			arr[i] = oldArr[i];
	}
}
