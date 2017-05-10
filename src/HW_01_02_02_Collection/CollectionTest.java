package HW_01_02_02_Collection;

import java.util.ArrayList;

/**
 * Created by Dmytro on 09.05.2017.
 */
public class CollectionTest {
    public static void main(String[] args) {

        CollectionHolder testCollection = new CollectionHolder();
        testCollection.massive = new ArrayList<>();

        testCollection.addElement();
        testCollection.getElement(0);

    }
}
