/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemploinversiondependencias;

/**
 *
 * @author jhenriquez
 */
public class NotificationService {
    // Clase de servicio de notificaciones

    private MessageService messageService;

    // Constructor que acepta una implementación de MessageService
    public NotificationService(MessageService messageService) {
        this.messageService = messageService;
    }

    // Método para enviar una notificación
    public void sendNotification(String message) {
        messageService.sendMessage(message);
    }


}
