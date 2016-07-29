package geekband.yanjinyi1987.com.homework1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private Button mshowInf_button;
    private ImageButton mexit_button;

    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch(view.getId()) {
                //进入下一个Activity，写代码的时候使用代码提示以减少奇怪的报错，这应该是编辑器的问题。
                case R.id.enter_button:
                    Intent intent=new Intent(MainActivity.this,InformationActivity.class);
                    startActivity(intent);
                    break;
                case R.id.exit_button:
                    //退出Main Activity
                    Intent intent2 = new Intent(Intent.ACTION_MAIN);
                    intent2.addCategory(Intent.CATEGORY_HOME);
                    intent2.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent2);
                    android.os.Process.killProcess(android.os.Process.myPid());
                    break;
                default:
                    break;
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mshowInf_button=(Button)findViewById(R.id.enter_button);
        mexit_button=(ImageButton)findViewById(R.id.exit_button);
        mshowInf_button.setOnClickListener(mOnClickListener);
        mexit_button.setOnClickListener(mOnClickListener);
    }
}
