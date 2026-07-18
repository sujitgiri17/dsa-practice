package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeSet;

public class FindLargestEle {
	
	public static void LargestEle(int[] arr) {
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
	
	public static void SecLargestEle(int[] arr) {
		int max = arr[0];
		int secMax = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				secMax = max;
				max = arr[i];
			}
			else if(arr[i]>secMax && secMax!=max) {
				secMax = arr[i];
			
			}
		}
		System.out.println(secMax);
	}
	
	public static int[] reverseArr(int[] arr2) {
		int left=0;
		int right = arr2.length-1;
		
		while(left<right) {
				int temp = arr2[left];
				arr2[left] = arr2[right];
				arr2[right] = temp;
			left++;
			right--;
		}
		return arr2;
	}
	
	public static int minElement(int [] arr3) {
		int min = arr3[0];
		for(int nums : arr3) {
			if(nums<min) {
				min = nums;
			}
		}
		return min;
	}
	
	public static void evenOrOdd(int [] arr4) {
		int evenCount = 0;
		int OddCount = 0;
		
		for(int nums : arr4) {
			if(nums%2==0) {
				evenCount++;
			}else {
				OddCount++;
			}
		}
		System.out.println("Even Count: "+ evenCount);
		System.out.println("Odd Count: " + OddCount);
	}
	
	public static int eleFoundOrNot(int [] arr2,int target) {
		for(int i=0;i<arr2.length;i++) {
			if(arr2[i]==target) {
				return i;
			}
		}
		return -1;
	}
	
		public static int Freq(int[] arr5,int target) {
			int frequency = 0;
			for(int nums : arr5) {
				if(nums == target) {
					frequency++;
				}
			}
			return frequency;
		}
		
		public static int[] moveZero(int[] arr6) {
			int first=0;
			for(int i=0;i<arr6.length;i++) {
				if(arr6[i]!=0) {
					int temp=arr6[first];
					arr6[first]=arr6[i];
					arr6[i]=temp;
					first++;
				}
			}
			return arr6;
		}
		
		public static int missingEle(int[] arr7) {
			//int expected = 0;
			int actual = 0;
			int n = arr7.length+1;
//			for(int i=1;i<=n;i++) {
//				expected+=i;
//			}
			int expected = n*(n+1)/2;
			
			for(int i=0;i<arr7.length;i++) {
				actual+=arr7[i];
			}
			int missing = expected-actual;
			return missing;
		}
		
		public static int secSmallEle(int[] arr8) {
			int firstSmall=Integer.MAX_VALUE;
			int SecondSmall=Integer.MAX_VALUE;
			for(int i=0;i<arr8.length;i++) {
				if(firstSmall>arr8[i]) {
					SecondSmall = firstSmall;
					firstSmall =arr8[i];
				}
				else if(SecondSmall>arr8[i] && SecondSmall!=firstSmall) {
					SecondSmall=arr8[i];
				}
			}
			return SecondSmall;
		}
		
		public static int buyAndSell(int[] prices) {
			int maxprofit = 0;
			int buy = prices[0];
			for(int i=1;i<prices.length;i++) {
				if(buy>prices[i]) {
					buy= prices[i];
				}
				int profit = prices[i]-buy;
				
				maxprofit = Math.max(maxprofit, profit);	
			}
			return maxprofit;
		}
		
		public static int[] twoSum(int[] arr9 , int target) {
			for(int i=0;i<arr9.length;i++) {
				for(int j=i+1;j<arr9.length;j++) {
					int add = arr9[i]+arr9[j];
					if(add==target) {
						return new int[] {i , j};
					}
				}
			}
			return new int[] {-1,-1};
		}
		
		public static void arrList(int[] arr2) {
			ArrayList<Integer> list = new ArrayList<>();
			
			for(int i=0;i<arr2.length;i++) {
				list.add(arr2[i]);
			}
			
			if(list.contains(30)) {
				System.out.println("Element Found");
			}else {
				System.out.println("Element Not Found");
			}
//			for(int i=0;i<list.size();i++) {
//				System.out.println(list.get(i));
//			}
		}
		
		public static void largestEle(int[] arrr) {
			ArrayList<Integer> list = new ArrayList<>();
			int max = arrr[0];
			for(int i=0;i<arrr.length;i++) {
				 list.add(arrr[i]);
			}
			for(int i=0;i<list.size();i++) {
				if(list.get(i)>max) {
					max = list.get(i);
				}
			}
			System.out.println(max);
		}
		
		public static int secondLarge(int[] arr3) {
			int max = arr3[0];
			int secMax = Integer.MIN_VALUE;
			ArrayList<Integer> list = new ArrayList<>();
			for(int i=0;i<arr3.length;i++) {
				list.add(arr3[i]);
			}
			for(int i=0;i<list.size();i++) {
				if(list.get(i)>max) {
					 secMax = max;
					max = list.get(i);
				}
				else if(list.get(i)>secMax && secMax!=max) {
					secMax = list.get(i);
				}
			}
			return secMax;
		}
		
		public static void Mappp(int[] arrmap) {
			HashMap<Integer,Integer> map = new HashMap<>();
			
			for(int i=0;i<arrmap.length;i++) {
				if(map.containsKey(arrmap[i])) {
					map.put(arrmap[i], map.get(arrmap[i])+1);
				}else {
					map.put(arrmap[i], 1);
				}
				
			}
			
			for(Integer key : map.keySet()) {
				System.out.println(key + " -> " + map.get(key));
			}
		}
		
		public static void mappp2() {
			HashMap<Integer , String> map = new HashMap<>();
			
			map.put(101, "Sujit");
			map.put(102, "Rahul");
			map.put(103, "Amit");
			
			System.out.println( map.get(102)); 
			System.out.println(map.containsKey(104));
			map.replace(102, "Rohan");
			System.out.println(map);
			
		}
		
		public static int freq(int[] arrrr , int target) {
			HashMap<Integer , Integer> map = new HashMap<>();
			
			for(int i=0;i<arrrr.length;i++) {
					map.put(arrrr[i], map.getOrDefault(arrrr[i], 0) +1);
			}
			return map.getOrDefault(target, 0);
		}
		
		
		
		public static int distinctElements(int[] dist) {
		    HashMap<Integer , Integer> map = new HashMap<>();
		    
		    for(int num : dist) {
		    	map.put(num, map.getOrDefault(num,0)+1);
		    }
			
		    return map.size();
		}
		
		public static int firstReptd(int[] firstrep) {
			HashMap<Integer,Integer> map = new HashMap<>();
			for(int num : firstrep) {
				map.put(num, map.getOrDefault(num, 0)+1);
			}
			
			for(int num : firstrep) {
				if(map.get(num)>1) {
					return	num;
				}
			}
			return -1;
		}
		
		public static int majEle(int[] leetcode) {
			int n = leetcode.length;
			int half = n/2;
			HashMap<Integer,Integer> map = new HashMap<>();
			for(int num : leetcode) {
				map.put(num, map.getOrDefault(num, 0)+1);
			}
			for(int num : map.keySet()) {
				if(map.get(num)>half) {
					return num;
				}
			}
			return -1;
			
		}
		
		
		//HashSet
		public static void uniqueElements(int[] sst) {
			HashSet<Integer> set = new HashSet<>();
			
			for(int num : sst) {
				set.add(num);
			}
			
			for(int num : set) {
				System.out.println(num);
			}
			
		}
		
		public static boolean containsDuplicate(int[] dup) {
			HashSet<Integer> set = new HashSet<>();
			
			for(int num : dup ) {
				if(set.contains(num)) {
					return true;
				}
				set.add(num);
			}
			
			return false;
		}
		
		public static void intersection(int[] arrr1, int[] arrr2) {
			
			HashSet<Integer> set =new HashSet<>();
			
			for(int num : arrr1) {
				set.add(num);
			}
			for(int num : arrr2) {
				
				if( set.contains(num)) {
				System.out.println(num);
				set.remove(num);
				}
			}
			
		}
		
		public static void removeDuplicates(int[] dup) {
			LinkedHashSet<Integer> set = new LinkedHashSet<>();
			
			for(int num : dup) {
				set.add(num);
			}
			
			for(int num : set) {
				System.out.println(num);
			}
		}

		public static void sortUnique(int[] treeeS) {
			TreeSet<Integer> set = new TreeSet<>();
			for(int num : treeeS) {
				set.add(num);
			}
			for(int num : set) {
				System.out.println(num);
				
			}
		}
		
		public static int secondLlargest(int[] large) {
			TreeSet<Integer> set = new TreeSet<>();
			
			for(int num : large ) {
				set.add(num);
			}
			int largest = set.last();
			
			return set.lower(largest);
		}
		
		  public static int thirdMax(int[] nums) {
		        TreeSet<Integer> set = new TreeSet<>();

		        for(int num : nums){
		            set.add(num);
		        }
		        if(set.size()<3){
		            return set.last();
		        }
		        set.pollLast();
		        set.pollLast();

		        return set.last();
		    }
		  
		  //Stack DataStructure
		  
		  public static void stackDemo() {
			  Stack<Integer> stack = new Stack<>();
			  
			  stack.push(10);
			  stack.push(20);
			  stack.push(30);
			  
			  System.out.println(stack);
			  
			  System.out.println("Top: "+ stack.peek());
			  System.out.println("Removed: "+ stack.pop());
			  
			  System.out.println(stack);
		  }
		  
		  public static boolean isValid(String s) {
			  Stack<Character> stack = new Stack<>();
			  
			  for(char ch : s.toCharArray()) {
				  if(ch=='(' || ch=='{' || ch== '[') {
					  stack.push(ch);
				  }
				  else if(ch == ')' || ch == '}' || ch == ']') {
					  if(stack.isEmpty()) {
						  return false;
					  }else if(ch==')' && stack.peek()=='(') {
						  stack.pop();
					  }else if(ch=='}' && stack.peek()=='{') {
						  stack.pop();
					  }else if(ch==']' && stack.peek()=='[') {
						  stack.pop();
					  }else {
						  return false;
					  }
				  }
			  }
			  return  stack.isEmpty();
		  }
		  
		  public static int calPoints(String[] operations) {
			  Stack<Integer> stack = new Stack<>();
			  
			  for(String op : operations) {
				  if(op.equals("C")) {
					  stack.pop();
				  }else if(op.equals("D")) {
					 stack.push(stack.peek()*2);
				  }else if(op.equals("+")) {
					  int first = stack.pop();
					  int second = stack.peek();
					  
					  stack.push(first);
					  stack.push(first+second);
				  }else {
					  stack.push(Integer.parseInt(op));
				  }
			  }
			  int sum = 0;
			  for(int score : stack) {
				  sum+=score;
			  }
			  return sum;
		  }
		  
		  public static int[] nextGreaterElement(int[] nums3, int[] nums4) {
			  Stack<Integer> stack = new Stack<>();
			  HashMap<Integer,Integer> map = new HashMap<>();
			  
			  for(int i=nums4.length-1;i>=0;i--) {
				  
				  while(!stack.isEmpty() && stack.peek()<nums4[i]){
					stack.pop();  
				  }
				  
				  if(stack.isEmpty()) {
					  map.put(nums4[i],-1);
				  }else {
					  map.put(nums4[i], stack.peek());
				  }
				  stack.push(nums4[i]);
			  }
			  int[] ans = new int[nums3.length];
			  for(int i=0;i<nums3.length;i++) {
				  ans[i] = map.get(nums3[i]);
			  }
			  return ans;
		  }
		  
		  //Queue
		  public static void queueDemo() {
			  Queue<Integer> queue = new LinkedList<>();
			  
			  queue.offer(10);
			  queue.offer(20);
			  queue.offer(30);
			  
			  System.out.println(queue);
			  
			  System.out.println(queue.peek());
			  System.out.println(queue.poll());
			  System.out.println(queue);
			  System.out.println(queue.size());
			  System.out.println(queue.isEmpty());
		  }
		  
		  //Priority Queue
		  public static void priorityQueueDemo(){
			  PriorityQueue<Integer> pq = new PriorityQueue<>();
			  
			  pq.offer(30);
			  pq.offer(10);
			  pq.offer(20);
			  pq.offer(40);
			  
			  System.out.println(pq.peek());
			  System.out.println(pq.poll());
			  System.out.println(pq.peek());
			  System.out.println(pq);
			    
		  }
		 public static int findKthLargest(int[] nums, int k) {
			        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

			        for(int i : nums){
			            maxHeap.offer(i);
			        }
			        for(int i=0;i<k-1;i++){
			            maxHeap.poll();
			        }
			        return maxHeap.peek();
			    }
		 
		 public  static int lastStoneWeight(int[] stones) {
		       PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

		       for(int i : stones){
		        maxHeap.offer(i);
		       }
		       while(maxHeap.size()>1){
		        int first = maxHeap.poll();
		        int second = maxHeap.poll();
		        int reamin = first-second;
		        if(reamin!=0){
		            maxHeap.offer(reamin);
		        }
		       }
		       if(maxHeap.isEmpty()){
		        return 0;
		       }
		       return maxHeap.peek();

		    }
		 
		 public static int[] topKFrequent(int[] nums, int k) {

		        HashMap<Integer, Integer> map = new HashMap<>();

		        for (int num : nums) {
		            map.put(num, map.getOrDefault(num, 0) + 1);
		        }

		        PriorityQueue<Map.Entry<Integer, Integer>> pq =
		                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

		        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
		            pq.offer(entry);
		        }

		        int[] ans = new int[k];

		        for (int i = 0; i < k; i++) {
		            ans[i] = pq.poll().getKey();
		        }

		        return ans;
		    }
			    
	public static void main(String[] args) {
		int[] arr = {12,45,7,89,26,56};
		int[] arr2 = {10,20,30,40,50};
		int arr3[] = {12, 45, 7, 89, 26, 56};
		int arr4[] = {12, 45, 7, 89, 23, 56, 10, 21};
		int[] arr5 = {10, 20, 10, 30, 10, 40, 20};
		int arr6[] = {0, 1, 0, 3, 12};
		int arr7[] = {1, 2, 4, 5, 6};
		int arr8[] = {12, 5, 7, 1, 20, 3};
		int prices[] = {7, 1, 5, 3, 6, 4};
		int arrr[] = {10,45,7,89,26};
		int[] arrmap = {1, 2, 1, 3, 2, 1};
		LargestEle(arr);
		SecLargestEle(arr);
		int[] array = reverseArr(arr2);
		System.out.println(Arrays.toString(array)); 
		System.out.println(minElement(arr3));  
		evenOrOdd(arr4);
		
		int index = eleFoundOrNot(arr2, 30);
		if(index != -1) {
			System.out.println("Element found at index " + index);
		}else {
			System.out.println("Element not found");
		}
		
		System.out.println(Freq(arr5,10));
		System.out.println(Arrays.toString(moveZero(arr6)));
		
		System.out.println(missingEle(arr7));
		System.out.println(secSmallEle(arr8));
		System.out.println(buyAndSell(prices));
		
		int arr9[] = {2, 7, 11, 15};
		System.out.println(Arrays.toString(twoSum(arr9 , 9)));
		
		//Collection FreamWork
		arrList(arr2);
		largestEle(arrr);
		
		Mappp(arrmap);
		mappp2();
		
		
		
		
		int[] arrrr = {10, 20, 10, 30, 10, 40, 20};
		int target = 10;
		System.out.println(freq(arrrr , target));
		
		int[] dist = {1,2,2,3,4,4,5};
		System.out.println(distinctElements(dist));
		
		int[] firstrep = {10,5,3,4,3,5,6};
		System.out.println(distinctElements(firstrep));
		
		int[] leetcode = {2,2,1,1,1,2,2};
		System.out.println(majEle(leetcode)); 
		
		//HashSet
		int[] sst = {10,20,10,30,40,20,50};
		uniqueElements(sst);
		
		int[] dup = {10,20,30,40,20};
		System.out.println(containsDuplicate(dup)); 
		
		int[]arrr1 = {1,2,2,3,4};

		int[] arrr2 = {2,2,4,6};
		intersection(arrr1,arrr2);
		
		//LinkedHashSet
		removeDuplicates(dup);
		
		int[] treeeS = {40,10,30,20,10,50};
		
		//sortUnique(treeeS);
		
		
		int[] large = {40, 10, 30, 20, 50};
		System.out.println(secondLlargest(large));
		
		
		int [] nums = {1,2,3,4,5,6};
		System.out.println(thirdMax(nums));
		
		stackDemo();
		
		String s = "()[]{}"; 
		System.out.println(isValid(s));
		
		
		String[] operations ={"5","2","C","D","+"};
		System.out.println(calPoints(operations));
		
		int[] nums3 = {4,1,2};
		int[] nums4 = {1,3,4,2};
		System.out.println(Arrays.toString(nextGreaterElement(nums3,nums4)));
		
		
		//Queue
		queueDemo();
		
		//ProrityQueue
		priorityQueueDemo();
		
		
		int[] numss = {3,2,1,5,6,4};  
		int k = 2;
		System.out.println(findKthLargest(nums, k)); 
		
		
		int[] stones = {2,7,4,1,8,1};
		System.out.println(lastStoneWeight(stones)); 
		
		int[] freqt = {1,1,1,2,2,3};
		int kk=2;
		System.out.println(Arrays.toString(topKFrequent(freqt , kk))) ;
	}

}
