public class Chacara extends Imovel{
   
    private Boolean possuiPocoArtesianoBoolean;

   
    public Chacara(Municipio municipio, Double areaM2, Integer vagas, Boolean possuiPocoArtesianoBoolean) {
        super(municipio, areaM2, vagas);
        this.possuiPocoArtesianoBoolean = possuiPocoArtesianoBoolean;
    }

   
    public Boolean getPossuiPocoArtesianoBoolean() {
        return this.possuiPocoArtesianoBoolean;
    }

    public void setPossuiPocoArtesianoBoolean(Boolean possuiPocoArtesianoBoolean) {
        this.possuiPocoArtesianoBoolean = possuiPocoArtesianoBoolean;
    }

}

