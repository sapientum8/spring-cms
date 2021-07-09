package com.sapientum8.xcms

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtmlController {
    @GetMapping("/")
    fun xcms(model: Model): String {
        model["title"] = "XCms v 0.1"
        return "xcms"
    }
}