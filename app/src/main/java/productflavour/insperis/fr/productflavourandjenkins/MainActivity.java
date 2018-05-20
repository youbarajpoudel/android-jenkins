package productflavour.insperis.fr.productflavourandjenkins;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView baseUrl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        baseUrl=findViewById(R.id.txt_base_url);
        baseUrl.setText(BuildConfig.BASE_URL);
    }
}
