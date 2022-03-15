package com.fileread

import java.io.File
import java.nio.file.Paths

/**
 * Function that reads a file and returns it as a string.
 */
fun readFile(fileName: String): String {
    // open file from root of project, formatted as absolute path
    val file = File(Paths.get("src/main/resources/$fileName").toAbsolutePath().toString())
    // empty string to add to
    var retString = ""
    // read lines
    file.forEachLine {
        // add line to string
        retString += it
    }
    // return string
    return(retString)
}