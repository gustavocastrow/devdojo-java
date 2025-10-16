public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 12;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado");
        } else {
            System.out.println(" Não Autorizado");
        }

        if(!isAutorizadoComprarBebida){
            System.out.println("Não autorizado a comprar bebida alcoolica");
        }

    }
}
