package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Corso {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	private LocalDate dataInizio;
	
	private int durataMesi;
	
	/* FETCH: siccome voglio poter accedere al Docente relativo al corso, la strategia di default
	 * 		  di tipo EAGER risulta essere ottimale.
	 * 
	 * CASCADE: non ritengo che sia necessario/conveniente propagare le azioni fatte sul Corso ai suoi genitori
	 * */
	@ManyToOne
	private Docente docente;
	
	/* FETCH: siccome risulta sconveninte dover caricare tutte le occorrenze di allievi, la strategia di default
	 * 		  di tipo LAZY risulta essere ottimale.
	 * 
	 * CASCADE: non ritengo che sia necessario/conveninte propagare le azioni fatte sul Corso ai suoi genitori
	 * */
	@ManyToMany(mappedBy = "corsi")
	private List<Allievo> allievi;
	
	public Corso() {
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(LocalDate dataInizio) {
		this.dataInizio = dataInizio;
	}

	public int getDurata() {
		return durataMesi;
	}

	public void setDurata(int durata) {
		this.durataMesi = durata;
	}

	public List<Allievo> getAllievi() {
		return allievi;
	}

	public void setAllievi(List<Allievo> allievi) {
		this.allievi = allievi;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

}
