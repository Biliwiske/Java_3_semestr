package Practica_8;

import Practica_8.IWaitList;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList <E> implements IWaitList<E> {
    protected ConcurrentLinkedQueue<E> components;

    WaitList() {
        components = new ConcurrentLinkedQueue<>();
    };
    WaitList(Collection<E> collection){
        components = new ConcurrentLinkedQueue<>(collection);
    };
    @Override
    public String toString() {
        return "WaitList{" +
                "components=" + components +
                '}';
    }
    @Override
    public void add(E element) {

    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<E> collection) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
