package com.infotech.client;

public class ClientTest3 {

	public static void main(String[] args) {
		// insert and append method
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = sb.append("This").append(" is").append(" Number ")
				.append(1).append(" and ").append(1.101);
		System.out.println("After append -- " + sb.toString());

		if (sb == sb1) {
			System.out.println("True - same reference");
		} else {
			System.out.println("false - reference changed");
		}

		String str = new String();
		String str1 = str.concat("This").concat(" is");
		if (str == str1) {
			System.out.println("True - same reference");
		} else {
			System.out.println("false - reference changed");
		}
	}
}
