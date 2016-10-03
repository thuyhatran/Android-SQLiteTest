package example.thuya.com.sqlitetest;

import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ContentValues values = new ContentValues();
        values.put(DBOpenHelper.NOTE_TEXT,"New Note");
        Uri noteUri = getContentResolver().insert(ThuyaProvider.CONTENT_URI,values);
        Log.d("MainActivity","Insert note" + noteUri.getLastPathSegment());

        Toast.makeText(this, "Insert note " + noteUri.getLastPathSegment() ,
                Toast.LENGTH_SHORT).show();
    }
}
