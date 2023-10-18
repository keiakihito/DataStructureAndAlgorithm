import java.util.Arrays;

public class ResizeableArrayBag<T> implements BagInterface<T>{
    private  T[] _bag;
    private int _numOfItems;
    private int _capacity;
    private static final int DEFAULT_CAPACITY = 5;
    private boolean _isEmpty;

    //Default CTR, provide default capacity if the capacity is not provided.
    public ResizeableArrayBag(){this(DEFAULT_CAPACITY);}

//    //Copy Constructor
//    public ResizeableArrayBag(ResizeableArrayBag bagObj){
//        this = (ResizeableArrayBag<T>) copyBag(bagObj);
//    }

    public ResizeableArrayBag(int capacity) {
        @SuppressWarnings("unchecked")
        T[] tempBag = (T[]) new Object[capacity];
        _bag = tempBag; //_bag references to Object array
        _capacity = capacity; // Set maximum capacity
        _numOfItems = 0; // Initialize
        _isEmpty = true;
    }

    @Override
    public int getCurrentSize() {return _numOfItems; }

    @Override
    public boolean isEmpty() {
        assert _numOfItems >= 0 : "Number of Items should be positive";
        return _numOfItems == 0;
    }

    /*Check the array is full or not.
    @return boolean
    * */
    public boolean isFull(){
        assert _numOfItems <= _capacity : "Number of Items never exceeds capacity";
        return _numOfItems == _capacity;
    }


    @Override
    public boolean add(T newEntry) {
        if(_isEmpty) {_isEmpty = false;}
        if(isFull())
        {
            doubleCapacity(); // Resize array capacity;
        }
        _bag[_numOfItems] = newEntry ; // Add the new item in the last index
        _numOfItems++; // Update the number of items in the bag
        return true;
    }

    //Random access to get an item by index
    public T getItem(int index){
        T arrItem = _bag[index]; //Random access to get the item in the index
        return arrItem;
    }

    @Override
    public T remove() {
        int lastIdx = _numOfItems - 1; //Avoiding bug
        T temp = _bag[lastIdx]; // Store last item to display which item was deleted
        _bag[lastIdx] = null; // Erase the last item in the bag
        _numOfItems--; // Updated the number of elements
        if(_numOfItems == 0) {_isEmpty = true;}
        return temp;
    }

    @Override
    public boolean remove(T newItem) {
        boolean result = false;
        int lstIdx = _numOfItems - 1;

        for (int i = 0; i < _numOfItems; i++){
            if(_bag[i].equals(newItem)){
                //Swap the last item and target item
                //Reduce costs moving all the elements next index after erasing the item
                _bag[i] = _bag[lstIdx];
                _bag[lstIdx] = null;
                _numOfItems--; // Update the number of items
                result = true;
                break; // Exist loop to erase only one item
            }
        }

        if(_numOfItems == 0) {_isEmpty = true;}

        return result;
    }

    @Override
    public void clear() {
        for (int i = 0; i < _numOfItems; i++){
            _bag[i] = null;
        }
        _numOfItems=0; // Initialize after clear method
        _isEmpty = true;
    }

    @Override
    public int getFrequencyOf(T item) {
        int numOfFreq = 0;
        for (int i = 0; i < _numOfItems; i++){
            if(_bag[i].equals(item)){
                numOfFreq++;
            }
        }
        return numOfFreq;
    }

    @Override
    public boolean contains(T item) {
        boolean result = false;
        //Once the loop find the item, it gets out the loop
        for(int i = 0; i < _numOfItems; i++){
            if(_bag[i].equals(item)){
                result = true;
                break;
            }
        }
        return result;
    }

    //Reallocate array when it is full of index with double capacity
    public void doubleCapacity(){
        int newCapacity = 2 * _capacity;
        _bag = Arrays.copyOf(_bag, newCapacity);
        _capacity = newCapacity;
    }

    @Override
    public T[] toArray() {
        @SuppressWarnings("unchecked")
        T[] copyArrayBag = (T[]) new Object[_numOfItems];
        for (int i = 0; i < _numOfItems; i++){
            copyArrayBag[i] = _bag[i];
        }

//        for (T s: copyArrayBag){
//            System.out.println(s);
//        }
        return copyArrayBag;
    }

    @Override
    public void printBag() {
        System.out.print("{ ");
        for(int i =0; i < _numOfItems; i++){
            System.out.print(_bag[i] + " ");
        }
        System.out.print("}\n");
    }

    @Override
    public String toString() {
        return "ResizeableArrayBag{" +
                "_bag=" + Arrays.toString(_bag) +
                ", _numOfItems=" + _numOfItems +
                ", _capacity=" + _capacity +
                ", _isEmpty=" + _isEmpty +
                '}';
    }

    @Override
    /**
     Copy a deep copy of current object to manipulate for data handling
    @return BagInterface copy Object
    */
    public BagInterface<T> copyBag()
    {
        // Declare copy variable, new key word makes deep copy
        ResizeableArrayBag<T> cpyBag = new ResizeableArrayBag<>(this.getCurrentSize()) ;

        //Traverse each item in the original object to the copy object for transfer
        for(int i = 0; i < this.getCurrentSize(); i++){
            cpyBag.add(this.getItem(i));
        }

        return cpyBag;
    }

    @Override
    public BagInterface union(BagInterface bagObj)
    {
        // Make a deep copy of original object to add parameter object later
        BagInterface<T> unonBag = new ResizeableArrayBag<>(this.getCurrentSize()) ;
        unonBag = this.copyBag();

        //The loop traverses  the parameter object
        //Add to the union bag object to all the parameter elements to merge every element
        for (int i = 0; i < bagObj.getCurrentSize(); i++){
            unonBag.add((T) bagObj.getItem(i));
        }

        // union bag should contain all the original object elements and parameter object elements
        return unonBag;
    }

    @Override
    public BagInterface intersection(BagInterface bagObj)
    {
        // Make a deep copy of original object to manipulate
        //Eliminate elements later to get common elements between  the original object and parameter object
        BagInterface<T> intSecBag = new ResizeableArrayBag<>() ; // To contain result
        BagInterface<T> cpyBag = new ResizeableArrayBag<>(this.getCurrentSize()) ;
        cpyBag = this.copyBag();
        T target =null; //Set walker

        //The loop traverses the parameter bag object
        //It reduces the element in copy object once the walker found  the same object if the parameter
        for (int i = 0; i < bagObj.getCurrentSize(); i++){
            target = (T)bagObj.getItem(i); // Walker traverse the parameter object
            if(cpyBag.contains(target)){ //The common element found
                intSecBag.add(target); // Add elements to the intersection bag which is we are looking for.
                cpyBag.remove(target); // the copy bag obj eliminates to pick up duplicated ones correctly
            }
        }

        //It should contain common elements between original bag object and parameter object
        //with duplication
        return intSecBag;

    }

    @Override
    public BagInterface difference(BagInterface bagObj)
    {
        // Make a deep copy of original object to eliminate parameter object's elements with loop later
        BagInterface<T> dffBag = new ResizeableArrayBag<>() ; // To contain result
        dffBag = this.copyBag();
        T target =null; //Set walker

        //The loop traverses the parameter bag object
        //It reduces the element in copy object  once the walker found the same object
        for (int i = 0; i < bagObj.getCurrentSize(); i++){
            target = (T)bagObj.getItem(i); // Walker traverse the parameter object
            if(dffBag.contains(target)){ //The common element found
                dffBag.remove(target); // the copy bag obj eliminates to pick up duplicated ones correctly
            }
        }

        //It should contain elements eliminated parameter bag objects.
        //With duplication
        return dffBag;
    }
}
