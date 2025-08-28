package sistema_radar;

public class Radar {
    public Integer limiteVelocidade;
    public String localizacao;
public void avaliarVelocidade(Carro carro){
    if(carro.velocidade > this.limiteVelocidade)
    {
        //emitir notificação
        emitirNotificacao(carro.placa, carro.velocidade);
    }
}
    public void emitirNotificacao(String placa, Integer velocidadeObservada){
        System.out.print("Placa: "+ placa);
        System.out.println("\nVelocidade Observada: "+ velocidadeObservada);
        System.out.println("Limite da via: "+ this.limiteVelocidade);
    }

}
