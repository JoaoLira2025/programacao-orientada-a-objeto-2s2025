package sistema_radar;

public class Simulacao {
    public static void main(String[] args) {
        System.out.println("Simulação");
        Carro monza = new Carro ("PFXX433", "Assalt", 1982, 0);
        //monza.ano = 1982;
        //monza.modelo = "Assalt";
       // monza.placa = "PFXX433";
        //monza.velocidade = 0;

        Radar radar = new Radar(60, "Pistao Sul");
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
