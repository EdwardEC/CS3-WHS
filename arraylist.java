public class arraylist {
    public static void main(String[] args) {
        AList<String> list = new AList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list.get(0));
        System.out.println(list.size());
        System.out.println(list.toString());
        list.set(0, "hello");
        list.remove(3);
        System.out.println(list.toString());
        list.clear();
        System.out.println(list.toString());
    }
}

class AList<E> {

    private E[] arr;
    private int n = 0;

    @SuppressWarnings("unchecked")
    public AList() {
        arr = (E[]) new Object[100];
    }

    public void add(E x) {
        arr[n] = x;
        n++;
    }

    public E get(int n) {
        if(n > this.n)
            throw new ArrayIndexOutOfBoundsException();
        return arr[n];
    }

    public void set(int n, E x) {
        if (n > this.n - 1)
            throw new IndexOutOfBoundsException("Index " + n + " out of bounds for length " + this.n);
        arr[n] = x;
    }

    public void remove(int n) {
        if (n > this.n - 1)
            throw new IndexOutOfBoundsException("Index " + n + " out of bounds for length " + this.n);
        while (arr[n] != null) {
            arr[n] = arr[n + 1];
            n++;
        }
        this.n--;
    }

    public void clear() {
        for(int i = 0; i < n; i++)
            arr[i] = null;
        n = 0;
    }

    public int size() {
        return n;
    }

    public String toString() {
        String str = "[";
        for(int i = 0; i < n - 1; i++)
            str += arr[i] + ", ";
        if (n != 0)
            str += arr[n - 1];
        return str + "]";
    }
}
