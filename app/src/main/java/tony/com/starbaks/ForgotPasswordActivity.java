package tony.com.starbaks;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ForgotPasswordActivity extends AppCompatActivity {

    private static final int REQUEST_SIGNUP = 0;
    EditText _emailText;
    TextView link_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        _emailText = findViewById(R.id.input_email);
        link_back = findViewById(R.id.link_back);

        link_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the ForgotPassword activity
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivityForResult(intent, REQUEST_SIGNUP);
                finish();
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
            }

        });
    }
}
