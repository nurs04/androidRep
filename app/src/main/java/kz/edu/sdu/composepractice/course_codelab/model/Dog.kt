package kz.edu.sdu.composepractice.course_codelab.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Dog(
    @DrawableRes
    val imageResId : Int,
    @StringRes
    val name : Int,
    val age : Int,
    @StringRes
    val hobbies : Int,
)
