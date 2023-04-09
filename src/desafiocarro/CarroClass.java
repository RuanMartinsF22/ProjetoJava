package desafiocarro;

public class CarroClass {

    private String marca;
    private String modelo;
    private int ano;
    private double combustivel;
    private double kmInicial;
    private double kmFinal;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    public double getKmInicial() {
        return kmInicial;
    }

    public void setKmInicial(double kmInicial) {
        this.kmInicial = kmInicial;
    }

    public double getKmFinal() {
        return kmFinal;
    }

    public void setKmFinal(double kmFinal) {
        this.kmFinal = kmFinal;
    }

    public void abastecer(double quantidade) {
        combustivel += quantidade;
    }

    public double calcularKmRodados() {
        return kmFinal - kmInicial;
    }

    public String detalhes() {
        return String.format("Novo carro adicionado: %s // %s // %d // %.2f litros de combustível // %.2f km rodados",
                marca, modelo, ano, combustivel, calcularKmRodados());
    }
}