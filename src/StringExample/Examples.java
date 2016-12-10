package StringExample;

public class Examples {
	
	public static void main(String[] args) {
	//	
		String s = "Welcome to my world";
	      char result = s.charAt(14);
	      System.out.println(result);
	//  
	   String s1 = "I like practicing";
	   s1 = s1.concat(" all the time");
	   System.out.println(s1);
    //
		String str1 = "Not immutable";
		String str2 = "Strings are immutable";
		StringBuffer str3 = new StringBuffer( "Not immutable");

		boolean  result1 = str1.contentEquals(str3);
		System.out.println(result1);

		result1 = str2.contentEquals(str3);
		System.out.println(result1);
    //
		char[] Str1 = {'W', 'e', 'l', 'c', 'o', 'm', 'e', ' ', 'h', 'o', 'm', 'e'};
		String Str2 = "";
		Str2 = String.copyValueOf(Str1);
		System.out.println("Returned String: " + Str2);
	//
		String Str = new String("This is really fun!!");
		boolean retVal;

		retVal = Str.endsWith( "fun!!" );
		System.out.println("Returned Value = " + retVal );

		retVal = Str.endsWith( "ffun" );
		System.out.println("Returned Value = " + retVal );
	//
		String Str11 = new String("This is really fun!!");
	      String Str22 = Str11;
	      String Str33 = new String("This is really not fun!!");
	      boolean retVal1;

	      retVal1 = Str11.equals(Str22);
	      System.out.println("Returned Value = " + retVal1 );

	      retVal1 = Str11.equals(Str33);
	      System.out.println("Returned Value = " + retVal1 );
	 //
	      String Str111 = new String("This is really fun!!");
	      String Str222 = Str111;
	      String Str333 = new String("This is really fun!!");
	      String Str444 = new String("This IS REALLY FUN!!");
	      boolean retVal2;

	      retVal2 = Str111.equals(Str222);
	      System.out.println("Returned Value = " + retVal2);

	      retVal2 = Str111.equals(Str333);
	      System.out.println("Returned Value = " + retVal2);

	      retVal2 = Str111.equalsIgnoreCase(Str444);
	      System.out.println("Returned Value = " + retVal2);
	 //
	      String Str10 = new String("Enjoy the ride");
	      String Str20 = new String("Bonus");

	      System.out.print("String Length :" );
	      System.out.println(Str10.length());

	      System.out.print("String Length :" );
	      System.out.println(Str20.length());
	 //  
	      String Str0 = new String("Enjoy the Ride");

	      System.out.print("Return Value :" );
	      System.out.println(Str0.matches("(.*)the(.*)"));

	      System.out.print("Return Value :" );
	      System.out.println(Str0.matches("the"));

	      System.out.print("Return Value :" );
	      System.out.println(Str0.matches("Enjoy(.*)"));
	      
	      System.out.print("return Value :");
	      System.out.println(Str0.matches("(.*)Ride"));
	      
	 //
	      String Str00 = new String("Enjoy The Ride");

	      System.out.print("Return Value :" );
	      System.out.println(Str00.replace('e', 'A'));

	      System.out.print("Return Value :" );
	      System.out.println(Str00.replace('y', 'T'));
     //
	      String Str01 = new String("Enjoy the Ride");

	      System.out.print("Return Value :" );
	      System.out.println(Str01.replaceFirst("(.*)the(.*)", "This is my Ride"));

	      System.out.print("Return Value :" );
	      System.out.println(Str01.replaceFirst("the", "my"));
     //
	      String Str001 = new String("Enjoy the Ride");

	      System.out.print("Return Value :" );
	      System.out.println(Str001.substring(6));

	//
	      String Str02 = new String("Enjoy the Game");

	      System.out.print("Return Value :");
	      System.out.println(Str02.toString());
	//
	      String Str03 = new String("enjoy the ride");

	      System.out.print("Return Value :" );
	      System.out.println(Str03.toUpperCase());
	//
	      String Str04 = new String("   Enjoy the ride   ");

	      System.out.print("Return Value :" );
	      System.out.println(Str04.trim() );
	//
	      String Str05 = new String("ENJOY THE RIDE");

	      System.out.print("Return Value :");
	      System.out.println(Str05.toLowerCase());
	//
	      double d = 99.99;
	      boolean b = true;
	      long l = 2000;
	      char[] arr = {'E', 'n', 'j', 'o', 'y' };

	      System.out.println("Return Value : " + String.valueOf(d) );
	      System.out.println("Return Value : " + String.valueOf(b) );
	      System.out.println("Return Value : " + String.valueOf(l) );
	      System.out.println("Return Value : " + String.valueOf(arr) );
	//
	      String s5="Yassine";  
	      System.out.println(s5.startsWith("Ya"));
	      System.out.println(s5.endsWith("e"));
	//
	      int a=10;  
	      String s6=String.valueOf(a);  
	      System.out.println(s6+10); 

	//
	      String name="what do you know about me";  
	      System.out.println(name.contains("do you know"));  
	      System.out.println(name.contains("about"));  
	      System.out.println(name.contains("hello"));  
	//
	      String str9 = "car finance";
	      if ( str9.compareTo("auto finance") > 0){ 
	      System.out.println("car finance string is alphabetically greater"); 
	      }
	      else{
	      System.out.println("car finance string is alphabetically lesser");
	      }
	//
	      String str8 = "Home Depot";
	      System.out.println(str8.hashCode());  
	// 
	      String s7="java string split method";  
	      String[] words=s7.split("\\s");  
	      for(String w:words){  
	      System.out.println(w);   
	}
}
}
