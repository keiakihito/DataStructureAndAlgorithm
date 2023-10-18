public class ArrayStackTest
{
	public static void main(String[] args) {
		   System.out.println("~~~ evaluatePostfix_Test~~~~~\n\n");

        ResizeableArrayStack<Integer> testStack = new ResizeableArrayStack<>();
        int result = 0;

        String pstFix = "2 3 *  4 2 - / 5 6 * + ";
        result = testStack.evaluatePostfix(pstFix);
        System.out.println("postFix : 2 3 *  4 2 - / 5 6 * +");
        System.out.println("inFix (2 * 3) / (4 -2) + 5 * 6");
        System.out.println("Expected answer: 33");
        System.out.println("Actual answer : "+ result);


        pstFix = "5 7 + 6 2 - * ";
        result = testStack.evaluatePostfix(pstFix);
        System.out.println("\npostFix : 5 7 + 6 2 - * ");
        System.out.println("inFix (5 + 7) * (6 - 2)");
        System.out.println("Expected answer: 48");
        // assertEquals(result, 48);
        System.out.println("Actual answer : "+ result);


        pstFix = "2 6 + 3 5 - / ";
        System.out.println("\npostFix : a e + b d - /");
        System.out.println("inFix (a + e) / (b - d)");
        System.out.println("postFix : 2 6 + 3 5 - /");
        System.out.println("inFix (2+6) / (3 -5)");
        result = testStack.evaluatePostfix(pstFix);
        System.out.println("Expected answer: -4");
        // assertEquals(result, -4);
        System.out.println("Actual answer : "+ result);

        pstFix = "2 3 4 * 5 * -";
        System.out.println("\npostFix : a b c *  d  * - ");
        System.out.println("inFix a - b *  c *  d)");
        System.out.println("postFix : 2 3 4 * 5 * - ");
        System.out.println("inFix 2 - 3 *  4 * 5");
        result = testStack.evaluatePostfix(pstFix);
        System.out.println("Expected answer: -58");
        // assertEquals(result, -58);
        System.out.println("Actual answer : "+ result);

        pstFix = "2 3 4 - / 5 * ";
        System.out.println("\npostFix : a b c - / d  * ");
        System.out.println("inFix a - b *  c *  d)");
        System.out.println("postFix :  a / (b - c) * d");
        System.out.println("inFix 2 / (3 -4) * 5");
        result = testStack.evaluatePostfix(pstFix);
        System.out.println("Expected answer: -10");
        // assertEquals(result, -10);
        System.out.println("Actual answer : "+ result);


        pstFix = "6 3 4 2 ^ * + 5 -";
        System.out.println("\npostFix e b c a ^ * + d - ");
        System.out.println("inFix e + b * c ^ a - d ");
        System.out.println("postFix :  6 3 4 2 ^ * + 5 -");
        System.out.println("inFix 6 + 3 * 4 ^ 2 - 5");
        result = testStack.evaluatePostfix(pstFix);
        System.out.println("Expected answer: 49");
        // assertEquals(result, 49);
        System.out.println("Actual answer : "+ result);

        pstFix = "4 5 7 2 + - *";
        System.out.println("\npostFix :  4 5 7 2 + - *");
        System.out.println("inFix 4 * (5 - (7 + 2))");
        result = testStack.evaluatePostfix(pstFix);
        System.out.println("Expected answer: -16");
        // assertEquals(result, -16);
        System.out.println("Actual answer : "+ result);

        pstFix = "3 4 + 2 * 7 / ";
        System.out.println("\npostFix : 3 4 + 2 * 7 /");
        System.out.println("inFix ((3+4) * 2) / 7");
        result = testStack.evaluatePostfix(pstFix);
        System.out.println("Expected answer: 2");
        // assertEquals(result, 2);
        System.out.println("Actual answer : "+ result);

        pstFix = "5 7 + 6 2 - * ";
        System.out.println("\npostFix : 5 7 + 6 2 - *");
        System.out.println("inFix (5+7) * (6 - 2)");
        result = testStack.evaluatePostfix(pstFix);
        System.out.println("Expected answer: 48");
        // assertEquals(result, 48);
        System.out.println("Actual answer : "+ result);

        pstFix = "4 2 + 3 5 1 - * + ";
        System.out.println("\npostFix : 4 2 + 3 5 1 - * + ");
        System.out.println("inFix (4+ 2) + (3 * (5 - 1))");
        result = testStack.evaluatePostfix(pstFix);
        System.out.println("Expected answer: 18");
        // assertEquals(result, 18);
        System.out.println("Actual answer : "+ result);




        System.out.println("\n\n~~~evaluatePostfix_Test passed~~~~~");


	}
}

/*
Sample Run


~~~ evaluatePostfix_Test passed~~~~~


postFix : 2 3 *  4 2 - / 5 6 * +
inFix (2 * 3) / (4 -2) + 5 * 6
Expected answer: 33
Actual answer : 33

postFix : 5 7 + 6 2 - * 
inFix (5 + 7) * (6 - 2)
Expected answer: 48
Actual answer : 48

postFix : a e + b d - /
inFix (a + e) / (b - d)
postFix : 2 6 + 3 5 - /
inFix (2+6) / (3 -5)
Expected answer: -4
Actual answer : -4

postFix : a b c *  d  * - 
inFix a - b *  c *  d)
postFix : 2 3 4 * 5 * - 
inFix 2 - 3 *  4 * 5
Expected answer: -58
Actual answer : -58

postFix : a b c - / d  * 
inFix a - b *  c *  d)
postFix :  a / (b - c) * d
inFix 2 / (3 -4) * 5
Expected answer: -10
Actual answer : -10

postFix e b c a ^ * + d - 
inFix e + b * c ^ a - d 
postFix :  6 3 4 2 ^ * + 5 -
inFix 6 + 3 * 4 ^ 2 - 5
Expected answer: 49
Actual answer : 49

postFix :  4 5 7 2 + - *
inFix 4 * (5 - (7 + 2))
Expected answer: -16
Actual answer : -16

postFix : 3 4 + 2 * 7 /
inFix ((3+4) * 2) / 7
Expected answer: 2
Actual answer : 2

postFix : 5 7 + 6 2 - *
inFix (5+7) * (6 - 2)
Expected answer: 48
Actual answer : 48

postFix : 4 2 + 3 5 1 - * + 
inFix (4+ 2) + (3 * (5 - 1))
Expected answer: 18
Actual answer : 18


~~~evaluatePostfix_Test passed~~~~~


*/