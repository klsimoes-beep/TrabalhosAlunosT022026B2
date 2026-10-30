package fag.objetos;

import java.util.Calendar;
import java.util.Date;

public class Livro {

	private static final int PRAZO_DIAS = 7;

	private String titulo;
	private String autor;
	private String genero;
	private Date dataEmprestimo;

	public Livro() {
	}

	public Livro(String titulo, String autor, String genero) {
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public Date getDataPrevistaDevolucao() {
		if (dataEmprestimo == null) {
			return null;
		}
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(dataEmprestimo);
		calendario.add(Calendar.DAY_OF_MONTH, PRAZO_DIAS);
		return calendario.getTime();
	}

	public String validarDisponibilidade() {
		if (dataEmprestimo == null) {
			return "Disponível";
		}
		return "Emprestado";
	}

}
