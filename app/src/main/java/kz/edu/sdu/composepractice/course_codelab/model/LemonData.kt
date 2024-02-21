package kz.edu.sdu.composepractice.course_codelab.model

import androidx.annotation.StringRes

data class LemonData(
    val image : Int,
    @StringRes
    val text : Int
)