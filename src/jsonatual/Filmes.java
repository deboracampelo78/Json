/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonatual;

/**
 *
 * @author supero
 */
public class Filmes {
    
     String ano;
     String titulo;
     String studio;
     String producao;
     String ganhou;

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getProducao() {
        return producao;
    }

    public void setProducao(String producao) {
        this.producao = producao;
    }

    public String getGanhou() {
        return ganhou;
    }

    public void setGanhou(String ganhou) {
        this.ganhou = ganhou;
    }


    public Filmes(String ano, String titulo, String studio, String producao, String ganhou) {
        this.ano = ano;
        this.titulo = titulo;
        this.studio = studio;
        this.producao = producao;
        this.ganhou = ganhou;
    }
     
     
}
