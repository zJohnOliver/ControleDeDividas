
package model;


public class Boletos {
    
    private String cnpj;
    private String dVencimento;
    private String empresa;
    private double vPagar;

    public String getdVencimento() {
        return dVencimento;
    }

    public void setdVencimento(String dVencimento) {
        this.dVencimento = dVencimento;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public double getvPagar() {
        return vPagar;
    }

    public void setvPagar(double vPagar) {
        this.vPagar = vPagar;
    }
    
}
