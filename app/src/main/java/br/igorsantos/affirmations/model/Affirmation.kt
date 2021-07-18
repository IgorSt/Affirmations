package br.igorsantos.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * Created by IgorSantos on 7/9/2021.
 */
data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
    )
