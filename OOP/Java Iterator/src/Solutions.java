
import java.util.ArrayList;
import java.util.Iterator;

public class Solutions {
    public ArrayList AddToLwist() {
        ArrayList list = new ArrayList();
        list.add(42);
        list.add(10);
        list.add("###");
        list.add("Hello");
        list.add("Java");
        return list;
    }
    public Iterator func(ArrayList mylist) {
        Iterator iterator = mylist.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            if (object.equals("###")) {
                break;
            }

        }

        return iterator;
    }
    public Iterator OutherFunc(ArrayList mylist) {
        Iterator iterator = mylist.iterator();
        boolean flag = false;
        while (iterator.hasNext()) {
            Object object = iterator.next();
            if (flag) {System.out.println(object);}
            if (object.equals("###")) {flag = true;}}
        return iterator;}

}
