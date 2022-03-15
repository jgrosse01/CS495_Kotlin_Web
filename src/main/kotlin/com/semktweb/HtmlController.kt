package com.semktweb

import com.email.EmailMessage
import com.fileread.readFile

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping


/**
 * Controller class for web handles and routing.
 */
@Controller
class HtmlController {

    /*
    All of the following are mappings for the pages which they route to and load.
    Each one takes a Model argument and the model has elements set to specific values to be generically
    filled into mustache html templates. These templates' files names are the return strings for each method.
     */
    @GetMapping("/")
    fun home(model: Model): String {
        model["webtitle"] = "Jake.com"
        model["title"] = "Welcome to Jake.com"
        model["subtitle"] = "Yes... I am Jake"
        model["phead"] = "Who is this man?! (Or boy if you really wanna be mean like that...)"
        model["paragraph"] = readFile("static/paragraphs/home")
        model["imagedesc"] = "carousel of jake"
        model["image1"] = "jakeportrait.png"
        model["image2"] = "jakehand.png"
        model["image3"] = "eaglejake.jpg"
        return "pagewithcarousel"
    }

    @GetMapping("/about")
    fun about(model: Model): String {
        model["webtitle"] = "Jake.com"
        model["title"] = "About Me"
        model["subtitle"] = "This is Still Jake, Just New Pictures"
        model["phead"] = "A brief description if you would!"
        model["paragraph"] = readFile("static/paragraphs/about")
        model["imagedesc"] = "carousel of jake"
        model["image1"] = "saxjake.jpeg"
        model["image2"] = "sweaterjake.jpg"
        model["image3"] = "modajake.jpg"
        return "pagewithcarousel"
    }

    @GetMapping("/education")
    fun education(model: Model): String {
        model["webtitle"] = "Jake.com"
        model["title"] = "Jake's Education"
        model["subtitle"] = "Here's an image of a college diploma."
        model["phead"] = "So what did I really learn? *cough cough nothing cough*"
        model["paragraph"] = readFile("static/paragraphs/education")
        model["imagedesc"] = "generic diploma"
        model["image1"] = "generic-diploma.jpg"
        return "page"
    }

    @GetMapping("/accomplishments")
    fun accomplishments(model: Model): String {
        model["webtitle"] = "Jake.com"
        model["title"] = "All I've Accomplished"
        model["subtitle"] = "...in life is nothing. Except this fence!"
        model["phead"] = "This is what I use to mask my feelings of inadequacy."
        model["paragraph"] = readFile("static/paragraphs/accomplishments")
        model["imagedesc"] = "a fence built by jake"
        model["image1"] = "notmyfence.jpg"
        return "page"
    }

    @GetMapping("/contact")
    fun contact(model: Model): String {
        model["webtitle"] = "Jake.com"
        model["title"] = "Contact Me"
        model["subtitle"] = "Seriously.. I'm lonely... Not Concerningly or Anything Though..."
        return "contact"
    }

    // not yet implemented
    // literally does not work, there is no link to it as of right now
    // my email bot fell through because I couldn't extract the data from the form
    @PostMapping("/contact_return")
    fun contactReturn(model: Model, @ModelAttribute("EmailMessage") emailMessage: EmailMessage): String {
        model["name"] = emailMessage.getName()
        model["email"] = emailMessage.getEmail()
        model["subject"] = emailMessage.getSubject()
        model["message"] = emailMessage.getMessage()
        return "form_submit"
    }

    // this returns to the above format of these methods shown at the top
    @GetMapping("/disclaimer")
    fun disclaimer(model: Model): String {
        model["webtitle"] = "Jake.com"
        model["title"] = "Disclaimer"
        model["subtitle"] = "Simply to Disclaim"
        model["phead"] = "You may be thinking..."
        model["paragraph"] = readFile("static/paragraphs/disclaimer")
        model["imagedesc"] = "disclaimer hand with exclamation point"
        model["image1"] = "disclaimer.jpg"
        return "page"
    }
}