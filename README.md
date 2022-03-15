# CS495_Kotlin_Web
A Spring Boot WebApp developed in Kotlin using Gradle for Carroll College CS Seminar.

This assignment is not complete to the ideal that I would have liked it but still well surpasses the minimum requirements of the project (printing "Hello World" to a web page).

Unimplemented features:
1. Email bot that sent email when submitting the "Contact Us" form.
2. The ability to pull information from forms. I think I may have used the wrong templating framework (mustache) for the job and am now way to late to swap everything around before the deadline.


In order to run the program, clone the repository, and, in a terminal window, navigate to the top layer of the repository folder on your computer. Then run the following commands (without quotation marks):

"./gradlew build"

"./gradlew run"

In the case that the command is not found, in the same directory, elevate the permissions of "gradlew" (without quotes) to include execution. This will look something like the following for mac or linux "chmod -x gradlew" (without quotes). This is by no means a comprehensive guide to changing file permissions and you should refer to a proper online guide for this process.

IMPORTANT RUN NOTES:
1. Ensure you are running an admin terminal or you elevate the permission level of the command (both to include execution and to elevate at the command level e.g. 
"sudo") depending on your operating system.
2. If there is a Java version error, ensure that you are using Oracle OpenJDK version 17.0.1.
3. Ensure you elevate the permission of the terminal (Windows) or command (MacOS/Linux).

(Nate, if you read this, can we meet some time and try to figure out what the issue here was with not properly being able to pull from forms?)
