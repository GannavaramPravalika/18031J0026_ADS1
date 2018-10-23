
import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

class AddLargeNumbers {

	public static LinkedList numberToDigits(String number) {
		LinkedList<String> list1 = new LinkedList<String>();
		for (int i = 0; i < number.length(); i++)
			list1.add("" + number.charAt(i));
		/*Iterator<String> it = list1.iterator();
		while (it.hasNext())
			System.out.println(it.next());*/
		return list1;
	}

	public static String digitsToNumber(LinkedList list) {
		int i = 0;
		String s = "";
		for (i = 0; i < list.size(); i++) {
			s = s + list.get(i);
		}
		return s;
	}

	public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
		LinkedList<String> list3 = new LinkedList<>();
		Stack<String> st1 = new Stack<>();
		Iterator<String> it = list1.iterator();
		while (it.hasNext())
			st1.push(it.next());
		Stack<String> st2 = new Stack<>();

		it = list2.listIterator();
		while (it.hasNext())
			st2.push(it.next());
		int carry = 0;
		while (!st1.empty() && !st2.empty()) {
			
			int val = carry + Integer.parseInt(st1.pop()) + Integer.parseInt(st2.pop());
			list3.addFirst("" + val % 10);
			carry = val / 10;
		}
		if (st1.empty())
			st1 = st2;
		while (!st1.empty()) {
			
			int val = carry + Integer.parseInt(st1.pop()) ;
			list3.addFirst("" + val % 10);
			carry = val / 10;
		}
		if (carry > 0) {
			list3.addFirst("" + carry);
		}
		return list3;

	}
}

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String p = sc.nextLine();
		String q = sc.nextLine();
		switch (input) {
		case "numberToDigits":

			LinkedList<String> pDigits = AddLargeNumbers.numberToDigits(p);
			LinkedList<String> qDigits = AddLargeNumbers.numberToDigits(q);
			System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
			System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
			break;

		case "addLargeNumbers":

			LinkedList<String> pDigits1 = AddLargeNumbers.numberToDigits(p);
			LinkedList<String> qDigits1 = AddLargeNumbers.numberToDigits(q);
			LinkedList<String> result = AddLargeNumbers.addLargeNumbers(pDigits1, qDigits1);
			System.out.print(AddLargeNumbers.digitsToNumber(result));
			break;
		}
	}

}
