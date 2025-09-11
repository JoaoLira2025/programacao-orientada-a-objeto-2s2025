
public class Municipio {
    private String nome;
    private String estado;
    private double precoM2;

    public Municipio (String nome, String estado, Double precoM2){
        this.nome = nome;
        this.estado = estado;
        this.precoM2 = precoM2;
    }
    public String getNome(){
        return this.nome;
    }


    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEstado(){
        return this.estado;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public double getPrecoM2(){
        return this.precoM2;
    }

    public void setEstado(Double precoM2){
        this.precoM2 = precoM2;
    }
}