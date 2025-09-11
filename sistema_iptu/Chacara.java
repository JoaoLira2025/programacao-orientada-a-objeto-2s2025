public class Chacara {
    private Municipio municipio;
    private Double areaM2;
    private Integer vagas;
    private Boolean possuiPocoArtesianoBoolean;

    public Double calcularIPTU(){
        
            return this.areaM2 * this.municipio.getPrecoM2();
    }

    public Chacara(Municipio municipio, Double areaM2, Integer vagas, Boolean possuiPocoArtesianoBoolean) {
        this.municipio = municipio;
        this.areaM2 = areaM2;
        this.vagas = vagas;
        this.possuiPocoArtesianoBoolean = possuiPocoArtesianoBoolean;
    }

    public Municipio getMunicipio() {
        return this.municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public Double getAreaM2() {
        return this.areaM2;
    }

    public void setAreaM2(Double areaM2) {
        this.areaM2 = areaM2;
    }

    public Integer getVagas() {
        return this.vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    public Boolean isPossuiPocoArtesianoBoolean() {
        return this.possuiPocoArtesianoBoolean;
    }

    public Boolean getPossuiPocoArtesianoBoolean() {
        return this.possuiPocoArtesianoBoolean;
    }

    public void setPossuiPocoArtesianoBoolean(Boolean possuiPocoArtesianoBoolean) {
        this.possuiPocoArtesianoBoolean = possuiPocoArtesianoBoolean;
    }

}
