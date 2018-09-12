import java.math.BigInteger;

public class Integer1
{
	public static void main(String[] args) 
	{
		
		
		BigInteger numberA=new BigInteger("9876543212345678945633");
		BigInteger numberB= BigInteger.TEN;
		
		numberA=numberA.add(numberB);
		
		System.out.println("NumberA ="+numberA);
	}
}
