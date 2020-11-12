package com.example.consultasapi

data class ResultsModel
(
    val id: Int,
    val name: String,
    val type: String,
    val dimension: String,
    val residents: List<String>
)