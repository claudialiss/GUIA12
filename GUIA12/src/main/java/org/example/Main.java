public class Main {
    public static void main(String[] args) {

        System.out.println("=== 1. INSTANCIA DE PLANTA ===");
        Planta plantaComun = new Planta();
        System.out.println("Tipo: " + plantaComun.tipo);       // Imprime: PLANTA
        System.out.println("Clima: " + Planta.clima());        // Imprime: templado
        System.out.println("Riego: " + plantaComun.regar());   // Imprime: cada 2 dias

        System.out.println("\n=== 2. INSTANCIA DE CACTUS ===");
        Cactus miCactus = new Cactus();
        System.out.println("Tipo: " + miCactus.tipo);          // Imprime: CACTUS
        System.out.println("Clima: " + Cactus.clima());        // Imprime: desertico
        System.out.println("Riego: " + miCactus.regar());      // Imprime: cada 15 dias (¡Sobrescrito!)

        System.out.println("\n=== 3. POLIMORFISMO (Referencia tipo Planta, Objeto Cactus) ===");
        Planta plantaMutante = new Cactus();

        // Las variables y métodos estáticos pertenecen al tipo de la *referencia* (Planta):
        System.out.println("Tipo (Variable): " + plantaMutante.tipo);       // Imprime: PLANTA
        System.out.println("Clima (Método Estático): " + plantaMutante.clima()); // Imprime: templado

        // El método de instancia usa polimorfismo y pertenece al tipo del *objeto real* (Cactus):
        System.out.println("Riego (Método @Override): " + plantaMutante.regar()); // Imprime: cada 15 dias
    }
}
