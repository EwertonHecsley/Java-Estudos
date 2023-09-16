public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Ewerton Hecsley";
        String segundoNome = "Martins Nunes";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

        int primeroNumero = 100;
        int segundoNumero = 50;

        int somaDosNuemeros = somarNumeros(primeroNumero, segundoNumero);

        System.out.println(somaDosNuemeros);
    }

    public static String nomeCompleto(String primeiroNome, String SegundoNome) {
        return primeiroNome.concat(" ").concat(SegundoNome);
    }

    public static int somarNumeros(int numero1, int numero2) {
        return numero1 + numero2;
    }
}