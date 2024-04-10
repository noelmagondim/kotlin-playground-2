package com.betrybe.playground

class OlympicDiscipline(
    name: String,
    code: Int
) : Discipline(name, code), Olympic {
    override fun extraClasses(): String {
        TODO("Not yet implemented")
    }

    override fun competition(): String {
        TODO("Not yet implemented")
    }
}