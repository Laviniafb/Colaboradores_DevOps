import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Colaborador> colaboradores = new ArrayList<>();
        while (colaboradores.size() < 3){
            System.out.println("\n\nOlá Gisella, adicione um novo Colaborador:");

            System.out.println("Nome: ");
            Scanner scNome = new Scanner(System.in);
            String nome = scNome.nextLine();

            System.out.println("CPF: ");
            Scanner scCPF = new Scanner(System.in);
            String CPF = scCPF.nextLine();

            System.out.println("Telefone: ");
            Scanner scTel = new Scanner(System.in);
            Long tel =  scTel.nextLong();

            System.out.println("Data de Nascimento: ");
            Scanner scDataNasc = new Scanner(System.in);
            String dataNasc = scDataNasc.nextLine();

            System.out.println("Data de Agenda: ");
            Scanner scDataAgen = new Scanner(System.in);
            String dataAgen = scDataAgen.nextLine();

            System.out.println("Periodo(manha, tarde ou noite): ");
            Scanner scPeri = new Scanner(System.in);
            String periodo = scPeri.nextLine();

            Colaborador gise = new Colaborador(nome,CPF,tel,dataNasc,dataAgen,periodo);
            colaboradores.add(gise);
        }

        System.out.println("Colaboradores cadastrados:");
        for (Colaborador c : colaboradores) {
            System.out.println(c);
        }
    }
}
