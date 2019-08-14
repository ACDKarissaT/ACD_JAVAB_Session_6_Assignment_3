package assignment3;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {1 , 2, 4, 5, 6, 7, 8, 10};
		int result = -1;
		
		result = binSearch(null,2);
		if(result < 0) {
			System.out.println("Number not found.");
		} else {
			System.out.println("Number found. Index = " + result);
		}
		result = binSearch(arr, 11);
		if(result < 0) {
			System.out.println("Number not found.");
		} else {
			System.out.println("Number found. Index = " + result);
		}
		
		result = binSearch(arr, -2);
		if(result < 0) {
			System.out.println("Number not found.");
		} else {
			System.out.println("Number found. Index = " + result);
		}
		result = binSearch(arr, 3);
		if(result < 0) {
			System.out.println("Number not found.");
		} else {
			System.out.println("Number found. Index = " + result);
		}
		result = binSearch(arr, 9);
		if(result < 0) {
			System.out.println("Number not found.");
		} else {
			System.out.println("Number found. Index = " + result);
		}
		result = binSearch(arr, 2);
		if(result < 0) {
			System.out.println("Number not found.");
		} else {
			System.out.println("Number found. Index = " + result);
		}
		result = binSearch(arr, 8);
		if(result < 0) {
			System.out.println("Number not found.");
		} else {
			System.out.println("Number found. Index = " + result);
		}
		
	}
	
	static int binSearch(int[] arr, int find){
		
		if (arr != null) {
			System.out.print("Array = {");
			for(int i: arr) System.out.print(i + " ");
			System.out.print("}"
					+ "\nSearching for " + find+ "\n");
			return binSearch(arr, 0, arr.length-1, find);
		}
		System.out.println("Array = null"
				+ "\nSearching for " + find);
		return -1;
	}
	
	static int binSearch(int[] arr, int start, int end, int find) {
		
		if (arr == null || start < 0 || end < 0 
				|| start >= arr.length || end >= arr.length) {
			return -1;
		} else {
			int i = (end + start)/2;
			if (arr[i] == find) {
				return i;
			} else if (i == start && end == i) {
				return -1;
			} else if (arr[i] < find) {
				return binSearch(arr, i+1, end, find);
			} else {
				return binSearch(arr, start, i-1, find);
			}
		}
	}
}
