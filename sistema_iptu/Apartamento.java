public class Apartamento {
    private Municipio municipio;
    private Double areaM2;
    private Integer vagas;
    private Boolean possuiElevador;

    public Double calcularIPTU(){
        if(this.possuiElevador){
            return this.areaM2 * this.municipio.getPrecoM2() *1.005;
        }
        else {
            return this.areaM2 * this.municipio.getPrecoM2();
    }
}
}
