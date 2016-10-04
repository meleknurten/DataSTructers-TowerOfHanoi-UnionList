
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *This class does some process like (intersection, subset of list1, union). 
 * @author Melek Nurten YAVUZ
 */

public class NurtenPart3 {

    /**
     *
     */
    public List list1;

    /**
     *
     */
    public List list2;

    /**
     *
     */
    public List newList = new ArrayList(); // ilk iki fonksiyonda kullandım

    /**
     *
     */
    public NurtenPart3() { //constructor
        list1 = new ArrayList();
        list2 = new ArrayList();
    }
    /**This method finds intersection of two lists, list1 and list2
     * @return List newlist 
     */
    public List intersectionOfLists() {
        if (list1.isEmpty() || list2.isEmpty()) {
            return newList;
        } else {
            if (list1.contains(list2.get(0))) {
                newList.add(list2.get(0)); //yeni liste olusuyor.
            }
            list2.remove(0);
            intersectionOfLists();
        }
        return newList;
    }
    /**This method finds union of two lists, list1 and list2
     * @return List newlist 
     */
    public List unionOfLists() {
        newList = list1;
        if (list1.isEmpty() || list2.isEmpty()) {
            return newList;
        } else {
            if (newList.contains(list2.get(0))) {

            } else { //eger yeni listede o eleman yoksa ata
                newList.add(list2.get(0)); //yeni liste olusuyor.
            }
            list2.remove(0);
            unionOfLists();
        }
        return newList;
    }
    /**This method return  true depends on list2 is subset of list1
     * @return true (if list2 is subset of list1) if not false
     */
    public boolean isSubset() {
        if (list2.isEmpty()) { //recursıve ıcın remove kullandım. list2 bosalinca tum degerlerin list1 de de bulundugunu anliyorum
            return true;
        } else if (!list1.contains(list2.get(0))) { // eger list2 nin 1 elemanı bile list1 de bulunmazsa subset olmuyor.
            return false;
        } else {
            list2.remove(0); // list2 yi azaltarak yolluyorum.
            return isSubset();
        }

    }

}
