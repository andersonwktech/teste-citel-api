package com.testecitel.api.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "estado")
public class Estado implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "idestado")
	private Integer idestado;
	@Column(name = "ac")
	private int ac;
	@Column(name = "al")
	private int al;
	@Column(name = "ap")
	private int ap;
	@Column(name = "am")
	private int am;
	@Column(name = "ba")
	private int ba;
	@Column(name = "ce")
	private int ce;
	@Column(name = "es")
	private int es;
	@Column(name = "go")
	private int go;
	@Column(name = "ma")
	private int ma;
	@Column(name = "mt")
	private int mt;
	@Column(name = "ms")
	private int ms;
	@Column(name = "mg")
	private int mg;
	@Column(name = "pa")
	private int pa;
	@Column(name = "pb")
	private int pb;
	@Column(name = "pr")
	private int pr;
	@Column(name = "pe")
	private int pe;
	@Column(name = "pi")
	private int pi;
	@Column(name = "rj")
	private int rj;
	@Column(name = "rn")
	private int rn;
	@Column(name = "rs")
	private int rs;
	@Column(name = "ro")
	private int ro;
	@Column(name = "rr")
	private int rr;
	@Column(name = "sc")
	private int sc;
	@Column(name = "sp")
	private int sp;
	@Column(name = "se")
	private int se;
	@Column(name = "too")
	private int too;
	@Column(name = "df")
	private int df;
	
	
	public Estado() {
	
	}


	public int getAc() {
		return ac;
	}


	public void setAc(int ac) {
		this.ac = ac;
	}


	public int getAl() {
		return al;
	}


	public void setAl(int al) {
		this.al = al;
	}


	public int getAp() {
		return ap;
	}


	public void setAp(int ap) {
		this.ap = ap;
	}


	public int getAm() {
		return am;
	}


	public void setAm(int am) {
		this.am = am;
	}


	public int getBa() {
		return ba;
	}


	public void setBa(int ba) {
		this.ba = ba;
	}


	public int getCe() {
		return ce;
	}


	public void setCe(int ce) {
		this.ce = ce;
	}


	public int getEs() {
		return es;
	}


	public void setEs(int es) {
		this.es = es;
	}


	public int getGo() {
		return go;
	}


	public void setGo(int go) {
		this.go = go;
	}


	public int getMa() {
		return ma;
	}


	public void setMa(int ma) {
		this.ma = ma;
	}


	public int getMt() {
		return mt;
	}


	public void setMt(int mt) {
		this.mt = mt;
	}


	public int getMs() {
		return ms;
	}


	public void setMs(int ms) {
		this.ms = ms;
	}


	public int getMg() {
		return mg;
	}


	public void setMg(int mg) {
		this.mg = mg;
	}


	public int getPa() {
		return pa;
	}


	public void setPa(int pa) {
		this.pa = pa;
	}


	public int getPb() {
		return pb;
	}


	public void setPb(int pb) {
		this.pb = pb;
	}


	public int getPr() {
		return pr;
	}


	public void setPr(int pr) {
		this.pr = pr;
	}


	public int getPe() {
		return pe;
	}


	public void setPe(int pe) {
		this.pe = pe;
	}


	public int getPi() {
		return pi;
	}


	public void setPi(int pi) {
		this.pi = pi;
	}


	public int getRj() {
		return rj;
	}


	public void setRj(int rj) {
		this.rj = rj;
	}


	public int getRn() {
		return rn;
	}


	public void setRn(int rn) {
		this.rn = rn;
	}


	public int getRs() {
		return rs;
	}


	public void setRs(int rs) {
		this.rs = rs;
	}


	public int getRo() {
		return ro;
	}


	public void setRo(int ro) {
		this.ro = ro;
	}


	public int getRr() {
		return rr;
	}


	public void setRr(int rr) {
		this.rr = rr;
	}


	public int getSc() {
		return sc;
	}


	public void setSc(int sc) {
		this.sc = sc;
	}


	public int getSp() {
		return sp;
	}


	public void setSp(int sp) {
		this.sp = sp;
	}


	public int getSe() {
		return se;
	}


	public void setSe(int se) {
		this.se = se;
	}




	public int getToo() {
		return too;
	}


	public void setToo(int too) {
		this.too = too;
	}


	public int getDf() {
		return df;
	}


	public void setDf(int df) {
		this.df = df;
	}
	

	
	public Integer getIdestado() {
		return idestado;
	}


	public void setIdestado(Integer idestado) {
		this.idestado = idestado;
	}


	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idestado != null ? idestado.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		//
		if (!(object instanceof Estado)) {
			return false;
		}
		Estado other = (Estado) object;
		if ((this.idestado == null && other.idestado != null)
				|| (this.idestado != null && !this.idestado.equals(other.idestado))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "br.com.testecitel.model.Estado[ idestado=" + idestado + " ]";
	}

	
	
	
	
	

}
