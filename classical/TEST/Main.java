import java.util.*;
import java.lang.*;

public class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        while (n != 42) {
            System.out.println(n);
            n = input.nextInt();
        }

        input.close();
    }
}