package com.email

import org.springframework.mail.javamail.JavaMailSenderImpl
import java.util.*

fun sendEmail(sender: String, recipient: String, subject: String, message: String, pass: String) {
    val mailSender = JavaMailSenderImpl()
    val properties = Properties()
    properties.put("mail.smtp.host", "smtp.gmail.com")
    properties.put("mail.smtp.port", "465")
    properties.put("mail.smtp.ssl.enable", "true")

    mailSender.setJavaMailProperties(properties)
    mailSender.setUsername("grosse.tech.101@gmail.com")
    mailSender.setPassword(pass)


}