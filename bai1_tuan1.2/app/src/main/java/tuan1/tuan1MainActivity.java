package tuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.lineaerlayout.R;

public class tuan1MainActivity extends AppCompatActivity {
    // khai báo các control
    EditText txt1,txt2;
    Button btn1;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan1_main);
        // anh xa cac control
        txt1=findViewById(R.id.demo11);
        txt2=findViewById(R.id.demo22);
        btn1=findViewById(R.id.button);
        tv1=findViewById(R.id.textView2);
        // xu ly su kien
        btn1.setOnClickListener(v->{
            // goi ham tinh tong
            tinhTong();
        });
    }

    // dinh nghia ham tinh tong
    private void tinhTong() {
        //lay du lieu vao tu edit
        String str1=txt1.getText().toString();
        String str2=txt2.getText().toString();
        float s_1=Float.parseFloat(str1);
        float s_2 =Float.parseFloat(str2);
        float tong=s_1+s_2;
        //in ket qua;
        tv1.setText(String.valueOf(tong));
    }
}