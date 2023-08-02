package br.com.ada;

public class IMC {
    public static void main(String[] args) {

        String[][] dadosPessoas = {
                {"Ana", "1.70", "80"},
                {"Paulo", "1.72", "90"},
                {"Marcia", "1.62", "61"},
                {"Pedro", "1.90", "84"},
                {"Beatriz", "1.53", "49"}
        };

        // Média aritmética de altura
        double somaAltura = 0.0;
        for (int i = 0; i < dadosPessoas.length; i++) {
            somaAltura += Double.parseDouble(dadosPessoas[i][1]);
        }
        double mediaAltura = somaAltura / dadosPessoas.length;

        // Média aritmética de peso
        int somaPeso = 0;
        for (int i = 0; i < dadosPessoas.length; i++) {
            somaPeso += Integer.parseInt(dadosPessoas[i][2]);
        }
        double mediaPeso = (double) somaPeso / dadosPessoas.length;


        String pessoaMaisAlta = "";
        double alturaMaisAlta = 0.0;
        String pessoaMaisBaixa = "";
        double alturaMaisBaixa = Double.MAX_VALUE;
        String pessoaMaisPesada = "";
        int pesoMaisPesada = 0;
        String pessoaMaisLeve = "";
        int pesoMaisLeve = Integer.MAX_VALUE;
        String pessoaMaiorIMC = "";
        double maiorIMC = Double.MIN_VALUE;
        String pessoaMenorIMC = "";
        double menorIMC = Double.MAX_VALUE;

        for (int i = 0; i < dadosPessoas.length; i++) {
            String nome = dadosPessoas[i][0];
            double altura = Double.parseDouble(dadosPessoas[i][1]);
            int peso = Integer.parseInt(dadosPessoas[i][2]);
            double imc = (altura * altura) / peso;

            if (altura > alturaMaisAlta) {
                pessoaMaisAlta = nome;
                alturaMaisAlta = altura;
            }

            if (altura < alturaMaisBaixa) {
                pessoaMaisBaixa = nome;
                alturaMaisBaixa = altura;
            }

            if (peso > pesoMaisPesada) {
                pessoaMaisPesada = nome;
                pesoMaisPesada = peso;
            }

            if (peso < pesoMaisLeve) {
                pessoaMaisLeve = nome;
                pesoMaisLeve = peso;
            }

            if (imc > maiorIMC) {
                pessoaMaiorIMC = nome;
                maiorIMC = imc;
            }

            if (imc < menorIMC) {
                pessoaMenorIMC = nome;
                menorIMC = imc;
            }

            System.out.println(nome + " IMC = " + imc);
        }

        System.out.println("A média aritmética de altura é " + mediaAltura + "m");
        System.out.println("A média aritmética de peso é " + mediaPeso + "Kg");
        System.out.println("A pessoa mais alta é " + pessoaMaisAlta + " com " + alturaMaisAlta + "m");
        System.out.println("A pessoa mais baixa é " + pessoaMaisBaixa + " com " + alturaMaisBaixa + "m");
        System.out.println("A pessoa mais pesada é " + pessoaMaisPesada + " com " + pesoMaisPesada + "Kg");
        System.out.println("A pessoa mais leve é " + pessoaMaisLeve + " com " + pesoMaisLeve + "Kg");
        System.out.println("A pessoa com maior IMC é " + pessoaMaiorIMC + " com " + maiorIMC);
        System.out.println("A pessoa com menor IMC é " + pessoaMenorIMC + " com " + menorIMC);
    }
}
