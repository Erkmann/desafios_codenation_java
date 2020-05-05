package br.com.codenation;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import br.com.codenation.desafio.annotation.Desafio;
import br.com.codenation.desafio.app.MeuTimeInterface;

import br.com.codenation.desafio.exceptions.CapitaoNaoInformadoException;
import br.com.codenation.desafio.exceptions.IdentificadorUtilizadoException;
import br.com.codenation.desafio.exceptions.JogadorNaoEncontradoException;
import br.com.codenation.desafio.exceptions.TimeNaoEncontradoException;

public class DesafioMeuTimeApplication implements MeuTimeInterface {

	private List<Time> times = new ArrayList<>();
	private List<Jogador> jogadores = new ArrayList<>();

	@Desafio("incluirTime")
	public void incluirTime(Long id, String nome, LocalDate dataCriacao, String corUniformePrincipal, String corUniformeSecundario) {
		if(buscarTimes().contains(id)){
			throw new IdentificadorUtilizadoException("Identificador Utilizado");
		}
		Time novo_time = new Time(id, nome, corUniformePrincipal, corUniformeSecundario, dataCriacao);
		times.add(novo_time);
	}

	@Desafio("incluirJogador")
	public void incluirJogador(Long id, Long idTime, String nome, LocalDate dataNascimento, Integer nivelHabilidade, BigDecimal salario) {
		if(buscarJogadores().contains(id)){
			throw new IdentificadorUtilizadoException("Identificador Utilizado");
		}
		else if(!buscarTimes().contains(idTime)){
			throw new TimeNaoEncontradoException("Time nao encontrado");
		}

		Jogador jogador = new Jogador(id, idTime, nome, dataNascimento, nivelHabilidade, salario);

		jogadores.add(jogador);
	}

	@Desafio("definirCapitao")
	public void definirCapitao(Long idJogador) {
		if(!buscarJogadores().contains(idJogador)){
			throw new JogadorNaoEncontradoException("O Jogador nao foi encontrado");
		}

		for(Jogador j: jogadores){
			if(j.getId().equals(idJogador)){
				Long timeId = j.getIdTime();
				for(Time t: times){
					if(t.getId().equals(timeId)){
						t.setIdCapitao(idJogador);
					}
				}
			}
		}

	}

	@Desafio("buscarCapitaoDoTime")
	public Long buscarCapitaoDoTime(Long idTime) {
		Long idCapitao = null;
		if(!buscarTimes().contains(idTime)){
			throw new br.com.codenation.desafio.exceptions.TimeNaoEncontradoException("Time nao encontrado");
		}

		for(Time t: times){
			if(t.getId().equals(idTime)){
				if(t.getIdCapitao() != null){
					idCapitao = t.getIdCapitao();
				}
				else{
					throw new CapitaoNaoInformadoException("Time nao tem capitao informado");
				}
			}
		}

		return idCapitao;
	}

	@Desafio("buscarNomeJogador")
	public String buscarNomeJogador(Long idJogador) {
		String nome = null;
		if(!buscarJogadores().contains(idJogador)){
			throw new JogadorNaoEncontradoException("Jogador nao encontrado");
		}

		for(Jogador j: jogadores){
			if(j.getId().equals(idJogador)){
				nome = j.getNome();
			}
		}

		return nome;
	}

	@Desafio("buscarNomeTime")
	public String buscarNomeTime(Long idTime) {
		String nome = "";

		if(!buscarTimes().contains(idTime)){
			throw new TimeNaoEncontradoException("Time nao encontrado");
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
		if(!buscarTimes().contains(idTime)){
			throw new TimeNaoEncontradoException("Time nao encontrado");
		}

		return jogadores.stream()
				.filter(player -> player.getIdTime().equals(idTime))
				.collect(Collectors.toList()).stream()
				.sorted(Comparator.comparingLong(Jogador::getId))
				.map(Jogador::getId)
				.collect(Collectors.toList());
	}

	@Desafio("buscarMelhorJogadorDoTime")
	public Long buscarMelhorJogadorDoTime(Long idTime) {
		if(!buscarTimes().contains(idTime)){
			throw new TimeNaoEncontradoException("Time nao encontrado");
		}

		int habilidade = 0;
		Long jogador = null;

		for(Jogador j: jogadores){
			if(j.getIdTime().equals(idTime)){
				if(j.getNivelHabilidade() > habilidade){
					habilidade = j.getNivelHabilidade();
					jogador = j.getId();
				}
				else if(j.getNivelHabilidade().equals(habilidade)){
					if(jogador != null){
						if(j.getId() < jogador){
							jogador = j.getId();
						}
					}
					else {
						jogador = j.getId();
					}
				}
			}
		}


		return jogador;

	}

	@Desafio("buscarJogadorMaisVelho")
	public Long buscarJogadorMaisVelho(Long idTime) {
		if(!buscarTimes().contains(idTime)){
			throw new TimeNaoEncontradoException("Time nao encontrado");
		}
		List<Jogador> jogadoresTime = jogadores.stream()
				.filter(player -> player.getIdTime().equals(idTime))
				.collect(Collectors.toList());

		LocalDate maiorData = LocalDate.MAX;
		Long id = null;

		for(Jogador j: jogadoresTime){
			if(j.getDataNascimento().isBefore(maiorData)){
				id = j.getId();
				maiorData = j.getDataNascimento();
			}
			else if(j.getDataNascimento().isEqual(maiorData)){
				if (id == null){
					maiorData = j.getDataNascimento();
					id = j.getId();
				}
				else {
					if (j.getId() < id){
						id = j.getId();
						maiorData = j.getDataNascimento();
					}
				}
			}
		}

		return id;
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
		if(!buscarTimes().contains(idTime)){
			throw new TimeNaoEncontradoException("Time nao encontrado");
		}

		List<Long> jogadoresTime = new ArrayList<>();

		jogadores.stream()
				.filter(jogador -> jogador.getIdTime().equals(idTime))
				.sorted(Comparator.
						comparing(Jogador::getSalario).reversed().
						thenComparingLong(Jogador::getId)).
						forEach(e -> jogadoresTime.add(e.getId()));

		return jogadoresTime.get(0);

	}

	@Desafio("buscarSalarioDoJogador")
	public BigDecimal buscarSalarioDoJogador(Long idJogador) {
		if(!buscarJogadores().contains(idJogador)){
			throw new JogadorNaoEncontradoException("Jogador nao encontrado");
		}

		BigDecimal salario = null;

		for(Jogador j: jogadores){
			if(j.getId().equals(idJogador)){
				salario = j.getSalario();
				break;
			}
		}

		return salario;

	}

	@Desafio("buscarTopJogadores")
	public List<Long> buscarTopJogadores(Integer top) {
		if(buscarJogadores().isEmpty()){
			return buscarJogadores();
		}
		if(top < 0) throw new IllegalArgumentException("Valor top não pode ser negativo");
		List<Long> jogadoresOrdenados = new ArrayList<>();

		jogadores.stream().
				sorted(Comparator.
						comparing(Jogador::getNivelHabilidade).reversed().
						thenComparingLong(Jogador::getId)).
				limit(top).
				forEach(e -> jogadoresOrdenados.add(e.getId()));

		return jogadoresOrdenados;

	}

	@Desafio("buscarCorCamisaTimeDeFora")
	public String buscarCorCamisaTimeDeFora(Long timeDaCasa, Long timeDeFora) {
		Time timeCasa = null, timeFora = null;
		String cor;

		if(!buscarTimes().contains(timeDaCasa) || !buscarTimes().contains(timeDeFora)){
			throw new TimeNaoEncontradoException("Time nao encontrado");
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
