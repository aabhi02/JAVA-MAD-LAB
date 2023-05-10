<?xml version="1.0" encoding="utf-8"?>

<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:fitsSystemWindows="true"
    android:orientation="vertical"
    tools:context=".MainActivity">

    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="125dp"
        android:background="@color/white">

        <ImageView
            android:layout_width="61dp"
            android:layout_height="83dp"
            android:layout_alignParentEnd="true"
            android:layout_alignParentBottom="true"
            android:layout_marginEnd="53dp"
            android:layout_marginBottom="21dp"
            android:background="@drawable/logo" />

        <TextView
            android:layout_width="335dp"
            android:layout_height="wrap_content"
            android:layout_alignParentEnd="true"
            android:layout_alignParentBottom="true"
            android:layout_marginEnd="95dp"
            android:layout_marginBottom="31dp"
            android:text="LET OUR MINDS TAKE CARE OF YOUR PROBLEMS"
            android:textAlignment="center"
            android:textColor="@color/black"
            android:textSize="12dp"
            android:textStyle="italic" />

        <TextView
            android:id="@+id/textView3"
            android:layout_width="193dp"
            android:layout_height="wrap_content"
            android:layout_alignParentEnd="true"
            android:layout_alignParentBottom="true"
            android:layout_marginEnd="151dp"
            android:layout_marginBottom="53dp"
            android:text="AI SOLUTIONS"
            android:textAlignment="center"
            android:textColor="@color/black"
            android:textSize="22dp"
            android:textStyle="bold" />

    </RelativeLayout>

    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="@color/teal_200">

        <View
            android:id="@+id/view2"
            android:layout_width="match_parent"
            android:layout_height="4dp"
            android:background="@color/black" />

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentStart="true"
            android:layout_alignParentTop="true"
            android:layout_alignParentEnd="true"
            android:layout_alignParentBottom="true"
            android:layout_marginStart="143dp"
            android:layout_marginTop="57dp"
            android:layout_marginEnd="143dp"
            android:layout_marginBottom="515dp"
            android:text="Abhishek A"
            android:textAlignment="center"
            android:textColor="@color/black"
            android:textSize="25dp" />

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentEnd="true"
            android:layout_alignParentBottom="true"
            android:layout_marginEnd="141dp"
            android:layout_marginBottom="467dp"
            android:text="AI Engineer"
            android:textAlignment="center"
            android:textColor="@color/black"
            android:textSize="25dp" />

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentEnd="true"
            android:layout_alignParentBottom="true"
            android:layout_marginEnd="135dp"
            android:layout_marginBottom="419dp"
            android:text="9945559291"
            android:textAlignment="center"
            android:textColor="@color/black"
            android:textSize="25dp" />

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentEnd="true"
            android:layout_alignParentBottom="true"
            android:layout_marginEnd="149dp"
            android:layout_marginBottom="366dp"
            android:text="Bengaluru"
            android:textAlignment="center"
            android:textColor="@color/black"
            android:textSize="25dp" />

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentEnd="true"
            android:layout_alignParentBottom="true"
            android:layout_marginEnd="110dp"
            android:layout_marginBottom="315dp"
            android:text="abhi@gmail.com"
            android:textAlignment="center"
            android:textColor="@color/black"
            android:textSize="25dp" />

    </RelativeLayout>
</LinearLayout>