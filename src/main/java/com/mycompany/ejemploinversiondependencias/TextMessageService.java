/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemploinversiondependencias;

/**
 *
 * @author jhenriquez
 */
// Implementación del servicio de mensajes de texto
class TextMessageService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Enviando mensaje de texto: " + message);
    }
}