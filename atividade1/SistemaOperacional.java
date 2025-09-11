package atividade1;
public class SistemaOperacional {
    private Computador computador;

    public SistemaOperacional(Computador computador) {
        this.computador = computador;
    }

    public void executarPrograma(Programa programa) {

        if (programa.getSSDOcupado() > computador.getSSD()) {
            System.out.println("Erro: Armazenamento SSD insuficiente para instalar o programa.");
            return;
        }
        if (programa.getMemoriaRAMAlocada() > computador.getMemoriaRAM()) {
            System.out.println("Erro: Memória RAM insuficiente para executar o programa.");
            return;
        }

        Float tempoExecucao = (float) programa.getQuantidadeOperacoes() /
                (computador.getOperacoesPorSegundo() * computador.getNucleos());

        System.out.println("Programa executado com sucesso!");
        System.out.printf("Tempo de execução: %.2f segundos%n", tempoExecucao);
    }

    public Computador getComputador() {
        return computador;
    }

    public void setComputador(Computador computador) {
        this.computador = computador;
    }
}
