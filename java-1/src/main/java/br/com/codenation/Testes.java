package br.com.codenation;

import br.com.codenation.DesafioMeuTimeApplication;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Testes {
    public static void main(String[] args) {
        final LocalDate NOW = LocalDate.from(LocalDateTime.now());

        DesafioMeuTimeApplication desafio = new DesafioMeuTimeApplication();

//Teste de exception para incluirTime - Funcionando.
//        desafio.incluirTime(1L, "TesteTime", NOW, "Vermelho", "Preto");
//        try{
//            desafio.incluirTime(1L, "TesteTime", NOW, "Vermelho", "Preto");
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }

//Teste de exception para incluirJogador - Funcionando.
//        desafio.incluirTime(2L, "TesteTime", NOW, "Vermelho", "Preto");
//        desafio.incluirJogador(2L, 2L, "TesteJogador", NOW, 50, new BigDecimal("1000.00"));
//        try{
//            desafio.incluirJogador(3L, 2L, "TesteJogador", NOW, 50, new BigDecimal("1000.00"));
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }

//Teste de exception para Time não encontrado - Funcionando.
//        desafio.incluirTime(1L, "TesteTime", NOW, "Vermelho", "Preto");
//        desafio.incluirJogador(1L, 2L,"TesteJogador", NOW, 50, new BigDecimal("1000.00"));

//Teste de exception para nivel de habilidade negativo e acima de 100 - Funcionando.
//        desafio.incluirTime(1L, "TesteTime", NOW, "Vermelho", "Preto");
//        desafio.incluirJogador(1L, 1L,"TesteJogador", NOW, -10, new BigDecimal("1000.00"));
//        desafio.incluirJogador(2L, 1L,"TesteJogador", NOW, 101, new BigDecimal("1000.00"));

//Teste de exception para quando o capitao não existe - Funcionando.
//        desafio.incluirTime(1L, "TesteTime", NOW, "Vermelho", "Preto");
//        desafio.incluirJogador(1L, 1L,"TesteJogador", NOW, 50, new BigDecimal("1000.00"));
//        desafio.definirCapitao(1L);

////Teste de exception para quando o time do capitao não foi encontrado - Funcionando.
//        desafio.incluirTime(1L, "TesteTime", NOW, "Vermelho", "Preto");
//        desafio.incluirJogador(1L, 1L,"TesteJogador", NOW, 50, new BigDecimal("1000.00"));
//        desafio.definirCapitao(1L);
//        desafio.buscarCapitaoDoTime(1L);

//Teste para retornar capitao na busca - Funcionando.
//        desafio.incluirTime(1L, "TesteTime", NOW, "Vermelho", "Preto");
//        desafio.incluirJogador(1L, 1L,"TesteJogador", NOW, 50, new BigDecimal("1000.00"));
//        desafio.incluirJogador(2L, 1L,"TesteJogador", NOW, 50, new BigDecimal("1000.00"));
//        desafio.incluirJogador(3L, 1L,"TesteJogador", NOW, 50, new BigDecimal("1000.00"));
//        desafio.definirCapitao(2L);
//        System.out.println("Capitão: " + desafio.buscarCapitaoDoTime(1L));
//        desafio.definirCapitao(3L);
//        System.out.println("Capitão: " + desafio.buscarCapitaoDoTime(1L));

//Teste de exception para retornar nome, mas o id do jogador não foi encontrado - Funcionando.
//        desafio.incluirTime(1L, "TesteTime", NOW, "Vermelho", "Preto");
//        desafio.incluirJogador(1L, 1L,"TesteJogador", NOW, 50, new BigDecimal("1000.00"));
//        desafio.buscarNomeJogador(2L);

//Teste para retornar nome jogador - Funcionando.
//        desafio.incluirTime(1L, "TesteTime", NOW, "Vermelho", "Preto");
//        desafio.incluirJogador(1L, 1L,"TesteJogador", NOW, 50, new BigDecimal("1000.00"));
//        desafio.incluirJogador(2L, 1L,"TesteOutroJogador", NOW, 50, new BigDecimal("1000.00"));
//        System.out.println("Nome: " + desafio.buscarNomeJogador(1L));

//Teste de exception para retornar nome, mas o id do time não foi encotrado - Funcionando.
//        desafio.incluirTime(1L, "TesteTime", NOW, "Vermelho", "Preto");
//        desafio.buscarNomeTime(2L);

//Teste para retornar nome Time - Funcionando.
//        desafio.incluirTime(1L, "TesteTime", NOW, "Vermelho", "Preto");
//        desafio.incluirTime(2L, "TesteOutroTime", NOW, "Vermelho", "Preto");
//        System.out.println("Nome: " + desafio.buscarNomeTime(1L));

//Teste de exception para id time não encontrado na busca de jogadores do time - Funcionando.
//        desafio.incluirTime(1L, "TesteTime", NOW, "Vermelho", "Preto");
//        desafio.incluirJogador(1L, 1L,"TesteJogador", NOW, 50, new BigDecimal("1000.00"));
//        desafio.incluirJogador(2L, 1L,"TesteOutroJogador", NOW, 50, new BigDecimal("1000.00"));
//        desafio.buscarJogadoresDoTime(2L);

//Teste para retornar lista de jogadores do time - Funcionando.
//        desafio.incluirTime(1L, "TesteTime", NOW, "Vermelho", "Preto");
//        desafio.incluirTime(2L, "TesteTime", NOW, "Vermelho", "Preto");
//        desafio.incluirJogador(1L, 1L,"TesteJogador", NOW, 50, new BigDecimal("1000.00"));
//        desafio.incluirJogador(2L, 1L,"TesteJogador", NOW, 50, new BigDecimal("1000.00"));
//        desafio.incluirJogador(3L, 2L,"TesteJogador", NOW, 50, new BigDecimal("1000.00"));
//        System.out.println("Jogadores: " + desafio.buscarJogadoresDoTime(1L));
//        System.out.println("Jogadores: " + desafio.buscarJogadoresDoTime(2L));

//Teste de exception para id time não encontrado no melhor jogador- Funcionando
//        desafio.incluirTime(1L, "TesteTime", NOW, "Vermelho", "Preto");
//        desafio.incluirJogador(1L, 1L,"TesteJogador", NOW, 50, new BigDecimal("1000.00"));
//        desafio.incluirJogador(2L, 1L,"TesteOutroJogador", NOW, 50, new BigDecimal("1000.00"));
//        desafio.buscarMelhorJogadorDoTime(2L);

//Teste para retornar melhor jogador - Funcionando.
//        desafio.incluirTime(1L, "TesteTime", NOW, "Vermelho", "Preto");
//        desafio.incluirJogador(1L, 1L,"TesteJogador", NOW, 100, new BigDecimal("1000.00"));
//        desafio.incluirJogador(2L, 1L,"TesteOutroJogador", NOW, 100, new BigDecimal("1000.00"));
//        desafio.incluirJogador(3L, 1L,"TesteOutroJogador", NOW, 100, new BigDecimal("1000.00"));
//        System.out.println("Melhor: " + desafio.buscarMelhorJogadorDoTime(1L));

//Teste de exception para id time não encontrado no jogador mais velho - Funcionando.
//        desafio.incluirTime(1L, "TesteTime", NOW, "Vermelho", "Preto");
//        desafio.incluirJogador(1L, 1L,"TesteJogador", LocalDate.of(2000,01,01), 50, new BigDecimal("1000.00"));
//        desafio.incluirJogador(2L, 1L,"TesteOutroJogador", LocalDate.of(2000,01,02), 50, new BigDecimal("1000.00"));
//        desafio.buscarJogadorMaisVelho(2L);

//Teste para retornar jogador mais velho - Funcionando.
//        desafio.incluirTime(1L, "TesteTime", NOW, "Vermelho", "Preto");
//        desafio.incluirJogador(1L, 1L,"TesteJogador1", LocalDate.of(2000,1,2), 100, new BigDecimal("1000.00"));
//        desafio.incluirJogador(2L, 1L,"TesteJogador2", LocalDate.of(2000,1,2), 100, new BigDecimal("1000.00"));
//        desafio.incluirJogador(3L, 1L,"TesteJogador3", LocalDate.of(2000,1,3), 100, new BigDecimal("1000.00"));
//        System.out.println("Mais velho: " + desafio.buscarJogadorMaisVelho(1L));

//Teste para retornar lista vazia por não ter elementos na lista de times - Funcionando.
//        System.out.println(desafio.buscarTimes());

//Teste para retornar a lista de times - .
//        desafio.incluirTime(1L, "TesteTime", NOW, "Vermelho", "Preto");
//        desafio.incluirTime(2L, "TesteTime", NOW, "Vermelho", "Preto");
//        desafio.incluirTime(3L, "TesteTime", NOW, "Vermelho", "Preto");
//        System.out.println(desafio.buscarTimes());

//Teste de exception para id time não encontrado no jogador com maior salário - Funcionando.
//        desafio.incluirTime(1L, "TesteTime", NOW, "Vermelho", "Preto");
//        desafio.incluirJogador(1L, 1L,"TesteJogador", NOW, 50, new BigDecimal("1000.01"));
//        desafio.incluirJogador(2L, 1L,"TesteOutroJogador", NOW, 50, new BigDecimal("1000.00"));
//        desafio.buscarJogadorMaiorSalario(1L);

//Teste para retornar jogador com maior salário - Funcionando.
//        desafio.incluirTime(1L, "TesteTime", NOW, "Vermelho", "Preto");
//        desafio.incluirJogador(1L, 1L,"TesteJogador1", NOW, 100, new BigDecimal("1000.00"));
//        desafio.incluirJogador(2L, 1L,"TesteJogador2", NOW, 100, new BigDecimal("1000.01"));
//        desafio.incluirJogador(3L, 1L,"TesteJogador3", NOW, 100, new BigDecimal("1000.01"));
//        System.out.println("Maior salário: " + desafio.buscarJogadorMaiorSalario(1L));

//Teste de exception para id jogador não encontrado no buscar salário jogador - Funcionando.
//        desafio.incluirTime(1L, "TesteTime", NOW, "Vermelho", "Preto");
//        desafio.incluirJogador(1L, 1L,"TesteJogador", NOW, 50, new BigDecimal("1000.01"));
//        desafio.incluirJogador(2L, 1L,"TesteOutroJogador", NOW, 50, new BigDecimal("1000.00"));
//        desafio.buscarSalarioDoJogador(3L);

//Teste para retornar salário do jogador - Funcionando.
//        desafio.incluirTime(1L, "TesteTime", NOW, "Vermelho", "Preto");
//        desafio.incluirJogador(1L, 1L,"TesteJogador1", NOW, 100, new BigDecimal("1000.00"));
//        desafio.incluirJogador(2L, 1L,"TesteJogador2", NOW, 100, new BigDecimal("1000.02"));
//        desafio.incluirJogador(3L, 1L,"TesteJogador3", NOW, 100, new BigDecimal("1000.01"));
//        System.out.println("salário: " + desafio.buscarSalarioDoJogador(2L));

//Teste de exception pelo parâmetro top ser negativo - Funcionando.
//        desafio.incluirTime(1L, "TesteTime", NOW, "Vermelho", "Preto");
//        desafio.incluirJogador(1L, 1L,"TesteJogador1", NOW, 100, new BigDecimal("1000.00"));
//        desafio.incluirJogador(2L, 1L,"TesteJogador2", NOW, 100, new BigDecimal("1000.01"));
//        desafio.buscarTopJogadores(-1);

//Teste para retornar lista vazia por não ter elementos na lista de jogadores - Funcionando.
//        System.out.println(desafio.buscarTopJogadores(3));

//Teste para retornar top jogadores - Funcionando.
//        desafio.incluirTime(1L, "TesteTime", NOW, "Vermelho", "Preto");
//        desafio.incluirTime(2L, "TesteTime", NOW, "Vermelho", "Preto");
//        desafio.incluirTime(3L, "TesteTime", NOW, "Vermelho", "Preto");
//        desafio.incluirJogador(4L, 2L,"TesteJogador4", NOW, 94, new BigDecimal("1000.00"));
//        desafio.incluirJogador(5L, 2L,"TesteJogador5", NOW, 98, new BigDecimal("1000.01"));
//        desafio.incluirJogador(6L, 2L,"TesteJogador6", NOW, 100, new BigDecimal("1000.01"));
//        desafio.incluirJogador(1L, 1L,"TesteJogador1", NOW, 85, new BigDecimal("1000.00"));
//        desafio.incluirJogador(2L, 1L,"TesteJogador2", NOW, 99, new BigDecimal("1000.01"));
//        desafio.incluirJogador(3L, 1L,"TesteJogador3", NOW, 93, new BigDecimal("1000.01"));
//        desafio.incluirJogador(7L, 3L,"TesteJogador7", NOW, 92, new BigDecimal("1000.00"));
//        desafio.incluirJogador(8L, 3L,"TesteJogador8", NOW, 91, new BigDecimal("1000.01"));
//        desafio.incluirJogador(9L, 3L,"TesteJogador9", NOW, 90, new BigDecimal("1000.01"));
//        System.out.println("Top Jogadores: " + desafio.buscarTopJogadores(3));
//        System.out.println("Top Jogadores: " + desafio.buscarTopJogadores(4));
//        System.out.println("Top Jogadores: " + desafio.buscarTopJogadores(9));

//Teste de exception para id time não encontrado no buscar cor camisa time de fora - Funcionando.
//        desafio.incluirTime(1L, "TesteTime", NOW, "Vermelho", "Preto");
//        desafio.buscarCorCamisaTimeDeFora(1L, 2L);
//        desafio.buscarCorCamisaTimeDeFora(2L, 1L);
//        desafio.buscarCorCamisaTimeDeFora(3L, 2L);

//Teste para retornar cor secundária e primária - Funcionando.
//        desafio.incluirTime(1L, "TesteTime", NOW, "Vermelho", "Preto");
//        desafio.incluirTime(2L, "TesteTimeFora", NOW, "Vermelho", "Preto");
//        desafio.incluirTime(3L, "TesteTimeFora", NOW, "Preto", "Vermelho");
//        System.out.println("Cor secundária: " + desafio.buscarCorCamisaTimeDeFora(1L, 2L));
//        System.out.println("Cor Primária: " + desafio.buscarCorCamisaTimeDeFora(1L, 3L));
    }
}