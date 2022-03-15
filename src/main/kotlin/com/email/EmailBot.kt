package com.email

import com.fileread.readFile
import org.springframework.mail.javamail.JavaMailSenderImpl
import java.util.*

fun sendEmail(sender: String, recipient: String, subject: String, message: String) {
    val mailSender = JavaMailSenderImpl()
    val properties = Properties()
    properties.put("mail.smtp.host", "smtp.gmail.com")
    properties.put("mail.smtp.port", "465")
    properties.put("mail.smtp.ssl.enable", "true")

    mailSender.setJavaMailProperties(properties)
    val credentials = readFile("creds").split(" ")
    mailSender.setUsername(credentials[0])
    mailSender.setPassword(credentials[1])


}