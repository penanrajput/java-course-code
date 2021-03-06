/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/
import java.util.*;
import java.io.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new
			                        InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException  e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
	public static void main(String args[] ) throws Exception {

		/* Sample code to perform I/O:
		 * Use either of these methods for input

		//BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();                // Reading input from STDIN
		System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

		//Scanner
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();                 // Reading input from STDIN
		System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

		*/

		// Write your code here
		// Scanner in = new Scanner(System.in);
		FastReader in = new FastReader();
		int n = in.nextInt();
		Vector<Integer> v1 = new Vector<Integer>();
		Vector<Integer> v2 = new Vector<Integer>();

		int m = n;
		while (m-- != 0)
			v1.add(in.nextInt());
		m = n;
		while (m-- != 0)
			v2.add(in.nextInt());
		m = 0;
		while (m < n) {
			System.out.print((v1.get(m) + v2.get(m)) + " ");
			m++;
		}


	}
}
