package inf319.exercise05;

import java.util.Set;

public class AssocObjectMain {

    public static void main(String[] args) {
        // Cria o objeto que representa a associação
        ContratosDeTrabalho contratos = new ContratosDeTrabalho();

        // Cria algumas pessoas
        Pessoa p1 = new Pessoa("João", "Silva");
        Pessoa p2 = new Pessoa("Maria", "Santos");
        Pessoa p3 = new Pessoa("Pedro", "Gomes");

        // Associa as pessoas ao objeto de associação
        p1.setContratos(contratos);
        p2.setContratos(contratos);
        p3.setContratos(contratos);

        // Cria algumas companhias
        Companhia c1 = new Companhia("Google");
        Companhia c2 = new Companhia("Microsoft");

        // Associa as companhias ao objeto de associação
        c1.setContratos(contratos);
        c2.setContratos(contratos);

        // Contratações
        System.out.println("--- Contratações ---");
        c1.emprega(p1, 10000.00);
        c1.emprega(p2, 12000.00);
        c2.emprega(p1, 15000.00); // João em duas companhias
        c2.emprega(p3, 9000.00);

        // Tenta empregar novamente quem já está empregado
        c1.emprega(p1, 11000.00);

        System.out.println("\n--- Status Pós-Contratações ---");
        System.out.println("Custo total da " + c1.getNome() + ": " + c1.custoTotal());
        System.out.println("Custo total da " + c2.getNome() + ": " + c2.custoTotal());

        System.out.println("Salário total de " + p1.getName() + ": " + p1.getSalarioTotal());
        System.out.println("Salário total de " + p2.getName() + ": " + p2.getSalarioTotal());
        System.out.println("Salário total de " + p3.getName() + ": " + p3.getSalarioTotal());

        System.out.println("Empregos de " + p1.getName() + ": " + p1.getEmpregos());

        System.out.println(c1.getNome() + " tem " + c1.getNumeroEmpregados() + " empregados.");
        System.out.println(p2.getName() + " é empregado da " + c1.getNome() + "? " + c1.isEmpregado(p2));
        System.out.println(p3.getName() + " é empregado da " + c1.getNome() + "? " + c1.isEmpregado(p3));

        // Demissões
        System.out.println("\n--- Demissões ---");
        System.out.println("Demite " + p2.getName() + " da " + c1.getNome());
        c1.demite(p2);

        System.out.println("\n--- Status Pós-Demissões ---");
        System.out.println("Custo total da " + c1.getNome() + ": " + c1.custoTotal());
        System.out.println(c1.getNome() + " tem " + c1.getNumeroEmpregados() + " empregados.");
        System.out.println(p2.getName() + " é empregado da " + c1.getNome() + "? " + c1.isEmpregado(p2));
        System.out.println("Salário total de " + p2.getName() + ": " + p2.getSalarioTotal());

        System.out.println("Empregos de " + p1.getName() + ": " + p1.getEmpregos());
    }
}