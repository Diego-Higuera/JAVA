/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TEMA04;

import java.util.List;

/**
 *
 * @author Curso Tarde
 */
public class Principal {
    public static void main(String[] args) {
        String rutaRelativa = "data/personas.json";
        List<Persona> personas_al = MetodosJson.obtenerListaPersonasFromArchivoJson(rutaRelativa);
        for(Persona persona: personas_al) {
            System.out.println(persona);
        }
    }
}
