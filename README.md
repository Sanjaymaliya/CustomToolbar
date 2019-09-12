# CustomToolbar
    A library for supporting custom Toolbar. You can set left side icon and right side icon 
    and also set text both side(left,right)
# Preview
![alt text](https://github.com/Sanjaymaliya/CustomToolbar/blob/master/app/src/main/res/drawable/image.png)

# 
# Integration

      allprojects {
      repositories {
        ...
         maven { url 'https://jitpack.io' }
       }
     }
     
     dependencies {
        implementation 'com.github.Sanjaymaliya:ToolBar:1.0'
     }
    
# XML File
      
    <com.maliyabrother.custom.ToolBar
        android:layout_marginTop="10dp"
        android:id="@+id/toolbarLeftImage"
        android:layout_width="match_parent"
        android:text="Toolbar"
        app:leftDrawable="@drawable/ic_back_arrow"
        app:toolbarTextColor="@color/colorWhite"
        app:toolbarBackgroundColor="@color/colorPrimaryDark"
        android:layout_height="wrap_content"/>


# In Your Code

       toolbarLeftImage.setLeftIconListener(listener = View.OnClickListener {
           Log.e("Tag :","Back icon click")
        })

        toolbarRightImage.setRightIconListener(listener = View.OnClickListener {
            Log.e("Tag :","Cross icon click")
        })

        toolbarRightTextView.setRightTextListener(listener = View.OnClickListener {
            Log.e("Tag :","Add Button click")
        })

        toolbarLeftTextView.setLeftTextListener(listener = View.OnClickListener {
            Log.e("Tag :","Back Button click")
        })
