package secao10.exercicio.composicao.carro;

import java.util.List;

public class Carro {
	private Motor motor;
	private List <Parafuso> parafuso;
	private List <Porta> porta;
	
	public Carro() {
		
	}

	public Carro(Motor motor, List<Parafuso> parafuso, List<Porta> porta) {
		this.motor = motor;
		this.parafuso = parafuso;
		this.porta = porta;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public List<Parafuso> getParafuso() {
		return parafuso;
	}

	public void setParafuso(List<Parafuso> parafuso) {
		this.parafuso = parafuso;
	}

	public List<Porta> getPorta() {
		return porta;
	}

	public void setPorta(List<Porta> porta) {
		this.porta = porta;
	}

	
	public String toString() {
		return "Carro [motor = " + motor + ", parafuso = " + parafuso + ", porta = " + porta + "]";
	}
	


}
