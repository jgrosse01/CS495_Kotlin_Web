package com.semktweb

// basic spring imports
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

// open class because there is no concrete definition, but it is the host class for the web app
@SpringBootApplication
open class SpringBootSeminarApp

// main method runs web-app with potential passed arguments :)
fun main(args: Array<String>) {
    runApplication<SpringBootSeminarApp>(*args)
}