/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package astedu.diego.prueba;

import astedu.diego.generico.CRUD_Generico;
import astedu.diego.modelo.entidad.Paciente;
import astedu.diego.servicio.Servicio_Paciente;
import java.util.Scanner;

/**
 *
 * @author drlomi95
 */
public class Hibernate {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Servicio_Paciente paciente_dao = new Servicio_Paciente();
        
        int eleccion = 1;
        while (eleccion != 4) {
            System.out.println("Bienvenido, escoge una opcion:");
            System.out.println("----(1)Crear usuario----");
            System.out.println("----(2)Listar usuarios----");
            System.out.println("----(3)Borrar usuario----");
            System.out.println("----(4)Salir del programa----");

            eleccion = teclado.nextInt();

            if (eleccion == 1) {
                System.out.println("Introduce el id del paciente: ");
                int id = teclado.nextInt();
                System.out.println("Introduce el nombre del paciente: ");
                
                String nombre = teclado.next();

                Paciente paciente = new Paciente(id, nombre);
                
                paciente_dao.GuardarPaciente(paciente);

            } else if(eleccion ==2){
                for(Paciente iter : paciente_dao.ListarPacientes()){
                    System.out.println("  Nombre--->  "+iter.getId()+"  Nombre--->  "+iter.getNombre());
                }

            }
            else if(eleccion ==3){
                System.out.println("Introduce el id del paciente: ");
                int id = teclado.nextInt();
                Paciente p = paciente_dao.Buscar(id);
                paciente_dao.EliminarPaciente(p);
            }
            
            else{
                eleccion = 4;
            }

        }

    }

}
