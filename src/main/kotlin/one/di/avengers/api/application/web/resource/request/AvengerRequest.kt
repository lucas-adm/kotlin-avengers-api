package one.di.avengers.api.application.web.resource.request

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import one.di.avengers.api.domain.avenger.Avenger

data class AvengerRequest(

        @NotBlank
        @NotNull
        @NotEmpty
        val nick: String,

        @NotBlank
        @NotNull
        @NotEmpty
        val person: String,

        val description: String? = null,

        val history: String? = null
) {
    fun toAvenger() = Avenger(
            nick = nick,
            person = person,
            description = description,
            history = history
    )

    companion object {
        fun to(id: Long?, request: AvengerRequest) = Avenger(
                id = id,
                nick = request.nick,
                person = request.person,
                description = request.description,
                history = request.history
        )
    }
}