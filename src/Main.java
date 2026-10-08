import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Sistema de Nomina de Empleados");

        Scanner entrada = new Scanner(System.in);

//scanner permite ingresar valores en el main sin necesidad
//de tener que escribir los setters nuevamente

//scanner para la clave del empleado
        System.out.print("Clave del empleado: ");
        String clave = entrada.nextLine();

//scanner para el nombre del empleado
        System.out.print("Nombre del empleado: ");
        String nombre = entrada.nextLine();

//scanner para las horas trabajadas en total
        System.out.print("Horas Trabajadas: ");
        int horasTrabajadas = entrada.nextInt();

//scanner para fijar el pagor por hora
        System.out.print("Pago por Hora: ");
        double pagoPorHora = entrada.nextDouble();

        Nomina nominaEmpleado = new Nomina(clave, nombre, horasTrabajadas, pagoPorHora);

//esto solamente imprime los valores que se le ingresaron en los scanners anteriores
        System.out.println("================================");
        System.out.println("\t\tRECIBO DE NOMINA");
        System.out.println("================================");
        System.out.println("Clave: " + clave);
        System.out.println("Empleado: " + nombre);
        System.out.println("Horas normales: " + nominaEmpleado.calcularHorasRegulares());
        System.out.println("Horas extra: " + nominaEmpleado.calcularHorasExtras());
        System.out.println("Pago por hora: " + pagoPorHora);
        System.out.println("Pago normal: " + nominaEmpleado.calcularPagoRegular());
        System.out.println("Pago horas extras: " + nominaEmpleado.calcularPagoExtra());
        System.out.println("--------------------------------");
        System.out.println("Pago total: " + nominaEmpleado.calcularPagoTotal());
        System.out.println("================================");


    }
}
