package kr.ac.kopo.direct7_1;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ImageView imgv;
    EditText editAngle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        imgv=findViewById(R.id.imgv);
        editAngle = findViewById(R.id.editangle);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        return true;
}
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);

        if (item.getItemId() == R.id.item_rotation) {
            int angle = Integer.parseInt(editAngle.getText().toString());
            imgv.setRotation(angle);
            return true;
        } else if (item.getItemId() == R.id.item_seraph) {
            imgv.setImageResource(R.drawable.seraph);
            return true;
        } else if (item.getItemId() == R.id.item_spear) {
            imgv.setImageResource(R.drawable.spear_of_amon);
            return true;
        } else if (item.getItemId() == R.id.auir) {
            imgv.setImageResource(R.drawable.auir);
            return true;
        }

        return false;
    }


}