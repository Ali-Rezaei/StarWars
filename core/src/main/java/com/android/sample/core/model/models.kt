package com.android.sample.core.model

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize

class PeopleWrapper(
    @Json(name = "results")
    val wrapper: List<Person>,
    val next: String?
)

@Parcelize
data class Person(
    val name: String,
    val height: String,
    @Json(name = "birth_year")
    val birthYear: String
) : Parcelable