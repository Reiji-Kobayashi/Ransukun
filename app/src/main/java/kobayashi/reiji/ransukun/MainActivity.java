package kobayashi.reiji.ransukun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void seisei(View view){
        TextView text = (TextView)this.findViewById(R.id.result);
        EditText edit = (EditText)this.findViewById(R.id.init);

        String s = edit.getText().toString();
        try {
            int i = Integer.parseInt(s);
            Random random = new Random();
            int n = random.nextInt(i);
            text.setText(String.valueOf(n + 1));
        }catch(NumberFormatException e){
        }
    }

    public void clear(View view){
        TextView text = (TextView)this.findViewById(R.id.result);
        EditText edit = (EditText)this.findViewById(R.id.init);

        text.setText("");
        edit.setText("");
    }
}