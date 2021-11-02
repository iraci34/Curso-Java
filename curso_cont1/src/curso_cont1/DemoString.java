package curso_cont1;

public class DemoString {

	public static void main(String[] args) {

	String original = "abcde FGHIJ ABC abc DEFG   ";	
		
	String s01 = original.toLowerCase();
	String s02 = original.toUpperCase();
	String s03 = original.trim();
	String s04 = original.substring(2);
	String s05 = original.substring(2,9);
	String s06 = original.replace('a', 'x');
	String s07 = original.replace("abc", "xy");
	int i = original.indexOf("bc");
	int j = original.lastIndexOf("bc");
	
	String s = "potato apple lemom orange";
	String[] vect = s.split(" ");
	
	
	System.out.println("Original: -" + original + "-");
	System.out.println("towLowerCase: -" + s01 + "-");   //minusculas
	System.out.println("towUpperCase: -" + s02 + "-");   // maiusculas
	System.out.println("trim: -" + s03 + "-");   //elimina espacos
	System.out.println("substring(2): -" + s04 + "-"); //retira 2 argumentos
	System.out.println("substring (2,9): -" + s05 + "-"); //seleciona entre os argumentos
	System.out.println("replace ('a', 'x'): -" + s06 + "-");   //substitui
	System.out.println("replace ('abc', 'xy'): -" + s07 + "-");
	System.out.println("Index of 'bc': " + i);
	System.out.println("lastIndex of 'bc' :" + j);
	
	System.out.println(vect[0]);
	System.out.println(vect[1]);
	System.out.println(vect[2]);
	System.out.println(vect[3]);


	
	}

}
