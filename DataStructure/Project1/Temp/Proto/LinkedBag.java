public class LinkedBag<T> implements BagInterface<T>{
    private Node _head;
    private  int _numOfNodes;


    public LinkedBag() {
        _head = null;
        _numOfNodes = 0;
    }

    @Override
    public int getCurrentSize()
    {
        Node wkRfnc = _head; //Set walker
        int counter = 0;
        while(wkRfnc != null){
            counter++;
            wkRfnc = wkRfnc.get_next();
        }
        return counter; // number of nodes in the linked list
    }

    @Override
    public boolean isEmpty() { return _numOfNodes == 0; }

    @Override
    public boolean add(T newEntry)
    {
        Node tempHead = _head; // Backup the _head address avoid losing all the nodes
        Node newNode = new Node (newEntry);
        newNode.set_next(tempHead); //Link the new head to the old first  node
        _head = newNode; // _head points to the new first node
        _numOfNodes++;
        return true;
    }

    @Override
    //Never use this method for the linkedLIst
    public T getItem(int index){
        T temp = null;
        return temp;
    }
    @Override
    public T remove()
    {
        T dltItem = null;
        if(_head != null){
            Node wkPtr = _head; // Set walker
            dltItem = _head._data; // Store the deleted item to return
            wkPtr = wkPtr.get_next(); // walker references to the next node
            _head = wkPtr; // _head updates the walkder address, the second node becomes the first node.
            _numOfNodes--; //update the number of items
        }
        return dltItem;
    }

    @Override
    public boolean remove(T target)
    {
        //Text version
        boolean result = false;
        Node tgtNode = search(target); // Check item whether te item exists or not.

        //Replace first node item in the target node, which eliminates the target data
        //Remove first node because the Item order doesn't matter
        if (tgtNode != null)
        {
            tgtNode.set_data(_head.get_data()); // Eliminate the target with replacing
            this.remove(); // remove the first node after replacing

//            Node dltNode = _head;
//            _head = _head.get_next();
//            dltNode.set_next(null); // The deleted note separated from the inked list before it is deleted
//
            result = true;
        }

        return result; // Result whether elimination has been done or not.
    }

    @Override
    public void clear()
    {
        _head = null; // Unlink all the nodes with head
        _numOfNodes = 0;
    }

    @Override
    public int getFrequencyOf(T item)
    {
        Node wkPtr = _head; //Set walker
        int counter = 0;

        //The loop traverse linked list and increment count,
        //when it finds the target data in the linked list
        while(wkPtr != null){
            if(wkPtr.get_data().equals(item)){
                counter++;
            }
            wkPtr = wkPtr.get_next();
        }

        return counter; // number of nodes in the linked list
    }

    @Override
    public boolean contains(T item)
    {
        boolean result = false;
        Node wkPtr = _head; //Set walker
        int counter = 0;

        //The loop traverse linked list and increment count,
        //when it finds the target data in the linked list
        while(wkPtr != null){
            if(wkPtr.get_data().equals(item)){
                return true; // Target is found in the linked list and return true
            }
            wkPtr = wkPtr.get_next();
        }

        return result; // whether the item was found or not
    }

    public Node search (T target)
    {
        boolean found = false;
        Node wkPtr = _head; // Set up walker

        //The walker traverse in the linkedBag
        //Once it founds the target item, the walker tells the target item address.
        while(!found && (wkPtr != null)){
            if(target.equals(wkPtr.get_data())){
                found = true;
            }else{
                wkPtr = wkPtr.get_next(); // Shift to the next node.
            }
        }

        return wkPtr; //The walker tells the target item address
    }
    @Override
    public T[] toArray()
    {
        Node wkPtr = _head; // Set walker
        @SuppressWarnings("unchecked")
        T[] copyArrayBag = (T[]) new Object[_numOfNodes]; // Contain the data to this array

        //Walker traverse each nodes in the linked list
        //Store data to the created array
        for (int i = 0; i < _numOfNodes; i++){
            copyArrayBag[i] = wkPtr.get_data();
            wkPtr = wkPtr.get_next();
        }

//        for (T s: copyArrayBag){
//            System.out.println(s);
//        }

        return copyArrayBag;
    }

    @Override
    public void printBag()
    {
        Node wkRfnc = _head; // Set walker reference to traverse all nodes.
        while(wkRfnc != null){
            System.out.print("[");
            System.out.print(wkRfnc.get_data());
            System.out.print("]->");
            wkRfnc = wkRfnc.get_next();
        }
        System.out.print("[null]");
    }

    @Override
    public String toString(){
        System.out.print("\ntoString: {");
        printBag();
        return ", _numOfNodes= " + _numOfNodes + '}';
    }

    //Insert the new item to the last node
    public void addLast(T newItem)
    {
        Node wkPtr = _head; //Set up walker

        //This case is the node is inserted as a first node
        //Just call add method and exit the method
        if(wkPtr == null){
            this.add(newItem);
            return;
        }

        //Create new node with a parameter, insert after the last node
        Node newLastNode = new Node(newItem); //New last node inserted
        wkPtr = this.getLast(); // The walker points to the last node address
        wkPtr.set_next(newLastNode); // The new last node connects the linked list
        _numOfNodes++;

    }

    //Return the fist node address
    public Node getFIrst() { return _head;}

    //Get the last address of node
    public Node getLast()
    {
        if(_head == null) {return null;} //This is the case the linked bag doesn't have any node
        Node wkPtr = _head;

        //Walker traverse until it hits the last node
        while(wkPtr.get_next() != null){
            wkPtr= wkPtr.get_next();
        }

        return wkPtr; // Return the last node address
    }

    @Override
    public BagInterface copyBag()
    {
        // Declare copy variable, new key word makes deep copy
        LinkedBag<T> cpyBag = new LinkedBag<>() ;
        Node wkPtr = _head; // walker gets the node item

        //Traverse each item in the original object
        // Get item and  transfer to the copy array.
        while(wkPtr != null){
            cpyBag.addLast(wkPtr.get_data());
            wkPtr = wkPtr.get_next();
        }

        //Deep copy of original linked bag object
        return cpyBag;

    }



    @Override
    public BagInterface union(BagInterface bagObj)
    {
        // Make a deep copy of the parameter  object to add original Node data later
        BagInterface<T> unonBag = new LinkedBag<>() ;
        unonBag = bagObj.copyBag();
        Node wkPtr = _head; // Set walker to travers original linked bag object

        //The loop traverses the original object
        //Add each element  in the original object to the union bag object until walker hits the last node
        while(wkPtr!= null){
            unonBag.add(wkPtr.get_data());
            wkPtr = wkPtr.get_next();
        }

        // union bag should contain all the original object elements and parameter object elements
        return unonBag;
    }

    @Override
    public BagInterface intersection(BagInterface bagObj)
    {
        // Make a deep copy of original object to manipulate
        //Eliminate elements later to get common elements between  the original object and parameter object
        BagInterface<T> intSecBag = new LinkedBag<>() ; // To contain result
        BagInterface<T> cpyBag = new LinkedBag<>();
        cpyBag = bagObj.copyBag();
        Node wkPtr = _head; //Set walker

//        //The loop traverses the parameter bag object
//        //It reduces the element in copy object once the walker found  the same object if the parameter
//        for (int i = 0; i < bagObj.getCurrentSize(); i++){
//            target = (bagObj.search; // Walker traverse the parameter object
//            if(cpyBag.contains(target)){ //The common element found
//                intSecBag.add(target); // Add elements to the intersection bag which is we are looking for.
//                cpyBag.remove(target); // the copy bag obj eliminates to pick up duplicated ones correctly
//            }
//        }

        T target = null;
        while(wkPtr != null){
            target = wkPtr.get_data();
            if (cpyBag.contains(target)){
                intSecBag.add(target);
                cpyBag.remove(target);
            }
            wkPtr = wkPtr.get_next();
        }

        //It should contain common elements between original bag object and parameter object
        //with duplication
        return intSecBag;
    }

    @Override
    public BagInterface difference(BagInterface bagObj)
    {
        // Make a deep copy of original object to eliminate parameter object's elements with loop later
        BagInterface<T> dffBag = new LinkedBag<>() ; // To contain result
        dffBag = this.copyBag();
        Object[] arrayBagCopy = bagObj.toArray();
        T target = null;

        //The loop traverses the parameter bag object
        //It reduces the element in copy object  once the walker found the same object
        for (int i = 0; i < bagObj.getCurrentSize(); i++){
            target = (T) arrayBagCopy[i]; // Walker traverse the parameter object
            if(dffBag.contains(target)){ //The common element found
                dffBag.remove(target); // the copy bag obj eliminates to pick up duplicated ones correctly
            }
        }

        //It should contain elements eliminated parameter bag objects.
        //With duplication
        return dffBag;
    }



    //Inner class
    private class Node
    {
        private T _data;
        private  Node _next;

        //Default CTR
        Node()
        {
            _data = null;
            _next = null;
        }

        Node(T _dataItem)
        {
            _data = _dataItem;
            _next = null;
        }

        //Getter and Setter
        public T get_data() { return _data; }
        public void set_data(T item) { this._data = item;}
        public Node get_next() { return _next; }
        public void set_next(Node nextNode) {_next = nextNode; }

        @Override
        public String toString() {
            return "Node{" + "_data=" + _data + ", _next=" + _next + '}';
        }
    } // End of Node class



} // End of LinkedBag class
