package practise;

public class Variable_Datatype {
//	int age = 25;
//	Double temperature = 98.6;
//	boolean isRaning = true;
//	char Grade = 'A';
//	String name = "Krishnan";
//	int num1 = 13, num2 = 20, num3 = 30;
//	Double pi = Math.PI;
//
//	boolean isEven(int num) {
//		return ((num1 % 2 == 0));
//	}// Even or odd using Boolean
//
//	char initial = 'N';
//	String City = "kanyakumari";

	boolean isPalindrome(String str) {// isPalindrome by Boolean
		int left = 0;
		int right = str.length() - 1;
		char val[] = str.toCharArray();
		while (left < right) {
			if (str.charAt(right) != str.charAt(left)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	double length = 5.5, width = 2.5;

	boolean isPositive(int b) { // ispositive using boolean
		if (b >= 0) {
			return true;
		}
		return false;
	}
	
	String greeting(String name) {
		String Name="Hello ";
		return Name+name; 
	}

	public static void main(String[] args) {
		Variable_Datatype obj = new Variable_Datatype();
//		System.out.println(obj.isEven(obj.num1));
//		System.out.println(obj.isPalindrome("madam"));
//		System.out.println(obj.isPositive(0));
		System.out.println(obj.greeting("krishnan"));
	}
}
