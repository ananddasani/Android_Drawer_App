# Android_Drawer_App
Implementing The Navigation Drawer in the App

This topic is a part of [My Complete Andorid Course](https://github.com/ananddasani/Android_Apps)

# App Highlight
![Drawer App1](https://user-images.githubusercontent.com/74413402/192095763-b8fb37fe-472f-4d01-848a-f43dd230c1a0.png)
![Drawer App2](https://user-images.githubusercontent.com/74413402/192095768-49ce815b-120d-48ff-a2fe-52597a3804f5.png)
![Drawer Code](https://user-images.githubusercontent.com/74413402/192095769-40b54982-cb91-4741-a13d-978961c21f00.png)


# Code

1. Create Header File (in Layout using LayoutResourceFile)
### nav_header.xml
```
<?xml version="1.0" encoding="utf-8"?>
<androidx.appcompat.widget.LinearLayoutCompat xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="vertical"
    android:gravity="center|top"
    android:background="#3B2196F3"
    >


    <ImageView
        android:id="@+id/imageView"
        android:layout_width="150dp"
        android:layout_height="150dp"
        app:srcCompat="@drawable/logo"
        android:layout_marginTop="20dp"/>

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:fontFamily="@font/aclonica"
        android:text="Anand Dasani"
        android:textSize="34sp" />

    <TextView
        android:id="@+id/textView2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="www.github.com/ananddasnai"
        android:layout_marginBottom="20dp"/>
</androidx.appcompat.widget.LinearLayoutCompat>
```

2. Create Menu file (menu/nav_menu.xml)
### nav_menu.xml
```
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">

    <group android:checkableBehavior="single">

        <item
            android:id="@+id/home_item"
            android:icon="@drawable/home"
            android:title="Home" />

        <item
            android:id="@+id/search_item"
            android:icon="@drawable/search"
            android:title="Search" />

        <item
            android:id="@+id/user_item"
            android:icon="@drawable/user"
            android:title="User" />

        <item
            android:id="@+id/profile_item"
            android:icon="@drawable/profile"
            android:title="Profile" />

        <item
            android:id="@+id/setting_item"
            android:icon="@drawable/setting"
            android:title="Settings" />

    </group>

    <group android:checkableBehavior="single">

        <item android:title="Communication">

            <menu>
                <item
                    android:id="@+id/share_item"
                    android:icon="@drawable/share"
                    android:title="Share" />

                <item
                    android:id="@+id/donate_item"
                    android:icon="@drawable/donate"
                    android:title="Donate" />
            </menu>

        </item>

    </group>

    <group android:checkableBehavior="single">

        <item android:title="Authentication">

            <menu>

                <item
                    android:id="@+id/login_item"
                    android:icon="@drawable/login"
                    android:title="Login" />

            </menu>

        </item>

    </group>
</menu>
```

3. Add Both the files in activity_main.xml
### activity_main.xml
```
<?xml version="1.0" encoding="utf-8"?>
<androidx.drawerlayout.widget.DrawerLayout xmlns:android="http://schemas.android.com/apk/res/android"

    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/drawerLayout"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:fitsSystemWindows="false"
    tools:context=".MainActivity">

    <androidx.appcompat.widget.LinearLayoutCompat
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <androidx.appcompat.widget.Toolbar
            android:id="@+id/toolbar"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:background="#3B2196F3"
            app:title="Navigation Drawer App" />

    </androidx.appcompat.widget.LinearLayoutCompat>

    <com.google.android.material.navigation.NavigationView
        android:id="@+id/navigationView"
        android:layout_width="wrap_content"
        android:layout_height="match_parent"

        android:layout_gravity="start"
        app:headerLayout="@layout/nav_header"

        app:menu="@menu/nav_menu" />

</androidx.drawerlayout.widget.DrawerLayout>
```

4. Do Backend for all 
#### MainActivity.java
```
DrawerLayout drawerLayout;
NavigationView navigationView;
ActionBarDrawerToggle toggle;

Toolbar toolbar = findViewById(R.id.toolbar);
setSupportActionBar(toolbar);

drawerLayout = findViewById(R.id.drawerLayout);
navigationView = findViewById(R.id.navigationView);

        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.home_item:
                        Toast.makeText(MainActivity.this, "Home Page", Toast.LENGTH_SHORT).show();

                        //close the drawer
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.search_item:
                        Toast.makeText(MainActivity.this, "Search Page", Toast.LENGTH_SHORT).show();

                        //close the drawer
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.user_item:
                        Toast.makeText(MainActivity.this, "User Page", Toast.LENGTH_SHORT).show();

                        //close the drawer
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.profile_item:
                        Toast.makeText(MainActivity.this, "Profile Page", Toast.LENGTH_SHORT).show();

                        //close the drawer
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.setting_item:
                        Toast.makeText(MainActivity.this, "Setting Page", Toast.LENGTH_SHORT).show();

                        //close the drawer
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                }
                return true;
            }
        });
```
