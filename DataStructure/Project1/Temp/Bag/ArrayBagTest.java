class ArrayBagTest {
    public static void main(String[] args) {
        unionTest();
        intersectionTest();
        differenceTest();
    }


    private static void unionTest() {
        System.out.println("= = = = = = = union Test= = = = = = \n");
        System.out.print("\n~~String~~~\n");


        BagInterface<String> bag1 = new ResizeableArrayBag<>(5);
        bag1.add("a");
        bag1.add("b");
        bag1.add("c");
        System.out.println(bag1.toString());

        BagInterface<String> bag2 = new ResizeableArrayBag<>(5);
        bag2.add("b");
        bag2.add("b");
        bag2.add("d");
        bag2.add("e");
        System.out.println(bag2.toString());

        System.out.print("\n Call union method to marge bag 1 and bag 2");
        System.out.println("\n After calling union method  bag 1 and bag 2 are still same");

        BagInterface<String> everything = bag1.union(bag2);

        System.out.print("\n bag 1 : ");
        System.out.println(bag1.toString());
        System.out.print("bag 2 : ");
        System.out.println(bag2.toString());
        System.out.print("everything : ");
        System.out.println(everything.toString());



        System.out.print("\n\n~~Integer~~~");
        BagInterface<Integer> intBag1 = new ResizeableArrayBag<>(5);
        intBag1.add(1);
        intBag1.add(2);
        intBag1.add(3);
        intBag1.add(4);

        BagInterface<Integer> intBag2 = new ResizeableArrayBag<>(5);
        intBag2.add(3);
        intBag2.add(5);
        intBag2.add(1);
        intBag2.add(2);

        BagInterface<Integer> intUniBag = intBag1.union(intBag2);
        System.out.print("\n intBag1 : ");
        System.out.println(intBag1.toString());
        System.out.print("intBag2: ");
        System.out.println(intBag2.toString());
        System.out.print("intUniBag : ");
        System.out.println(intUniBag.toString());


        System.out.print("\n\n~~Double~~~");
        BagInterface<Double> dobBag1 = new ResizeableArrayBag<>(5);
        dobBag1.add(1.5);
        dobBag1.add(2.7);
        dobBag1.add(3.9);
        dobBag1.add(4.8);

        BagInterface<Double> dobBag2 = new ResizeableArrayBag<>(5);
        dobBag2.add(3.6);
        dobBag2.add(5.7);
        dobBag2.add(1.8);
        dobBag2.add(2.0);

        BagInterface<Double> dobUniBag = dobBag1.union(dobBag2);
        System.out.print("\n dobBag1 : ");
        System.out.println(dobBag1.toString());
        System.out.print("dobBag2: ");
        System.out.println(dobBag2.toString());
        System.out.print("dubUniBag : ");
        System.out.println(dobUniBag.toString());



        System.out.print("\n\n~~Character~~~");
        BagInterface<Character> charBag1 = new ResizeableArrayBag<>(5);
        charBag1.add('A');
        charBag1.add('H');
        charBag1.add('B');
        charBag1.add('K');

        BagInterface<Character> charBag2 = new ResizeableArrayBag<>(5);
        charBag2.add('O');
        charBag2.add('L');
        charBag2.add('M');
        charBag2.add('D');

        BagInterface<Character> charUniBag = charBag1.union(charBag2);
        System.out.print("\n charBag1 : ");
        System.out.println(charBag1.toString());
        System.out.print("charBag2: ");
        System.out.println(charBag2.toString());
        System.out.print("charUniBag : ");
        System.out.println(charUniBag.toString());

        System.out.println("\n\n = = = = union Test  passed = = = = = \n\n");
    }


    private static void intersectionTest()
    {
        System.out.println(" = = = = intersection Test = = = = \n\n");
//        System.out.println("~~~String~~~~\n");

        BagInterface<String> bag1 = new ResizeableArrayBag<>(5);
        bag1.add("a");
        bag1.add("b");
        bag1.add("c");
//        System.out.println(bag1.toString());

        BagInterface<String> bag2 = new ResizeableArrayBag<>(5);
        bag2.add("b");
        bag2.add("b");
        bag2.add("d");
        bag2.add("e");
//        System.out.println(bag2.toString());

        System.out.print("Call intersection method to marge bag 1 and bag 2");
        System.out.println("\nAfter intersection union method  bag 1 and bag 2 are still same");


        BagInterface<String> commonItems = bag1.intersection(bag2);
        BagInterface<String> commonItems2 = bag2.intersection(bag1);

        System.out.println("\n~~~String~~~~");
        System.out.print("bag 1 : ");
        System.out.print(bag1.toString());
        System.out.print("\n bag 2 : ");
        System.out.print(bag2.toString());
        System.out.print("\n commonItems : ");
        System.out.print(commonItems.toString());
        System.out.print("\n commonItems2 : ");
        System.out.print(commonItems2.toString());




        System.out.print("\n\n~~Duplicated String ~~");

        BagInterface<String> bag3 = new ResizeableArrayBag<>(5);
        bag3.add("a");
        bag3.add("b");
        bag3.add("b");
        bag3.add("c");
        bag3.add("e");
//        System.out.println(bag3.toString());

        BagInterface<String> bag4 = new ResizeableArrayBag<>(5);
        bag4.add("b");
        bag4.add("b");
        bag4.add("d");
        bag4.add("e");
//        System.out.println(bag4.toString());

        BagInterface<String> commonItems3 = bag3.intersection(bag4);
        BagInterface<String> commonItems4 = bag4.intersection(bag3);

        System.out.print("\n bag 3 : ");
        System.out.print(bag3.toString());
        System.out.print("\n bag 4 : ");
        System.out.print(bag4.toString());
        System.out.print("\n commonItems3 : ");
        System.out.print(commonItems3.toString());
        System.out.print("\n commonItems4 : ");
        System.out.print(commonItems4.toString());



        System.out.print("\n\n~~Integer~~~");
        BagInterface<Integer> intBag1 = new ResizeableArrayBag<>(5);
        intBag1.add(1);
        intBag1.add(2);
        intBag1.add(3);
        intBag1.add(4);

        BagInterface<Integer> intBag2 = new ResizeableArrayBag<>(5);
        intBag2.add(3);
        intBag2.add(5);
        intBag2.add(1);
        intBag2.add(2);

        BagInterface<Integer> intUniBag1 = intBag1.intersection(intBag2);
        BagInterface<Integer> intUniBag2 = intBag2.intersection(intBag1);
        System.out.print("\n intBag1 : ");
        System.out.println(intBag1.toString());
        System.out.print("intBag2: ");
        System.out.println(intBag2.toString());
        System.out.print("intUniBag1 : ");
        System.out.println(intUniBag1.toString());
        System.out.print("intUniBag2 : ");
        System.out.println(intUniBag2.toString());


        System.out.print("\n\n~~Duplicated Integers ~~");

        BagInterface<Integer> intBag3 = new ResizeableArrayBag<>(5);
        intBag3.add(1);
        intBag3.add(2);
        intBag3.add(2);
        intBag3.add(3);
        intBag3.add(4);

        BagInterface<Integer> intBag4 = new ResizeableArrayBag<>(5);
        intBag4.add(3);
        intBag4.add(5);
        intBag4.add(1);
        intBag4.add(2);
        intBag4.add(2);

        BagInterface<Integer> intUniBag3 = intBag3.intersection(intBag4);
        BagInterface<Integer> intUniBag4 = intBag4.intersection(intBag3);
        System.out.print("\n intBag3 : ");
        System.out.println(intBag3.toString());
        System.out.print("intBag4: ");
        System.out.println(intBag4.toString());
        System.out.print("intUniBag1 : ");
        System.out.println(intUniBag3.toString());
        System.out.print("intUniBag2 : ");
        System.out.println(intUniBag4.toString());


        System.out.print("\n\n~~Double~~~");
        BagInterface<Double> dobBag1 = new ResizeableArrayBag<>(5);
        dobBag1.add(1.5);
        dobBag1.add(2.7);
        dobBag1.add(3.9);
        dobBag1.add(4.8);

        BagInterface<Double> dobBag2 = new ResizeableArrayBag<>(5);
        dobBag2.add(3.6);
        dobBag2.add(2.7);
        dobBag2.add(1.8);
        dobBag2.add(2.0);

        BagInterface<Double> dobUniBag1 = dobBag1.intersection(dobBag2);
        BagInterface<Double> dobUniBag2 = dobBag2.intersection(dobBag1);
        System.out.print("\n dobBag1 : ");
        System.out.println(dobBag1.toString());
        System.out.print("dobBag2: ");
        System.out.println(dobBag2.toString());
        System.out.print("dubUniBag1 : ");
        System.out.println(dobUniBag1.toString());


        System.out.print("\n\n~~Duplicated Double~~~");
        BagInterface<Double> dobBag3 = new ResizeableArrayBag<>(5);
        dobBag3.add(1.5);
        dobBag3.add(2.7);
        dobBag3.add(2.7);
        dobBag3.add(3.9);
        dobBag3.add(4.8);

        BagInterface<Double> dobBag4 = new ResizeableArrayBag<>(5);
        dobBag4.add(3.6);
        dobBag4.add(2.7);
        dobBag4.add(2.7);
        dobBag4.add(1.8);
        dobBag4.add(2.0);

        BagInterface<Double> dobUniBag3 = dobBag3.intersection(dobBag4);
        BagInterface<Double> dobUniBag4 = dobBag4.intersection(dobBag3);
        System.out.print("\n dobBag3 : ");
        System.out.println(dobBag3.toString());
        System.out.print("dobBag4: ");
        System.out.println(dobBag4.toString());
        System.out.print("dubUniBag3 : ");
        System.out.println(dobUniBag3.toString());
        System.out.print("dubUniBag4 : ");
        System.out.println(dobUniBag4.toString());






        System.out.print("\n\n~~Character~~~");
        BagInterface<Character> charBag1 = new ResizeableArrayBag<>(5);
        charBag1.add('A');
        charBag1.add('H');
        charBag1.add('B');
        charBag1.add('K');

        BagInterface<Character> charBag2 = new ResizeableArrayBag<>(5);
        charBag2.add('O');
        charBag2.add('L');
        charBag2.add('M');
        charBag2.add('A');

        BagInterface<Character> charUniBag1 = charBag1.intersection(charBag2);
        BagInterface<Character> charUniBag2 = charBag2.intersection(charBag1);
        System.out.print("\n charBag1 : ");
        System.out.println(charBag1.toString());
        System.out.print("charBag2: ");
        System.out.println(charBag2.toString());
        System.out.print("charUniBag1 : ");
        System.out.println(charUniBag1.toString());
        System.out.print("charUniBag2 : ");
        System.out.println(charUniBag2.toString());


        System.out.print("\n\n~~Duplicated Charactera~~~");
        BagInterface<Character> charBag3 = new ResizeableArrayBag<>(5);
        charBag3.add('A');
        charBag3.add('H');
        charBag3.add('B');
        charBag3.add('A');

        BagInterface<Character> charBag4 = new ResizeableArrayBag<>(5);
        charBag4.add('A');
        charBag4.add('L');
        charBag4.add('M');
        charBag4.add('A');

        BagInterface<Character> charUniBag3 = charBag3.intersection(charBag4);
        BagInterface<Character> charUniBag4 = charBag4.intersection(charBag3);
        System.out.print("\n charBag3 : ");
        System.out.println(charBag3.toString());
        System.out.print("charBag4: ");
        System.out.println(charBag4.toString());
        System.out.print("charUniBag1 : ");
        System.out.println(charUniBag3.toString());
        System.out.print("charUniBag2 : ");
        System.out.println(charUniBag4.toString());


        System.out.print("\n\n~~~intersection Test  passed~~~~~~\n\n");
    }


    private static void differenceTest()
    {
        System.out.println(" = = = = Difference Test = = = = \n\n");

        BagInterface<String> bag1 = new ResizeableArrayBag<>(5);
        bag1.add("a");
        bag1.add("b");
        bag1.add("c");
//        System.out.println(bag1.toString());

        BagInterface<String> bag2 = new ResizeableArrayBag<>(5);
        bag2.add("b");
        bag2.add("b");
        bag2.add("d");
        bag2.add("e");
//        System.out.println(bag2.toString());

        System.out.print("Call intersection method to marge bag 1 and bag 2");
        System.out.println("\nAfter intersection union method  bag 1 and bag 2 are still same");


        BagInterface<String> commonItems = bag1.difference(bag2);
        BagInterface<String> commonItems2 = bag2.difference(bag1);

        System.out.println("\n~~~String~~~~");
        System.out.print("bag 1 : ");
        System.out.print(bag1.toString());
        System.out.print("\n bag 2 : ");
        System.out.print(bag2.toString());
        System.out.print("\n commonItems : ");
        System.out.print(commonItems.toString());
        System.out.print("\n commonItems2 : ");
        System.out.print(commonItems2.toString());




        System.out.print("\n\n~~Duplicated String ~~");

        BagInterface<String> bag3 = new ResizeableArrayBag<>(5);
        bag3.add("a");
        bag3.add("b");
        bag3.add("b");
        bag3.add("c");
        bag3.add("e");
//        System.out.println(bag3.toString());

        BagInterface<String> bag4 = new ResizeableArrayBag<>(5);
        bag4.add("b");
        bag4.add("b");
        bag4.add("d");
        bag4.add("e");
//        System.out.println(bag4.toString());

        BagInterface<String> commonItems3 = bag3.difference(bag4);
        BagInterface<String> commonItems4 = bag4.difference(bag3);

        System.out.print("\n bag 3 : ");
        System.out.print(bag3.toString());
        System.out.print("\n bag 4 : ");
        System.out.print(bag4.toString());
        System.out.print("\n commonItems3 : ");
        System.out.print(commonItems3.toString());
        System.out.print("\n commonItems4 : ");
        System.out.print(commonItems4.toString());



        System.out.print("\n\n~~Integer~~~");
        BagInterface<Integer> intBag1 = new ResizeableArrayBag<>(5);
        intBag1.add(1);
        intBag1.add(2);
        intBag1.add(3);
        intBag1.add(4);

        BagInterface<Integer> intBag2 = new ResizeableArrayBag<>(5);
        intBag2.add(3);
        intBag2.add(5);
        intBag2.add(1);
        intBag2.add(2);

        BagInterface<Integer> intUniBag1 = intBag1.difference(intBag2);
        BagInterface<Integer> intUniBag2 = intBag2.difference(intBag1);
        System.out.print("\n intBag1 : ");
        System.out.println(intBag1.toString());
        System.out.print("intBag2: ");
        System.out.println(intBag2.toString());
        System.out.print("intUniBag1 : ");
        System.out.println(intUniBag1.toString());
        System.out.print("intUniBag2 : ");
        System.out.println(intUniBag2.toString());


        System.out.print("\n\n~~Duplicated Integers ~~");

        BagInterface<Integer> intBag3 = new ResizeableArrayBag<>(5);
        intBag3.add(1);
        intBag3.add(2);
        intBag3.add(2);
        intBag3.add(3);
        intBag3.add(4);

        BagInterface<Integer> intBag4 = new ResizeableArrayBag<>(5);
        intBag4.add(3);
        intBag4.add(5);
        intBag4.add(1);
        intBag4.add(2);
        intBag4.add(2);

        BagInterface<Integer> intUniBag3 = intBag3.difference(intBag4);
        BagInterface<Integer> intUniBag4 = intBag4.difference(intBag3);
        System.out.print("\n intBag3 : ");
        System.out.println(intBag3.toString());
        System.out.print("intBag4: ");
        System.out.println(intBag4.toString());
        System.out.print("intUniBag1 : ");
        System.out.println(intUniBag3.toString());
        System.out.print("intUniBag2 : ");
        System.out.println(intUniBag4.toString());


        System.out.print("\n\n~~Double~~~");
        BagInterface<Double> dobBag1 = new ResizeableArrayBag<>(5);
        dobBag1.add(1.5);
        dobBag1.add(2.7);
        dobBag1.add(3.9);
        dobBag1.add(4.8);

        BagInterface<Double> dobBag2 = new ResizeableArrayBag<>(5);
        dobBag2.add(3.6);
        dobBag2.add(2.7);
        dobBag2.add(1.8);
        dobBag2.add(2.0);

        BagInterface<Double> dobUniBag1 = dobBag1.difference(dobBag2);
        BagInterface<Double> dobUniBag2 = dobBag2.difference(dobBag1);
        System.out.print("\n dobBag1 : ");
        System.out.println(dobBag1.toString());
        System.out.print("dobBag2: ");
        System.out.println(dobBag2.toString());
        System.out.print("dubUniBag1 : ");
        System.out.println(dobUniBag1.toString());
        System.out.print("dubUniBag2 : ");
        System.out.println(dobUniBag2.toString());


        System.out.print("\n\n~~Duplicated Double~~~");
        BagInterface<Double> dobBag3 = new ResizeableArrayBag<>(5);
        dobBag3.add(1.5);
        dobBag3.add(2.7);
        dobBag3.add(2.7);
        dobBag3.add(3.9);
        dobBag3.add(4.8);

        BagInterface<Double> dobBag4 = new ResizeableArrayBag<>(5);
        dobBag4.add(3.6);
        dobBag4.add(2.7);
        dobBag4.add(2.7);
        dobBag4.add(1.8);
        dobBag4.add(2.0);

        BagInterface<Double> dobUniBag3 = dobBag3.difference(dobBag4);
        BagInterface<Double> dobUniBag4 = dobBag4.difference(dobBag3);
        System.out.print("\n dobBag3 : ");
        System.out.println(dobBag3.toString());
        System.out.print("dobBag4: ");
        System.out.println(dobBag4.toString());
        System.out.print("dubUniBag3 : ");
        System.out.println(dobUniBag3.toString());
        System.out.print("dubUniBag4 : ");
        System.out.println(dobUniBag4.toString());






        System.out.print("\n\n~~Character~~~");
        BagInterface<Character> charBag1 = new ResizeableArrayBag<>(5);
        charBag1.add('A');
        charBag1.add('H');
        charBag1.add('B');
        charBag1.add('K');

        BagInterface<Character> charBag2 = new ResizeableArrayBag<>(5);
        charBag2.add('O');
        charBag2.add('L');
        charBag2.add('M');
        charBag2.add('A');

        BagInterface<Character> charUniBag1 = charBag1.difference(charBag2);
        BagInterface<Character> charUniBag2 = charBag2.difference(charBag1);
        System.out.print("\n charBag1 : ");
        System.out.println(charBag1.toString());
        System.out.print("charBag2: ");
        System.out.println(charBag2.toString());
        System.out.print("charUniBag1 : ");
        System.out.println(charUniBag1.toString());
        System.out.print("charUniBag2 : ");
        System.out.println(charUniBag2.toString());


        System.out.print("\n\n~~Duplicated Character~~~");
        BagInterface<Character> charBag3 = new ResizeableArrayBag<>(5);
        charBag3.add('A');
        charBag3.add('H');
        charBag3.add('B');
        charBag3.add('A');

        BagInterface<Character> charBag4 = new ResizeableArrayBag<>(5);
        charBag4.add('A');
        charBag4.add('L');
        charBag4.add('M');
        charBag4.add('A');

        BagInterface<Character> charUniBag3 = charBag3.difference(charBag4);
        BagInterface<Character> charUniBag4 = charBag4.difference(charBag3);
        System.out.print("\n charBag3 : ");
        System.out.println(charBag3.toString());
        System.out.print("charBag4: ");
        System.out.println(charBag4.toString());
        System.out.print("charUniBag1 : ");
        System.out.println(charUniBag3.toString());
        System.out.print("charUniBag2 : ");
        System.out.println(charUniBag4.toString());


        System.out.print("\n\n~~~Difference Test  passed~~~~~~\n\n");
    }


} //End of test


//Sample Run
/**
 = = = = = = = union Test= = = = = =


 ~~String~~~
 ResizeableArrayBag{_bag=[a, b, c, null, null], _numOfItems=3, _capacity=5}
 ResizeableArrayBag{_bag=[b, b, d, e, null], _numOfItems=4, _capacity=5}

 Call union method to marge bag 1 and bag 2
 After calling union method  bag 1 and bag 2 are still same

 bag 1 : ResizeableArrayBag{_bag=[a, b, c, null, null], _numOfItems=3, _capacity=5}
 bag 2 : ResizeableArrayBag{_bag=[b, b, d, e, null], _numOfItems=4, _capacity=5}
 everything : ResizeableArrayBag{_bag=[a, b, c, b, b, d, e, null, null, null, null, null, null, null], _numOfItems=7, _capacity=14}


 ~~Integer~~~
 intBag1 : ResizeableArrayBag{_bag=[1, 2, 3, 4, null], _numOfItems=4, _capacity=5}
 intBag2: ResizeableArrayBag{_bag=[3, 5, 1, 2, null], _numOfItems=4, _capacity=5}
 intUniBag : ResizeableArrayBag{_bag=[1, 2, 3, 4, 3, 5, 1, 2, null, null, null, null, null, null, null, null], _numOfItems=8, _capacity=16}


 ~~Double~~~
 dobBag1 : ResizeableArrayBag{_bag=[1.5, 2.7, 3.9, 4.8, null], _numOfItems=4, _capacity=5}
 dobBag2: ResizeableArrayBag{_bag=[3.6, 5.7, 1.8, 2.0, null], _numOfItems=4, _capacity=5}
 dubUniBag : ResizeableArrayBag{_bag=[1.5, 2.7, 3.9, 4.8, 3.6, 5.7, 1.8, 2.0, null, null, null, null, null, null, null, null], _numOfItems=8, _capacity=16}


 ~~Character~~~
 charBag1 : ResizeableArrayBag{_bag=[A, H, B, K, null], _numOfItems=4, _capacity=5}
 charBag2: ResizeableArrayBag{_bag=[O, L, M, D, null], _numOfItems=4, _capacity=5}
 charUniBag : ResizeableArrayBag{_bag=[A, H, B, K, O, L, M, D, null, null, null, null, null, null, null, null], _numOfItems=8, _capacity=16}


 = = = = union Test  passed = = = = =


 = = = = intersection Test = = = =


 Call intersection method to marge bag 1 and bag 2
 After intersection union method  bag 1 and bag 2 are still same

 ~~~String~~~~
 bag 1 : ResizeableArrayBag{_bag=[a, b, c, null, null], _numOfItems=3, _capacity=5}
 bag 2 : ResizeableArrayBag{_bag=[b, b, d, e, null], _numOfItems=4, _capacity=5}
 commonItems : ResizeableArrayBag{_bag=[b, null], _numOfItems=1, _capacity=2}
 commonItems2 : ResizeableArrayBag{_bag=[b, null], _numOfItems=1, _capacity=2}

 ~~Duplicated String ~~
 bag 3 : ResizeableArrayBag{_bag=[a, b, b, c, e], _numOfItems=5, _capacity=5}
 bag 4 : ResizeableArrayBag{_bag=[b, b, d, e, null], _numOfItems=4, _capacity=5}
 commonItems3 : ResizeableArrayBag{_bag=[b, b, e, null, null, null], _numOfItems=3, _capacity=6}
 commonItems4 : ResizeableArrayBag{_bag=[b, b, e, null, null, null], _numOfItems=3, _capacity=6}

 ~~Integer~~~
 intBag1 : ResizeableArrayBag{_bag=[1, 2, 3, 4, null], _numOfItems=4, _capacity=5}
 intBag2: ResizeableArrayBag{_bag=[3, 5, 1, 2, null], _numOfItems=4, _capacity=5}
 intUniBag1 : ResizeableArrayBag{_bag=[3, 1, 2, null, null, null], _numOfItems=3, _capacity=6}
 intUniBag2 : ResizeableArrayBag{_bag=[1, 2, 3, null, null, null], _numOfItems=3, _capacity=6}


 ~~Duplicated Integers ~~
 intBag3 : ResizeableArrayBag{_bag=[1, 2, 2, 3, 4], _numOfItems=5, _capacity=5}
 intBag4: ResizeableArrayBag{_bag=[3, 5, 1, 2, 2], _numOfItems=5, _capacity=5}
 intUniBag1 : ResizeableArrayBag{_bag=[3, 1, 2, 2, null, null, null, null], _numOfItems=4, _capacity=8}
 intUniBag2 : ResizeableArrayBag{_bag=[1, 2, 2, 3, null, null, null, null], _numOfItems=4, _capacity=8}


 ~~Double~~~
 dobBag1 : ResizeableArrayBag{_bag=[1.5, 2.7, 3.9, 4.8, null], _numOfItems=4, _capacity=5}
 dobBag2: ResizeableArrayBag{_bag=[3.6, 2.7, 1.8, 2.0, null], _numOfItems=4, _capacity=5}
 dubUniBag1 : ResizeableArrayBag{_bag=[2.7, null], _numOfItems=1, _capacity=2}


 ~~Duplicated Double~~~
 dobBag3 : ResizeableArrayBag{_bag=[1.5, 2.7, 2.7, 3.9, 4.8], _numOfItems=5, _capacity=5}
 dobBag4: ResizeableArrayBag{_bag=[3.6, 2.7, 2.7, 1.8, 2.0], _numOfItems=5, _capacity=5}
 dubUniBag3 : ResizeableArrayBag{_bag=[2.7, 2.7, null, null], _numOfItems=2, _capacity=4}
 dubUniBag4 : ResizeableArrayBag{_bag=[2.7, 2.7, null, null], _numOfItems=2, _capacity=4}


 ~~Character~~~
 charBag1 : ResizeableArrayBag{_bag=[A, H, B, K, null], _numOfItems=4, _capacity=5}
 charBag2: ResizeableArrayBag{_bag=[O, L, M, A, null], _numOfItems=4, _capacity=5}
 charUniBag1 : ResizeableArrayBag{_bag=[A, null], _numOfItems=1, _capacity=2}
 charUniBag2 : ResizeableArrayBag{_bag=[A, null], _numOfItems=1, _capacity=2}


 ~~Duplicated Charactera~~~
 charBag3 : ResizeableArrayBag{_bag=[A, H, B, A, null], _numOfItems=4, _capacity=5}
 charBag4: ResizeableArrayBag{_bag=[A, L, M, A, null], _numOfItems=4, _capacity=5}
 charUniBag1 : ResizeableArrayBag{_bag=[A, A, null, null], _numOfItems=2, _capacity=4}
 charUniBag2 : ResizeableArrayBag{_bag=[A, A, null, null], _numOfItems=2, _capacity=4}


 ~~~intersection Test  passed~~~~~~

 = = = = Difference Test = = = =


 Call intersection method to marge bag 1 and bag 2
 After intersection union method  bag 1 and bag 2 are still same

 ~~~String~~~~
 bag 1 : ResizeableArrayBag{_bag=[a, b, c, null, null], _numOfItems=3, _capacity=5}
 bag 2 : ResizeableArrayBag{_bag=[b, b, d, e, null], _numOfItems=4, _capacity=5}
 commonItems : ResizeableArrayBag{_bag=[a, c, null, null], _numOfItems=2, _capacity=4}
 commonItems2 : ResizeableArrayBag{_bag=[b, d, e, null, null, null], _numOfItems=3, _capacity=6}

 ~~Duplicated String ~~
 bag 3 : ResizeableArrayBag{_bag=[a, b, b, c, e], _numOfItems=5, _capacity=5}
 bag 4 : ResizeableArrayBag{_bag=[b, b, d, e, null], _numOfItems=4, _capacity=5}
 commonItems3 : ResizeableArrayBag{_bag=[a, c, null, null], _numOfItems=2, _capacity=4}
 commonItems4 : ResizeableArrayBag{_bag=[d, null], _numOfItems=1, _capacity=2}

 ~~Integer~~~
 intBag1 : ResizeableArrayBag{_bag=[1, 2, 3, 4, null], _numOfItems=4, _capacity=5}
 intBag2: ResizeableArrayBag{_bag=[3, 5, 1, 2, null], _numOfItems=4, _capacity=5}
 intUniBag1 : ResizeableArrayBag{_bag=[4, null], _numOfItems=1, _capacity=2}
 intUniBag2 : ResizeableArrayBag{_bag=[5, null], _numOfItems=1, _capacity=2}


 ~~Duplicated Integers ~~
 intBag3 : ResizeableArrayBag{_bag=[1, 2, 2, 3, 4], _numOfItems=5, _capacity=5}
 intBag4: ResizeableArrayBag{_bag=[3, 5, 1, 2, 2], _numOfItems=5, _capacity=5}
 intUniBag1 : ResizeableArrayBag{_bag=[4, null], _numOfItems=1, _capacity=2}
 intUniBag2 : ResizeableArrayBag{_bag=[5, null], _numOfItems=1, _capacity=2}


 ~~Double~~~
 dobBag1 : ResizeableArrayBag{_bag=[1.5, 2.7, 3.9, 4.8, null], _numOfItems=4, _capacity=5}
 dobBag2: ResizeableArrayBag{_bag=[3.6, 2.7, 1.8, 2.0, null], _numOfItems=4, _capacity=5}
 dubUniBag1 : ResizeableArrayBag{_bag=[1.5, 3.9, 4.8, null, null, null], _numOfItems=3, _capacity=6}
 dubUniBag2 : ResizeableArrayBag{_bag=[3.6, 1.8, 2.0, null, null, null], _numOfItems=3, _capacity=6}


 ~~Duplicated Double~~~
 dobBag3 : ResizeableArrayBag{_bag=[1.5, 2.7, 2.7, 3.9, 4.8], _numOfItems=5, _capacity=5}
 dobBag4: ResizeableArrayBag{_bag=[3.6, 2.7, 2.7, 1.8, 2.0], _numOfItems=5, _capacity=5}
 dubUniBag3 : ResizeableArrayBag{_bag=[1.5, 3.9, 4.8, null, null, null], _numOfItems=3, _capacity=6}
 dubUniBag4 : ResizeableArrayBag{_bag=[3.6, 1.8, 2.0, null, null, null], _numOfItems=3, _capacity=6}


 ~~Character~~~
 charBag1 : ResizeableArrayBag{_bag=[A, H, B, K, null], _numOfItems=4, _capacity=5}
 charBag2: ResizeableArrayBag{_bag=[O, L, M, A, null], _numOfItems=4, _capacity=5}
 charUniBag1 : ResizeableArrayBag{_bag=[H, B, K, null, null, null], _numOfItems=3, _capacity=6}
 charUniBag2 : ResizeableArrayBag{_bag=[O, L, M, null, null, null], _numOfItems=3, _capacity=6}


 ~~Duplicated Character~~~
 charBag3 : ResizeableArrayBag{_bag=[A, H, B, A, null], _numOfItems=4, _capacity=5}
 charBag4: ResizeableArrayBag{_bag=[A, L, M, A, null], _numOfItems=4, _capacity=5}
 charUniBag1 : ResizeableArrayBag{_bag=[H, B, null, null], _numOfItems=2, _capacity=4}
 charUniBag2 : ResizeableArrayBag{_bag=[L, M, null, null], _numOfItems=2, _capacity=4}


 ~~~Difference Test  passed~~~~~~


 */









