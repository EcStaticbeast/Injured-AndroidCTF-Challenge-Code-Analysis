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
            X.Y("Action", null);        // declares the snapbar with the method action
            X.N();        //declares method N() to display the message from snackbar
            this.w++;        //in the current instance value of variable w is incremented
        } else if (i == 1) {    // else condition, if the value of integer i is equal to 1 then 
            Snackbar X2 = Snackbar.X(view, "Exported Activities can be accessed with adb or Drozer.", 0);    //creates snackbar x2, initiates the snackbar with the message
            X2.Y("Action", null);        //adds an action "Action" to the snackbar with a null callback
            X2.N();        //declares N() method to display snackbar
            this.w = 0;        //in the current interface,value of variable w is set to 0
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
