package exercicio2;

import java.util.Date;

public class Cliente {
	public enum TipoCliente{ESTRANGEIRO, NACIONAL};
	public enum TipoDocumento{PASSPORT, CPF};
	private String name;
	private TipoDocumento typeDoc;
	private String Document;
	private Date dateRented;
	private TipoCliente type;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public TipoDocumento getTypeDoc() {
		return typeDoc;
	}
	public void setTypeDoc(TipoDocumento typeDoc) {
		this.typeDoc = typeDoc;
	}
	public String getDocument() {
		return Document;
	}
	public void setDocument(String document) {
		Document = document;
	}
	public Date getDateRented() {
		return dateRented;
	}
	public void setDateRented(Date dateRented) {
		this.dateRented = dateRented;
	}
	public TipoCliente getType() {
		return type;
	}
	public void setType(TipoCliente type) {
		this.type = type;
	}
}
