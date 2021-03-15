package edu.pp.demo1;

public class Demo {

    public static void main(String[] args) {
        //Declaração de variáveis do tipo double (números reais)
        float width, height, woodLength, glassArea;
        //constantes
        final float MAX_WIDTH = 5.0f;
        final float MIN_WIDTH = 0.5f;
        final float MAX_HEIGHT = 3.0f;
        final float MIN_HEIGHT = 0.75f;

        //inicialização de variáveis
        if (args.length == 2) {
            width = Float.parseFloat(args[0]);
            height = Float.parseFloat(args[1]);
        } else {
            width = 2;
            height = 3;
        }

        //Validação do comprimento
        if (width < MIN_WIDTH) {
            System.out.println("Width is too small.");
            System.out.println("Using minimum");
            width = MIN_WIDTH;
        }
        if (width > MAX_WIDTH) {
            System.out.println("Width is too large.\n\n");
            System.out.println("Using maximum");
            width = MAX_WIDTH;
        }

        //Validação da altura
        if (height < MIN_HEIGHT) {
            System.out.println("Height is too small.\n\n");
            System.out.println("Using minimum");
            height = MIN_HEIGHT;
        }
        if (height > MAX_HEIGHT) {
            System.out.println("Height is too large.\n\n");
            System.out.println("Using maximum");
            height = MAX_HEIGHT;
        }

        //Calcular a quantidade de madeira e área do vidro
        woodLength = 2 * (width + height) * 3.25f;
        glassArea = width * height;

        //Apresentação de resultados
        System.out.println("The length of the wood is " + woodLength + " feet");
        System.out.println("The area of the glass is " + glassArea + " square metres");

    }

}
