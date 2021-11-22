package Lab3.Iterator;

public class ArrayCustomIterator implements Iterator{
    private int arr[];
    private int position;

    public ArrayCustomIterator(int[] arr) {
        this.arr = arr;
    }

    @Override
    public boolean hasNext() {
        return (position<arr.length);
    }

    @Override
    public int next() {
        return arr[position++];
    }
}
