import java.math.BigInteger;

public class Homework4 {
public static void main(String[] args) {
	BigInteger num =new BigInteger("123133123131321331231312312313312312312312312313122312313132123");
	BigInteger num2 =new BigInteger("23141441515825885185382858385328585238952825385385238523885932895");
	BigInteger sumBigInteger=num.add(num2);
	BigInteger minusBigInteger=num.subtract(num2);
	System.out.println(sumBigInteger);
	System.out.println(minusBigInteger);

	}
	
}


