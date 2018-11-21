
public class Calculator {
 Calculator Calc = new Calculator ();
 
 double additionresult;
 double subtractionresult;
 double multiplicationresult;
 double divisionresult;


 public double add (double arg0, double arg1) {
	 additionresult = arg0 + arg1;
	 return additionresult;
	 
 }
 
 public double subtract (double arg0, double arg1) {
	 subtractionresult = arg0 - arg1;
	 return subtractionresult;
 }

 public double multiply (double arg0, double arg1) {
	 multiplicationresult = arg0 * arg1;
	 return multiplicationresult;
 }
 
 public double divide (double arg0, double arg1) {
	 divisionresult = arg0 * arg1;
	 return divisionresult;
 }
}
