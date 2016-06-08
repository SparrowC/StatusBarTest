#设置透明状态栏
android4.4后的版本可以让最上方的状态栏透明化，效果如下图
![这里写图片描述](http://img.blog.csdn.net/20160606204739511)
我们可以通过代码来修改，具体代码如下
```java
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            //透明状态栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            
        }
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
```

布局文件如下：
```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <ImageView
        android:layout_width="match_parent"
        android:layout_height="200dp"
        android:src="@drawable/custom_head_card_default_bg"
        android:scaleType="fitXY"
        android:layout_alignParentTop="true"/>
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        android:layout_centerInParent="true"/>
</RelativeLayout>

```
当然还得在theme中选择一个NoActionBar的主题。我的代码如下：
```xml
<resources>

    <!-- Base application theme. -->
    <style name="AppTheme" parent="Theme.AppCompat.Light.NoActionBar">
        <!-- Customize your theme here. -->
        <item name="colorPrimary">@color/colorPrimary</item>
        <item name="colorPrimaryDark">@color/colorPrimaryDark</item>
        <item name="colorAccent">@color/colorAccent</item>
    </style>

</resources>

```
