package br.com.projuris;

/**
 * Created by phelipe.pereira on 22/08/2019.
 */
public class Main {

    public static void main(String[] args) {
        MyFindArray find = new MyFindArray();
        MyFindChar letra = new MyFindChar();
        int tam1[] = {4,9,3,-7,8,-3,-7,1};
        int tam2[] = {3,7};
        int tam3[] = {3,1,5};
        int tam4[] = {1};
        int tam5[] = {7,8,9};
        int tam6[] = {8,9,10};
        String word = "888890000222"; //pppptttyyi || palabra || shows || zzzzbbsooorrr || aaaaaaaabb || aaaaaacaaaabb
        System.out.println("---Find subArray in Array---");
        System.out.println(find.FindArray(tam1,tam2));
        System.out.println(find.FindArray(tam3,tam4));
        System.out.println(find.FindArray(tam5,tam6));
        System.out.println();
        System.out.println("---Find carachter unic in word---");
        System.out.println("'"+letra.findChar(word)+"'");
    }

}
