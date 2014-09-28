package scaladroid

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import de.codecraft.scaladroid.R


class MyActivity extends Activity {

    override def onCreate(savedInstanceState : Bundle ) = {
        super.onCreate(savedInstanceState)
        Log.d("test", "test")
        setContentView(R.layout.activity_my)
    }


    override def onCreateOptionsMenu(menu : Menu ) = {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater.inflate(R.menu.my, menu)
        true
    }

    override def onOptionsItemSelected(item : MenuItem ) = {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.getItemId

        if (id == R.id.action_settings) true else
          super.onOptionsItemSelected(item)
    }
}
