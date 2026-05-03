package base;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestStrings {

	public static void main(String[] args) {
		//test_strings();
		//test_frequency();
		//test_frequency_withoutInbuilt();
		//test_removeduplicates();
		//test_findduplciates();
		//test_reversestrings();
		//test_findfirstandlastindex();
		//test_secondmax();
		test_maxandminvalue();

	}

	private static void test_maxandminvalue() {
		int arr[]= {1,2,3,1,3,4,5,6,7,8};
		
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}

	private static void test_secondmax() {
		int arr[]= {1,2,3,1,3,4,5,6,7,8};
		
		int firstmax=Integer.MIN_VALUE;
		int secondmax=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > firstmax) {
				secondmax=firstmax;
				firstmax=arr[i];
			}else if(arr[i] > secondmax && arr[i] != firstmax) {
				secondmax=arr[i];
			}
		}
		
		System.out.println(firstmax);
		System.out.println(secondmax);
		
	}

	private static void test_findfirstandlastindex() {
		String val="aamazzinga";
		
		int firstIndex=val.indexOf('a');
		int lastIndex=val.lastIndexOf('a');
		System.out.print(firstIndex+ "-->"+lastIndex);
		
	}

	private static void test_reversestrings() {
		String values="he is an automation test engineer";
		String[] val=values.split("\\s+");
		
		String rev="";
		
		for(int i=val.length-1;i>=0;i--) {
			rev=rev+val[i]+" ";
		}
		System.out.print(rev.toString().trim());
		
	}

	private static void test_findduplciates() {
        int[] arr= {1,2,3,1,2,5,6,7,8};
		
		Set<Integer> set=new HashSet<>();
		Set<Integer> dup=new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			if(!set.add(arr[i])) {
				dup.add(arr[i]);
			}
		}
		System.out.print(dup.toString());
		
	}

	private static void test_removeduplicates() {
		int[] arr= {1,2,3,1,2,5,6,7,8};
		
		Set<Integer> set=new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			if(!set.contains(arr[i])) {
				set.add(arr[i]);
			}
		}
		System.out.print(set.toString());
		
	}

	private static void test_frequency_withoutInbuilt() {
		String value="rithesh";
		char[] ch=value.toCharArray();
		
		boolean[] visited=new boolean[ch.length];
		
		for(int i=0;i<ch.length;i++) {
			if(visited[i]) {
				continue;
			}
			int count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i] == ch[j]) {
					count++;
					visited[j]=true;
					
				}
			}
			System.out.println(ch[i]+"-->"+count);
		}
		
	}

	private static void test_frequency() {
		String value="rithesh";
		char[] ch=value.toCharArray();
		
		Map<Character,Integer> map=new HashMap<>();
		
		for(int i=0;i<ch.length;i++) {
			map.put(ch[i],map.getOrDefault(ch[i],0)+1);
		}
		
		for(Entry<Character,Integer> m:map.entrySet()) {
			System.out.println(m.getKey()+"-->"+m.getValue());
		}
		
	}

	private static void test_strings() {
		String val="rithesh";
		String rev="";
		char[] ch=val.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--) {
			rev=rev+ch[i];
		}
		System.out.print(rev);
	}

}
