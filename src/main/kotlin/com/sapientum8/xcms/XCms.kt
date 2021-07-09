//@file:JvmName("XCms")
package com.sapientum8.xcms

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class XCms

fun main(args: Array<String>) {
	runApplication<XCms>(*args)
}