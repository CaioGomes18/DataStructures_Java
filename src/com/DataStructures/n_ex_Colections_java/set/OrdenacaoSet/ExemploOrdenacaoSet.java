package com.DataStructures.n_ex_Colections_java.set.OrdenacaoSet;

import java.util.HashSet;
import java.util.Objects;
import java.util.*;

/*Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
        Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
        Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25*/
public class ExemploOrdenacaoSet {
    public static void main(String[] args){

        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};
        System.out.println("Ordem Aleatoria -- " );

        for(Serie s : minhasSeries){
            System.out.println(s.getNome() + s.getGenero() + s.getTipoDeEpisodio());
        }

        Set<Serie> minhasSeries2 = new LinkedHashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};
        System.out.println("Ordem de inserção\n" + minhasSeries2);


        Set<Serie> minhasSeries3 = new TreeSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};

        System.out.println("Ordem natural (tempo Episodio)");
        for(Serie s : minhasSeries3){
            System.out.println(s.getNome() + " - "+ s.getGenero()+ " - "+ s.getTipoDeEpisodio());
        }

        System.out.println("--\tOrdem Nome/Gênero/TempoEpisodio\t--");
        Set<Serie> minhasSeries4 = new TreeSet<>(new CompareToNomeGeneroTempoSerie());


        minhasSeries4.addAll(minhasSeries);
        for(Serie s : minhasSeries4){
            System.out.println(s.getNome() + " - "+ s.getGenero()+ " - "+ s.getTipoDeEpisodio());
        }


        //Pra você
/*        System.out.println("--\tOrdem gênero\t--");

          System.out.println("--\tOrdem Tempo Episódio\t--");
 */
    }
}

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer TipoDeEpisodio;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getTipoDeEpisodio() {
        return TipoDeEpisodio;
    }

    public void setTipoDeEpisodio(Integer tipoDeEpisodio) {
        TipoDeEpisodio = tipoDeEpisodio;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", TipoDeEpisodio=" + TipoDeEpisodio +
                '}';
    }

    public Serie(String nome, String genero, Integer tipoDeEpisodio) {
        this.nome = nome;
        this.genero = genero;
        TipoDeEpisodio = tipoDeEpisodio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(TipoDeEpisodio, serie.TipoDeEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, TipoDeEpisodio);
    }

    @Override
    public int compareTo(Serie o) {
        int temp =Integer.compare(this.getTipoDeEpisodio(), o.getTipoDeEpisodio());
        if(temp != 0) {
            return temp;
        }
        return this.getGenero().compareTo(o.getGenero());


    }


}

class CompareToNomeGeneroTempoSerie implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if(nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if(genero!= 0)return genero;

        return Integer.compare(s1.getTipoDeEpisodio(), s2.getTipoDeEpisodio());
    }
}
