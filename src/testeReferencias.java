public class testeReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.println("saldo primeira conta:" + primeiraConta); // printa referência ao objeto conta

        Conta segundaConta = primeiraConta; // atribuiu a referência do objeto
        System.out.println(segundaConta);
        System.out.println("saldo segunda conta:" + segundaConta.saldo); // saldo do objeto referenciado

        segundaConta.saldo += 100;
        System.out.println("saldo segunda conta:" + segundaConta.saldo);

        System.out.println(primeiraConta.saldo);

        if (primeiraConta == segundaConta) {
            System.out.println("são a mesmissima conta"); // apontam para um único objeto
        }
    }
}
