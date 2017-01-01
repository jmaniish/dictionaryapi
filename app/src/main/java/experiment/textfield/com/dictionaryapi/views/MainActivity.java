package experiment.textfield.com.dictionaryapi.views;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import experiment.textfield.com.dictionaryapi.R;
import experiment.textfield.com.dictionaryapi.models.DictionaryResponse;

public class MainActivity extends AppCompatActivity {

    private TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button goButton = (Button) findViewById(R.id.go_btn);
        final EditText wordEditText = (EditText) findViewById(R.id.word_entry);
        resultView = (TextView) findViewById(R.id.result);

        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new CallbackTask().execute(dictionaryEntries(wordEditText.getText().toString()));
            }
        });
    }

    private String dictionaryEntries(String word) {
        final String language = "en";
        final String word_id = word.toLowerCase();
        return "https://od-api.oxforddictionaries.com:443/api/v1/entries/" + language + "/" + word_id;
    }


    private class CallbackTask extends AsyncTask<String, Integer, String> {

        @Override
        protected String doInBackground(String... params) {

            //TODO: replace with your own app id and app key
            final String app_id = "fbec7f56";
            final String app_key = "d0c92b8a0e3c085105969fed00d92399";
            try {
                URL url = new URL(params[0]);
                HttpsURLConnection urlConnection = (HttpsURLConnection) url.openConnection();
                urlConnection.setRequestProperty("Accept", "application/json");
                urlConnection.setRequestProperty("app_id", app_id);
                urlConnection.setRequestProperty("app_key", app_key);

                BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                StringBuilder stringBuilder = new StringBuilder();

                String line;
                while ((line = reader.readLine()) != null) {
                    stringBuilder.append(line + "\n");
                }

                return stringBuilder.toString();

            } catch (Exception e) {
                e.printStackTrace();
                return e.toString();
            }
        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);
            Gson gson = new Gson();
            DictionaryResponse dictionaryResponse = gson.fromJson(result, DictionaryResponse.class);
            resultView.setText(dictionaryResponse.results[0].getLexicalEntries()[0].getEntries()[0].getSenses()[0].getDefinitions()[0]);
            System.out.println(result);
        }
    }

}
