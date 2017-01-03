package experiment.textfield.com.dictionaryapi.network;

import experiment.textfield.com.dictionaryapi.models.DictionaryResponse;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import rx.Observable;

public interface DictionaryService {

    @Headers({
            "Accept : application/json",
            "app_id : fbec7f56",
            "app_key : d0c92b8a0e3c085105969fed00d92399"
    })
    @GET("/api/v1/entries/en/{word_id}/definitions")
    Observable<DictionaryResponse> getDefinition(@Path("word_id") String wordId);
}
