package unknown.random

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Deprecated("所处路径不在@Application的所在路径内，不会被自动加载")
@RestController
@RequestMapping
class UnknownPathController {

    @GetMapping("/unknown")
    fun goodbye() = "Hello, this is from unknown package"
}
