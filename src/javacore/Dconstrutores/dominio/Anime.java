package javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private String genero;
    private int episodios;
    private String estudio;
    // Constructor: Inicializa os objetos
    // Deve ser feito antes dos métodos.
    // Não tem retorno. (Caso tenha algum tipo de retorno - void, por exemplo - passa a ser um método)
    //

    public Anime(String nome, String tipo, String genero, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.genero = genero;
        this.episodios = episodios;
    }

    public Anime(String nome, String tipo, String genero, int episodios, String estudio) {
        this(nome, tipo, genero, episodios); // Não é possivel usar essa sintaxe fora do corpo de texto do constructor.
        // Deve também ser declarada na primeira
        this.estudio = estudio;
    }


    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.genero);
        System.out.println(this.episodios);
        System.out.println(this.estudio);
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
