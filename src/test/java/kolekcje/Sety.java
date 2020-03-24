package kolekcje;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class Sety {


    Set<String> nicks = new HashSet<String>();

    public void dodajNickiUzytkownikow() {

        nicks.add("ponury zniwacz");
        nicks.add("ferment");
        nicks.add("wesoly chlopak");
        nicks.add("czarna owca");
        nicks.add("swinka peppa");


    }


    @Test
    public void testSetow() {
        dodajNickiUzytkownikow();
        nicks.add("kolejny user");
        System.out.println(nicks.size());
        System.out.println(nicks.contains("ponury zniwacz"));
        nicks.remove("ponury zniwacz");
        System.out.println(nicks.size());
        nicks.add("kolejny user");
        System.out.println(nicks.size());
    }
}
