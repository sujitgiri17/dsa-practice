package com.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Stack;

public class StringProbs {
	
	public static String revs(String str) {
		String  string= "";
		for(int i=str.length()-1;i>=0;i--) {
			string += str.charAt(i);
		}
		return string;
	}
	
	public static int vowels(String str2) {
		int count = 0;
		for(int i=0;i<str2.length();i++) {
			char ch = str2.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				count++;
			}
		}
		return count;
	}
	
	public static void palindrome(String str3) {
		int first = 0;
		int last = str3.length()-1;
		
		while(first<last) {
			if(str3.charAt(first)!=str3.charAt(last)) {
				System.out.println("not palindrome");
				return;
			}
			first++;
			last--;	
		}
		System.out.println("palindorme");
	}
	
	public static void UpperOrLower(String str4) {
		int UpperCase = 0;
		int lowerCase = 0;
		for(int i=0;i<str4.length();i++) {
			if(str4.charAt(i)>='A' && str4.charAt(i)<='Z') {
				UpperCase++;
			}else if(str4.charAt(i)>='a' && str4.charAt(i)<='z') {
				lowerCase++;
			}
		}
		System.out.println("UpperCase: "+UpperCase);
		System.out.println("LowerCase: "+lowerCase);
	}
	
	public static void duplicate(String str5) {
		for(int i=0;i<str5.length();i++) {
			for(int j=i+1;j<str5.length();j++) {
				if(str5.charAt(i)==str5.charAt(j)) {
					System.out.println(str5.charAt(i));
					break;
				}
			}
		}
	}
	
	public static void mixed(String str6) {
		int letters = 0;
		int digits = 0;
		int special = 0;
		
		for(int i=0;i<str6.length();i++) {
			int ch = str6.charAt(i);
			if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) {
				letters++;
			}else if(ch>='0' && ch<='9') {
				digits++;
			}else {
				special++;
			}
		}
		System.out.println("Letters: "+letters);
		System.out.println("digits: "+ digits);
		System.out.println("special: "+special);
	}
	
	public static boolean isAnagram(String str7 , String str8) {
		
		if(str7.length()!=str8.length()) {
			return false;
		}
		for(int i=0;i<str7.length();i++) {
			int count1=0;
			int count2=0;
			
			for(int j=0;j<str7.length();j++) {
				if(str7.charAt(i)==str7.charAt(j)) {
					count1++;
				}
				if(str7.charAt(i)==str7.charAt(j)) {
					count2++;
				}
			}
			if(count1!=count2) {
				return false;
			}
		}
		return true;
	}
	
	public static void nonReptd(String str5) {
		for(int i=0;i<str5.length();i++) {
			int count=0;
			for(int j=0;j<str5.length();j++) {
				if(str5.charAt(i)==str5.charAt(j)) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(str5.charAt(i));
				return;
			}
		}
		
	}
	
	public static void removeDupli(String str5) {
		String result = "";
		for(int i=0;i<str5.length();i++) {
			boolean found = false;
			for(int j=0;j<result.length();j++) {
				if(str5.charAt(i)==result.charAt(j)) {
					found = true;
					break;
				}
			}
			if(!found) {
				result+=str5.charAt(i);
			}
			
		}
		System.out.println(result);
	}
	
	public static void freq(String str5) {
		HashMap<Character , Integer> map = new HashMap<>();
		
		for(int i=0;i<str5.length();i++) {
			
			map.put(str5.charAt(i), map.getOrDefault(str5.charAt(i), 0)+1);
			
		}
		for(Map.Entry<Character, Integer>entry: map.entrySet()) {
			System.out.println(entry.getKey()+ " -> "+ entry.getValue());
		}
	}
	
	public static boolean validAna(String str7 , String str8) {
		HashMap<Character, Integer> map = new HashMap<>();
		
		if(str7.length()!=str8.length()) {
			return false;
		}
		for(char ch : str7.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		for(char ch : str8.toCharArray()) {
			if(!map.containsKey(ch)) {
				return false;
			}
			map.put(ch, map.get(ch)-1);
			
			if(map.get(ch)==0) {
				map.remove(ch);
			}
		}
		return map.isEmpty();
		
	}
	
	public static int firstUnique(String stre) {
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i=0;i<stre.length();i++) {
			map.put(stre.charAt(i), map.getOrDefault(stre.charAt(i), 0)+1);
		}
		
		for(int i=0;i<stre.length();i++) {
			if(map.get(stre.charAt(i))==1) {
				return i;
			}
		}
		return -1;
	}
	
	//LinkedHashSet
	public static void uniqueCharacters(String str5) {
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		
		//programming
		for(char ch : str5.toCharArray()) {
			set.add(ch);
		}
		
		for(char ch : set) {
			System.out.println(ch);
		}
	}
	
	
	public static int numJewelsInStones(String jewels, String stones) {
		HashSet<Character> set = new HashSet<>();
		int count = 0;
		for(char ch : jewels.toCharArray()) {
			set.add(ch);
		}
		for(char ch : stones.toCharArray()) {
			if(set.contains(ch)) {
				count++;
			}
		}
		return count;
	}
	
	public static boolean isIsomorphic(String s, String t) {
		HashMap<Character, Character> map = new HashMap<>();
		HashMap<Character , Character> map1 = new HashMap<>();
		
		for(int i=0;i<s.length();i++) {
			char ch1 = s.charAt(i);
			char ch2 = t.charAt(i);
			
			if(map.containsKey(ch1)) {
				if(map.get(ch1)!=ch2) {
					return false;
				}
			}else {
				map.put(ch1, ch2);
			}
			if(map1.containsKey(ch2)) {
				if(map1.get(ch2)!=ch1) {
					return false;
				}
				}else {
					map.put(ch2, ch1);
				}	
			}
		return true;
		}
	
	public static String removeDuplicates(String a) {
		Stack<Character> stack = new Stack<>();
		
		for(char ch : a.toCharArray()) {
			if(stack.isEmpty()) {
				stack.push(ch);
			}else if(stack.peek()==ch) {
				stack.pop();
			}else {
				stack.push(ch);
			}
		}
		StringBuilder st = new StringBuilder();
		for(char ch : stack) {
			st.append(ch);
		}
		return st.toString();
	}
	
	public static String build(String str) {
		Stack<Character> stack = new Stack<>();
		
		for(char ch : str.toCharArray()) {
			if(ch != '#') {
				stack.push(ch);
			}else {
				if(!stack.isEmpty()) {
					stack.pop();
				}
			}
		}
		StringBuilder st = new StringBuilder();
		for(char ch : stack) {
			st.append(ch);
		}
		return st.toString();
	}
	
    public static boolean backspaceCompare(String x, String y) {
    	String first = build(x);
    	String second = build(y);
    	
    	return first.equals(second);
    }


	public static void main(String[] args) {
		String str = "JAVA";
		System.out.println(revs(str));
		
		String str2 = "education";
		System.out.println(vowels(str2));
		
		String str3 = "madam";
		palindrome(str3);
		
		String str4 = "JaVaPro";	
		UpperOrLower(str4);
		
		String str5 = "programming";
		duplicate(str5);
		
		String str6 = "Java@123#";
		mixed(str6);
		
		String str7 = "listen";
		String str8 = "silent";
		if(isAnagram(str7, str8)){
			System.out.println("Anagram");	
		}else {
			System.out.println("not Anagram");
		}
		
		nonReptd(str5);
		removeDupli(str5);
		freq(str5);
		System.out.println(validAna(str7, str8));
		
		String stre= "loveleetcode";
		System.out.println(firstUnique(stre)); 
		
		String jewels = "aA";
		String stones = "aAAbbbb";
		
		//LinkedHashSet
		uniqueCharacters(str5);
		
		System.out.println(numJewelsInStones(jewels , stones));
		
		String s = "egg";
		String t = "add";
		System.out.println(isIsomorphic(s,t));
		
		String a = "abbaca";
		System.out.println(removeDuplicates(a));
		
		String x = "ab#c";
		String y = "ab#c";
		System.out.println(backspaceCompare(x,y));
		
		

	}
}
