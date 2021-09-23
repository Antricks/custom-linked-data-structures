package structures.chain;

import exceptions.ChainIndexOutOfBoundsException;

public abstract class Chain<T>
{    
    protected int length = 0;

    
    public int getLength()
    {
        return this.length;
    }

    public abstract void add(T obj);

    public abstract void add(T obj, int index) throws ChainIndexOutOfBoundsException;

    public abstract void remove(int index) throws ChainIndexOutOfBoundsException;

    public abstract T get(int index) throws ChainIndexOutOfBoundsException;

    public abstract T getLast();

    public abstract T[] toArray();
    
    public abstract String toString();


    protected ChainIndexOutOfBoundsException indexOutOfBounds(int index)
    {
        return new ChainIndexOutOfBoundsException("Index " + Integer.toString(index) + " out of bounds for length " + Integer.toString(length));
    }
}
