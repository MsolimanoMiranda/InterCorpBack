package com.msolimano.IntercorpBack.Entity;
import java.math.BigDecimal;


public class KpiCliente {

	
	private BigDecimal media;
	private BigDecimal desviacion;
	
	public KpiCliente() {
		
	}


	public KpiCliente(BigDecimal media, BigDecimal desviacion) {
	
		this.media = media;
		this.desviacion = desviacion;
		
	}


	public BigDecimal getMedia() {
		return media;
	}


	public void setMedia(BigDecimal media) {
		this.media = media;
	}


	public BigDecimal getDesviacion() {
		return desviacion;
	}


	public void setDesviacion(BigDecimal desviacion) {
		this.desviacion = desviacion;
	}



	
	
	
	
	
}
