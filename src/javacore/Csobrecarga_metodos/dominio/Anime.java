package javacore.Csobrecarga_metodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private String genero;
    private int episodios;

    public void init(String nome, String tipo, String genero) {
        this.nome = nome;
        this.tipo = tipo;
        this.genero = genero;
    }

    public void init(String nome, String tipo, String genero, int episodios) {
        this.init(nome, tipo, genero);
        this.episodios = episodios;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.genero);
        System.out.println(this.episodios);
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return this.episodios;
    }
}
