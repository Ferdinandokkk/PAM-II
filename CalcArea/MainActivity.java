package com.example.pmii40;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.pmii40.R;

import java.text.DecimalFormat;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botaoCalcAreaListener();
}

    public void botaoCalcAreaListener() {
        Button botaoCalcArea = (Button) findViewById(R.id.botaoCalcArea);
        botaoCalcArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final EditText inputAlt = (EditText) findViewById(R.id.inputAlt);
                double alturaDecimal = Double.parseDouble(inputAlt.getText().toString());
                final EditText inputLarg = (EditText) findViewById(R.id.inputLarg);
                double larguraDecimal = Double.parseDouble(inputLarg.getText().toString());
                DecimalFormat df = new DecimalFormat("#.#");

                double areaDecimal = Double.parseDouble(df.format(alturaDecimal * larguraDecimal));
                final EditText outputArea = (EditText) findViewById(R.id.outputArea);
                outputArea.setText(Double.toString(areaDecimal));
            }
        });
    }

}
