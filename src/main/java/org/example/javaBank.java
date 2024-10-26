package org.example;

import java.util.Scanner;

public class javaBank {

    public static void main(String[] args){

        System.out.println("bienvenido a su cajero electronico");
        System.out.println("*** DP-Bank ***");

        Scanner teclado =new Scanner(System.in);

        String accountNumber;
        String pin;
        Double balance = 0.0;
        Double newBalance;
        final String PIN_SAVE = "1507";
        final String AC_SAVE = "1234";

        System.out.print("Ingrese su numero de cuenta: ");
        accountNumber = teclado.nextLine();

        System.out.print("Ingrese su contraseña PIN: ");
        pin = teclado.nextLine();


        if (accountNumber.equals(AC_SAVE)&&pin.equals(PIN_SAVE)){


            int consult = 1;

            do {

                System.out.println("opciones ATM DP-BANK");
                System.out.println("ingrese la opcion que desea realizar");
                System.out.println("1. consultar saldo");
                System.out.println("2. Depositar dinero");
                System.out.println("3. retirar dinero");

                Integer option = teclado.nextInt();

                switch (option) {

                    case 1 :

                        System.out.println("El saldo de su cuenta es: "+balance);

                        break;
                    case 2 :

                        System.out.println("ingrese el monto que desea depositar");

                        newBalance = teclado.nextDouble();

                        balance = balance + newBalance;

                        System.out.println(" Transaccion realizada con exito. Su saldo actualizado es de: " + balance);

                        break;

                    case 3 :

                        System.out.println("Ingrese el monto a retirar");

                        newBalance = teclado.nextDouble();

                        if (newBalance > balance){

                            System.out.println("saldo insuficiente, ingrese valor valido");
                        }else {

                            balance = balance - newBalance;

                            System.out.println("Transaccion realizada con exito. Su saldo actualizado es de: " + balance);

                        }

                        break;

                    default:

                        System.out.println("opcion invalida, intentelo de nuevo");

                }

                System.out.println("Desea realizar otra consulta? ");
                System.out.println("Ingrese 1 para SI");
                System.out.println("Ingrese 0 para NO");

                consult = teclado.nextInt();

                teclado.nextLine();

            }while (consult == 1);

            System.out.println("gracias por usar nuestro cajero DP BANK. ADIOS");


        }else{
            System.out.println("Número de cuenta o PIN incorrecto. Por favor, inténtelo nuevamente.");
        }

        teclado.close();






    }

}
