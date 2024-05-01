import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Película Matrix");

        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                La mejor película del fin del milenio.
                """;
        double mediaEvaluacionesUsuario = 0;

        System.out.println(fechaDeLanzamiento);
        System.out.println(evaluacion);
        System.out.println(incluidoEnElPlanBasico);
        System.out.println(nombre);
        System.out.println(sinopsis);
        //System.out.println("Linea comentada");
        System.out.println("Película: " + nombre);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("Media de la evaluación de " + nombre +": " + mediaEvaluacion);

        if (fechaDeLanzamiento > 2023)
            {
                System.out.println("Película popular en el momento");
            }
        else
        {
            System.out.println("Película retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la evaluación que le darias a la película " + nombre);
            double notaPelicula = teclado.nextDouble();
            mediaEvaluacionesUsuario = mediaEvaluacionesUsuario + notaPelicula;


        }
        System.out.println("La media de la película "+ nombre + "es: " + (mediaEvaluacionesUsuario/3));

    }
}