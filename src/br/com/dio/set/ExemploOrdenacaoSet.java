package br.com.dio.set;

import br.com.dio.list.Gato;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
        Set<Serie> minhasSeries = new HashSet<>(){{
            this.add(new Serie("got",  "fantasia",  60));
            this.add(new Serie("dark",  "drama",  60));
            this.add(new Serie("that 70' Shows",  "comédia",  25));
        }};
        System.out.println(minhasSeries);

        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            this.add(new Serie("got",  "fantasia",  60));
            this.add(new Serie("dark",  "drama",  60));
            this.add(new Serie("that 70' Shows",  "comédia",  25));
        }};
        System.out.println(minhasSeries1);

        Set<Serie> minhasSeries2 = new TreeSet<>(){{
            this.add(new Serie("got",  "fantasia",  60));
            this.add(new Serie("dark",  "drama",  60));
            this.add(new Serie("that 70' Shows",  "comédia",  25));
        }};
        System.out.println(minhasSeries2);

        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);
        System.out.println(minhasSeries3);









    }
}
