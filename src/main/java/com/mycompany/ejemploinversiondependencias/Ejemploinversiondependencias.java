/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemploinversiondependencias;

/**
 *
 * @author jhenriquez
 * En este ejemplo, NotificationService no está acoplado directamente a las 
 * implementaciones concretas EmailService o TextMessageService, 
 * sino que depende de la abstracción proporcionada por la interfaz MessageService. 
 * Esto cumple con el principio de Inversión de Dependencias (DIP) al
 * permitir que las clases de alto nivel dependan de abstracciones en
 * lugar de detalles concretos de implementación.
 */
public class Ejemploinversiondependencias {

    public static void main(String[] args) {
        // Crear una instancia de EmailService y pasarla a NotificationService
        MessageService emailService = new EmailService();
        NotificationService emailNotificationService = new NotificationService(emailService);
        emailNotificationService.sendNotification("¡Hola desde el correo electrónico!");

        // Crear una instancia de TextMessageService y pasarla a NotificationService
        MessageService textMessageService = new TextMessageService();
        NotificationService textNotificationService = new NotificationService(textMessageService);
        textNotificationService.sendNotification("¡Hola desde el mensaje de texto!");
    }
}
