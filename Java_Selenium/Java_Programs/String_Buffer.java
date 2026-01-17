
public class MyClass {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Welcome");
		sb.append(" to home");
		System.out.println(sb);       // appends provided string at the end
		
		sb.insert(2, "new");          // inserts provided string at specified index
		System.out.println(sb);
		
		sb.delete(2, 5);              // deletes string between provided index
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);       // reverses the string
		sb.reverse();
		
		sb.replace(0, 7, "Come");     // replaces the provided string within specified index range
		System.out.println(sb);
		
	}

}
