package com.testecitel.api.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "resultado")
public class Resultado implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "idresultado")
	private Integer idresultado;
	@Column(name = "mediaimc10")
	private float mediaimc10;
	@Column(name = "mediaimc20")
	private float mediaimc20;
	@Column(name = "mediaimc30")
	private float mediaimc30;
	@Column(name = "mediaimcmais")
	private float mediaimcmais;
	@Column(name = "idadeamais")
	private int idadeamais;
	@Column(name = "idadeamenos")
	private int idadeamenos;
	@Column(name = "idadebmais")
	private int idadebmais;
	@Column(name = "idadebmenos")
	private int idadebmenos;
	@Column(name = "idadeabmais")
	private int idadeabmais;
	@Column(name = "idadeabmenos")
	private int idadeabmenos;
	@Column(name = "idadeomais")
	private int idadeomais;
	@Column(name = "idadeomenos")
	private int idadeomenos;
	@Column(name = "ndoadoramais")
	private int ndoadoramais;
	@Column(name = "ndoadoramenos")
	private int ndoadoramenos;
	@Column(name = "ndoadorbmais")
	private int ndoadorbmais;
	@Column(name = "ndoadorbmenos")
	private int ndoadorbmenos;
	@Column(name = "ndoadorabmais")
	private int ndoadorabmais;
	@Column(name = "ndoadorabmenos")
	private int ndoadorabmenos;
	@Column(name = "ndoadoromais")
	private int ndoadoromais;
	@Column(name = "ndoadoromenos")
	private int ndoadoromenos;
	@JoinColumn(name = "estado_idestado", referencedColumnName = "idestado")
	@ManyToOne(optional = false)
	private Estado estados;
	
	
	
	public Resultado() {
	
	}
	
	



	public void setIdresultado(Integer idresultado) {
		this.idresultado = idresultado;
	}





	public int getIdresultado() {
		return idresultado;
	}



	public void setIdresultado(int idresultado) {
		this.idresultado = idresultado;
	}



	public float getMediaimc10() {
		return mediaimc10;
	}



	public void setMediaimc10(float mediaimc10) {
		this.mediaimc10 = mediaimc10;
	}



	public float getMediaimc20() {
		return mediaimc20;
	}



	public void setMediaimc20(float mediaimc20) {
		this.mediaimc20 = mediaimc20;
	}



	public float getMediaimc30() {
		return mediaimc30;
	}



	public void setMediaimc30(float mediaimc30) {
		this.mediaimc30 = mediaimc30;
	}



	public float getMediaimcmais() {
		return mediaimcmais;
	}



	public void setMediaimcmais(float mediaimcmais) {
		this.mediaimcmais = mediaimcmais;
	}



	public int getIdadeamais() {
		return idadeamais;
	}



	public void setIdadeamais(int idadeamais) {
		this.idadeamais = idadeamais;
	}



	public int getIdadeamenos() {
		return idadeamenos;
	}



	public void setIdadeamenos(int idadeamenos) {
		this.idadeamenos = idadeamenos;
	}



	public int getIdadebmais() {
		return idadebmais;
	}



	public void setIdadebmais(int idadebmais) {
		this.idadebmais = idadebmais;
	}



	public int getIdadebmenos() {
		return idadebmenos;
	}



	public void setIdadebmenos(int idadebmenos) {
		this.idadebmenos = idadebmenos;
	}



	public int getIdadeabmais() {
		return idadeabmais;
	}



	public void setIdadeabmais(int idadeabmais) {
		this.idadeabmais = idadeabmais;
	}



	public int getIdadeabmenos() {
		return idadeabmenos;
	}



	public void setIdadeabmenos(int idadeabmenos) {
		this.idadeabmenos = idadeabmenos;
	}



	public int getIdadeomais() {
		return idadeomais;
	}



	public void setIdadeomais(int idadeomais) {
		this.idadeomais = idadeomais;
	}



	public int getIdadeomenos() {
		return idadeomenos;
	}



	public void setIdadeomenos(int idadeomenos) {
		this.idadeomenos = idadeomenos;
	}



	public int getNdoadoramais() {
		return ndoadoramais;
	}



	public void setNdoadoramais(int ndoadoramais) {
		this.ndoadoramais = ndoadoramais;
	}



	public int getNdoadoramenos() {
		return ndoadoramenos;
	}



	public void setNdoadoramenos(int ndoadoramenos) {
		this.ndoadoramenos = ndoadoramenos;
	}



	public int getNdoadorbmais() {
		return ndoadorbmais;
	}



	public void setNdoadorbmais(int ndoadorbmais) {
		this.ndoadorbmais = ndoadorbmais;
	}



	public int getNdoadorbmenos() {
		return ndoadorbmenos;
	}



	public void setNdoadorbmenos(int ndoadorbmenos) {
		this.ndoadorbmenos = ndoadorbmenos;
	}



	public int getNdoadorabmais() {
		return ndoadorabmais;
	}



	public void setNdoadorabmais(int ndoadorabmais) {
		this.ndoadorabmais = ndoadorabmais;
	}



	public int getNdoadorabmenos() {
		return ndoadorabmenos;
	}



	public void setNdoadorabmenos(int ndoadorabmenos) {
		this.ndoadorabmenos = ndoadorabmenos;
	}



	public int getNdoadoromais() {
		return ndoadoromais;
	}



	public void setNdoadoromais(int ndoadoromais) {
		this.ndoadoromais = ndoadoromais;
	}



	public int getNdoadoromenos() {
		return ndoadoromenos;
	}



	public void setNdoadoromenos(int ndoadoromenos) {
		this.ndoadoromenos = ndoadoromenos;
	}



	public Estado getEstados() {
		return estados;
	}



	public void setEstados(Estado estados) {
		this.estados = estados;
	}
	
	
	
	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idresultado != null ? idresultado.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		//
		if (!(object instanceof Resultado)) {
			return false;
		}
		Resultado other = (Resultado) object;
		if ((this.idresultado == null && other.idresultado != null)
				|| (this.idresultado != null && !this.idresultado.equals(other.idresultado))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "br.com.testecitel.model.Resultado[ idresultado=" + idresultado + " ]";
	}
	
	
	
	

}
