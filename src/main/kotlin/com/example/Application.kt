package com.example

import io.micronaut.runtime.Micronaut.run
fun main(args: Array<String>) {
	run(*args)

	// get environment variables JAVJA_HOME and JAVA_OPTS
	val javaHome = System.getenv("JAVA_HOME")

	// get system properties
	val javaVersion = System.getProperty("java.version")

	// get environment variables
	val path = System.getenv("PATH")

}

