package it.uniroma3.siw.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Societa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String ragioneSociale;
	
	/* FETCH: siccome voglio poter accedere all'Indirizzo relativo alla Societa, la strategia di default
	 * 		  di tipo EAGER risulta essere ottimale.
	 * 
	 * CASCADE: non ritengo che sia necessario/conveninte propagare le azioni fatte sull'Allievo ai suoi genitori
	 * */
	@OneToOne
	private Indirizzo indirizzo;
	
	private String telefono;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
