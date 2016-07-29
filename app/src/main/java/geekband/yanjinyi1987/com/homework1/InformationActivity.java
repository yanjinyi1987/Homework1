package geekband.yanjinyi1987.com.homework1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class InformationActivity extends AppCompatActivity {
    private Button mreturnButton;

    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.return_button:
                    Intent intent = new Intent(InformationActivity.this,MainActivity.class);
                    startActivity(intent);
                    //记得销毁这个Activity哦，否则在MainActivity中再销毁是有难度的，至少我现在不会用什么Activity栈的。
                    finish();
                    break;
                default:
                    break;
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        mreturnButton=(Button)findViewById(R.id.return_button);
        mreturnButton.setOnClickListener(mOnClickListener);
    }
}
