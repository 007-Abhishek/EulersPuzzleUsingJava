import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

public class eulersPuzzle {
 public final int NUM_OF_DIGITS = 10000;
 public final int NUMBER_OF_TERMS = 2000;
 
 public static void main(String[] args) {

	 eulersPuzzle EP = new eulersPuzzle();
	 System.out.println(EP.calculateE());
	 
 }
 
 public BigDecimal calculateE() {
	 MathContext mc = new MathContext(NUM_OF_DIGITS);
	 BigDecimal e= new BigDecimal(0);
	 BigInteger factorial = BigInteger.ONE;
	 BigDecimal nominator = BigDecimal.ONE;
     BigDecimal denominator = null;
     BigDecimal division = null;
	 
	 for(int i=0; i<=NUMBER_OF_TERMS; i++ ) {
		 if(i<=1)
			 factorial = BigInteger.ONE;
		 else
			 factorial = factorial.multiply(BigInteger.valueOf(i));
		 
		 denominator = new BigDecimal(factorial);
         division = nominator.divide(denominator, mc);
         e = e.add(division, mc);
	 }
 return e;
 }
}

