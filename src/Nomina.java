public class Nomina {

    private String clave;
    private String nombre;
    private int horasTrabajadas;
    private double pagoPorHora;

    public Nomina(String claveEmpleado, String nombre, int horasTrabajadas, double pagoPorHora){

        this.clave = claveEmpleado;
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;

    }

//este permite comparar las horas trabajadas con respecto a las horas maximas semanales
//Math.min y Math.max son metodos los cuales nos permiten comparar 2 valores entre sí,
//y dependiendo de cuál hayamos usado, devolvera un valor u otro

    public int getHorasCalculadas(){

//Math.min compara 2 valores (en este caso, comparara las horas trabajadas con el maximo de horas semanales (50))
//y retornara el menor de los dos, si por ejemplo, horasTrabajadas = 35, se retornara horasTrabajadas
//porque es el de menor valor

        return Math.min(horasTrabajadas, 50);

//si horasTrabajadas > 50 se retornaria 50, porque es el de menor valor, evitando que se sobrepase el maximo
//de 50 horas semanales
    }

//este hace basicamente lo mismo, compara el resultado del getter anterior con 40
//(el maximo de horas de trabajo antes de comenzar a contar horas extra)
//y retornará el de menor valor

    public int calcularHorasRegulares(){
        return Math.min(getHorasCalculadas(), 40);
    }

//este hace lo contrario a los 2 anteriores, primero restara las horas calculadas con 40
//(el maximo antes de las horas extra), el resultado se comparara con el segundo valor y se retornara el de mayor valor

    public int calcularHorasExtras(){
        return Math.max(getHorasCalculadas() - 40, 0);

//si el resultado de la operación fuera negativo, se retornaria 0 porque es el de mayor valor, evitando
//que se hagan los calculos posteriores con valores negativos
//y cualquier valor mayor a 0 que resulte de la operación se consideraran horas extra
    }

//este hace el cálculo para determinar el pago extra en caso de que se hubieran hecho horas extra
    public double calcularPagoExtra(){
        return calcularHorasExtras() * pagoPorHora * 2;
//las horas extra se pagan doble con un maximo de 10 horas extra por semana
    }

//este hace el cálculo para determinar el pago normal del empleado (40 horas o menos)
    public double calcularPagoRegular(){
        return calcularHorasRegulares() * pagoPorHora;
//las horas regulares se pagan según cuanto cobre el empleado por hora, con un maximo de 40 horas
//antes de comenzar a contar horas extra
    }

//este simplemente suma el pago regular del empleado, más el pago de las horas extra que haya hecho
//(en caso de que haya hecho horas extra)
    public double calcularPagoTotal(){
        return calcularPagoRegular() + calcularPagoExtra();
    }

}
