package com.bridgelabz.hashtablesandtree;

import java.util.Arrays;
import java.util.LinkedHashSet;

import org.junit.Assert;
import org.junit.Test;

public class HashTableTest {

	@Test
	public void frequencyWordTest() {
		String sentence = "To to be or not to be";
		String[] words = sentence.toLowerCase().split(" ");
		String result = "";
		MyHashMap<String, Integer> hashMap = new MyHashMap<>();
		for (String word : words) {
			Integer value = hashMap.get(word);
			if (value == null) {
				value = 1;
			} else {
				value += 1;
			}
			hashMap.add(word, value);
		}

		LinkedHashSet<String> set = new LinkedHashSet<String>(Arrays.asList(words));
		for (String word : set) { // Convert to string
			result = result + word + " : " + hashMap.get(word) + "\n";
		}
		System.out.println(result);
		System.out.println("Size is : " + hashMap.size());

		Integer frequency = hashMap.get("be");
		Integer expectedValue = 2;
		Assert.assertEquals(expectedValue, frequency);
	}

	@Test
	public void largeParafrequencyWordTest() {
		String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		String[] words = sentence.toLowerCase().split(" ");
		String result = "";
		MyHashMap<String, Integer> hashMap = new MyHashMap<>();
		for (String word : words) {
			Integer value = hashMap.get(word);
			if (value == null) {
				value = 1;
			} else {
				value += 1;
			}
			hashMap.add(word, value);
		}

		LinkedHashSet<String> set = new LinkedHashSet<String>(Arrays.asList(words));
		for (String word : set) { // Convert to string
			result = result + word + " : " + hashMap.get(word) + "\n";
		}
		System.out.println(result);
		System.out.println("Size is : " + hashMap.size());

		Integer frequency = hashMap.get("paranoid");
		Integer expectedValue = 3;
		Assert.assertEquals(expectedValue, frequency);
	}
	
	@Test
	public void removeAvoidableWord() {
		String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		String[] words = sentence.toLowerCase().split(" ");
		String result = "";
		MyHashMap<String, Integer> hashMap = new MyHashMap<>();
		for (String word : words) {
			Integer value = hashMap.get(word);
			if (value == null) {
				value = 1;
			} else {
				value += 1;
			}
			hashMap.add(word, value);
		}
		
		hashMap.remove("avoidable");
		
		Integer expected = null;
		Integer actualResult = hashMap.get("avoidable");
		Assert.assertEquals(actualResult, expected);

		LinkedHashSet<String> set = new LinkedHashSet<String>(Arrays.asList(words));
		for (String word : set) { // Convert to string
			result = result + word + " : " + hashMap.get(word) + "\n";
		}
		System.out.println(result);
		System.out.println("Size is : " + hashMap.size());
	}
}
