/*EJERCICIO PRÁCTICO  EVAL 1 ED
*/
package empleadoed_44654545x1;

import java.util.*;
/**@author Marina Smirnova NIE Y5904039E
*@version 1.0
*constructor con tres parametros
*/
public class EmpleadoED_44654545x1 {
/**constructor para Empleado
*@param nombreCompleto nombre completo en mayúsculas
*@param dni documento nacional de identidad con letra y sin espacios
*/
static final double FACTOR_HORA_EXTRA = 1.2;
private String nombreCompleto, dni;
private double salarioBasePorHora = 10.56;
public EmpleadoED_44654545x1(String nombreCompleto, String dni) {
this.nombreCompleto = nombreCompleto;
this.dni = dni;
}

public double getSalarioEsteMes(int horasExtra) {
/**constructor para getSalario
*@param Calcula el salario bruto mensual en función del salario base por hora y
las horas extras.
*@param El precio por hora de la hora extra se determina con la
constante FACTOR_HORA_EXTRA
*/
double cantidadExtra, salarioFinal;
cantidadExtra = horasExtra * this.salarioBasePorHora *
FACTOR_HORA_EXTRA;
/**@paramhorasExtra número de horas extra dedicadas redondeado a la baja (entero)
*/
salarioFinal=this.salarioBasePorHora * 40 * 4 + cantidadExtra;
salarioFinal=(double)Math.round(salarioFinal * 100d) / 100d;
/**h@return orasExtra número de horas extra dedicadas redondeado a la baja (entero)
*/
return salarioFinal;
}
// Este método no lo comentaremos con JavaDoc
public static void main(String[] args) {
// !!!! MODIFICA TU NOMBRE Y TU DNI EN LA SIGUIENTE LÍNEA
EmpleadoED_44654545x1 emp = new EmpleadoED_44654545x1("MARINA SMIRNOVA",
"Y5904039E");
int horasExtra = 2;
System.out.println("El salario de " + emp.nombreCompleto + " este mes será de " + emp.getSalarioEsteMes(horasExtra)+ " euros, al hacer " + horasExtra + " horas extra.");
}
} 
