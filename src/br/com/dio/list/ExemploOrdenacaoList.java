package br.com.dio.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<Gato>() {
            {
                this.add(new Gato("Jon", 10, "preto"));
                this.add(new Gato("Simba", 6, "tigrado"));
                this.add(new Gato("Jon", 12, "amarelo"));
            }
        };

        // mostra na ordem de inserção
        System.out.println(meusGatos);
        // bagunça a ordem de inserção
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);


        Collections.sort(meusGatos);
        System.out.println(meusGatos);
        System.out.println("Ordem por idade");
        meusGatos.sort( new ComparatorIdade());
        System.out.println(meusGatos);
        meusGatos.sort( new ComparatorCor());
        System.out.println(meusGatos);


    }
}
///////////////////////////////////////////////////////////////


