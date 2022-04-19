package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Docente {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false)
	private String partitaIva;
	
	private LocalDate dataNascita;
	
	private String luogoNascita;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String cognome;
	
	/* FETCH: ritengo che siccome quando si effettua l'accesso all'entita Docente puo risultare utile accedere ai suoi corsi,
	 * si possa modificare il tipo di tech da quello di dafault (LAZY) a EAGER.
	 * 
	 * CASCADE: non ritengo che sia necessario/conveninte propagare le azioni fatte sul Docente ai suoi genitori
	 * */
	
	@OneToMany (mappedBy = "docente", fetch = FetchType.EAGER)
	private List<Corso> corsi;
	
	public Docente() {
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

	public String getPartitaIva() {
		return partitaIva;
	}

	public void setPartitaIva(String partitaIva) {
		this.partitaIva = partitaIva;
	}

	public List<Corso> getInsegnamenti() {
		return corsi;
	}

	public void setInsegnamenti(List<Corso> insegnamenti) {
		this.corsi = insegnamenti;
	}
}
