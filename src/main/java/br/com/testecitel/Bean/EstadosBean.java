package br.com.testecitel.Bean;

import com.testecitel.api.model.Estado;

public class EstadosBean {
	
	private int ac;
	private int al;
	private int ap;
	private int am;
	private int ba;
	private int ce;
	private int es;
	private int go;
	private int ma;
	private int mt;
	private int ms;
	private int mg;
	private int pa;
	private int pb;
	private int pr;
	private int pe;
	private int pi;
	private int rj;
	private int rn;
	private int rs;
	private int ro;
	private int rr;
	private int sc;
	private int sp;
	private int se;
	private int to;
	private int df;
	
	
	public EstadosBean() {
	
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


	public int getTo() {
		return to;
	}


	public void setTo(int to) {
		this.to = to;
	}


	public int getDf() {
		return df;
	}


	public void setDf(int df) {
		this.df = df;
	}
	
	
	
	public static Estado adicionarCandidato(Estado estados, String estadoCandidato){
		if (estadoCandidato.equalsIgnoreCase("ac")) {
			estados.setAc(estados.getAc() + 1);
		}else if(estadoCandidato.equalsIgnoreCase("al")) {
			estados.setAl(estados.getAl() + 1);
		}else if(estadoCandidato.equalsIgnoreCase("ap")) {
			estados.setAp(estados.getAp() + 1);
		}else if(estadoCandidato.equalsIgnoreCase("am")) {
			estados.setAm(estados.getAm() + 1);
		}else if(estadoCandidato.equalsIgnoreCase("ba")) {
			estados.setBa(estados.getBa() + 1);
		}else if(estadoCandidato.equalsIgnoreCase("ce")) {
			estados.setCe(estados.getCe() + 1);
		}else if(estadoCandidato.equalsIgnoreCase("es")) {
			estados.setEs(estados.getEs() + 1);
		}else if(estadoCandidato.equalsIgnoreCase("go")) {
			estados.setGo(estados.getGo() + 1);
		}else if(estadoCandidato.equalsIgnoreCase("ma")) {
			estados.setMa(estados.getMa() + 1);
		}else if(estadoCandidato.equalsIgnoreCase("mt")) {
			estados.setMt(estados.getMt() + 1);
		}else if(estadoCandidato.equalsIgnoreCase("ms")) {
			estados.setMs(estados.getMs() + 1);
		}else if(estadoCandidato.equalsIgnoreCase("mg")) {
			estados.setMg(estados.getMg() + 1);
		}else if(estadoCandidato.equalsIgnoreCase("pa")) {
			estados.setPa(estados.getPa() + 1);
		}else if(estadoCandidato.equalsIgnoreCase("pb")) {
			estados.setPb(estados.getPb() + 1);
		}else if(estadoCandidato.equalsIgnoreCase("pr")) {
			estados.setPr(estados.getPr() + 1);
		}else if(estadoCandidato.equalsIgnoreCase("pe")) {
			estados.setPe(estados.getPe() + 1);
		}else if(estadoCandidato.equalsIgnoreCase("pi")) {
			estados.setPi(estados.getPi() + 1);
		}else if(estadoCandidato.equalsIgnoreCase("rj")) {
			estados.setRj(estados.getRj() + 1);
		}else if(estadoCandidato.equalsIgnoreCase("rn")) {
			estados.setRn(estados.getRn() + 1);
		}else if(estadoCandidato.equalsIgnoreCase("rs")) {
			estados.setRs(estados.getRs() + 1);
		}else if(estadoCandidato.equalsIgnoreCase("ro")) {
			estados.setRo(estados.getRo() + 1);
		}else if(estadoCandidato.equalsIgnoreCase("rr")) {
			estados.setRr(estados.getRr() + 1);
		}else if(estadoCandidato.equalsIgnoreCase("sc")) {
			estados.setSc(estados.getSc() + 1);
		}else if(estadoCandidato.equalsIgnoreCase("se")) {
			estados.setSe(estados.getSe() + 1);
		}else if(estadoCandidato.equalsIgnoreCase("to")) {
			estados.setToo(estados.getToo() + 1);
		}else {
			estados.setDf(estados.getDf() + 1);
		}
		return estados;
	}
	
	
	
	
	

}
