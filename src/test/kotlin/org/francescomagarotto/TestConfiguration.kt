package org.francescomagarotto

import io.quarkus.test.junit.QuarkusTestProfile

class TestConfiguration : QuarkusTestProfile {
    override fun getConfigOverrides(): MutableMap<String, String> {
        return mutableMapOf(
            Pair("quarkus.datasource.db-kind", "h2"),
            Pair("quarkus.datasource.username", "user"),
            Pair("quarkus.datasource.password", "user"),
            Pair(
                "quarkus.datasource.jdbc.url",
                "jdbc:h2:mem:testdb;INIT=RUNSCRIPT FROM 'src/test/resources/import.sql';"
            ),
        )
    }
}