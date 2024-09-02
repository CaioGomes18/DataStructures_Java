package com.DataStructures.n_ex_Colections_java.Map;


//Autor = Hawking, Stephen  - Livro = nome: Uma Breve História do Tempo. páginas: 256
//Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, paginas: 408
//Autor = Harari, Yuval Noah  - Livro = 21 Lições Para o Século 21, páginas: 432

import java.util.*;
public class ExemploOrdenacaoMap {

    public static void main(String[] args) {

        Map<String, Livro> meuMap = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));

        }};
        System.out.println("Ordem aleatoria");

        for(Map.Entry<String,Livro> s : meuMap.entrySet()){
            System.out.println(s.getKey() + "- " + s.getValue().getNome());
        }

        System.out.println("--\tOrdem Inserção\t--");
        Map<String, Livro> meuLinkedMap = new LinkedHashMap<>(meuMap);

        for(Map.Entry<String,Livro> s : meuLinkedMap.entrySet()){
            System.out.println(s.getKey() + "- " + s.getValue().getNome());
        }

        System.out.println("--\tOrdem Alfabetica\t--");

        Map<String, Livro> meuTreeMap = new TreeMap<>(meuMap);

        for(Map.Entry<String,Livro> s : meuTreeMap.entrySet()){
            System.out.println(s.getKey() + "- " + s.getValue().getNome());
        }
        System.out.println("--\tOrdem Alfabetica Livros\t--");

        Set<Map.Entry<String, Livro>> meusLivros = new TreeSet<>( new CopmparatorNome());
        meusLivros.addAll(meuMap.entrySet());

        for(Map.Entry<String,Livro> s : meusLivros){
            System.out.println(s.getKey() + "- " + s.getValue().getNome());
        }
        System.out.println("--\tOrdem Número de página\t--"); // exercicio
    }




}

class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }



}

class CopmparatorNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> livro1, Map.Entry<String, Livro> livro2) {
        return livro1.getValue().getNome().compareToIgnoreCase(livro2.getValue().getNome());
    }
}
