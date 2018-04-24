package experiment.textfield.com.dictionaryapi.views.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View.GONE
import android.view.View.VISIBLE
import experiment.textfield.com.dictionaryapi.R
import experiment.textfield.com.dictionaryapi.network.RestFactory
import kotlinx.android.synthetic.main.activity_dictionary1.*

class DictionaryKotlinKotlinActivity : AppCompatActivity(), DictionaryKotlinView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dictionary1)
        val dictionaryPresenter = DictionaryKotlinPresenter(this, RestFactory())

        goBtn.setOnClickListener {
            dictionaryPresenter.getMeaningForWord(wordInput.text.toString())
            progressBar.visibility = VISIBLE
        }
    }

    override fun updateMeaning(meaning: String) {
        progressBar.visibility = GONE
        resultText.text = meaning
    }
}
