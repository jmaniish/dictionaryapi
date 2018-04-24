package experiment.textfield.com.dictionaryapi.views.mvvm;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import experiment.textfield.com.dictionaryapi.R;
import experiment.textfield.com.dictionaryapi.databinding.ActivityMainBinding;
import experiment.textfield.com.dictionaryapi.network.RestFactory;

public class DictionaryMVVMActivity extends AppCompatActivity {

    private DictionaryMVVMViewModel dictionaryMVVMViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dictionaryMVVMViewModel = new DictionaryMVVMViewModel(new RestFactory());
        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mainBinding.setMainViewModel(dictionaryMVVMViewModel);
    }
}
