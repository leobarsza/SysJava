package model;

public abstract class Usuario {
    private String nome;
    private String senha;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }
    //Classe abstrata
    public abstract void autenticar(String senhaDigitada) throws Exception;
}
