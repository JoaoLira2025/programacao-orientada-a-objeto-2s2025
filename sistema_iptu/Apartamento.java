

public class Apartamento extends Imovel{
    
    private Boolean possuiElevador;

    public Apartamento(Municipio municipio, Double areaM2, Integer vagas, Boolean possuiElevador) {
        super(municipio, areaM2, vagas);
        
    }

    public Boolean getPossuiElevador() {
        return this.possuiElevador;
    }

    public void setPossuiElevador(Boolean possuiElevador) {
        this.possuiElevador = possuiElevador;
    }

}

