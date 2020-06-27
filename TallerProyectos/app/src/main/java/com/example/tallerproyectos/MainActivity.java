package com.example.tallerproyectos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText edt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Siguiente(View view){
        Intent siguiente = new Intent(this,Principal.class);
        startActivity(siguiente);
    }
    public void onCl(View view) {
        Uri uri = Uri.parse("https://l.facebook.com/l.php?u=https%3A%2F%2Fweb-chat.global.assistant.watson.cloud.ibm.com%2Fpreview.html%3Fregion%3Deu-gb%26integrationID%3D76801cae-2708-4aad-9ef2-c53ec41f5b56%26serviceInstanceID%3Df6a38ca3-bdf3-4497-95aa-af36%26fbclid%3DIwAR0CvEroVMw8ZgTNd7gIItkTMJ5GHKqYkbZaop0bdUb75qetf2IRLSJh01U&h=AT0GT-5H3pwsIPbsbNw2UT5qQe4DB4ywKU9XGVybSCpx4Z7x9lpfFtUXJPy8l1d54n7Fk31jYZoxql655qVJXCLv9czjRvoDcwdg0ljPTK80c-4OKC0T3p3jNq3VgkNF05mA6g");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}