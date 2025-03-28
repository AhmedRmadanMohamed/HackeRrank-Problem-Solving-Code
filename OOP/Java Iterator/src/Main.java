import java.util.Iterator;
public class Main {
    public static void main(String[] args) {
        Solutions s = new Solutions();
        Iterator iterator = s.func(s.AddToLwist());
        while (iterator.hasNext()) {
            System.out.println((String) iterator.next());
        }

        //outher Solution
//        Iterator iterator2 = s.OutherFunc(s.AddToLwist());
//        if (iterator2.hasNext()) {
//            for (Iterator iter = iterator2; iter.hasNext(); ) {
//
//                System.out.println((String) iter.next());
//
//            }
//        }
    }

}
