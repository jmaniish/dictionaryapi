package experiment.textfield.com.dictionaryapi.views.mvvm;

import android.databinding.ObservableField;
import android.view.View;

import experiment.textfield.com.dictionaryapi.models.DictionaryResponse;
import experiment.textfield.com.dictionaryapi.network.RestFactory;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class DictionaryMVVMViewModel {

    public ObservableField<String> wordToSearch = new ObservableField<>("");
    private RestFactory restFactory;
    public ObservableField<String> wordDefinition = new ObservableField<>("");

    public DictionaryMVVMViewModel(RestFactory restFactory) {
        this.restFactory = restFactory;
    }

    public void findDefinitionForWord(View view) {
        restFactory.getDefinition().getDefinition(wordToSearch.get()).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<DictionaryResponse>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(DictionaryResponse dictionaryResponse) {
                wordDefinition.set(dictionaryResponse.results[0].getLexicalEntries()[0]
                        .getEntries()[0].getSenses()[0].getDefinitions()[0]);
            }
        });
    }

}
