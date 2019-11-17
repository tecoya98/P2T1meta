package mx.edu.tesoem.isc.meta.p2t1meta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
EditText n1,n2;
RadioButton sum,rest,div,mult;
TextView resul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=(EditText)findViewById(R.id.edv1);
        n2=(EditText)findViewById(R.id.edv2);
        resul=(TextView) findViewById(R.id.tresul);
        sum=(RadioButton)findViewById(R.id.rdsuma);
        rest=(RadioButton)findViewById(R.id.rdresta);
        div=(RadioButton)findViewById(R.id.rddiv);
        mult=(RadioButton)findViewById(R.id.rdmult);

    }
    public void Suma(View v){
        int v1 =Integer.parseInt(n1.getText().toString());
        int v2 =Integer.parseInt(n2.getText().toString());
        int r=v1+v2;
        resul.setText(r+"");
    }
    public void Resta(View v){
        int v1 =Integer.parseInt(n1.getText().toString());
        int v2 =Integer.parseInt(n2.getText().toString());
        int r=v1-v2;
        resul.setText(r+"");
    }
    public void Divi(View v){
        int v1 =Integer.parseInt(n1.getText().toString());
        int v2 =Integer.parseInt(n2.getText().toString());
        int r=v1/v2;
        resul.setText(r+"");
    }
    public void Mult(View v){
        int v1 =Integer.parseInt(n1.getText().toString());
        int v2 =Integer.parseInt(n2.getText().toString());
        int r=v1*v2;
        resul.setText(r+"");
    }
}
