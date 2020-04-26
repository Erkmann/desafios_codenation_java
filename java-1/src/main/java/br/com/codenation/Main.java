package br.com.codenation;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {

    private final static LocalDate hoje = LocalDate.now();

    public static void main(String[] args) {
        DesafioMeuTimeApplication tests = new DesafioMeuTimeApplication();
        try {
            tests.incluirTime((long) 15, "Curintha", hoje, "Branco", "Preto");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            tests.incluirTime((long) 18, "Framengo", hoje, "Vermelho", "Branco");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            tests.incluirTime((long) 1, "Santos", hoje, "Branco", "Marrom");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(tests.buscarNomeTime((long)15));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(tests.buscarCorCamisaTimeDeFora((long)15, (long)18));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            tests.incluirJogador((long)15, (long)15, "Messi", hoje, 99, BigDecimal.valueOf(70000000));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            tests.incluirJogador((long)145, (long)18, "Ney", hoje, 92, BigDecimal.valueOf(4000000));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(tests.buscarJogadores());

    }

}
