package br.com.codenation;

import java.time.LocalDate;

public class Time {

    private Long id, idCapitao;
    private String nome, corUniformePrincipal, corUniformeSecundario;
    private LocalDate dataCriacao;

    public Time(Long id, String nome, String corUniformePrincipal, String corUniformeSecundario, LocalDate dataCriacao) {
        this.setId(id);
        this.setNome(nome);
        this.setCorUniformePrincipal(corUniformePrincipal);
        this.setCorUniformeSecundario(corUniformeSecundario);
        this.setDataCriacao(dataCriacao);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdCapitao() {
        return idCapitao;
    }

    public void setIdCapitao(Long idCapitao) {
        this.idCapitao = idCapitao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCorUniformePrincipal() {
        return corUniformePrincipal;
    }

    public void setCorUniformePrincipal(String corUniformePrincipal) {
        this.corUniformePrincipal = corUniformePrincipal;
    }

    public String getCorUniformeSecundario() {
        return corUniformeSecundario;
    }

    public void setCorUniformeSecundario(String corUniformeSecundario) {
        this.corUniformeSecundario = corUniformeSecundario;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
