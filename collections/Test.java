package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		Set<Integer> uniSet = new TreeSet<>();

		uniSet.add(3);
		uniSet.add(4);
		uniSet.add(5);
		uniSet.add(6);
		uniSet.add(3);
		uniSet.add(1);
		uniSet.add(2);
		System.out.println(uniSet);
		int[] arr = new int[uniSet.size()];
		int index = 0;
		System.out.println(uniSet.size());
		for(Integer e: uniSet) {
			System.out.println(e+" "+index);
			arr[index] = e;
			index++;
		}
		System.out.println(Arrays.toString(arr));
		
		
	}
}
