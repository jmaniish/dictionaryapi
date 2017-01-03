package experiment.textfield.com.dictionaryapi.network;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestFactory {

    public DictionaryService getDefinition() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://od-api.oxforddictionaries.com:443")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        DictionaryService service = retrofit.create(DictionaryService.class);
        return service;
    }
}
