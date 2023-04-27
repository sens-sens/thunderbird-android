package app.k9mail.autodiscovery.autoconfig

import assertk.assertThat
import assertk.assertions.containsExactly
import org.junit.Test

class ProviderAutoconfigUrlProviderTest {
    private val urlProvider = ProviderAutoconfigUrlProvider()

    @Test
    fun `getAutoconfigUrls with ASCII email address`() {
        val autoconfigUrls = urlProvider.getAutoconfigUrls("test@domain.example")

        assertThat(autoconfigUrls.map { it.toString() }).containsExactly(
            "https://autoconfig.domain.example/mail/config-v1.1.xml?emailaddress=test%40domain.example",
            "https://domain.example/.well-known/autoconfig/mail/config-v1.1.xml?emailaddress=test%40domain.example",
            "http://autoconfig.domain.example/mail/config-v1.1.xml?emailaddress=test%40domain.example",
            "http://domain.example/.well-known/autoconfig/mail/config-v1.1.xml?emailaddress=test%40domain.example",
        )
    }
}
