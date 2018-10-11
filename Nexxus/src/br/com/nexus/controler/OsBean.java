package br.com.nexus.controler;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import br.com.nexus.DAO.OsDAO;
import br.com.nexus.model.Os;

@ManagedBean
@ViewScoped
public class OsBean extends Bean {
	
	private static final long serialVersionUID = 1L;
	
	private Os os = new Os();
	private List<Os> oss;
	private Os osPesquisa;
	private Os selectOs;
	
	@Inject 
	OsDAO osDAO;
	
	public void init(){
		osPesquisa = new Os();

	}
	
	
	public void adicionaOs() {
		this.os.setId(null);
		osDAO.save(this.os);
		this.os = new Os();
		
	}
	
	public void alterarOs() {
		osDAO.alterarOs(selectOs);
		this.selectOs = new Os();
	}
	
				
	
	
	public Os getOsPesquisa() {
		return osPesquisa;
	}


	public void setOsPesquisa(Os osPesquisa) {
		this.osPesquisa = osPesquisa;
	}


	public Os getSelectOs() {
		return selectOs;
	}


	public void setSelectOs(Os selectOs) {
		this.selectOs = selectOs;
	}


	public void setOss(List<Os> oss) {
		this.oss = oss;
	}


	public List<Os> getOss() {
		if(oss == null){
			oss = (List<Os>) osDAO.getAll(Os.class);
		}	
		return oss;
	}

	public Os getOs() {
		return os;
	}

	public void setOs(Os os) {
		this.os = os;
	}
	
	

}
