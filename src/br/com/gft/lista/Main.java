package br.com.gft.lista;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Pessoas pessoa = new Pessoas();
       List<Pessoas> pessoas = new ArrayList<>(){{
           add(new Pessoas("Joao", 15));
           add(new Pessoas("Leandro", 21));
           add(new Pessoas("Paulo", 17));
           add(new Pessoas("Jessica", 18));
       }};


        System.out.println(pessoas);

        System.out.println(pessoa.maiorIdadeObjeto(pessoas).getNome());

        System.out.println("Lista dos maiores de idade: " + pessoa.maioresDeIdade(pessoas));

        System.out.println("Se a Jessica estiver na lista favor informar sua idade: " + pessoa.encontrarPessoa(pessoas).getIdade());


    }
}
