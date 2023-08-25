import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("*****BIENVENIDOS AL HOTEL EL POBLADO*****");

        System.out.println("*****HABITACIONES DISPONIBLES*****");

        System.out.print("habitacion1 = cama doble, televisor, aire acondicionado, baño privado, nevera, jacuzzi, Wi-Fi\n");

        System.out.print("habitacion2 = cama sencilla, televisor, ventilador, baño privado, Wi-Fi\n");

        System.out.print("habitacion3 = cama sencilla, ventilador, baño privado\n");

        double habitacion1 = 350000;
        double habitacion2 = 200000;
        double habitacion3 = 150000;

        System.out.print("¿Que habitacion deseas reservar?: ");
        String respuesta = scanner.nextLine();


        if (respuesta.equals("habitacion1")) {
            System.out.print("Valor a pagar: 350000\n");
            System.out.print("Habitacion reservada");
        } else if (respuesta.equals("habitacion2")) {
            System.out.print("su valor a pagar es: 200000\n");
            System.out.print("Habitacion reservada");
        } else if (respuesta.equals("habitacion3")) {
            System.out.print("Su valor a pagar es: 150000\n");
            System.out.print("Habitacion reservada");
        }
        System.out.print("¿Que habitacion deseas reservar?: ");
        String leer = scanner.nextLine();

        for (int i=0; i<3; i=i+1){
            if (respuesta.equals(leer)){
                System.out.print("Error, esta habitacion ya esta reservada");

                i=4;
            }else {
                if (leer.equals("habitacion1")) {
                    System.out.print("Valor a pagar: 350000\n");
                    System.out.print("Habitacion reservada");
                } else if (leer.equals("habitacion2")) {
                    System.out.print("su valor a pagar es: 200000\n");
                    System.out.print("Habitacion reservada");
                } else if (leer.equals("habitacion3")) {
                    System.out.print("Su valor a pagar es: 150000\n");
                    System.out.print("Habitacion reservada");
                }
            }   i=4;
        }
    }
}