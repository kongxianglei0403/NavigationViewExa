package com.kxl.atu.navigationviewexa;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

/**
 *  侧滑菜单
 *@author tutu
 *  create at 2017/6/26 15:42
 */
public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toorbar);
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        navigationView = (NavigationView) findViewById(R.id.nv);
        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_nv:
                //ToastUtils.showToast(this, "NavigationView使用实例");
                Toast.makeText(this,"NavigationView使用实例",Toast.LENGTH_SHORT);
                break;
            case R.id.menu_til:
                ToastUtils.showToast(this, "TextInputLayout使用实例");
                break;
            case R.id.menu_fab:
                ToastUtils.showToast(this, "FloatingActionButton使用实例");
                break;
            case R.id.menu_sb:
                ToastUtils.showToast(this, "Snackbar使用实例");
                break;
            case R.id.menu_cl:
                ToastUtils.showToast(this, "CoordinatorLayout使用实例");
                break;
            case R.id.menu_al:
                ToastUtils.showToast(this, "AppBarLayout使用实例");
                break;
            case R.id.menu_ctl:
                ToastUtils.showToast(this, "CollapsingToolbarLayout使用实例");
                break;
            case R.id.ic_setting:
                ToastUtils.showToast(this, "设置");
                break;
            case R.id.ic_search:
                ToastUtils.showToast(this, "搜索");
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}
