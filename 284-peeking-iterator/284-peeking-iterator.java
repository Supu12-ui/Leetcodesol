// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
	Queue<Integer> it;
    public PeekingIterator(Iterator<Integer> iterator) {
        it=new LinkedList<>();
        while (iterator.hasNext())
        {
            it.add(iterator.next());
        }
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        if(it.size()==0)
        {
            return -1;
        }
      int val=it.peek();
      return  val;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
       if(it.size()==0)
       {
           return -1;
       }
       Integer val=it.poll();
       return val;
    }

    @Override
    public boolean hasNext() {
       if(it.size()==0)
       {
           return false;

       }
       return true;
    }
}
