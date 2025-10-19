package projects.recursion;

public class RecursionProject {
	public static int fib(int n) {
		if(n == 0) {//f(0) = 0
			return 0;
		}else if(n == 1) {//f(1) = 1
			return 1;
		}
		return fib(n-1)+fib(n-2);//formula
	}//works

	
	public static int power(int x, int y) {
		if(y <= 0) {//x to power of 0 is 1
			return 1;
		}else if(y == 1) {//x to power of 1 is x
			return x;
		}else {
			return x*power(x, y-1);//y-1 to get to the condition of y == 1 to return x, then get x multiplied by x
		}
	}//works

		
	public static int ackermann(int m, int n) {
		if(m <= 0) {//if m = 0, n+1;  
			return n+1;
		}else if(m > 0 && n <= 0) {//if m > 0 & n = 0, A(m-1, 1)
			return ackermann(m-1, 1);
		}else {//if m > 0 & n > 0, A(m-1), A(m, n-1))
			return ackermann(m-1, ackermann(m, n-1));
		}
	}//works

	
	
	public static int balance(int x, int y) {
		if(x == y || x+1 == y || x-1 == y) {//x within 1 of y
			if(x < y) {//return smaller number
				return x;
			}else {
				return y;
			}
		}else {
			if(x > y) {//if x is not within 1 of y
				return balance(x-1, y+1);//x is greater number, y is smaller number
			}else {
				return balance(x+1, y-1);//y is greater number, x is smaller number
			}
		}
	}//works
	

	
	
	//formula conversion (Math.pow(-1, n+1)/(2*(n-1)))
	public static double pi_approximation(int n) {
		double nthTermCalc = Math.pow(-1, n+1)/(2*n-1)*4;//result multiplied by 4
		
		if(n == 1) {//1-1/3+1/5-1/7+1/9 - nth term = pi/4; ex. 1 = n, 1 is input into leibniz (and returns 1) then added onto the formula in the doc
			return 1;
		}else {
			return nthTermCalc + pi_approximation(n-1);//multiplying here by 4 makes the numbers really big...
			//plus nthTermCalc because it gets added onto the pi_approximation formula
		}
	}//works

	
	public static boolean isPalindrome(String s) {
		if(s.length() <= 1) {//if the string is non-existent or one character 
			return true;			
		}else if(s.charAt(0) == s.charAt(s.length()-1)) {//if first character is equal to last character
			if(s.length() == 2) {//catches strings that are two characters
				return true;
			}else {
				return isPalindrome(s.substring(1, s.length()-1));//goes to the next character and next end length and checks the second to last character, and so on
			}
		}else {
			return false;
		}
	}//works
	
	

	public static boolean monotonicallyIncreasing(Integer[] a) {//like isPalindrome method, but with an array
		if(a.length <= 1) {//checking if array exists or one number
			return true;
		}else if(a[1] >= a[0]){//checks if index 1 is less than or equal to index 2
			if(a.length == 2) {//catches if there's only two integers in the array
				return true;
			}else {
				return mIHelper(a, 1);//array, starting 1 index after last
			}
		}else {
			return false;
		}
	}//works
	
	public static boolean mIHelper(Integer[] a, int indexNum) {//like substring(being index, end index) but.. mIHelper(array, begin index)
		//needs to check other indexes, at unspecified indexes
		
		if(a[indexNum] <= a[1]) {//if indexNum is first or second index, have to make it more than that
				indexNum++;
			if(indexNum == a.length-1) {//catches if it's at the end of the array
				return true;
			}else {
				return mIHelper(a, indexNum);//the array and the index number
			}
		}else {
			return false;
		}
	}//works
}
