package org.example.projectavaliacao;

public class Especial extends Conta{

    private Double limite;

    public Especial(Integer numero, String titular, Double limite) {
        super(numero, titular);
        this.limite = limite;
    }


    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    @Override
    public Boolean sacar(Double valor) {
        if(valor <= (this.getSaldo() + this.limite)){
            this.setSaldo(this.getSaldo() - valor);
            return true;
        }else {
            return  false;
        }
        }

    @Override
    public String toString() {
        return "numero= " + this.getNumero() +
                ", titular= " + this.getTitular() +
                 ", limite= " + limite +
                ", saldo= " + this.getSaldo() + System.lineSeparator();
    }
}



