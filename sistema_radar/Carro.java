package sistema_radar;

public class Carro {
    public String placa;
    public String modelo;
    public Integer ano;
    public Integer velocidade;


    public void acelerar(){
        this.velocidade += 10;
    }
    public void frear (){
        if (this.velocidade > 0){
            this.velocidade -= 10;
        }
    }
}
