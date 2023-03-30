public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaMiguel = new Conta();

        contaMiguel.saldo = 100;
        contaMiguel.deposita(100);

        System.out.println(contaMiguel.saldo);

        boolean conseguiuSacar = contaMiguel.saca(50); // estamos usando a informação devolvida
        System.out.println("meu saldo atual é: " + contaMiguel.saldo);
        System.out.println(conseguiuSacar);

        Conta contaMarcela = new Conta();
        contaMarcela.deposita(1000);

        contaMarcela.transfere(300, contaMiguel);
        System.out.println(contaMarcela.saldo);
        System.out.println(contaMiguel.saldo);
    }
}
