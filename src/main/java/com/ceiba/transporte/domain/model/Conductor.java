package com.ceiba.transporte.domain.model;

public class Conductor {

	
	private int idConductor;	
	private String cedulaCond;
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	private int celularCond;
	private boolean disponibleCond;
	
	
	
	public Conductor(int idConductor, String cedulaCond, String primerNombre, String segundoNombre,
			String primerApellido, String segundoApellido, int celularCond, boolean disponibleCond) {
		super();
		this.idConductor = idConductor;
		this.cedulaCond = cedulaCond;
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.celularCond = celularCond;
		this.disponibleCond = disponibleCond;
	}
	public int getIdConductor() {
		return idConductor;
	}
	public void setIdConductor(int idConductor) {
		this.idConductor = idConductor;
	}
	public String getCedulaCond() {
		return cedulaCond;
	}
	public void setCedulaCond(String cedulaCond) {
		this.cedulaCond = cedulaCond;
	}
	public String getPrimerNombre() {
		return primerNombre;
	}
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}
	public String getSegundoNombre() {
		return segundoNombre;
	}
	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	public int getCelularCond() {
		return celularCond;
	}
	public void setCelularCond(int celularCond) {
		this.celularCond = celularCond;
	}
	public boolean isDisponibleCond() {
		return disponibleCond;
	}
	public void setDisponibleCond(boolean disponibleCond) {
		this.disponibleCond = disponibleCond;
	}
	
	
	
	

}
