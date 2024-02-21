package kz.edu.sdu.composepractice.course_codelab.model

import androidx.annotation.StringRes
import kz.edu.sdu.composepractice.R

data class Topic(
    @StringRes
    val name : Int,
    val page : Int,
    val images : Int


)