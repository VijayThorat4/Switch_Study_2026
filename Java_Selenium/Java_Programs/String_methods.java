
public class MyClass {

	public static void main(String[] args) {
		String str = new String("Hello");
		
		// length()
		int len = str.length();       // returns length of string
		System.out.println(len);
		
		// indexOf()
		int index = str.indexOf("o");    // returns index value of provided character
		System.out.println(index);
		
		// charAt()
		char a = str.charAt(2);        // returns character at provided index value
		System.out.println(a);
		
		// replace()
		String str1 = str.replace("ll", "ee");
		System.out.println(str1);         // returns a string that replaces old char with new char
		
		//  toLowerCase()
		String str2 = str.toLowerCase();     // returns string by converting to lower case
		System.out.println(str2);
		
		//  toUpperCase
		String str3 = str.toUpperCase();     // returns string by converting to upper case
		System.out.println(str3);
		
		//  compareTo()
		int com = str.compareTo("hello");
		System.out.println(com);
		
		//  concat()
		String str4 = str.concat(" Boy");    // returns a string appended by provided string 
		System.out.println(str4);
		
		//  trim()
		String str5 = str.trim();         // returns a string by trimming provided string with starting and ending white spaces 
		System.out.println(str5);
	}

}
