package com.fileread

import java.io.File
import java.nio.file.Paths

fun readFile(fileName: String): String {
    val file = File(Paths.get("src/main/resources/static/paragraphs/$fileName").toAbsolutePath().toString())
    var retString = ""
    file.forEachLine {
        retString += it
    }
    return(retString)
}