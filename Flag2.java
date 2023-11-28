package b3nac.injuredandroid;        // declaring the package

import android.os.Bundle;        //importing classes and components
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

/* loaded from: classes.dex */
public class FlagTwoActivity extends androidx.appcompat.app.c {        //declaring class FlagTwoActivity which is inherited from androidx.appcompat.app.c
    int w = 0;        // Initializing integer variable w with the value 0

    public /* synthetic */ void F(View view) {        //declaring a method F() which assigns a parameter View to view
        int i = this.w;        // initializing integer i with the current interface with variable w
        if (i == 0) {        // if conditional block,if the value of integer i is 0 then execute if block
            Snackbar X = Snackbar.X(view, "Key words Activity and exported.", 0);    // creates a snackbar, initiates the snackbar with the message
            X.Y("Action", null);        //
            X.N();
            this.w++;
        } else if (i == 1) {
            Snackbar X2 = Snackbar.X(view, "Exported Activities can be accessed with adb or Drozer.", 0);
            X2.Y("Action", null);
            X2.N();
            this.w = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.c, androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_flag_two);
        C((Toolbar) findViewById(R.id.toolbar));
        ((FloatingActionButton) findViewById(R.id.fab)).setOnClickListener(new View.OnClickListener() { // from class: b3nac.injuredandroid.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FlagTwoActivity.this.F(view);
            }
        });
    }
}
