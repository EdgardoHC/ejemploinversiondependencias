/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemploinversiondependencias;

/**
 *
 * @author jhenriquez
 */
// Implementación del servicio de mensajes de correo electrónico
class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Enviando correo electrónico: " + message);
    }
}