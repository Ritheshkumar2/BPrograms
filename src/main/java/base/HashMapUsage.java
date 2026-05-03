package base;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapUsage {

	public static void main(String[] args) {
		//test();
		//frequencyofcharacters();
		//characterfrequencyusing();
		//primenumcheck();
		//printduplicateValues();
		//testone();
		//replacevowelwithx();
		//tempwithouttempval();
		
		

	}

	private static void tempwithouttempval() {
		String a="dee";
		String b="eed";
		
//		a=a+b;
//		b=a.substring(0, a.length()-b.length());
//		a=a.substring(b.length());
//		System.out.println("a:"+a);
//		System.out.println("b:"+b);
		String temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
		
		
		
	}

	private static void replacevowelwithx() {
		String value="member";
		char[] ch=value.toCharArray();
		String upd="";
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i] == 'a' || ch[i] == 'e' || ch[i] =='i' || ch[i] == 'o' || ch[i] == 'u') {
				upd = upd+"x";
			}else {
				upd=upd+ch[i];
			}
		}
		System.out.print(upd.toString());
		
	}

	public static Map<String, String> getCredentials() {
	    Map<String, String> map = new HashMap<>();
	    map.put("username", "user1");
	    map.put("password", "pass1");
	    return map;
	}
	
	public static void testone() {
		Map<String, String> creds = getCredentials();

		System.out.println(creds.get("username"));
		System.out.println(creds.get("password"));
	}

	private static void printduplicateValues() {
		int arr[]= {1,2,3,1,2,3,1,8,4,5,9,0};
		
		Set<Integer> set=new HashSet<>();
		Set<Integer> duplicates=new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			if(!set.add(arr[i])) {
				duplicates.add(arr[i]);
			}
		}		
		System.out.print(duplicates);
	}

	private static void primenumcheck() {
		int num=11;
		boolean isPrime=true;
		
		if(num <=1) {
			isPrime=false;
		}
		
		for(int i=2;i<=num/2;i++) {
			if(num%i == 0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.print("Its a prime number");
		}else {
			System.out.print("Its not a prime number");
		}
		
	}

	private static void characterfrequencyusing() {
		String value="rithesh";
		char[] ch=value.toCharArray();
		boolean[] visited=new boolean[ch.length];
		
		for(int i=0;i<ch.length;i++) {
			if(visited[i]) {
				continue;
			}
			int count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					visited[j]=true;
				}
			}
			System.out.println(ch[i]+"-->"+count);
		}
		
	}

	private static void frequencyofcharacters() {
		String value="rithesh";
		char[] ch=value.toCharArray();
		Map<Character,Integer> map=new HashMap<>();
		
		for(int i=0;i<ch.length;i++) {
			map.put(ch[i],map.getOrDefault(ch[i], 0)+1);
		}
		for(Entry<Character, Integer> m:map.entrySet()) {
			System.out.println(m.getKey()+"-->"+m.getValue());
		}
		
	}

	private static void test() {
		String value="rithesh";
		char ch[]=value.toCharArray();
		String rev="";
		
		for(int i=ch.length-1;i>=0;i--) {
			rev=rev+ch[i];
		}
		System.out.print(rev.toString());
	}

}
