package com.distribuida.entities;

import java.util.Date;

import org.springframework.stereotype.Component;
@Component
public class Factura {
	private int idFactura;
	private String numFactura;
	private Date fecha;
	private double totalNeto;
	private double iva;
	private double total;
	//private int idCliente;
	
	private Cliente cliente;
	
	public Factura() {
		
	}
	
	
	public Factura(int idFactura, String numFactura, Date fecha, Double totalneto, Double iva, Double total,
			int idCliente) {
		
		this.idFactura = idFactura;
		this.numFactura = numFactura;
		this.fecha = fecha;
		this.totalNeto = totalneto;
		this.iva = iva;
		this.total = total;
		//this.idCliente = idCliente;
	}
	public int getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}
	public String getNumFactura() {
		return numFactura;
	}
	public void setNumFactura(String numFactura) {
		this.numFactura = numFactura;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Double getTotalNeto() {
		return totalNeto;
	}
	public void setTotalNeto(Double totalneto) {
		this.totalNeto = totalneto;
	}
	public Double getIva() {
		return iva;
	}
	public void setIva(Double iva) {
		this.iva = iva;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}

	
	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	@Override
	public String toString() {
		return "Factura [idFactura=" + idFactura + ", numFactura=" + numFactura + ", fecha=" + fecha + ", totalNeto="
				+ totalNeto + ", iva=" + iva + ", total=" + total + ", cliente=" + cliente + "]";
	}

}