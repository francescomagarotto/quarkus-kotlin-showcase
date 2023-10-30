package org.francescomagarotto.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class Pet(
    @get:JsonProperty("name") var name: String = "Nome",
    @get:JsonProperty("age") var age: Int = 0
) {
}