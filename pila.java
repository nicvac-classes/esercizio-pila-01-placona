import java.util.NoSuchElementException;

public class Pila<T>{
    private Nodo<T> top;

    public Pila(){
        this.top = null;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void push(T dato){
        Nodo<T> nuovoNodo = new Nodo<>(dato);

        nuovoNodo.next = top;
        top = nuovoNodo;
    }

    public T pop(){
        if(top == null){
            throw new NoSuchElementException("Pila vuota!");
        }

        T dato = top.dato;
        top = top.next;

        return dato;
    }

    public T peek(){
        if(top == null){
            throw new NoSuchElementException("Pila vuota!");
        }

        return top.dato;
    }

    public int size(){
        Nodo<T> attuale = top;

        int count = 0;
        while(attuale != null){
            attuale = attuale.next;
            ++count;
        }

        return count;
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();

        Nodo<T> attuale = top;

        str.append("top");
        while (attuale != null) {
            str.append("--->");
            str.append(attuale.dato);
            
            attuale = attuale.next;
        }

        str.append("NULL");

        return str.toString();
    }
}