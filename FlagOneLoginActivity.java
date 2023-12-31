package b3nac.injuredandroid;        // package declaration

import android.content.Intent;        //importing classes and components,Intent is used for navigating between activities, Bundle is used for passing data between components
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

/* loaded from: classes.dex */
public final class FlagOneLoginActivity extends androidx.appcompat.app.c {        // declares a class named FlagOneLoginActivity
    private int w;            // declares a private integer variable w, used to keep track of Flag state

    /* loaded from: classes.dex */
    static final class a implements View.OnClickListener {            // declares class a that implements the View.OnClickListener interface, handles click events for a specific view
        a() {            // constructor of class a
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {            //declaring a final method named onClick that takes a View parameter, and it does not return any value
            if (FlagOneLoginActivity.this.F() == 0) {        // declares if condition,checks if the value returned by the method F() in the FlagOneLoginActivity class is equal to 0
                Snackbar X = Snackbar.X(view, "The flag is right under your nose.", 0);        //reates a Snackbar object named X,along with the message
                X.Y("Action", null);        //configures Snackbar by setting an action with the label Action and a null action listener
                X.N();        //displays the configured Snackbar,N() method is often used to make the Snackbar visible
                FlagOneLoginActivity flagOneLoginActivity = FlagOneLoginActivity.this;        //creates a new variable named flagOneLoginActivity and assigns it a reference to the current instance of the FlagOneLoginActivity class
                flagOneLoginActivity.G(flagOneLoginActivity.F() + 1);        // updates state of FlagOneLoginActivity class,retrieves the current value using the F() method, increments it by 1, and then sets the updated value using the G() method
            } else if (FlagOneLoginActivity.this.F() == 1) {        // line initiates else-if block.checks whether the value returned by the F() method in the FlagOneLoginActivity class is equal to 1
                Snackbar X2 = Snackbar.X(view, "The flag is also under the GUI.", 0);    // creates a new Snackbar object named X2,it displays a message
                X2.Y("Action", null);        //configures the Snackbar (X2) by setting an action with the label Action and a null action listener
                X2.N();        //displays the configured Snackbar  (X2),N() method is often used to make the Snackbar visible
                FlagOneLoginActivity.this.G(0);        //resetting the flag state value to 0
            }
        }
    }

    public final int F() {        // declares a method F()
        return this.w;        //accessing the instance variable w and returns
    }

    public final void G(int i) {        //declares method G()
        this.w = i;        //method G takes an integer argument and sets the value of the instance variable w to that integer value
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.c, androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {        //method onCreate created and it overrides from the Activity class
        super.onCreate(bundle);        //calls the onCreate method of the superclass Activity
        setContentView(R.layout.activity_flag_one_login);        // this method sets the content view of the activity to the layout defined in activity_flag_one_login.xml
        j.j.a(this);        // calling a method a() on an object j.j
        C((Toolbar) findViewById(R.id.toolbar));        // finding a Toolbar view by its ID (R.id.toolbar) and passing it to a method named C()
        ((FloatingActionButton) findViewById(R.id.fab)).setOnClickListener(new a());        // finds a FloatingActionButton by its ID (R.id.fab) and sets a click listener on it
    }

    public final void submitFlag(View view) {        // method declared submitFlag with a View parameter named view
        EditText editText = (EditText) findViewById(R.id.editText2);        // retrieves an EditText widget from the layout using its ID, which is specified as editText2
        d.s.d.g.d(editText, "editText2");        // invokes a method d on an object s.d.g, passing the editText object and the string "editText2" as arguments
        if (d.s.d.g.a(editText.getText().toString(), "F1ag_0n3")) {        // line checks if the text entered in the EditText widget is equal to the string "F1ag_0n3"
            Intent intent = new Intent(this, FlagOneSuccess.class);        //  line creates an Intent to start a new activity, FlagOneSuccess
            new FlagsOverview().J(true);        // creates a new instance of FlagsOverview and calls a method J on it, passing true as an argument
            new j().b(this, "flagOneButtonColor", true);        //  creates a new instance of a class j and calls a method b on it, passing the current context (this), a string "flagOneButtonColor," and true as arguments
            startActivity(intent);        // starts the activity specified by the intent, which would likely transition the user to the success screen FlagOneSuccess
        }
    }
}
