/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author 20244
 */
public class Administrador extends Empleado {

    private static int cont = 0;
    private Habitacion[] arregloHabitaciones;
    private ServicioAdicional[] arregloServicios;

    public Administrador(String dni, String nombre, String apellido) {
        super(dni, nombre, apellido, "Administrador");
        arregloHabitaciones = new Habitacion[50];
        arregloServicios = new ServicioAdicional[50];
    }

    public void registrarHabitacion(Habitacion h) {
        arregloHabitaciones[cont] = h;
        cont++;
    }

    public void modificarHabitacion(int index, Habitacion nueva) {
        arregloHabitaciones[index] = nueva;
    }

    public void eliminarHabitacion(int index) {
        arregloHabitaciones[index] = arregloHabitaciones[cont-1];
        cont--;
    }
}
