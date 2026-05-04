package base;

import java.util.LinkedList;
import java.util.List;

public class MergeTwoArrays {

	public static void main(String[] args) {
		//test();
		mergetwolinkedlists();

	}

	private static void mergetwolinkedlists() {
		List<Integer> list1=new LinkedList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		List<Integer> list2=new LinkedList<>();
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		list1.addAll(list2);
		
		System.out.print(list1);
	}

	private static void test() {
		int arr1[]= {1,2,3};
		int arr2[]= {4,5,6};
		
		int[] result=new int[arr1.length+arr2.length];
		
		for(int i=0;i<arr1.length;i++) {
			result[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			result[arr1.length+i]=arr2[i];
		}
		
		for(int res:result) {
			System.out.print(res+" ");
		}
		
	}

}
