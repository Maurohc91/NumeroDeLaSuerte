package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu fecha de nacimiento con este formato 'dd/mm/aaaa': ");
        String fecha = entrada.nextLine();

        int tamanyo = fecha.length();

        while (tamanyo != 10) {
            System.out.println("Por favor, introduzca de nuevo la fecha");

            fecha = entrada.nextLine();
            tamanyo = fecha.length();
        }
        int dia = Integer.parseInt(fecha.substring(0,2));
        int mes = Integer.parseInt(fecha.substring(3,5));
        int anyo = Integer.parseInt(fecha.substring(6,10));
        int suma1 =  dia + mes + anyo;

        if (fecha.charAt(2) != '/' || fecha.charAt(5) != '/') {
            System.out.println("Introduzca una fecha correcta");
            fecha = entrada.nextLine();

        }
        boolean sondigitos = Character.isDigit(fecha.charAt(0)) &&
                Character.isDigit(fecha.charAt(1)) &&
                Character.isDigit(fecha.charAt(3)) &&
                Character.isDigit(fecha.charAt(4)) &&
                Character.isDigit(fecha.charAt(6)) &&
                Character.isDigit(fecha.charAt(7)) &&
                Character.isDigit(fecha.charAt(8)) &&
                Character.isDigit(fecha.charAt(9));
        if (sondigitos == false)   {

            System.out.println("Introduce una fecha válida");

        }
        if (dia > 31 || dia <= 0 || mes <= 0 || mes > 12 || anyo < 1824 || anyo > 2024) {
            System.out.println("Introduce una fecha correcta");
            fecha = entrada.nextLine();
        }



        int digito1 = suma1 / 1000;
        int digito2 = (suma1 / 100) % 10;
        int digito3 = (suma1 / 10) % 10;
        int digito4 = suma1 % 10;

        int sumadigitos = digito1 + digito2 + digito3 + digito4;

        System.out.println("TU numero de la suerte es: " + sumadigitos);






    }
}