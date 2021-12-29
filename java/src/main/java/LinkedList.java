import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

class Node<T> {
    public Node<T> previous;
    public T data;
}

public class LinkedList<T> implements List<T> {

    private Node<T> last;
    private int size;

    public LinkedList(){
        last = null;
    }

    private Node<T> getNode(int index){
        Node<T> iter = last;
        for(int i = size - 1; i > index; i--)
            iter = iter.previous;
        return iter;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        List.super.forEach(action);
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] t1s) {
        return null;
    }

    @Override
    public <T1> T1[] toArray(IntFunction<T1[]> generator) {
        return List.super.toArray(generator);
    }

    @Override
    public boolean add(T t) {
        if(null == t)
            return false;

        Node<T> node = new Node<>();
        node.data = t;
        node.previous = last;
        last = node;

        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if(null == o)
            return false;
        if(isEmpty())
            return false;

        Node<T> iter = last;
        Node<T> prevIter = null;
        while(iter != null){
            if(iter.data.equals(o)){
                iter.previous = prevIter;
                size--;
                return true;
            }
            prevIter = iter;
            iter = iter.previous;
        }

        return false;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> collection) {
        return false;
    }

    @Override
    public boolean addAll(int i, Collection<? extends T> collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean removeIf(Predicate<? super T> filter) {
        return List.super.removeIf(filter);
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override
    public void replaceAll(UnaryOperator<T> operator) {
        List.super.replaceAll(operator);
    }

    @Override
    public void sort(Comparator<? super T> c) {
        List.super.sort(c);
    }

    @Override
    public void clear() {
        last = null;
        size = 0;
    }

    @Override
    public T get(int index) {
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException();

        return getNode(index).data;
    }

    @Override
    public T set(int index, T data) {
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        if(data == null)
            throw new NullPointerException();

        Node<T> node = getNode(index);

        T oldData = node.data;
        node.data = data;
        return oldData;
    }

    @Override
    public void add(int index, T data) {
        if(index < 0 || index > size)
            throw new IndexOutOfBoundsException();
        if(data == null)
            throw new NullPointerException();

        Node<T> node = new Node<>();
        node.data = data;
        if(isEmpty()){
            last = node;
        }
        else{
            Node<T> forward = getNode(index + 1);
            Node<T> location = forward.previous;
            node.previous = location == null ? null : location.previous;
            forward.previous = node;
        }
        size++;
    }

    @Override
    public T remove(int i) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int i) {
        return null;
    }

    @Override
    public List<T> subList(int i, int i1) {
        return null;
    }

    @Override
    public Spliterator<T> spliterator() {
        return List.super.spliterator();
    }

    @Override
    public Stream<T> stream() {
        return List.super.stream();
    }

    @Override
    public Stream<T> parallelStream() {
        return List.super.parallelStream();
    }
}
