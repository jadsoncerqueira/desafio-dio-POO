package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private final java.util.Set<Dev> devsInscritos = new java.util.HashSet<>();
    private final java.util.Set<Conteudo> conteudos = new java.util.LinkedHashSet<>();
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bootcamp bootcamp)) return false;

        return nome != null ? nome.equals(bootcamp.nome) : bootcamp.nome == null;
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
    }
}
