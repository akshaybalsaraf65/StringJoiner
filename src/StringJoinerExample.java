import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringJoiner stringjoiner = new StringJoiner(",","[","]");
		stringjoiner.add("akshay");
		stringjoiner.add("ak");
		stringjoiner.add("aki");
		stringjoiner.add("akiiii");
		
		System.out.println(stringjoiner);
		
		StringJoiner stringjoiner1 = new StringJoiner(",","[","]");
		stringjoiner1.add("akshay");
		stringjoiner1.add("ak");
		stringjoiner1.add("aki");
		stringjoiner1.add("akiiii");
		
		System.out.println(stringjoiner1);
		StringJoiner merge = stringjoiner.merge(stringjoiner1);
		System.out.println(merge);
		
		StringJoiner stringjoiner2 = new StringJoiner(",","[","]");
		System.out.println(stringjoiner2);
		stringjoiner2.setEmptyValue("It is empty");
		System.out.println(stringjoiner2);
		
		int length = stringjoiner2.length();
		System.out.println(length);
		
		String str = stringjoiner2.toString();
		System.out.println(str);
		
		char ch = str.charAt(3);
		System.out.println(ch);
		
		stringjoiner2.add("akshay");
		System.out.println(stringjoiner2);
		
		int newlength = stringjoiner2.length();
		System.out.println(newlength);
	}

}
