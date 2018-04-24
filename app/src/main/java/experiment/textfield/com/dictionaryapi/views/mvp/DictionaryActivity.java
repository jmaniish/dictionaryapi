package experiment.textfield.com.dictionaryapi.views.mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import experiment.textfield.com.dictionaryapi.R;
import experiment.textfield.com.dictionaryapi.network.RestFactory;

public class DictionaryActivity extends AppCompatActivity implements DictionaryView {

    private TextView textView;
    private Button goBtn;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dictionary);
        final DictionaryPresenter dictionaryPresenter = new DictionaryPresenter(this, new RestFactory());

        setupUi();
        goBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dictionaryPresenter.getMeaningForWord(editText.getText().toString());
            }
        });
    }

    private void setupUi() {
        editText = (EditText) findViewById(R.id.word_entry_presenter);
        textView = (TextView) findViewById(R.id.result_presenter);
        goBtn = (Button) findViewById(R.id.go_btn_presenter);
    }

    @Override
    public void updateMeaning(String meaning) {
        textView.setText(meaning);
    }
}
