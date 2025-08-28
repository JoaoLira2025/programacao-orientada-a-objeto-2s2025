package sistema_radar;

public class Simulacao {
    public static void main(String[] args) {
        System.out.println("Simulação");
        Carro monza = new Carro ();
        monza.ano = 1982;
        monza.modelo = "Assalt";
        monza.placa = "PFXX433";
        monza.velocidade = 0;

        Radar radar = new Radar();
        radar.limiteVelocidade = 60;
        radar.localizacao = "Pistao Sul";
        radar.avaliarVelocidade(monza);
        
        monza.acelerar(); // 10
        monza.acelerar(); // 20
        monza.acelerar(); // 30
        monza.acelerar(); // 40
        monza.acelerar(); // 50
        monza.acelerar(); // 60 LIMITE
        monza.acelerar(); // 70 passou

        radar.avaliarVelocidade(monza);




    }
}
