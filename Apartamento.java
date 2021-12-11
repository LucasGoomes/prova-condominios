public class Apartamento{
    //Atributos
    private String moradorResponsavel;
    private int apartamento;
    
    //Construtor
    public Apartamento(String moradorResponsavel, int apartamento){
        this.moradorResponsavel = moradorResponsavel;
        this.apartamento = apartamento;
    }
    
    //Setter (somente do responsavel, pois o numero nao pode ser alterado)
    public void setMorador(String moradorResponsavel){
        this.moradorResponsavel = moradorResponsavel;
    }
    
    //Getters
    public String getMorador(){
        return this.moradorResponsavel;
    }
    public int getApartamento(){
        return this.apartamento;
    }
    
    //toString
    public String toString(){
        return "Apartamento: " + this.getApartamento() + " , morador responsável: " + this.getMorador();
    }
}
