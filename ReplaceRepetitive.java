package exercies6;

import java.util.ArrayList;
import java.util.Scanner;



public class ReplaceRepetitive {
	static String a;
	static String [] a1;
	static String a2;
	static ArrayList<String> list = new ArrayList<>();
	
	public static void repeat() {

		for (int i = 0; i < a1.length; i++) {
			if (i < a1.length - 1 && a1[i].equals(a1[i + 1])) {
				a1[i] = " ";
				a1[i + 1] = "REPEAT";
				i++;
			}
			list.add(a1[i]);
		}
		for (int j = 0; j < list.size(); j++)
			System.out.print(list.get(j) + " ");
		System.out.println();
	}

	

	public static void testCaseA() {
		 a = "I want to to go to the the zoo";
		 a1 = a.split("\\s+");
		 a2 = "";
		
		System.out.println("Input:I want to to go to the the zoo");
		System.err.print("Expect out:");
		repeat();
		System.out.println("Real output: I want REPEAT go to REPEAT zoo ");
		list.removeAll(list);
		System.out.println("-----------------------------------------------------------");
	}
	public static void testCaseB() {
		 a = "I am am a Hero";

		 a1 = a.split("\\s+");
		 a2 = "";
		System.out.println("Input:I am am a Hero");		
		System.err.print("Expect out: ");
		repeat();
		System.out.println("I REPEAT a Hero ");
		list.removeAll(list);
		System.out.println("-----------------------------------------------------------");
	}
	
	public static void testCaseC() {
		a = "I go to the the Shopping";

		 a1 = a.split("\\s+");
		 a2 = "";
		System.out.println("I go to the the Shopping");
		System.err.print("Expect out:");
		repeat();
		System.out.println("Real output: I go to REPEAT Shopping ");
		list.removeAll(list);
		System.out.println("-----------------------------------------------------------");
	}
	
	public static void testCaseD() {
		 a = "Do you you love me me";

		 a1 = a.split("\\s+");
		 a2 = "";
		System.out.println("Input:Do you you love me me");
		System.err.print("Expect out:");
		repeat();
		System.out.println("Real output: Do REPEAT love REPEAT");
		list.removeAll(list);
		System.out.println("-------------------------------------------------------------");
	}
	
	public static void testCaseE() {
		 a = "Hello Hello chào cậu";

		 a1 = a.split("\\s+");
		 a2 = "";
		System.out.println("Input:Hello Hello chào cậu");
		System.err.print("Expect out:");
		repeat();
		System.out.println("Real output:REPEAT chào cậu ");
		list.removeAll(list);
		System.out.println("----------------------------------------------------------------");
	}
	
	public static void main(String[] args) {

		testCaseA();
		testCaseB();
		testCaseC();
		testCaseD();
		testCaseE();
	
	}
}
