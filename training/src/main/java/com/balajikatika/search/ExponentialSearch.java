package com.balajikatika.search;

public class ExponentialSearch {
	public static void main(String[] args) {
		int input[] = { 1, 20, 45, 65, 78, 87 };
		int result = exponentialSearch(input, 87);
		System.out.println(result);
	}

	private static int exponentialSearch(int[] input, int k) {

		int n = input.length;
		int i = 0;
		if (input[i] == k) {
			return i;
		}

		if (input[i + 1] == k) {
			return i + 1;
		}
		i = 1;
		while (i < n && input[i] <= k) {
			i *= 2;
		}

		return binarySearch(input, i / 2, Math.min(i, n - 1), k);
	}

	private static int calcMid(int start, int end) {
		return start + (end - start) / 2;
	}

	private static int binarySearch(int[] input, int start, int end, int k) {
		int result = -1;
		int mid;

		while (start <= end) {
			mid = calcMid(start, end);
			if (input[mid] == k) {
				result = mid;
				break;
			}
			if (k == input[end]) {
				result = end;
				break;
			}
			if (input[mid] > k) {
				start = mid + 1;
			}
			if (input[mid] < k) {
				end = mid - 1;
			}

		}

		return result;
	}

}
