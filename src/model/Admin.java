package model;

import exception.SenhaIncorretaException;

public class Admin extends Usuario {

    public Admin(String nome, String senha) {
        super(nome, senha);
    }

    @Override
    public void autenticar(String senhaDigitada) throws SenhaIncorretaException {
        if (!senhaDigitada.equals("admin123")) {
            throw new SenhaIncorretaException("Senha incorreta para administrador.");
        }
        System.out.println("✅ Login de admin autorizado!");
    }
}
