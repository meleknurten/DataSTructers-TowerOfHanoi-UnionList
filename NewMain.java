
import javax.swing.JOptionPane;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Melek Nurten YAVUZ
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewMain object = new NewMain();
        char src = 'M'; //kule isimleri
        char dst = 'L'; //kule isimleri
        char aux = 'K'; //kule isimleri
        object.TowerOfHanoi(3, src, dst, aux);

         LinkedListRec lst = new LinkedListRec(); // listeyi dolduruyorum
         lst.add(1);
         lst.add(2);
         lst.add(2);
         lst.add(1);
         lst.add(3);
         lst.add(1);
        System.out.println("PART2 Test (lİSTENİN İLK HALİ:)");
         System.out.println(lst); // listenin eski hali.
         lst.remove(1); // listedeki 1 leri kaldırıyorum.
         System.out.println("PART2 Test (lİSTENİN SON HALİ:)");
         System.out.println(lst); // listenin yeni hali
         
       NurtenPart3 objec = new NurtenPart3(); // part3 test icin obje olusturdum
        int count = 0;
        objec.list1.add(1); // PART3 test için ilk listeyi doldurdum.
        objec.list1.add(5);
        objec.list1.add(2);
        objec.list1.add(3);

        objec.list2.add(1); // Part3 test için ikinci listeyi doldurdum. Ama recursıve metodda list2 size 0 oluyor.
        objec.list2.add(3); //Bu yüzden part3 teki her method için list2 yi tekrar dolduruyorum.
        objec.list2.add(7);
        objec.list2.add(5);
        
        System.out.println(objec.intersectionOfLists());
        objec.list2.add(1);//Bu yüzden part3 teki her method için list2 yi tekrar dolduruyorum.
        objec.list2.add(3);
        objec.list2.add(7);
        objec.list2.add(5);
        System.out.println(objec.unionOfLists());
        objec.list2.add(1);//Bu yüzden part3 teki her method için list2 yi tekrar dolduruyorum.
        objec.list2.add(3);
        objec.list2.add(7);
        objec.list2.add(5);
        

    }

    /**
     * @param diskSize
     * @param src source tower name
     * @param dst destination tower name
     * @param aux third tower name
     *
     *
     * Bu fonksiyon tower of hanoi problemini iterative olarak yapmaktadır.
     */
    void TowerOfHanoi(int diskSize, char src, char dst, char aux) {
        int size;
        size = diskSize;
        char src1 = 0; //initial
        char dst1 = 0; //initial
        int iterCount = (1 << size) - 1; // iterasyon sayisi
        for (int i = 0; i < iterCount; i++) {
            int g, x = i + 1;
            for (g = 0; x % 2 == 0; g++) {
                x /= 2;
            }
            int d = g; // tasinmasi gereken disk.
            int source = ((((i >> d) + 1) >> 1) * (2 - (size + d) % 2)) % 3; // Diskin bulundugu kule.
            int dest = (source + (2 - (size + d) % 2)) % 3; // Diskin tasinacagi kuleyi belirliyorum.

            if (source == 0) { // Kulelere isim verdigim icin eger 0 hesaplarsa M dir dedim.
                src1 = src;
            } else if (source == 1) { // Kulelere isim verdigim icin eger 1 hesaplarsa L dir dedim.
                src1 = dst;
            } else if (source == 2) { // Kulelere isim verdigim icin eger 2 hesaplarsa K dir dedim.
                src1 = aux;
            }
            if (dest == 0) { // Ayni sekilde kulelere isim verdigim icin eger 0 hesaplarsa M dir dedim.
                dst1 = src;
            } else if (dest == 1) { // Ayni sekilde kulelere isim verdigim icin eger 1 hesaplarsa L dir dedim.
                dst1 = dst;
            } else if (dest == 2) { // Ayni sekilde kulelere isim verdigim icin eger 2 hesaplarsa K dir dedim.
                dst1 = aux;
            }
            System.out.println("Disk  " + d + " 'i Kule " + src1 + " 'den Kule " + dst1 + "'ye tasimalisiniz.");

        }
    } // REFERENCE: www.cs.cornell.edu

}
