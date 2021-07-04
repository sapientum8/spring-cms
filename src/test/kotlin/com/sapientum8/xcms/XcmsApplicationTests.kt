package com.sapientum8.xcms

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class IntegrationTests(@Autowired val restTemplate: TestRestTemplate) {

	@BeforeAll
	fun setup() {
		println(">> Setup")
	}

	@Test
	fun `Assert blog page title, content and status code`() {
		println(">> Assert blog page title, content and status code")
		val entity = restTemplate.getForEntity<String>("/",String::class.java)
		assertThat(entity.statusCode).isEqualTo(HttpStatus.OK)
		assertThat(entity.body).contains("<h1>Xcms v 0.1</h1>")
	}

	@Test
	fun `Assert article page title, content and status code`() {
		println(">> TODO")
	}

	@AfterAll
	fun teardown() {
		println(">> Tear down")
	}

}