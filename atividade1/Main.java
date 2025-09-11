package atividade1;

public class Main {
    public static void main(String[] args) {
        Computador Pc = new Computador(16, 500, 4, 2.5f);
        SistemaOperacional SistemaOpe = new SistemaOperacional(Pc);

        Programa prog1 = new Programa(8, 100, 2, 4000);   
        Programa prog2 = new Programa(4, 600, 2, 7000);    
        Programa prog3 = new Programa(32, 100, 2, 40000);  

        System.out.println(" Programa 1:");
        SistemaOpe.executarPrograma(prog1);

        System.out.println("\nPrograma 2:");
        SistemaOpe.executarPrograma(prog2);

        System.out.println("\nPrograma 3:");
        SistemaOpe.executarPrograma(prog3);
    }
}
