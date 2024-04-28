class Carros extends Veiculos {
   private int num_Portas;

    public int getNum_Portas() {
        return num_Portas;
    }
    public Carros(String marca, String modelo, int ano, int num_Portas) {
        super(marca, modelo, ano);
        this.num_Portas = num_Portas;
    }

    public void setNum_Portas(int num_Portas) {
        this.num_Portas = num_Portas;
    }
}

