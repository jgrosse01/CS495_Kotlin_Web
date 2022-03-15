package com.email

// imports don't all get recognized, they do all work though.
import com.fileread.readFile
import org.springframework.mail.javamail.JavaMailSenderImpl
import org.springframework.mail.javamail.MimeMessageHelper
import java.util.*

// mail sender and mail properties
val mailSender = JavaMailSenderImpl()
val properties = Properties()
// credentials are read in directly and stored because I do not care about the security of this account
val credentials = readFile("creds").split(" ")


/**
 * A basic function to send emails.
 */
fun sendEmail(recipient: String, name: String, submittedEmail: String, subject: String, message: String) {
    // configure mail sender properties
    properties["mail.smtp.host"] = "smtp.gmail.com"
    properties["mail.smtp.port"] = "465"
    properties["mail.smtp.ssl.enable"] = "true"
    // assign properties to the mailsender
    mailSender.setJavaMailProperties(properties)
    // sign in with credentials
    mailSender.setUsername(credentials[0])
    mailSender.setPassword(credentials[1])

    // make the message and the object which will add the elements of the email to the message
    val messageManager = mailSender.createMimeMessage()
    var messageHelper = MimeMessageHelper(messageManager, true)
    // add the elements of the email
    messageHelper.setFrom(submittedEmail)
    messageHelper.setSubject(subject)
    messageHelper.setText("$name $message", true)
    messageHelper.addTo(recipient)

    // send email
    mailSender.send(messageManager)
}