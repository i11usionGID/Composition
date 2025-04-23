package com.example.composition.domain.entity

data class Question(
    val sun: Int,
    val visibleNumber: Int,
    val options: List<Int>
) {
}