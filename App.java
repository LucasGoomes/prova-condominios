/*
 * Autor: Lucas Gomes do Nascimento
 * 
 * Fundamentos de Programação - Turma 012
 */
import java.util.Scanner;
public class App{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);    
        char controle = 's';
        
        do{
           Condominio vilaVerde = new Condominio("Condominio Vila Verde", "Av. Assis Brasil, 500"); 
           vilaVerde.addApartamento("José Carlos", 24);
           vilaVerde.addApartamento("Maria Vicentina", 25);
           vilaVerde.addApartamento("Edir Silveira", 26);
           vilaVerde.addApartamento("Joao Silva", 27);
           vilaVerde.addApartamento("Gohan Reis", 28);
           vilaVerde.addApartamento("Carlos Alberto", 29);
           vilaVerde.addApartamento("Jorge Alberto", 30);
           vilaVerde.addApartamento("Julia Gonçalves", 31);
           vilaVerde.addApartamento("Joao Pedro", 32);
           vilaVerde.addApartamento("Carla Beatriz", 33);
           
           System.out.println("Olá! Digite o nome do morador para encontrarmos seu respectivo apartamento: ");
           String nomeMorador = sc.nextLine();
           int numeroApartamento = vilaVerde.moradorResponsavel(nomeMorador);
           if(numeroApartamento == 0){
               System.out.println("Morador não encontrado! Deseja tentar novamente? s/n");
               controle = sc.next().charAt(0);
               String vazio = sc.nextLine();
           }else{
               System.out.println("O morador " + nomeMorador + " é responsável pelo apartamento número " + numeroApartamento);
               System.out.println("Deseja fazer uma nova busca? s/n");
               controle = sc.next().charAt(0);
               String vazio = sc.nextLine();
           }
        }while(controle == 's' || controle == 'S');
    }
}
