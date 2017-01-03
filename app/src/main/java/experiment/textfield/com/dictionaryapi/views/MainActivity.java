package experiment.textfield.com.dictionaryapi.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import experiment.textfield.com.dictionaryapi.R;
import experiment.textfield.com.dictionaryapi.models.DictionaryResponse;
import experiment.textfield.com.dictionaryapi.network.RestFactory;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    private TextView resultView;
    private RestFactory restFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button goButton = (Button) findViewById(R.id.go_btn);
        final EditText wordEditText = (EditText) findViewById(R.id.word_entry);
        resultView = (TextView) findViewById(R.id.result);

        restFactory = new RestFactory();
        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restFactory.getDefinition().getDefinition(wordEditText.getText().toString()).subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<DictionaryResponse>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(DictionaryResponse dictionaryResponse) {
                        resultView.setText(dictionaryResponse.results[0].getLexicalEntries()[0]
                                .getEntries()[0].getSenses()[0].getDefinitions()[0]);
                    }
                });
            }
        });
    }

}
