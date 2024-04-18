public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Segundo exercício sobre métodos!");
        String primeiroNome = "Danilo ";
        String segundoNome = "Estevão";
        String nomeSobreNome = juntaNome(primeiroNome, segundoNome);
        String ultimoNome = " Cordeiro";
        String nomeCompleto = juntaUltimoNome(ultimoNome);
        
        System.out.print(nomeSobreNome);
        System.out.println(juntaUltimoNome(ultimoNome));

        int num1 = 10;
        int num2 = 10;
        int soma = somar(num1, num2);

        System.out.println(somar(num1, num2));
    }

    public static String juntaNome (String primeiroNome, String segundoNome){
        return primeiroNome.concat(segundoNome);
    }

    public static String juntaUltimoNome (String ultimoNome){
        return ultimoNome;
    }

    public static int somar (int num1, int num2){
        return num1 + num2;
    }
}
