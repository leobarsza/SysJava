package app;

import java.util.Scanner;
import model.Admin;
import model.Cliente;
import model.Usuario;
import exception.SenhaIncorretaException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Usuario usuario1 = new Cliente("Amanda", "123cliente");
        Usuario usuario2 = new Admin("AmandaAdmin", "admin123");

        try {
            System.out.print("Digite a senha para o cliente: ");
            String senhaCliente = sc.nextLine();
            usuario1.autenticar(senhaCliente);

            System.out.print("Digite a senha para o admin: ");
            String senhaAdmin = sc.nextLine();
            usuario2.autenticar(senhaAdmin);

        } catch (SenhaIncorretaException e) {
            System.out.println("❌ Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("❌ Erro inesperado: " + e.getMessage());
        }

        sc.close();
    }
}
