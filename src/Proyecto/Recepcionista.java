/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author 20244
 */
public class Recepcionista extends Empleado {

    private Huesped[] arregloHuespedes;
    private Reservacion[] arregloReservaciones;

    public Recepcionista(String dni, String nombre, String apellido) {
        super(dni, nombre, apellido, "Recepcionista");
        arregloHuespedes = new Huesped[100];
        arregloReservaciones = new Reservacion[100];
    }

    public void registrarHuesped(Huesped h, int index) {
        arregloHuespedes[index] = h;
    }

    public void modificarHuesped(int index, Huesped nuevo) {
        arregloHuespedes[index] = nuevo;
    }

    public void eliminarHuesped(int index) {
        arregloHuespedes[index] = null;
    }

    public double calcularCheckin() {
        return 0; // luego implementar
    }

    public double calcularCheckout() {
        return 0; // luego implementar
    }
}
