package com.campusdual.classroom;

public class Exercise29 {
    public static void main(String[] args) {
        try {
            // Lanzar una excepción intencionalmente
            throw new RuntimeException("Esta es cualquier tipo de excepción.");

        } catch (RuntimeException e) {
            // Capturar la excepción y manejarla
            System.out.println("Excepción capturada e manejada: " + e.getMessage());
        }

        // El programa continúa después de manejar la excepción
        System.out.println("El programa continúa ejecutándose después de manejar cualquier tipo de excepción.");
    }
    }

