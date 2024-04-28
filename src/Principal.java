public class Principal {
    public static void main(String[] args) {

    Carros c1 = new Carros("Hyundai", "HB20", 2012, 4);
        System.out.println("Marca: " + c1.getMarca());
        System.out.println("Modelo: " + c1.getModelo());
        System.out.println("Ano: " + c1.getAno());
        System.out.println("Número de Portas: " + c1.getNum_Portas());
        System.out.println("==========================================");

    Motos m1 = new Motos("Kawasaki", "Ninja 400", 2023, 400);
        System.out.println("Marca: " + m1.getMarca());
        System.out.println("Modelo: " + m1.getModelo());
        System.out.println("Ano: " + m1.getAno());
        System.out.println("Cilindradas: " + m1.getCilindrada());
        System.out.println("==========================================");




    }
}
