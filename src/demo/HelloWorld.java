//monday sep 24

/*HelloWorld should also be in a folder called demo
 /HelloWorld$ javac demo/HelloWorld.java
package resolves the fact that what if you had two HelloWorld's?
demo.HelloWorld is different than example.HelloWorld

java is running class demo.HelloWorld
demo.HelloWorld is the fully qualified class name
*/
package demo;

public class HelloWorld {
	//public; any class can run
	//static:
	//void: returns nothing
	//String args is the input from the terminal
	public static void main(String args[]) {
		
		//System.out.println(args.length);

		/* Prints Hello and first arg entry */
		System.out.println("Hello, " + args[0]);
	}
}
