package entities;

public class Conta {
    //conta, nome, saldo = varaaveis
	//saque, deposito
	
	private int numero;
	private String nome;
	private double saldo;
	
	//get = pegar
	//set = fazer
	
	public Conta(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	
	public Conta(int numero, String nome, double depositoInicial) {
		this.numero = numero;
	    this.nome = nome;
	}
	
	public int getNumero() {
		return numero;
	}	
		
	public String getNome() {
		return nome;
	}
		//this = objeto local
	public void setNumero(int numero) {
		this.numero = numero;
		
	}
    public void setNome(String nome) {
    	this.nome = nome;
    }
    	public double getSaldo() {
    		return saldo;
    	}
    
    
    	public void deposito(double valor) {
    		saldo += valor;
    	}	
     public void saque(double valor) {
    	 saldo -= valor + 5;
    	 
     }
    	 public String toString() {
    		 return "conta: "+numero + "nome"+ nome +"saldo: R$" + String.format("%.2f", saldo);
    		 
    	 }
    	 
    	}
    
    
	
	
		
		
		
		
	

