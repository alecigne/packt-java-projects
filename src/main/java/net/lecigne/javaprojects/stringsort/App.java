package net.lecigne.javaprojects.stringsort;

public class App {

	public static void main(String[] args) {
		var names = new String[] { "Johnson", "Wilson", "Wilkinson", "Abraham", "Dagobert" };
		Sort.sort(names);
		for (final String name : names) {
			System.out.println(name);
		}
	}

}
