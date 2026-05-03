package base;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicatesInAnArray {

	public static void main(String[] args) {
		//test();
		//testone();
		one();

	}

	private static void one() {
		int[] arr={1,2,3,1,2,4,5,5,7};
		
		boolean[] visited=new boolean[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			if(visited[i]) {
				continue;
			}
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					count++;
					visited[j]=true;
				}
			}
			if(count>1) {
				System.out.print(arr[i]+" ");
			}
		}
	}

	private static void testone() {
		int[] arr={1,2,3,1,2,4,5,5,7};
		Arrays.sort(arr);
		
		for(int i=1;i<=arr.length-1;i++) {
			if(arr[i] == arr[i-1]) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}

	private static void test() {
		int[] arr={1,2,3,1,2,4,5,5,7};
		
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
		}
		for(Entry<Integer,Integer> i:map.entrySet()) {
			//System.out.println(i.getKey()+"-->"+i.getValue());
			if(i.getValue()>1) {
				System.out.println(i.getKey()+"-->"+i.getValue());
			}
		}
		
	}

}
