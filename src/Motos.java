class Motos extends Veiculos {
    private int cilindrada;

    public int getCilindrada() {
        return cilindrada;
    }

    public Motos(String marca, String modelo, int ano, int cilindrada) {
        super(marca, modelo, ano);
        this.cilindrada = cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
