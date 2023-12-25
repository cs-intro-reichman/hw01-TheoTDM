/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int n1 = (int) ((Math.random() * (b - a)) + a);
        int n2 = (int) ((Math.random() * (b - a)) + a);
        int n3 = (int) ((Math.random() * (b - a)) + a);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        int min = Math.min(n1, Math.min(n2, n3));
        System.out.println("The minimal generated number was " + min);
	}
}
