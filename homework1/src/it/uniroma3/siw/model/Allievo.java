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
public class Allievo {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long matricola;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String cognome;
	
	private LocalDate dataNascita;
	
	private String luogoNascita;
	
	@Column(nullable = false)
	private String email;
	
	/* FETCH: siccome risulta sconveninte dover caricare tutte le occorrenze di corsi, la strategia di default
	 * 		  di tipo LAZY risulta essere ottimale.
	 * 
	 * CASCADE: non ritengo che sia necessario/conveninte propagare le azioni fatte sull'Allievo ai suoi genitori
	 * */
	@ManyToMany
	private List<Corso> corsi;
	
	/* FETCH: siccome voglio poter accedere alla Societa relativa all'Allievo, la strategia di default
	 * 		  di tipo EAGER risulta essere ottimale.
	 * 
	 * CASCADE: non ritengo che sia necessario/conveninte propagare le azioni fatte sull'Allievo ai suoi genitori
	 * */
	@ManyToOne
	private Societa societa;
	
	public Allievo() {
		
	}
	
	public Long getMatricola() {
		return matricola;
	}

	public void setMatricola(Long matricola) {
		this.matricola = matricola;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getLuogoNascita() {
		return luogoNascita;
	}

	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}

	public LocalDate getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Societa getSocieta() {
		return societa;
	}

	public void setSocieta(Societa societa) {
		this.societa = societa;
	}

	public List<Corso> getCorsi() {
		return corsi;
	}

	public void setCorsi(List<Corso> corsi) {
		this.corsi = corsi;
	}
	
}
