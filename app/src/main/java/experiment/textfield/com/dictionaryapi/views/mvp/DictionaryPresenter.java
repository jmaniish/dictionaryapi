package experiment.textfield.com.dictionaryapi.views.mvp;

import experiment.textfield.com.dictionaryapi.models.DictionaryResponse;
import experiment.textfield.com.dictionaryapi.network.RestFactory;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class DictionaryPresenter {
    private DictionaryView dictionaryView;
    private RestFactory restFactory;

    public DictionaryPresenter(DictionaryView dictionaryView, RestFactory restFactory) {
        this.dictionaryView = dictionaryView;
        this.restFactory = restFactory;
    }

    public void getMeaningForWord(String word) {
        restFactory.getDefinition().getDefinition(word).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<DictionaryResponse>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(DictionaryResponse dictionaryResponse) {
                dictionaryView.updateMeaning(dictionaryResponse.results[0].getLexicalEntries()[0]
                        .getEntries()[0].getSenses()[0].getDefinitions()[0]);
            }
        });
    }
}
