import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Collect implements Iterable<Contact>{
    private ArrayList<Contact>myList = new ArrayList<>();

    public Collect() {
    }
    public void addContact(Contact a){
        myList.add(a);
    }

    @Override
    public String toString() {
        return "Collect{" +
                "myList=" + myList +
                '}';
    }

    @Override
    public Iterator<Contact> iterator() {
        return myList.listIterator();
    }
}
