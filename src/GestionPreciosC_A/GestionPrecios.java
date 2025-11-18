package GestionPreciosC_A;
import java.util.ArrayList;
import java.util.Scanner;
public class GestionPrecios {
    public static void ingresarPrecio(ArrayList<Double> precios, Scanner sc) {
        System.out.print("Ingrese el precio: ");
        double precio1 = sc.nextDouble();
        if (precio1 > 0) {
            precios.add(precio1);
            System.out.println("Precio agregado exitosamente.");
        } else {
            System.out.println("Precio inválido, debe ser mayor a 0.");
        }
    }

    public static void mostrarPrecios(ArrayList<Double> precios) {
        if (precios.isEmpty()) {
            System.out.println("No existen precios registrados aún.");
        } else {
            System.out.println("---- LISTA DE PRECIOS ----");
            for (Double precio : precios) {
                System.out.println(precio);
            }
        }
    }

    public static void mostrarPrecioMasAlto(ArrayList<Double> precios) {
        if (precios.isEmpty()) {
            System.out.println("No existen precios registrados aún.");
        } else {
            double maximo = precios.get(0);
            for (Double precio : precios) {
                if (precio > maximo) {
                    maximo = precio;
                }
            }
            System.out.println("Precio más alto: " + maximo);
        }
    }

    public static void mostrarPrecioMasBajo(ArrayList<Double> precios) {
        if (precios.isEmpty()) {
            System.out.println("No existen precios registrados aún.");
        } else {
            double minimo = precios.get(0);
            for (Double precio : precios) {
                if (precio < minimo) {
                    minimo = precio;
                }
            }
            System.out.println("Precio más bajo: " + minimo);
        }
    }

    public static void mostrarPreciosIguales(ArrayList<Double> precios, Scanner sc) {
        if (precios.isEmpty()) {
            System.out.println("No existen precios registrados aún.");
        } else {
            System.out.print("Ingrese un precio para buscar iguales: ");
            double valorIgual = sc.nextDouble();
            boolean encontrado = false;

            for (Double precio : precios) {
                if (precio.equals(valorIgual)) {
                    System.out.println("Precio igual encontrado: " + precio);
                    encontrado = true;
                }
            }

            if (!encontrado) {
                System.out.println("No se encontraron precios iguales.");
            }
        }
    }

    public static void buscarPrecio(ArrayList<Double> precios, Scanner sc) {
        if (precios.isEmpty()) {
            System.out.println("No existen precios registrados aún.");
        } else {
            System.out.print("Ingrese el precio a buscar: ");
            double valorBuscado = sc.nextDouble();

            if (precios.contains(valorBuscado)) {
                System.out.println("El precio SÍ está en la lista.");
            } else {
                System.out.println("El precio NO se encuentra.");
            }
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Double> precios = new ArrayList<>();
        int opcion = 0;

        do {
            System.out.println("===== MENÚ DE PRECIOS INMOBILIARIOS =====");
            System.out.println("1. Ingresar precio");
            System.out.println("2. Mostrar todos los precios");
            System.out.println("3. Mostrar precio más alto");
            System.out.println("4. Mostrar precio más bajo");
            System.out.println("5. Mostrar precios iguales");
            System.out.println("6. Buscar un precio específico");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        ingresarPrecio(precios, sc);
                        break;
                    case 2:
                        mostrarPrecios(precios);
                        break;
                    case 3:
                        mostrarPrecioMasAlto(precios);
                        break;
                    case 4:
                        mostrarPrecioMasBajo(precios);
                        break;
                    case 5:
                        mostrarPreciosIguales(precios, sc);
                        break;
                    case 6:
                        buscarPrecio(precios, sc);
                        break;
                    case 7:
                        System.out.println("Saliendo del sistema...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (Exception e) {
                System.out.println("Error: ingrese solo números.");
                sc.nextLine(); // limpiar buffer
            }
            System.out.println();

        } while (opcion != 7);
    }
}
