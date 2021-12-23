import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambdaa01 {
    /*
	 	1) Lambda "Functional Programming"
	 		"Functional Programming" de "Nasil yaparim?" degil "Ne yaparim?" dusunulur.
	 	2) "Structured Programming" de "Ne yaparim?" dan cok "Nasil Yaparim?" dusunulur
	 	3) "Functional Programming" hiz, code kisaligi, code okunabilirligi
	 	ve hatasiz code yazma acilarindan cok faydalidir.
	 	4) Lambda sadece collections'larda(List, Queue ve Set) ve array'lerde kullanilabilir ancak map'lerde kullan�lmaz.
        Lambda kullanmak hatas�z code kullanmakt�r.
	 */
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(12, 13, 65, 3, 7, 34, 22, 60, 42, 55));
        printElStructured(list);//method call
        System.out.println();
        System.out.println("   ***   ");
        printElfunctional(list);//lambda expression
        System.out.println();
        System.out.println("   ***   ");
        printElfunctional1(list);//method reference
        System.out.println();
        System.out.println("   ***   ");
        printCiftElStuructured(list);
        System.out.println();
        System.out.println("   ***   ");
        printCiftElFunctional1(list);
        System.out.println();
        System.out.println("   ***   ");
        printCiftElFunctional2(list);
        System.out.println();
        System.out.println("   ***   ");
        printCiftAltm�sKucuk(list);
        System.out.println();
        System.out.println("   ***   ");
        tekYirmidenbuyukPrint(list);
        System.out.println();
        System.out.println("   ***   ");
        ciftKarePrint(list);
    }

    //structured Programming ile list elemanlerinin  tamamini aralarina bosluk birakarak yazdiriniz
    public static void printElStructured(List<Integer> list) { //12 13 65 3 7 34 22 60 42 55
        for (Integer w : list) {
            System.out.print(w + " ");

        }
    }

    //Functional Programming ile list elemanlerinin  tamamini aralarina bosluk birakarak yazdiriniz
    public static void printElfunctional(List<Integer> list) {
        list.stream().forEach(t -> System.out.print(t + " "));//Lambda Expression :Lambda ifadesi
        //stream() : datalari yukaridan asagiya akis sekline getirir.
        //forEach() :datanin parametresine gore her bir eleman� isler
        //t-> : Lambda operatoru
        // Lambda Expression  yapisi cok tavsiye edilmez daha cok METHOD REFERENCE kullanilir

    }
    //Method Reference --> kendi create ettigimiz veya java'dan aldigimiz method ile
    // ClassName::MethodName--> ez- ber- leeeeee

    public static void printEl(int t) {//refere eddilecek method create edildi
        System.out.print(t + " ");
    }

    public static void printElfunctional1(List<Integer> list) {
        list.stream().forEach(Lambdaa01::printEl);//iste lambda budur...
    }

    //structured Programming ile list elemanlarinin  cift olanalrini ayni satirda aralarina bosluk birakarak yazdiriniz
    public static void printCiftElStuructured(List<Integer> list) {
        for (Integer w : list) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }

    //Functional Programming ile list elemanlarinin  cift olanalrini ayni satirda aralarina bosluk birakarak yazdiriniz
    public static void printCiftElFunctional1(List<Integer> list) {
        list.stream().filter(t -> t % 2 == 0).forEach(Lambdaa01::printEl);
        //filter()--> ais icersindeki elemanlari istenen sarta g�re filtreleme yapar
    }

    public static boolean ciftBul(int i) {//refere edilecek tohum method creATE ED�LD�

        return i % 2 == 0;

    }

    public static void printCiftElFunctional2(List<Integer> list) {
        list.stream().filter(Lambdaa01::ciftBul).forEach(Lambdaa01::printEl);//�K� TANE METHOD REFERE
        //filter()--> ais icersindeki elemanlari istenen sarta g�re filtreleme yapar
    }

    //Functional Programming ile list elemanlarinin  cift olanalrinin 60 dan kucuk olanlar�n� ayni satirda aralarina bosluk birakarak yazdiriniz
    public static void printCiftAltm�sKucuk(List<Integer> list) {
        list.stream().filter(t -> t % 2 == 0 & t < 60).forEach(Lambdaa01::printEl);
    }

    //Functional Programming ile list elemanlarinin  tek olanalrini veya 20 dan buyuk
    // olanlar�n� ayni satirda aralarina bosluk birakarak yazdiriniz
    public static void tekYirmidenbuyukPrint(List<Integer> list) {
        list.stream().filter(t ->t%2 == 1 ||t>20).forEach(Lambdaa01::printEl);

    }
    //Functional Programming ile list elemanlarinin  cift olanlarinin
    // karelerini ayni satirda aralarina bosluk birakarak yazdiriniz
    public static void ciftKarePrint(List<Integer> list){
        list.stream().filter(Lambdaa01::ciftBul).map(t->t*t).forEach(Lambdaa01::printEl);
//map()--> bir ara islemde kullanilir.elemanlar� istenen isleme gore degistirmek update etmek icin kullanilir.
    }

}