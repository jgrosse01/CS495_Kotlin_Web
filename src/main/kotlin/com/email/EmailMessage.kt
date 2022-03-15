package com.email

/**
 * A basic class to store the information that will be sent in an outgoing email for ease of acquiring from the form.
 */
class EmailMessage{
    // instance variables to be initialized by spring-mvc-xml (not figured out yet)
    private lateinit var name: String
    private lateinit var email: String
    private lateinit var subject: String
    private lateinit var message: String


    // basic getters and setters
    fun getName(): String {
        return name
    }

    fun getEmail(): String {
        return email
    }

    fun getSubject(): String {
        return subject
    }

    fun getMessage(): String {
        return message
    }

    fun setName(name: String) {
        this.name = name
    }

    fun setEmail(email: String) {
        this.email = email
    }

    fun setSubject(subject: String) {
        this.subject = subject
    }

    fun setMessage(message: String) {
        this.message = message
    }
}