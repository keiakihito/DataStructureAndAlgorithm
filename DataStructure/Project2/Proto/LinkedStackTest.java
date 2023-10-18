public class LinkedStackTest
{
	public static void main(String[] args) {

        System.out.println("~~~~ convertToPostfix_Test~~~~~~~~");

        LinkedStack<String> testLkdStack = new LinkedStack<>();
        LinkedStack<String> pstFix = new LinkedStack<>();
        LinkedStack<String> opStack = new LinkedStack<>();

        String inFix = "a * b / (c - a) + d * e";
        String expected = "a b * c a - / d e * +";
        pstFix = testLkdStack.convertToPostfix(inFix);
        System.out.println("\n\nInfix : " + inFix);
        System.out.print("Expected : " + expected);
        System.out.println(pstFix.toString());
        pstFix.clear();
        opStack.clear();


        inFix = "(a + b) / (c - d)";
        expected = "a b + c d - /";
        pstFix = testLkdStack.convertToPostfix(inFix);
        System.out.println("\n\nInfix : " + inFix);
        System.out.print("Expected : " + expected);
        System.out.println(pstFix.toString());
        pstFix.clear();
        opStack.clear();

        inFix = "a / (b - c) * d";
        expected = "a b c - / d *";
        pstFix = testLkdStack.convertToPostfix(inFix);
        System.out.println("\n\nInfix : " + inFix);
        System.out.print("Expected : " + expected);
        System.out.println(pstFix.toString());
        pstFix.clear();
        opStack.clear();

        inFix = "a - (b/(c-d)*e+f)^g";
        expected = "a b c d - / e * f + g ^ -";
        pstFix = testLkdStack.convertToPostfix(inFix);
        System.out.println("\n\nInfix : " + inFix);
        System.out.print("Expected : " + expected);
        System.out.println(pstFix.toString());
        pstFix.clear();
        opStack.clear();


        inFix = "(a - b * c) / (d * e ^ f * g +h)";
        expected = "a b c * - d e f ^ * g * h + /";
        pstFix = testLkdStack.convertToPostfix(inFix);
        System.out.println("\n\nInfix : " + inFix);
        System.out.print("Expected : " + expected);
        System.out.println(pstFix.toString());
        pstFix.clear();
        opStack.clear();


        System.out.println("\n\n~~~~ convertToPostfix_Test passed~~~~~~~~");


	}
}

/*
Sample run
~~~~ convertToPostfix_Test~~~~~~~~


Infix : a * b / (c - a) + d * e
Expected : a b * c a - / d e * +
toString : [+]->[*]->[e]->[d]->[/]->[-]->[a]->[c]->[*]->[b]->[a]->[^]


Infix : (a + b) / (c - d)
Expected : a b + C d - /
toString : [/]->[-]->[d]->[c]->[+]->[b]->[a]->[^]


Infix : a / (b - c) * d
Expected : a b c - / d *
toString : [*]->[d]->[/]->[-]->[c]->[b]->[a]->[^]


Infix : a - (b/(c-d)*e+f)^g
Expected : a b c d - / e * f + g ^ -
toString : [-]->[^]->[g]->[+]->[f]->[*]->[e]->[/]->[-]->[d]->[c]->[b]->[a]->[^]


Infix : (a - b * c) / (d * e ^ f * g +h)
Expected : a b c * - d e f ^ * g * h + /
toString : [/]->[+]->[h]->[*]->[g]->[*]->[^]->[f]->[e]->[d]->[-]->[*]->[c]->[b]->[a]->[^]


~~~~ convertToPostfix_Test passed~~~~~~~~

*/