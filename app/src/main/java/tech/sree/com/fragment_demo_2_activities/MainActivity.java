package tech.sree.com.fragment_demo_2_activities;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gotoLoginForm(getCurrentFocus());

    }

    public void gotoRegistationForm(View V){
        Registation_frg registation_frg  = new Registation_frg();
        FragmentManager fragmentManager =getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container,registation_frg);
        fragmentTransaction.commit();

    }

    public  void gotoLoginForm(View V){
        Login_frg login_frg = new Login_frg();
        FragmentManager fragmentManager =getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container,login_frg);
        fragmentTransaction.commit();
    }
}
