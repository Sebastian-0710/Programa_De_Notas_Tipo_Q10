import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.0");
        double x, b, c, d, e, f, g, h;
        int opcion = 0;
        int opci = 0;
        int op = 0;
        double num, num1, total = 0, total1 = 0, materia;
        int notas, notas1;
        double trabajos, quices, parcial;
        while (opcion != 8) {
            System.out.println("\n     ......... CALCULADORA DE PROMEDIO..........");
            System.out.println("\n    ............QUE QUIERES CALCULAR?............");

            System.out.println("\n1:) calcular nota de trabajos y quices");
            System.out.println("2:) nota por materia?");
            System.out.println("3:) nota acomulada por materia?");
            System.out.println("4:) promedio acomulado del primer corte?");
            System.out.println("5:) promedio acomulado del segundo corte?");
            System.out.println("6:) promedio acomulado del tercer corte?");
            System.out.println("7:) promedio acomulado de los tres cortes?");
            System.out.println("8:) salir del programa");
            opcion = leer.nextInt();
            if (opcion == 1) {
                System.out.println("     .......exelente calcularemos la nota de trabajos y quices........");
                System.out.println("TRABAJOS");
                System.out.println("primero que todo cuantas notas en trabajos tienes?");
                notas = leer.nextInt();
                System.out.println("EXELENTE");
                for (int i = 1; i <= notas; i++) {
                    System.out.println("ingresa tu " + i + " nota de trabajos");
                    num = leer.nextDouble();
                    total += num;
                    System.out.println("tu nota definitiva en trabajos es de " + df.format(total / i));
                }
                System.out.println("\nQUICES");
                System.out.println("cuantas notas en quices tienes?");
                notas1 = leer.nextInt();
                for (int a = 1; a <= notas1; a++) {
                    System.out.println("ingresa tu " + a + " nota de quices");
                    num1 = leer.nextDouble();
                    total1 += num1;
                    System.out.println("tu nota definitiva en quices es de " + df.format(total1 / a));
                }
            } else if (opcion == 2) {
                System.out.println("                ............EXELENTE............ ");
                System.out.println("PARA QUE CORTE QUIERES CALCULAR TUS NOTAS?");
                System.out.println("           1:) primer corte       2:) segundo corte       3:) tercer corte");
                opci = leer.nextInt();
                if (opci == 1) {
                    System.out.println("                            ......BIEN......");
                    System.out.println("\n    ........... calcularemos tu nota por materia del primer corte...........");
                    System.out.println("\n                         MENU DE OPCIONES");
                    System.out.println("que materia quieres calcular?");
                    System.out.println("1:) MATEMATICAS        2:) LOGICA COMPUTACIONAL        3:) REDES DE COMUNICACIONES         4:) LECTIVA");
                    System.out.println("     5:) HABILIDADES COMUNICATIVAS         6:) SOCIEDAD Y RURALIDAD         7:)CURSO DE APOYO         8:) FISICA");
                    op = leer.nextInt();
                    if (op == 1) {
                        System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA DE MATEMATCAS");
                        System.out.println("porfavor ingresa tu nota definitiva en trabajos");
                        trabajos = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota definitiva en quices");
                        quices = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota del parcial");
                        parcial = leer.nextDouble();
                        total = (trabajos * 0.17) + (quices * 0.17) + (parcial * 0.66);
                        System.out.println("tu nota en matematicas es de " + df.format(total));
                    } else if (op == 2) {
                        System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA DE LOGICA COMPUTACIONAL");
                        System.out.println("porfavor ingresa tu nota definitiva en trabajos");
                        trabajos = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota definitiva en quices");
                        quices = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota del parcial");
                        parcial = leer.nextDouble();
                        total = (trabajos * 0.17) + (quices * 0.17) + (parcial * 0.66);
                        System.out.println("tu nota en logica computacional es de " + df.format(total));
                    } else if (op == 3) {
                        System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA DE REDES DE COMUNICACIONES");
                        System.out.println("porfavor ingresa tu nota definitiva en trabajos");
                        trabajos = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota definitiva en quices");
                        quices = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota del parcial");
                        parcial = leer.nextDouble();
                        total = (trabajos * 0.17) + (quices * 0.17) + (parcial * 0.66);
                        System.out.println("tu nota en redes de comunicaciones es de " + df.format(total));
                    } else if (op == 4) {
                        System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA DE ELECTIVA");
                        System.out.println("porfavor ingresa tu nota definitiva en trabajos");
                        trabajos = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota definitiva en quices");
                        quices = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota del parcial");
                        parcial = leer.nextDouble();
                        total = (trabajos * 0.17) + (quices * 0.17) + (parcial * 0.66);
                        System.out.println("tu nota en electiva es de " + df.format(total));
                    } else if (op == 5) {
                        System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA DE HABILIDADES COMUNICATIVAS");
                        System.out.println("porfavor ingresa tu nota definitiva en trabajos");
                        trabajos = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota definitiva en quices");
                        quices = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota del parcial");
                        parcial = leer.nextDouble();
                        total = (trabajos * 0.17) + (quices * 0.17) + (parcial * 0.66);
                        System.out.println("tu nota en habilidades comunicativas es de " + df.format(total));
                    } else if (op == 6) {
                        System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA DE SOCIEDAD Y RURALIDAD");
                        System.out.println("porfavor ingresa tu nota definitiva en trabajos");
                        trabajos = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota definitiva en quices");
                        quices = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota del parcial");
                        parcial = leer.nextDouble();
                        total = (trabajos * 0.17) + (quices * 0.17) + (parcial * 0.66);
                        System.out.println("tu nota en sociedad y ruralidad es de " + df.format(total));
                    } else if (op == 7) {
                        System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA DE CURSO DE APOYO");
                        System.out.println("porfavor ingresa tu nota definitiva en trabajos");
                        trabajos = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota definitiva en quices");
                        quices = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota del parcial");
                        parcial = leer.nextDouble();
                        total = (trabajos * 0.17) + (quices * 0.17) + (parcial * 0.66);
                        System.out.println("tu nota en curso de apoyo es de " + df.format(total));
                    } else if (op == 8) {
                        System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA DE FISICA");
                        System.out.println("porfavor ingresa tu nota definitiva en trabajos");
                        trabajos = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota definitiva en quices");
                        quices = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota del parcial");
                        parcial = leer.nextDouble();
                        total = (trabajos * 0.17) + (quices * 0.17) + (parcial * 0.66);
                        System.out.println("tu nota en fisica es de " + df.format(total));
                    }
                }
                if (opci == 2) {
                    System.out.println("                            ......BIEN......");
                    System.out.println("\n    ........... calcularemos tu nota por materia del segundo corte...........");
                    System.out.println("\n                         MENU DE OPCIONES");
                    System.out.println("que materia quieres quieres calcular?");
                    System.out.println("1:) MATEMATICAS        2:) LOGICA COMPUTACIONAL        3:) REDES DE COMUNICACIONES         4:) LECTIVA");
                    System.out.println("     5:) HABILIDADES COMUNICATIVAS         6:) SOCIEDAD Y RURALIDAD         7:)CURSO DE APOYO         8:) FISICA");
                    op = leer.nextInt();
                    if (op == 1) {
                        System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA DE MATEMATCAS");
                        System.out.println("porfavor ingresa tu nota definitiva en trabajos");
                        trabajos = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota definitiva en quices");
                        quices = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota del parcial");
                        parcial = leer.nextDouble();
                        total = (trabajos * 0.17) + (quices * 0.17) + (parcial * 0.66);
                        System.out.println("tu nota en matematicas es de " + df.format(total));
                    } else if (op == 2) {
                        System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA DE LOGICA COMPUTACIONAL");
                        System.out.println("porfavor ingresa tu nota definitiva en trabajos");
                        trabajos = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota definitiva en quices");
                        quices = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota del parcial");
                        parcial = leer.nextDouble();
                        total = (trabajos * 0.17) + (quices * 0.17) + (parcial * 0.66);
                        System.out.println("tu nota en logica computacional es de " + df.format(total));
                    } else if (op == 3) {
                        System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA DE REDES DE COMUNICACIONES");
                        System.out.println("porfavor ingresa tu nota definitiva en trabajos");
                        trabajos = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota definitiva en quices");
                        quices = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota del parcial");
                        parcial = leer.nextDouble();
                        total = (trabajos * 0.17) + (quices * 0.17) + (parcial * 0.66);
                        System.out.println("tu nota en redes de comunicaciones es de " + df.format(total));
                    } else if (op == 4) {
                        System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA DE ELECTIVA");
                        System.out.println("porfavor ingresa tu nota definitiva en trabajos");
                        trabajos = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota definitiva en quices");
                        quices = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota del parcial");
                        parcial = leer.nextDouble();
                        total = (trabajos * 0.17) + (quices * 0.17) + (parcial * 0.66);
                        System.out.println("tu nota en electiva es de " + df.format(total));
                    } else if (op == 5) {
                        System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA DE HABILIDADES COMUNICATIVAS");
                        System.out.println("porfavor ingresa tu nota definitiva en trabajos");
                        trabajos = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota definitiva en quices");
                        quices = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota del parcial");
                        parcial = leer.nextDouble();
                        total = (trabajos * 0.17) + (quices * 0.17) + (parcial * 0.66);
                        System.out.println("tu nota en habilidades comunicativas es de " + df.format(total));
                    } else if (op == 6) {
                        System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA DE SOCIEDAD Y RURALIDAD");
                        System.out.println("porfavor ingresa tu nota definitiva en trabajos");
                        trabajos = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota definitiva en quices");
                        quices = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota del parcial");
                        parcial = leer.nextDouble();
                        total = (trabajos * 0.17) + (quices * 0.17) + (parcial * 0.66);
                        System.out.println("tu nota en sociedad y ruralidad es de " + df.format(total));
                    } else if (op == 7) {
                        System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA DE CURSO DE APOYO");
                        System.out.println("porfavor ingresa tu nota definitiva en trabajos");
                        trabajos = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota definitiva en quices");
                        quices = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota del parcial");
                        parcial = leer.nextDouble();
                        total = (trabajos * 0.17) + (quices * 0.17) + (parcial * 0.66);
                        System.out.println("tu nota en curso de apoyo es de " + df.format(total));
                    } else if (op == 8) {
                        System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA DE FISICA");
                        System.out.println("porfavor ingresa tu nota definitiva en trabajos");
                        trabajos = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota definitiva en quices");
                        quices = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota del parcial");
                        parcial = leer.nextDouble();
                        total = (trabajos * 0.17) + (quices * 0.17) + (parcial * 0.66);
                        System.out.println("tu nota en fisica es de " + df.format(total));
                    }
                }
                if (opci == 3) {
                    System.out.println("                            ......BIEN......");
                    System.out.println("\n    ........... calcularemos tu nota por materia del tercer corte...........");
                    System.out.println("\n                         MENU DE OPCIONES");
                    System.out.println("que materia quieres quieres calcular?");
                    System.out.println("1:) MATEMATICAS        2:) LOGICA COMPUTACIONAL        3:) REDES DE COMUNICACIONES         4:) LECTIVA");
                    System.out.println("     5:) HABILIDADES COMUNICATIVAS         6:) SOCIEDAD Y RURALIDAD         7:)CURSO DE APOYO         8:) FISICA");
                    op = leer.nextInt();
                    if (op == 1) {
                        System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA DE MATEMATCAS");
                        System.out.println("porfavor ingresa tu nota definitiva en prueba escrita");
                        trabajos = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota definitiva en prueba oral");
                        quices = leer.nextDouble();
                        total = (trabajos * 0.50) + (quices * 0.50);
                        System.out.println("tu nota en matematicas es de " + df.format(total));
                    } else if (op == 2) {
                        System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA DE LOGICA COMPUTACIONAL");
                        System.out.println("porfavor ingresa tu nota definitiva en prueba escrita");
                        trabajos = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota definitiva en prueba oral");
                        quices = leer.nextDouble();
                        total = (trabajos * 0.50) + (quices * 0.50);
                        System.out.println("tu nota en logica computacional es de " + df.format(total));
                    } else if (op == 3) {
                        System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA DE REDES DE COMUNICACIONES");
                        System.out.println("porfavor ingresa tu nota definitiva en prueba escrita");
                        trabajos = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota definitiva en prueba oral");
                        quices = leer.nextDouble();
                        total = (trabajos * 0.50) + (quices * 0.50);
                        System.out.println("tu nota en redes de comunicaciones es de " + df.format(total));
                    } else if (op == 4) {
                        System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA DE ELECTIVA");
                        System.out.println("porfavor ingresa tu nota definitiva en prueba escrita");
                        trabajos = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota definitiva en prueba oral");
                        quices = leer.nextDouble();
                        total = (trabajos * 0.50) + (quices * 0.50);
                        System.out.println("tu nota en electiva es de " + df.format(total));
                    } else if (op == 5) {
                        System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA DE HABILIDADES COMUNICATIVAS");
                        System.out.println("porfavor ingresa tu nota definitiva en prueba escrita");
                        trabajos = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota definitiva en prueba oral");
                        quices = leer.nextDouble();
                        total = (trabajos * 0.50) + (quices * 0.50);
                        System.out.println("tu nota en habilidades comunicativas es de " + df.format(total));
                    } else if (op == 6) {
                        System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA DE SOCIEDAD Y RURALIDAD");
                        System.out.println("porfavor ingresa tu nota definitiva en prueba escrita");
                        trabajos = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota definitiva en prueba oral");
                        quices = leer.nextDouble();
                        total = (trabajos * 0.50) + (quices * 0.50);
                        System.out.println("tu nota en sociedad y ruralidad es de " + df.format(total));
                    } else if (op == 7) {
                        System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA DE CURSO DE APOYO");
                        System.out.println("porfavor ingresa tu nota definitiva en prueba escrita");
                        trabajos = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota definitiva en prueba oral");
                        quices = leer.nextDouble();
                        total = (trabajos * 0.50) + (quices * 0.50);
                        System.out.println("tu nota en curso de apoyo es de " + df.format(total));
                    } else if (op == 8) {
                        System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA DE FISICA");
                        System.out.println("porfavor ingresa tu nota definitiva en prueba escrita");
                        trabajos = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota definitiva en prueba oral");
                        quices = leer.nextDouble();
                        total = (trabajos * 0.50) + (quices * 0.50);
                        System.out.println("tu nota en fisica es de " + df.format(total));
                    }
                }
            } else if (opcion == 3) {
                System.out.println("                ............EXELENTE............ ");
                System.out.println("PARA QUE CORTE QUIERES CALCULAR TU NOTA ACOMULADA?");
                System.out.println("           1:) primer corte       2:) segundo corte       3:) tercer corte");
                opci = leer.nextInt();
                if (opci == 1) {
                    System.out.println("                            ......BIEN......");
                    System.out.println("\n    ........... calcularemos tu nota acomulada por materia del primer corte...........");
                    System.out.println("\n                         MENU DE OPCIONES");
                    System.out.println("que materia quieres calcular?");
                    System.out.println("1:) MATEMATICAS        2:) LOGICA COMPUTACIONAL        3:) REDES DE COMUNICACIONES         4:) LECTIVA");
                    System.out.println("     5:) HABILIDADES COMUNICATIVAS         6:) SOCIEDAD Y RURALIDAD         7:)CURSO DE APOYO         8:) FISICA");
                    op = leer.nextInt();
                    if (op == 1) {
                        System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA ACOMULADA DE MATEMATCAS");
                        System.out.println("porfavor ingresa tu nota definitiva en trabajos");
                        trabajos = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota definitiva en quices");
                        quices = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota del parcial");
                        parcial = leer.nextDouble();
                        total = (trabajos * 0.17) + (quices * 0.17) + (parcial * 0.66);
                        x = total * 0.3;
                        System.out.println("tu nota en matematicas es de " + df.format(x));

                    } else if (op == 2) {
                        System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA ACOMULADA DE LOGICA COMPUTACIONAL");
                        System.out.println("porfavor ingresa tu nota definitiva en trabajos");
                        trabajos = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota definitiva en quices");
                        quices = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota del parcial");
                        parcial = leer.nextDouble();
                        total = (trabajos * 0.17) + (quices * 0.17) + (parcial * 0.66);
                        b = total * 0.3;
                        System.out.println("tu nota en logica computacional es de " + df.format(b));
                    } else if (op == 3) {
                        System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA ACOMULADA DE REDES DE COMUNICACIONES");
                        System.out.println("porfavor ingresa tu nota definitiva en trabajos");
                        trabajos = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota definitiva en quices");
                        quices = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota del parcial");
                        parcial = leer.nextDouble();
                        total = (trabajos * 0.17) + (quices * 0.17) + (parcial * 0.66);
                        c = total * 0.3;
                        System.out.println("tu nota en redes de comunicaciones es de " + df.format(c));
                    } else if (op == 4) {
                        System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA ACOMULADA DE ELECTIVA");
                        System.out.println("porfavor ingresa tu nota definitiva en trabajos");
                        trabajos = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota definitiva en quices");
                        quices = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota del parcial");
                        parcial = leer.nextDouble();
                        total = (trabajos * 0.17) + (quices * 0.17) + (parcial * 0.66);
                        d = total * 0.3;
                        System.out.println("tu nota en electiva es de " + df.format(d));
                    } else if (op == 5) {
                        System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA ACOMULADA DE HABILIDADES COMUNICATIVAS");
                        System.out.println("porfavor ingresa tu nota definitiva en trabajos");
                        trabajos = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota definitiva en quices");
                        quices = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota del parcial");
                        parcial = leer.nextDouble();
                        total = (trabajos * 0.17) + (quices * 0.17) + (parcial * 0.66);
                        e = total * 0.3;
                        System.out.println("tu nota en habilidades comunicativas es de " + df.format(e));
                    } else if (op == 6) {
                        System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA ACOMULADA DE SOCIEDAD Y RURALIDAD");
                        System.out.println("porfavor ingresa tu nota definitiva en trabajos");
                        trabajos = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota definitiva en quices");
                        quices = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota del parcial");
                        parcial = leer.nextDouble();
                        total = (trabajos * 0.17) + (quices * 0.17) + (parcial * 0.66);
                        f = total * 0.3;
                        System.out.println("tu nota en sociedad y ruralidad es de " + df.format(f));
                    } else if (op == 7) {
                        System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA ACOMULADA DE CURSO DE APOYO");
                        System.out.println("porfavor ingresa tu nota definitiva en trabajos");
                        trabajos = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota definitiva en quices");
                        quices = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota del parcial");
                        parcial = leer.nextDouble();
                        total = (trabajos * 0.17) + (quices * 0.17) + (parcial * 0.66);
                        g = total * 0.3;
                        System.out.println("tu nota en curso de apoyo es de " + df.format(g));
                    } else if (op == 8) {
                        System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA ACOMULADA DE FISICA");
                        System.out.println("porfavor ingresa tu nota definitiva en trabajos");
                        trabajos = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota definitiva en quices");
                        quices = leer.nextDouble();
                        System.out.println("porfavor ingresa tu nota del parcial");
                        parcial = leer.nextDouble();
                        total = (trabajos * 0.17) + (quices * 0.17) + (parcial * 0.66);
                        h = total * 0.3;
                        System.out.println("tu nota en fisica es de " + df.format(h));
                    }
                }
            }
            if (opci == 2) {
                System.out.println("                            ......BIEN......");
                System.out.println("\n    ........... calcularemos tu nota acomulada por materia del segundo corte...........");
                System.out.println("\n                         MENU DE OPCIONES");
                System.out.println("que materia quieres quieres calcular?");
                System.out.println("1:) MATEMATICAS        2:) LOGICA COMPUTACIONAL        3:) REDES DE COMUNICACIONES         4:) LECTIVA");
                System.out.println("     5:) HABILIDADES COMUNICATIVAS         6:) SOCIEDAD Y RURALIDAD         7:)CURSO DE APOYO         8:) FISICA");
                op = leer.nextInt();
                if (op == 1) {
                    System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA ACOMULADA DE MATEMATCAS");
                    System.out.println("porfavor ingresa tu nota definitiva en trabajos");
                    trabajos = leer.nextDouble();
                    System.out.println("porfavor ingresa tu nota definitiva en quices");
                    quices = leer.nextDouble();
                    System.out.println("porfavor ingresa tu nota del parcial");
                    parcial = leer.nextDouble();
                    total = (trabajos * 0.17) + (quices * 0.17) + (parcial * 0.66);
                    x = total * 0.3;
                    System.out.println("tu nota en matematicas es de " + df.format(x));
                } else if (op == 2) {
                    System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA ACOMULADA DE LOGICA COMPUTACIONAL");
                    System.out.println("porfavor ingresa tu nota definitiva en trabajos");
                    trabajos = leer.nextDouble();
                    System.out.println("porfavor ingresa tu nota definitiva en quices");
                    quices = leer.nextDouble();
                    System.out.println("porfavor ingresa tu nota del parcial");
                    parcial = leer.nextDouble();
                    total = (trabajos * 0.17) + (quices * 0.17) + (parcial * 0.66);
                    b = total * 0.3;
                    System.out.println("tu nota en logica computacional es de " + df.format(b));
                } else if (op == 3) {
                    System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA ACOMULADA DE REDES DE COMUNICACIONES");
                    System.out.println("porfavor ingresa tu nota definitiva en trabajos");
                    trabajos = leer.nextDouble();
                    System.out.println("porfavor ingresa tu nota definitiva en quices");
                    quices = leer.nextDouble();
                    System.out.println("porfavor ingresa tu nota del parcial");
                    parcial = leer.nextDouble();
                    total = (trabajos * 0.17) + (quices * 0.17) + (parcial * 0.66);
                    c = total * 0.3;
                    System.out.println("tu nota en redes de comunicaciones es de " + df.format(c));
                } else if (op == 4) {
                    System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA ACOMULADA DE ELECTIVA");
                    System.out.println("porfavor ingresa tu nota definitiva en trabajos");
                    trabajos = leer.nextDouble();
                    System.out.println("porfavor ingresa tu nota definitiva en quices");
                    quices = leer.nextDouble();
                    System.out.println("porfavor ingresa tu nota del parcial");
                    parcial = leer.nextDouble();
                    total = (trabajos * 0.17) + (quices * 0.17) + (parcial * 0.66);
                    d = total * 0.3;
                    System.out.println("tu nota en electiva es de " + df.format(d));
                } else if (op == 5) {
                    System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA ACOMULADA DE HABILIDADES COMUNICATIVAS");
                    System.out.println("porfavor ingresa tu nota definitiva en trabajos");
                    trabajos = leer.nextDouble();
                    System.out.println("porfavor ingresa tu nota definitiva en quices");
                    quices = leer.nextDouble();
                    System.out.println("porfavor ingresa tu nota del parcial");
                    parcial = leer.nextDouble();
                    total = (trabajos * 0.17) + (quices * 0.17) + (parcial * 0.66);
                    e = total * 0.3;
                    System.out.println("tu nota en habilidades comunicativas es de " + df.format(e));
                } else if (op == 6) {
                    System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA ACOMULADA DE SOCIEDAD Y RURALIDAD");
                    System.out.println("porfavor ingresa tu nota definitiva en trabajos");
                    trabajos = leer.nextDouble();
                    System.out.println("porfavor ingresa tu nota definitiva en quices");
                    quices = leer.nextDouble();
                    System.out.println("porfavor ingresa tu nota del parcial");
                    parcial = leer.nextDouble();
                    total = (trabajos * 0.17) + (quices * 0.17) + (parcial * 0.66);
                    f = total * 0.3;
                    System.out.println("tu nota en sociedad y ruralidad es de " + df.format(f));
                } else if (op == 7) {
                    System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA ACOMULADA DE CURSO DE APOYO");
                    System.out.println("porfavor ingresa tu nota definitiva en trabajos");
                    trabajos = leer.nextDouble();
                    System.out.println("porfavor ingresa tu nota definitiva en quices");
                    quices = leer.nextDouble();
                    System.out.println("porfavor ingresa tu nota del parcial");
                    parcial = leer.nextDouble();
                    total = (trabajos * 0.17) + (quices * 0.17) + (parcial * 0.66);
                    g = total * 0.3;
                    System.out.println("tu nota en curso de apoyo es de " + df.format(g));
                } else if (op == 8) {
                    System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA ACOMULADA DE FISICA");
                    System.out.println("porfavor ingresa tu nota definitiva en trabajos");
                    trabajos = leer.nextDouble();
                    System.out.println("porfavor ingresa tu nota definitiva en quices");
                    quices = leer.nextDouble();
                    System.out.println("porfavor ingresa tu nota del parcial");
                    parcial = leer.nextDouble();
                    total = (trabajos * 0.17) + (quices * 0.17) + (parcial * 0.66);
                    h = total * 0.3;
                    System.out.println("tu nota en fisica es de " + df.format(h));
                }
            }
            if (opci == 3) {
                System.out.println("                            ......BIEN......");
                System.out.println("\n    ........... calcularemos tu nota acomulada por materia del tercer corte...........");
                System.out.println("\n                         MENU DE OPCIONES");
                System.out.println("que materia quieres quieres calcular?");
                System.out.println("1:) MATEMATICAS        2:) LOGICA COMPUTACIONAL        3:) REDES DE COMUNICACIONES         4:) LECTIVA");
                System.out.println("     5:) HABILIDADES COMUNICATIVAS         6:) SOCIEDAD Y RURALIDAD         7:)CURSO DE APOYO         8:) FISICA");
                op = leer.nextInt();
                if (op == 1) {
                    System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA ACOMULADA DE MATEMATCAS");
                    System.out.println("porfavor ingresa tu nota definitiva en prueba escrita");
                    trabajos = leer.nextDouble();
                    System.out.println("porfavor ingresa tu nota definitiva en prueba oral");
                    quices = leer.nextDouble();
                    total = (trabajos * 0.50) + (quices * 0.50);
                    x = total * 0.4;
                    System.out.println("tu nota en matematicas es de " + df.format(x));
                } else if (op == 2) {
                    System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA ACOMULADA DE LOGICA COMPUTACIONAL");
                    System.out.println("porfavor ingresa tu nota definitiva en prueba escrita");
                    trabajos = leer.nextDouble();
                    System.out.println("porfavor ingresa tu nota definitiva en prueba oral");
                    quices = leer.nextDouble();
                    total = (trabajos * 0.50) + (quices * 0.50);
                    b = total * 0.4;
                    System.out.println("tu nota en logica computacional es de " + df.format(b));
                } else if (op == 3) {
                    System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA ACOMULADA DE REDES DE COMUNICACIONES");
                    System.out.println("porfavor ingresa tu nota definitiva en prueba escrita");
                    trabajos = leer.nextDouble();
                    System.out.println("porfavor ingresa tu nota definitiva en prueba oral");
                    quices = leer.nextDouble();
                    total = (trabajos * 0.50) + (quices * 0.50);
                    c = total * 0.4;
                    System.out.println("tu nota en redes de comunicaciones es de " + df.format(c));
                } else if (op == 4) {
                    System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA ACOMULADA DE ELECTIVA");
                    System.out.println("porfavor ingresa tu nota definitiva en prueba escrita");
                    trabajos = leer.nextDouble();
                    System.out.println("porfavor ingresa tu nota definitiva en prueba oral");
                    quices = leer.nextDouble();
                    total = (trabajos * 0.50) + (quices * 0.50);
                    d = total * 0.4;
                    System.out.println("tu nota en electiva es de " + df.format(d));
                } else if (op == 5) {
                    System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA ACOMULADA DE HABILIDADES COMUNICATIVAS");
                    System.out.println("porfavor ingresa tu nota definitiva en prueba escrita");
                    trabajos = leer.nextDouble();
                    System.out.println("porfavor ingresa tu nota definitiva en prueba oral");
                    quices = leer.nextDouble();
                    total = (trabajos * 0.50) + (quices * 0.50);
                    e = total * 0.4;
                    System.out.println("tu nota en habilidades comunicativas es de " + df.format(e));
                } else if (op == 6) {
                    System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA ACOMULADA DE SOCIEDAD Y RURALIDAD");
                    System.out.println("porfavor ingresa tu nota definitiva en prueba escrita");
                    trabajos = leer.nextDouble();
                    System.out.println("porfavor ingresa tu nota definitiva en prueba oral");
                    quices = leer.nextDouble();
                    total = (trabajos * 0.50) + (quices * 0.50);
                    f = total * 0.4;
                    System.out.println("tu nota en sociedad y ruralidad es de " + df.format(f));
                } else if (op == 7) {
                    System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA ACOMULADA DE CURSO DE APOYO");
                    System.out.println("porfavor ingresa tu nota definitiva en prueba escrita");
                    trabajos = leer.nextDouble();
                    System.out.println("porfavor ingresa tu nota definitiva en prueba oral");
                    quices = leer.nextDouble();
                    total = (trabajos * 0.50) + (quices * 0.50);
                    g = total * 0.4;
                    System.out.println("tu nota en curso de apoyo es de " + df.format(g));
                } else if (op == 8) {
                    System.out.println("\n          EXELENTE CALCULAREMOS TU NOTA ACOMULADA DE FISICA");
                    System.out.println("porfavor ingresa tu nota definitiva en prueba escrita");
                    trabajos = leer.nextDouble();
                    System.out.println("porfavor ingresa tu nota definitiva en prueba oral");
                    quices = leer.nextDouble();
                    total = (trabajos * 0.50) + (quices * 0.50);
                    h = total * 0.4;
                    System.out.println("tu nota en fisica es de " + df.format(h));
                }
            } else if (opcion == 4) {
                System.out.println("     .......exelente calculares el promedio acomulado del primer corte.......");
                System.out.println("primero que todo cuantas materias tienes?");
                materia = leer.nextInt();
                System.out.println("EXELENTE");
                for (int i = 1; i <= materia; i++) {
                    System.out.println("ingresa la notas definitiva de tu " + i + " materia");
                    num = leer.nextDouble();
                    total += num;
                    System.out.println("tu promedio acomulado del primer corte es de " + total * 0.3);
                }
            } else if (opcion == 5) {
                System.out.println("     .......exelente calculares el promedio acomulado del segundo corte corte.......");
                System.out.println("primero que todo cuantas materias tienes?");
                materia = leer.nextInt();
                System.out.println("EXELENTE");
                for (int i = 1; i <= materia; i++) {
                    System.out.println("ingresa la notas definitiva de tu " + i + " materia");
                    num = leer.nextDouble();
                    total += num;
                    System.out.println("tu promedio acomulado del primer corte es de " + total * 0.3);
                }
            } else if (opcion == 6) {
                System.out.println("     .......exelente calculares el promedio acomulado del tercer corte.......");
                System.out.println("primero que todo cuantas materias tienes?");
                materia = leer.nextInt();
                System.out.println("EXELENTE");
                for (int i = 1; i <= materia; i++) {
                    System.out.println("ingresa la notas definitiva de tu " + i + " materia");
                    num = leer.nextDouble();
                    total += num;
                    System.out.println("tu promedio acomulado del primer corte es de " + total * 0.4);
                }
            } else if (opcion == 7) {
                System.out.println("para calcular el promedio acomulado de los tres cortes solo sumelos ");
                System.out.println("como por ejemplo primer corte (1.2) segundo (0.9) tercero (1.3)");
                System.out.println("el promedio acumulado de los tres cortes es de 3.4");

            } else if (opcion == 8) {
                break;
            }
        }
    }
}
