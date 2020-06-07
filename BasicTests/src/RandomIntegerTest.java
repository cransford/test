
//Test of StdRandom

import edu.princeton.cs.algs4.StdRandom;

public class RandomIntegerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test = StdRandom.uniform(1, 3);
		System.out.println(test);
	    for(int i = 0; i < 10; i++) {
	    	int t = StdRandom.uniform(1, 4);
	    	System.out.println(t);
	    }

	}

}
