package nexters.admin.domain.user

import io.kotest.matchers.shouldNotBe
import org.junit.jupiter.api.Test

class PasswordTest {

    @Test
    fun `비밀번호 암호화`() {
        val password = Password("1234")

        password.value shouldNotBe "1234"
    }

    @Test
    fun `비밀번호 암호화 테스트 2`() {
        val password = Password("12345")

        password.value shouldNotBe "1234"
    }
}
