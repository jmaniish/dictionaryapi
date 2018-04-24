package experiment.textfield.com.dictionaryapi.views.kotlin

import experiment.textfield.com.dictionaryapi.models.DictionaryResponse
import experiment.textfield.com.dictionaryapi.network.RestFactory
import rx.Observer
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

class DictionaryKotlinPresenter(private val dictionaryKotlinView: DictionaryKotlinView, val restFactory: RestFactory) {


    fun getMeaningForWord(word: String) {
        restFactory.definition.getDefinition(word).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<DictionaryResponse> {
                    override fun onCompleted() {

                    }

                    override fun onError(e: Throwable) {

                    }

                    override fun onNext(dictionaryResponse: DictionaryResponse) {
                        dictionaryKotlinView.updateMeaning(dictionaryResponse.results[0].lexicalEntries[0]
                                .entries[0].senses[0].definitions[0])
                    }
                })
    }
}
