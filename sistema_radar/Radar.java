package sistema_radar;




public class Radar {
    public Integer limiteVelocidade;
    public String localizacao;


    public Radar (Integer limiteVelocidade, String localizacao)
    {
        this.limiteVelocidade = limiteVelocidade;
        this.localizacao = localizacao;
    
    }




public void avaliarVelocidade(Carro carro){
    if(carro.getVelocidade() > this.limiteVelocidade)
    {
        //emitir notificação
        emitirNotificacao(carro.placa, carro.getVelocidade());
    }
}
    public void emitirNotificacao(String placa, Integer velocidadeObservada){
        System.out.print("Placa: "+ placa);
        System.out.println("\nVelocidade Observada: "+ velocidadeObservada);
        System.out.println("Limite da via: "+ this.limiteVelocidade);
    }

   
   


}
