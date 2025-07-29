package model;

import exception.SenhaIncorretaException;

public class Cliente extends Usuario {

    public Cliente(String nome, String senha) {
        super(nome, senha);
    }

    @Override
    public void autenticar(String senhaDigitada) throws SenhaIncorretaException {
        if (!senhaDigitada.equals("123cliente")) {
            throw new SenhaIncorretaException("Senha incorreta para cliente.");
        }
        System.out.println("✅ Login de cliente autorizado!");
    }
}
