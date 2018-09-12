import java.io.*;
import java.util.*;

public class BinaryAddition{

	String addBinary(string a, string b)
	{
		String result = ""; // Initialize result
		int s = 0;		 // Initialize digit sum

		// Travers both strings starting from last
		// characters
		int i = a.size() - 1, j = b.size() - 1;
		while (i >= 0 || j >= 0 || s == 1)
		{
			// Comput sum of last digits and carry
			s += ((i >= 0)? a[i] - '0': 0);
			s += ((j >= 0)? b[j] - '0': 0);

			// If current digit sum is 1 or 3, add 1 to result
			result = char(s % 2 + '0') + result;

			// Compute carry
			s /= 2;

			// Move to next digits
			i--; 
			j--;
		}
		return result;
	}

public static void main(String args[]){	
	BinaryAddtion obj = new BinaryAddition();
	String a = "1001";
	String b = "1000";
	String ans = obj.addBinary(a,b);
	System.out.prinln("ANS IS:"+ ans);
	}

}



