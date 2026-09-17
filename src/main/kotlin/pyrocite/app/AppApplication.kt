package pyrocite.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class AppApplication

fun main(args: Array<String>) {
	runApplication<AppApplication>(*args)
}

@RestController
@CrossOrigin(origins = ["http://localhost:5173", "http://localhost:3000"])
class WebController {
	@GetMapping("/api/data")
	fun getData() = mapOf("message" to "Hello from your Kotlin Backend!")
}
