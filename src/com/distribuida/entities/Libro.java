package com.distribuida.entities;

import java.util.Date;

public class Libro {
    private int idLibro;
    private String titulo;
    private String editorial;
    private int numPaginas;
    private String edicion;
    private String idioma;
    private Date fechaDePublicacion;
    private String descripcion;
    private String tipoDePasta;
    private String isbn;
    private int numEjemplares;
    private String portada;
    private String presentacion;
    private double precio;
    //private int idCategoria;
    //private int idAutor;
    
    private Categoria categoria;
    private Autor autor;
    
	public Libro() {
		
	}

	public Libro(int idLibro, String titulo, String editorial, int numPaginas, String edicion, String idioma,
			Date fechaDePublicacion, String descripcion, String tipoDePasta, String isbn, int numEjemplares,
			String portada, String presentacion, double precio, int idCategoria, int idAutor) {
	
		this.idLibro = idLibro;
		this.titulo = titulo;
		this.editorial = editorial;
		this.numPaginas = numPaginas;
		this.edicion = edicion;
		this.idioma = idioma;
		this.fechaDePublicacion = fechaDePublicacion;
		this.descripcion = descripcion;
		this.tipoDePasta = tipoDePasta;
		this.isbn = isbn;
		this.numEjemplares = numEjemplares;
		this.portada = portada;
		this.presentacion = presentacion;
		this.precio = precio;
		//this.idCategoria = idCategoria;
		//this.idAutor = idAutor;
	}

	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public Date getFechaDePublicacion() {
		return fechaDePublicacion;
	}

	public void setFechaDePublicacion(Date fechaDePublicacion) {
		this.fechaDePublicacion = fechaDePublicacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipoDePasta() {
		return tipoDePasta;
	}

	public void setTipoDePasta(String tipoDePasta) {
		this.tipoDePasta = tipoDePasta;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getNumEjemplares() {
		return numEjemplares;
	}

	public void setNumEjemplares(int numEjemplares) {
		this.numEjemplares = numEjemplares;
	}

	public String getPortada() {
		return portada;
	}

	public void setPortada(String portada) {
		this.portada = portada;
	}

	public String getPresentacion() {
		return presentacion;
	}

	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Libro [idLibro=" + idLibro + ", titulo=" + titulo + ", editorial=" + editorial + ", numPaginas="
				+ numPaginas + ", edicion=" + edicion + ", idioma=" + idioma + ", fechaDePublicacion="
				+ fechaDePublicacion + ", descripcion=" + descripcion + ", tipoDePasta=" + tipoDePasta + ", isbn="
				+ isbn + ", numEjemplares=" + numEjemplares + ", portada=" + portada + ", presentacion=" + presentacion
				+ ", precio=" + precio + ", categoria=" + categoria + ", autor=" + autor + "]";
	}

	
}
