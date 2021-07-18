package br.igorsantos.affirmations.data

import br.igorsantos.affirmations.R
import br.igorsantos.affirmations.model.Affirmation

/**
 * Created by IgorSantos on 7/9/2021.
 */
class DataSource {

    fun loadAffirmations(): List<Affirmation>{
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation3, R.drawable.image2),
            Affirmation(R.string.affirmation4, R.drawable.image3),
            Affirmation(R.string.affirmation5, R.drawable.image4),
            Affirmation(R.string.affirmation6, R.drawable.image5),
            Affirmation(R.string.affirmation7, R.drawable.image6),
            Affirmation(R.string.affirmation8, R.drawable.image7),
            Affirmation(R.string.affirmation9, R.drawable.image8),
            Affirmation(R.string.affirmation10, R.drawable.image9)
        )
    }
}