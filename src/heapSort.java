import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class heapSort {

	public static void sort(int[] arr) {
		minHeap heap = new minHeap(arr);
		int i = 0;
		while(!heap.isEmpty()) {
			arr[i] = heap.pop();
			i++;
		}
	}
	
	private static class minHeap {
		
		ArrayList<Integer> heap;
		int size;
		
		public minHeap(int[] arr) {
			Integer[] array = new Integer[arr.length];
			for(int i = 0; i < arr.length; i++)
				array[i] = arr[i];
			heap = new ArrayList<Integer>(Arrays.asList(array));
			size = array.length;
			buildHeap(0);
		}
		
		public int pop() {
			int min = heap.get(0);
			swap(heap, 0, size-1);
			size--;
			fixHeap(0);
			return min;
		}
		
		public boolean isEmpty() {
			return size==0;
		}
	 	
		private void buildHeap(int index) {
			if(index < size) {			
				buildHeap(2*index+1);
				buildHeap(2*index+2);
				fixHeap(index);
			}
		}
		
		private void fixHeap(int Pindex) {
			int LCindex = 2*Pindex+1;
			int RCindex = 2*Pindex+2;
			int minIndex = Pindex;
			while((LCindex < size && heap.get(LCindex) < heap.get(Pindex)) || (RCindex < size && heap.get(RCindex) < heap.get(Pindex))) {
				if(heap.get(LCindex) < heap.get(Pindex)) {
					minIndex = LCindex;
				}
				if(RCindex < size && heap.get(RCindex) < heap.get(minIndex)) {
					minIndex = RCindex;
				}			
				if(minIndex != Pindex) {
					swap(heap, Pindex, minIndex);
				}
				Pindex = minIndex;
				LCindex = 2*Pindex+1;
				RCindex = 2*Pindex+2;
				minIndex = Pindex;
			}
		}
		
		private void swap(List<Integer> list, int i, int j) {
			int temp = list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);
		}
	}

	
}
