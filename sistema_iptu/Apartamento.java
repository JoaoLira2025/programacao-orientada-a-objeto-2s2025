public class Apartamento {
    private Municipio municipio;
    private Double areaM2;
    private Integer vagas;
    private Boolean possuiElevador;

    public Double calcularIPTU(){
        
            return this.areaM2 * this.municipio.getPrecoM2() * 1.005;
    }

    public Apartamento(Municipio municipio, Double areaM2, Integer vagas, Boolean possuiElevador) {
        this.municipio = municipio;
        this.areaM2 = areaM2;
        this.vagas = vagas;
        this.possuiElevador = possuiElevador;
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

    public Boolean isPossuiElevador() {
        return this.possuiElevador;
    }

    public Boolean getPossuiElevador() {
        return this.possuiElevador;
    }

    public void setPossuiElevador(Boolean possuiElevador) {
        this.possuiElevador = possuiElevador;
    }

}

