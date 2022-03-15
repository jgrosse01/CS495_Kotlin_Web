package com.semktweb

import com.fileread.readFile

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping


@Controller
class HtmlController {
    @GetMapping("/")
    fun home(model: Model): String {
        model["title"] = "Welcome to Jake.com"
        model["subtitle"] = "Yes... I am Jake"
        model["phead"] = "Who is this man?! (Or boy if you really wanna be mean like that...)"
        model["paragraph"] = readFile("static/paragraphs/home")
        model["imagedesc"] = ""
        model["image1"] = "jakeportrait.png"
        model["image2"] = "jakehand.png"
        model["image3"] = "eaglejake.jpg"
        return "pagewithcarousel"
    }

    @GetMapping("/about")
    fun about(model: Model): String {
        model["title"] = "About Me"
        model["subtitle"] = "This is Still Jake, Just New Pictures"
        model["phead"] = "A brief description if you would!"
        model["paragraph"] = readFile("static/paragraphs/about")
        model["imagedesc"] = ""
        model["image1"] = ""
        model["image2"] = ""
        model["image3"] = ""
        return "pagewithcarousel"
    }

    @GetMapping("/education")
    fun education(model: Model): String {
        model["title"] = "Jake's Education"
        model["subtitle"] = "Here's an image of a college diploma."
        model["phead"] = "So what did I really learn? *cough cough nothing cough*"
        model["paragraph"] = readFile("static/paragraphs/education")
        model["imagedesc"] = ""
        model["image1"] = ""
        return "page"
    }

    @GetMapping("/accomplishments")
    fun accomplishments(model: Model): String {
        model["title"] = "All I've Accomplished"
        model["subtitle"] = "...in life is nothing. Except this fence!"
        model["phead"] = "This is what I use to mask my feelings of inadequacy."
        model["paragraph"] = readFile("static/paragraphs/accomplishments")
        model["imagedesc"] = ""
        model["image1"] = ""
        model["image2"] = ""
        model["image3"] = ""
        return "pagewithcarousel"
    }

    @GetMapping("/passions")
    fun passions(model: Model): String {
        model["title"] = "Passion is for the Weak"
        model["subtitle"] = "Kidding of Course..."
        model["phead"] = "I like trains!"
        model["paragraph"] = readFile("static/paragraphs/passions")
        model["imagedesc"] = ""
        model["image1"] = ""
        model["image2"] = ""
        model["image3"] = ""
        return "pagewithcarousel"
    }

    @GetMapping("/strengths_and_weaknesses")
    fun strengthWeakness(model: Model): String {
        model["title"] = "I AM STRONG (and weak)"
        model["subtitle"] = "But in What Categories?"
        model["phead"] = "Strengths and Weaknesses are as Follows:"
        model["paragraph"] = readFile("static/paragraphs/strengthAndWeakness")
        model["imagedesc"] = ""
        model["image1"] = ""
        return "page"
    }

    @GetMapping("/contact")
    fun contact(model: Model): String {
        model["title"] = "Contact Me (Seriously I'm Lonely)"
        model["subtitle"] = "Not Concerningly or Anything Though..."
        return "contact"
    }

    @GetMapping("/disclaimer")
    fun disclaimer(model: Model): String {
        model["title"] = "Disclaimer"
        model["subtitle"] = "Simply to Disclaim"
        model["phead"] = "You may be thinking..."
        model["paragraph"] = readFile("static/paragraphs/disclaimer")
        model["imagedesc"] = ""
        model["image1"] = ""
        return "page"
    }
}