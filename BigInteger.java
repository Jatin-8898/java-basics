import java.math.BigInteger;

public class Integer
{
	public static void main(String[] args) 
	{
		
		
		BigInteger numberA=new BigInteger("987654321234567897855");
		BigInteger numberB= BigInteger.TEN;
		
		numberA=numberA.add(numberB);
		
		System.out.println("NumberA ="+numberA);
	}
}
