import java.util.ArrayList;
public class Condominio{
   //Atributos
   private String nomeDoCondominio;
   private String endereco;
   private int totalDeApartamentos = 0;
   private ArrayList<Apartamento> Lista = new ArrayList<Apartamento>();
   
   //Construtor
   public Condominio(String nomeDoCondominio, String endereco){
       this.nomeDoCondominio = nomeDoCondominio;
       this.endereco = endereco;
   }
   //Getters
   public String getNomeCondominio(){
       return this.nomeDoCondominio;
   }
   public String getEnderecoCondominio(){
       return this.endereco;
   }
   //Metodos
   public void addApartamento(String moradorResponsavel, int apartamento){
       Apartamento p = new Apartamento(moradorResponsavel, apartamento);
       Lista.add(p);
       totalDeApartamentos++;
   }
   public int moradorResponsavel(String moradorResponsavel){
       int apartamento = 0;//assume o apartamento como 0 (inexistente)
       for(Apartamento p : Lista){
           if(p.getMorador().equals(moradorResponsavel)){
               apartamento = p.getApartamento();    
           }
       }
       return apartamento;
   }
}
