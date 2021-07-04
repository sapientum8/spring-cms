package com.sapientum8.xcms

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class XcmsApplication

fun main(args: Array<String>) {
	runApplication<XcmsApplication>(*args)
}