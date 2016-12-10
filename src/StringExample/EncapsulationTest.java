package StringExample;

public class EncapsulationTest extends EncapsulationExample{
	    public static void main(String args[]){
	         EncapsulationTest obj = new EncapsulationTest();
	         obj.setEmpName("Patrick");
	         obj.setEmpAge(29);
	         obj.setEmpSSN(224455);
	         System.out.println("Employee Name: " + obj.getEmpName());
	         System.out.println("Employee SSN: " + obj.getEmpSSN());
	         System.out.println("Employee Age: " + obj.getEmpAge());
	    } 
	}

