package model;

public class Pokemon {

    private int id;
    private String nome;
    private String tipo;
    private String caregoria;
    private double altura;
    private double peso;
    private int geracao;

    public Pokemon() {
    }

    public Pokemon(int id, String nome, String tipo, String caregoria, double altura, double peso, int geracao) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.caregoria = caregoria;
        this.altura = altura;
        this.peso = peso;
        this.geracao = geracao;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCaregoria() {
        return this.caregoria;
    }

    public void setCaregoria(String caregoria) {
        this.caregoria = caregoria;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getGeracao() {
        return this.geracao;
    }

    public void setGeracao(int geracao) {
        this.geracao = geracao;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nome='" + getNome() + "'" +
            ", tipo='" + getTipo() + "'" +
            ", caregoria='" + getCaregoria() + "'" +
            ", altura='" + getAltura() + "'" +
            ", peso='" + getPeso() + "'" +
            ", geracao='" + getGeracao() + "'" +
            "}";
    }
}