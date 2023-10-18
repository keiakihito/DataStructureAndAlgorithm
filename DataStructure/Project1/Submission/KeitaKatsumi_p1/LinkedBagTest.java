class LinkedBagTest {

    public static void main(String[] args) {
        
        unionTest();
        intersectionTest();
        differenceTest();

    }

    private static  void unionTest()
    { System.out.println("= = = = = = = union Test= = = = = = \n");



        BagInterface<String> bag1 = new LinkedBag<>();
        bag1.add("a");
        bag1.add("b");
        bag1.add("c");

        BagInterface<String> bag2 = new LinkedBag<>();
        bag2.add("b");
        bag2.add("b");
        bag2.add("d");
        bag2.add("e");


        System.out.print("\n Call union method to marge bag 1 and bag 2");
        System.out.println("\n After calling union method  bag 1 and bag 2 are still same");

        System.out.print("\n~~String~~~");
        BagInterface<String> everything = bag1.union(bag2);

        System.out.print("\n bag 1 : ");
        System.out.println(bag1.toString());
        System.out.print("bag 2 : ");
        System.out.println(bag2.toString());
        System.out.print("everything : ");
        System.out.println(everything.toString());



        System.out.print("\n\n~~Integer~~~");
        BagInterface<Integer> intBag1 = new LinkedBag<>();
        intBag1.add(1);
        intBag1.add(2);
        intBag1.add(3);
        intBag1.add(4);

        BagInterface<Integer> intBag2 = new LinkedBag<>();
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
        BagInterface<Double> dobBag1 = new LinkedBag<>();
        dobBag1.add(1.5);
        dobBag1.add(2.7);
        dobBag1.add(3.9);
        dobBag1.add(4.8);

        BagInterface<Double> dobBag2 = new LinkedBag<>();
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
        BagInterface<Character> charBag1 = new LinkedBag<>();
        charBag1.add('A');
        charBag1.add('H');
        charBag1.add('B');
        charBag1.add('K');

        BagInterface<Character> charBag2 = new LinkedBag<>();
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


    private static  void intersectionTest()
    {        System.out.println(" = = = = intersection Test = = = = \n\n");
//        System.out.println("~~~String~~~~\n");

        BagInterface<String> bag1 = new LinkedBag<>();
        bag1.add("a");
        bag1.add("b");
        bag1.add("c");
//        System.out.println(bag1.toString());

        BagInterface<String> bag2 = new LinkedBag<>();
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

        BagInterface<String> bag3 = new LinkedBag<>();
        bag3.add("a");
        bag3.add("b");
        bag3.add("b");
        bag3.add("c");
        bag3.add("e");
//        System.out.println(bag3.toString());

        BagInterface<String> bag4 = new LinkedBag<>();
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
        BagInterface<Integer> intBag1 = new LinkedBag<>();
        intBag1.add(8);
        intBag1.add(2);
        intBag1.add(3);
        intBag1.add(1);

        BagInterface<Integer> intBag2 = new LinkedBag<>();
        intBag2.add(3);
        intBag2.add(5);
        intBag2.add(7);
        intBag2.add(1);

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

        BagInterface<Integer> intBag3 = new LinkedBag<>();
        intBag3.add(1);
        intBag3.add(2);
        intBag3.add(6);
        intBag3.add(3);
        intBag3.add(2);

        BagInterface<Integer> intBag4 = new LinkedBag<>();
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
        System.out.print("intUniBag3 : ");
        System.out.println(intUniBag3.toString());
        System.out.print("intUniBag4 : ");
        System.out.println(intUniBag4.toString());


        System.out.print("\n\n~~Double~~~");
        BagInterface<Double> dobBag1 = new LinkedBag<>();
        dobBag1.add(1.5);
        dobBag1.add(2.7);
        dobBag1.add(3.9);
        dobBag1.add(4.8);

        BagInterface<Double> dobBag2 = new LinkedBag<>();
        dobBag2.add(3.6);
        dobBag2.add(2.6);
        dobBag2.add(1.8);
        dobBag2.add(1.5);

        BagInterface<Double> dobUniBag1 = dobBag1.intersection(dobBag2);
        BagInterface<Double> dobUniBag2 = dobBag2.intersection(dobBag1);
        System.out.print("\n dobBag1 : ");
        System.out.println(dobBag1.toString());
        System.out.print("dobBag2: ");
        System.out.println(dobBag2.toString());
        System.out.print("dubUniBag1 : ");
        System.out.println(dobUniBag1.toString());


        System.out.print("\n\n~~Duplicated Double~~~");
        BagInterface<Double> dobBag3 = new LinkedBag<>();
        dobBag3.add(1.5);
        dobBag3.add(2.7);
        dobBag3.add(2.7);
        dobBag3.add(3.9);
        dobBag3.add(4.8);

        BagInterface<Double> dobBag4 = new LinkedBag<>();
        dobBag4.add(3.6);
        dobBag4.add(2.7);
        dobBag4.add(2.9);
        dobBag4.add(1.8);
        dobBag4.add(2.7);

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
        BagInterface<Character> charBag1 = new LinkedBag<>();
        charBag1.add('A');
        charBag1.add('H');
        charBag1.add('B');
        charBag1.add('K');

        BagInterface<Character> charBag2 = new LinkedBag<>();
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
        BagInterface<Character> charBag3 = new LinkedBag<>();
        charBag3.add('A');
        charBag3.add('H');
        charBag3.add('B');
        charBag3.add('A');

        BagInterface<Character> charBag4 = new LinkedBag<>();
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



    private static   void differenceTest()
    {
        System.out.println(" = = = = difference Test = = = = \n\n");
//        System.out.println("~~~String~~~~\n");

        BagInterface<String> bag1 = new LinkedBag<>();
        bag1.add("a");
        bag1.add("b");
        bag1.add("c");
//        System.out.println(bag1.toString());

        BagInterface<String> bag2 = new LinkedBag<>();
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

        BagInterface<String> bag3 = new LinkedBag<>();
        bag3.add("a");
        bag3.add("b");
        bag3.add("b");
        bag3.add("c");
        bag3.add("e");
//        System.out.println(bag3.toString());

        BagInterface<String> bag4 = new LinkedBag<>();
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
        BagInterface<Integer> intBag1 = new LinkedBag<>();
        intBag1.add(8);
        intBag1.add(2);
        intBag1.add(3);
        intBag1.add(1);

        BagInterface<Integer> intBag2 = new LinkedBag<>();
        intBag2.add(3);
        intBag2.add(5);
        intBag2.add(7);
        intBag2.add(1);

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

        BagInterface<Integer> intBag3 = new LinkedBag<>();
        intBag3.add(1);
        intBag3.add(2);
        intBag3.add(6);
        intBag3.add(3);
        intBag3.add(2);

        BagInterface<Integer> intBag4 = new LinkedBag<>();
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
        System.out.print("intUniBag3 : ");
        System.out.println(intUniBag3.toString());
        System.out.print("intUniBag4 : ");
        System.out.println(intUniBag4.toString());


        System.out.print("\n\n~~Double~~~");
        BagInterface<Double> dobBag1 = new LinkedBag<>();
        dobBag1.add(1.5);
        dobBag1.add(2.7);
        dobBag1.add(3.9);
        dobBag1.add(4.8);

        BagInterface<Double> dobBag2 = new LinkedBag<>();
        dobBag2.add(3.6);
        dobBag2.add(2.6);
        dobBag2.add(1.8);
        dobBag2.add(1.5);

        BagInterface<Double> dobUniBag1 = dobBag1.difference(dobBag2);
        BagInterface<Double> dobUniBag2 = dobBag2.difference(dobBag1);
        System.out.print("\n dobBag1 : ");
        System.out.println(dobBag1.toString());
        System.out.print("dobBag2: ");
        System.out.println(dobBag2.toString());
        System.out.print("dubUniBag1 : ");
        System.out.println(dobUniBag1.toString());


        System.out.print("\n\n~~Duplicated Double~~~");
        BagInterface<Double> dobBag3 = new LinkedBag<>();
        dobBag3.add(1.5);
        dobBag3.add(2.7);
        dobBag3.add(2.7);
        dobBag3.add(3.9);
        dobBag3.add(4.8);

        BagInterface<Double> dobBag4 = new LinkedBag<>();
        dobBag4.add(3.6);
        dobBag4.add(2.7);
        dobBag4.add(2.9);
        dobBag4.add(1.8);
        dobBag4.add(2.7);

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
        BagInterface<Character> charBag1 = new LinkedBag<>();
        charBag1.add('A');
        charBag1.add('H');
        charBag1.add('B');
        charBag1.add('K');

        BagInterface<Character> charBag2 = new LinkedBag<>();
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


        System.out.print("\n\n~~Duplicated Charactera~~~");
        BagInterface<Character> charBag3 = new LinkedBag<>();
        charBag3.add('A');
        charBag3.add('H');
        charBag3.add('B');
        charBag3.add('A');

        BagInterface<Character> charBag4 = new LinkedBag<>();
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


        System.out.print("\n\n~~~difference Test  passed~~~~~~\n\n");

    }


} // End of test







//Sample Run
/**
 = = = = = = = union Test= = = = = =


 Call union method to marge bag 1 and bag 2
 After calling union method  bag 1 and bag 2 are still same

 ~~String~~~
 bag 1 : {[c]->[b]->[a]->[^], _numOfNodes= 3}
 bag 2 : {[e]->[d]->[b]->[b]->[^], _numOfNodes= 4}
 everything : {[e]->[d]->[b]->[b]->[c]->[b]->[a]->[^], _numOfNodes= 7}


 ~~Integer~~~
 intBag1 : {[4]->[3]->[2]->[1]->[^], _numOfNodes= 4}
 intBag2: {[2]->[1]->[5]->[3]->[^], _numOfNodes= 4}
 intUniBag : {[2]->[1]->[5]->[3]->[4]->[3]->[2]->[1]->[^], _numOfNodes= 8}


 ~~Double~~~
 dobBag1 : {[4.8]->[3.9]->[2.7]->[1.5]->[^], _numOfNodes= 4}
 dobBag2: {[2.0]->[1.8]->[5.7]->[3.6]->[^], _numOfNodes= 4}
 dubUniBag : {[2.0]->[1.8]->[5.7]->[3.6]->[4.8]->[3.9]->[2.7]->[1.5]->[^], _numOfNodes= 8}


 ~~Character~~~
 charBag1 : {[K]->[B]->[H]->[A]->[^], _numOfNodes= 4}
 charBag2: {[D]->[M]->[L]->[O]->[^], _numOfNodes= 4}
 charUniBag : {[D]->[M]->[L]->[O]->[K]->[B]->[H]->[A]->[^], _numOfNodes= 8}


 = = = = union Test  passed = = = = =


 = = = = intersection Test = = = =


 Call intersection method to marge bag 1 and bag 2
 After intersection union method  bag 1 and bag 2 are still same

 ~~~String~~~~
 bag 1 : {[c]->[b]->[a]->[^], _numOfNodes= 3}
 bag 2 : {[e]->[d]->[b]->[b]->[^], _numOfNodes= 4}
 commonItems : {[b]->[^], _numOfNodes= 1}
 commonItems2 : {[b]->[^], _numOfNodes= 1}

 ~~Duplicated String ~~
 bag 3 : {[e]->[c]->[b]->[b]->[a]->[^], _numOfNodes= 5}
 bag 4 : {[e]->[d]->[b]->[b]->[^], _numOfNodes= 4}
 commonItems3 : {[e]->[b]->[b]->[^], _numOfNodes= 3}
 commonItems4 : {[e]->[b]->[b]->[^], _numOfNodes= 3}

 ~~Integer~~~
 intBag1 : {[1]->[3]->[2]->[8]->[^], _numOfNodes= 4}
 intBag2: {[1]->[7]->[5]->[3]->[^], _numOfNodes= 4}
 intUniBag1 : {[1]->[3]->[^], _numOfNodes= 2}
 intUniBag2 : {[1]->[3]->[^], _numOfNodes= 2}


 ~~Duplicated Integers ~~
 intBag3 : {[2]->[3]->[6]->[2]->[1]->[^], _numOfNodes= 5}
 intBag4: {[2]->[2]->[1]->[5]->[3]->[^], _numOfNodes= 5}
 intUniBag3 : {[2]->[3]->[2]->[1]->[^], _numOfNodes= 4}
 intUniBag4 : {[2]->[2]->[1]->[3]->[^], _numOfNodes= 4}


 ~~Double~~~
 dobBag1 : {[4.8]->[3.9]->[2.7]->[1.5]->[^], _numOfNodes= 4}
 dobBag2: {[1.5]->[1.8]->[2.6]->[3.6]->[^], _numOfNodes= 4}
 dubUniBag1 : {[1.5]->[^], _numOfNodes= 1}


 ~~Duplicated Double~~~
 dobBag3 : {[4.8]->[3.9]->[2.7]->[2.7]->[1.5]->[^], _numOfNodes= 5}
 dobBag4: {[2.7]->[1.8]->[2.9]->[2.7]->[3.6]->[^], _numOfNodes= 5}
 dubUniBag3 : {[2.7]->[2.7]->[^], _numOfNodes= 2}
 dubUniBag4 : {[2.7]->[2.7]->[^], _numOfNodes= 2}


 ~~Character~~~
 charBag1 : {[K]->[B]->[H]->[A]->[^], _numOfNodes= 4}
 charBag2: {[A]->[M]->[L]->[O]->[^], _numOfNodes= 4}
 charUniBag1 : {[A]->[^], _numOfNodes= 1}
 charUniBag2 : {[A]->[^], _numOfNodes= 1}


 ~~Duplicated Charactera~~~
 charBag3 : {[A]->[B]->[H]->[A]->[^], _numOfNodes= 4}
 charBag4: {[A]->[M]->[L]->[A]->[^], _numOfNodes= 4}
 charUniBag1 : {[A]->[A]->[^], _numOfNodes= 2}
 charUniBag2 : {[A]->[A]->[^], _numOfNodes= 2}


 ~~~intersection Test  passed~~~~~~

 = = = = difference Test = = = =


 Call intersection method to marge bag 1 and bag 2
 After intersection union method  bag 1 and bag 2 are still same

 ~~~String~~~~
 bag 1 : {[c]->[b]->[a]->[^], _numOfNodes= 3}
 bag 2 : {[e]->[d]->[b]->[b]->[^], _numOfNodes= 4}
 commonItems : {[c]->[a]->[^], _numOfNodes= 2}
 commonItems2 : {[e]->[d]->[b]->[^], _numOfNodes= 3}

 ~~Duplicated String ~~
 bag 3 : {[e]->[c]->[b]->[b]->[a]->[^], _numOfNodes= 5}
 bag 4 : {[e]->[d]->[b]->[b]->[^], _numOfNodes= 4}
 commonItems3 : {[c]->[a]->[^], _numOfNodes= 2}
 commonItems4 : {[d]->[^], _numOfNodes= 1}

 ~~Integer~~~
 intBag1 : {[1]->[3]->[2]->[8]->[^], _numOfNodes= 4}
 intBag2: {[1]->[7]->[5]->[3]->[^], _numOfNodes= 4}
 intUniBag1 : {[2]->[8]->[^], _numOfNodes= 2}
 intUniBag2 : {[7]->[5]->[^], _numOfNodes= 2}


 ~~Duplicated Integers ~~
 intBag3 : {[2]->[3]->[6]->[2]->[1]->[^], _numOfNodes= 5}
 intBag4: {[2]->[2]->[1]->[5]->[3]->[^], _numOfNodes= 5}
 intUniBag3 : {[6]->[^], _numOfNodes= 1}
 intUniBag4 : {[5]->[^], _numOfNodes= 1}


 ~~Double~~~
 dobBag1 : {[4.8]->[3.9]->[2.7]->[1.5]->[^], _numOfNodes= 4}
 dobBag2: {[1.5]->[1.8]->[2.6]->[3.6]->[^], _numOfNodes= 4}
 dubUniBag1 : {[4.8]->[3.9]->[2.7]->[^], _numOfNodes= 3}


 ~~Duplicated Double~~~
 dobBag3 : {[4.8]->[3.9]->[2.7]->[2.7]->[1.5]->[^], _numOfNodes= 5}
 dobBag4: {[2.7]->[1.8]->[2.9]->[2.7]->[3.6]->[^], _numOfNodes= 5}
 dubUniBag3 : {[4.8]->[3.9]->[1.5]->[^], _numOfNodes= 3}
 dubUniBag4 : {[1.8]->[2.9]->[3.6]->[^], _numOfNodes= 3}


 ~~Character~~~
 charBag1 : {[K]->[B]->[H]->[A]->[^], _numOfNodes= 4}
 charBag2: {[A]->[M]->[L]->[O]->[^], _numOfNodes= 4}
 charUniBag1 : {[K]->[B]->[H]->[^], _numOfNodes= 3}
 charUniBag2 : {[M]->[L]->[O]->[^], _numOfNodes= 3}


 ~~Duplicated Charactera~~~
 charBag3 : {[A]->[B]->[H]->[A]->[^], _numOfNodes= 4}
 charBag4: {[A]->[M]->[L]->[A]->[^], _numOfNodes= 4}
 charUniBag1 : {[B]->[H]->[^], _numOfNodes= 2}
 charUniBag2 : {[M]->[L]->[^], _numOfNodes= 2}


 ~~~difference Test  passed~~~~~~


 Process finished with exit code 0



*/
