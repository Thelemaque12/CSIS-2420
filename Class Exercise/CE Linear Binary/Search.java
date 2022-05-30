package ceLinearBinary;

/**
 * 
 * @author Jefson S
 *
 */

public class Search {
	
	/**
	 * Searches the array <code>numbers</code> for the
	 * specified <code>key</code> based on the linear
	 * search algorithm.
	 * @param numbers
	 * @param key the number that we are looking for 
	 * @return the index of the first occurrence of the key
	 * in the array or -1 if the key was not found
	 */
	public static int linear(int[] numbers, int key) {
		int n = numbers.length;
		for(int i = 0; i < n; i++) {
			if(numbers[i] == key) 
				return i;
			 
		}
		return -1;
	}

	/**
	 * Searches the array <code>numbers</code> for the
	 * specified <code>key</code> based on the linear
	 * search algorithm.
	 * @param numbers
	 * @param key the number that we are looking for 
	 * @return the index of the first occurrence of the key
	 * in the array or -1 if the key was not found
	 */
	public static int binary(int[] numbers, int key) {
		int lo = 0;
		int hi = numbers.length -1;
		
		while (lo <= hi) {
			int mid = lo + ((hi - lo) / 2);
			if (key < numbers[mid])
				hi = mid - 1;
			else if (key > numbers[mid])
				lo = mid + 1;
			else return mid;
		}
		return -1;
	}
	
}

