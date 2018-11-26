import com.revature.example.Calculator;

public class HelloWorld { //PascalCase is when you have more capitals such as HelloWorld where as camelCase then snakecase all lowers
		public static void main (String [] args) // public is the access, static it belongs to the class itself not any instance of the class , void it returns nothing, main it is the main method its the first thing 
		//instantiated when the program is called
		{
			System.out.println("Hello World!");
			//how to create an instance of the calculator class
			
			Calculator calc = new Calculator();
			System.out.println(calc.toString());
			System.out.println("five plus three is: "+calc.add(5,3));
		
			String s = "5";
			Double d = Double.parseDouble(s);
			//check type of d, should be parsed as the WRAPPER CLASS Double,
			//not the primitive double (which is why .getClass() works)
			System.out.println(d.getClass());
			
			//no more loose typing s = "3";
		}
	}
