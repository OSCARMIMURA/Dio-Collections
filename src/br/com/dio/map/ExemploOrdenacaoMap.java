package br.com.dio.map;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class ExemploOrdenacaoMap {

    public static void main(String[] args) {
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put ("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put ("Duhigg,Charles ", new Livro("O poder do Hábito", 488));
            put ("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }}  ;

        for(Map.Entry<String, Livro> livro : meusLivros.entrySet())
        System.out.println("\n"+ livro.getKey()+ " = " + livro.getValue().getNome());
    }
}
