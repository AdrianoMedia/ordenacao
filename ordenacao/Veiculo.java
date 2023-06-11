package ordenacao;

public class Veiculo implements Comparable<Veiculo> {
    private String placa;
    private String modelo;
    private int ano;
    private String nome;

    public Veiculo(String placa, String modelo, int ano, String nome) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.nome = nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "Veiculo{" + 
                "placa=" + placa + ", modelo=" + modelo +
                ", ano=" + ano + ", nome" + nome + "}";
    }

    @Override
    public int compareTo(Veiculo outroVeiculo) {
        return this.placa.compareTo(outroVeiculo.getPlaca());
    }
}
