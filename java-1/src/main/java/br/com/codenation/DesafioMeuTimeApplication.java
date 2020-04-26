package br.com.codenation;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.codenation.desafio.annotation.Desafio;
import br.com.codenation.desafio.app.MeuTimeInterface;
import br.com.codenation.desafio.exceptions.IdentificadorUtilizadoException;
import br.com.codenation.desafio.exceptions.TimeNaoEncontradoException;

public class DesafioMeuTimeApplication implements MeuTimeInterface {

	private List<Time> times = new ArrayList<>();
	private List<Jogador> jogadores = new ArrayList<>();

	@Desafio("incluirTime")
	public void incluirTime(Long id, String nome, LocalDate dataCriacao, String corUniformePrincipal, String corUniformeSecundario) {
		if(buscarTimes().contains(id)){
			throw new IdentificadorUtilizadoException();
		}
		Time novo_time = new Time(id, nome, corUniformePrincipal, corUniformeSecundario, dataCriacao);
		times.add(novo_time);
	}

	@Desafio("incluirJogador")
	public void incluirJogador(Long id, Long idTime, String nome, LocalDate dataNascimento, Integer nivelHabilidade, BigDecimal salario) {
		if(buscarJogadores().contains(id)){
			throw new IdentificadorUtilizadoException();
		}
		else if(!buscarTimes().contains(idTime)){
			throw new TimeNaoEncontradoException();
		}

		Jogador jogador = new Jogador(id, idTime, nome, dataNascimento, nivelHabilidade, salario);

		jogadores.add(jogador);
	}

	@Desafio("definirCapitao")
	public void definirCapitao(Long idJogador) {
		throw new UnsupportedOperationException();
	}

	@Desafio("buscarCapitaoDoTime")
	public Long buscarCapitaoDoTime(Long idTime) {
		throw new UnsupportedOperationException();
	}

	@Desafio("buscarNomeJogador")
	public String buscarNomeJogador(Long idJogador) {
		throw new UnsupportedOperationException();
	}

	@Desafio("buscarNomeTime")
	public String buscarNomeTime(Long idTime) {
		String nome = "";

		if(!buscarTimes().contains(idTime)){
			throw new TimeNaoEncontradoException();
		}

		for(Time time: times){
			if(time.getId().equals(idTime)){
				nome = time.getNome();
			}
		}

		return nome;
	}

	@Desafio("buscarJogadoresDoTime")
	public List<Long> buscarJogadoresDoTime(Long idTime) {
		throw new UnsupportedOperationException();
	}

	@Desafio("buscarMelhorJogadorDoTime")
	public Long buscarMelhorJogadorDoTime(Long idTime) {
		throw new UnsupportedOperationException();
	}

	@Desafio("buscarJogadorMaisVelho")
	public Long buscarJogadorMaisVelho(Long idTime) {
		throw new UnsupportedOperationException();
	}

	@Desafio("buscarTimes")
	public List<Long> buscarTimes() {
		List<Long> ids = new ArrayList<>();
		for(Time time: times){
			ids.add(time.getId());
		}
		return ids;
	}

	@Desafio("buscarJogadorMaiorSalario")
	public Long buscarJogadorMaiorSalario(Long idTime) {
		throw new UnsupportedOperationException();
	}

	@Desafio("buscarSalarioDoJogador")
	public BigDecimal buscarSalarioDoJogador(Long idJogador) {
		throw new UnsupportedOperationException();
	}

	@Desafio("buscarTopJogadores")
	public List<Long> buscarTopJogadores(Integer top) {
		throw new UnsupportedOperationException();
	}

	@Desafio("buscarCorCamisaTimeDeFora")
	public String buscarCorCamisaTimeDeFora(Long timeDaCasa, Long timeDeFora) {
		Time timeCasa = null, timeFora = null;
		String cor;

		if(!buscarTimes().contains(timeDaCasa) || !buscarTimes().contains(timeDeFora)){
			throw new TimeNaoEncontradoException();
		}

		for(Time time: times){
			if(time.getId().equals(timeDaCasa)){
				timeCasa = time;
			}
			else if(time.getId().equals(timeDeFora)){
				timeFora = time;
			}
		}

		if(!timeCasa.getCorUniformePrincipal().equals(timeFora.getCorUniformePrincipal())){
			cor = timeFora.getCorUniformePrincipal();
		}
		else cor = timeFora.getCorUniformeSecundario();

		return cor;
	}

	public List<Long> buscarJogadores(){
		List<Long> idsJogadores = new ArrayList<>();

		for(Jogador jogador: jogadores){
			idsJogadores.add(jogador.getId());
		}

		return idsJogadores;
	}

}
