# 1 android

## 1.1 目录文件

![image-20230910141118527](C:\Users\7878\AppData\Roaming\Typora\typora-user-images\image-20230910141118527.png)

# 2 简单控件

## 2.1 文本

### 2.1.1 文本显示

在Android中，您可以使用TextView控件来显示文本。要设置文本，您可以通过以下步骤进行操作：

1. 在XML布局文件中添加TextView控件：

   ```xml
   <TextView
       android:id="@+id/myTextView"
       android:layout_width="wrap_content"
       android:layout_height="wrap_content"
       android:text="Hello, World!" />
   ```

2. 在Java代码中找到TextView控件并设置文本：

   ```java
   TextView myTextView = findViewById(R.id.myTextView);
   myTextView.setText("Hello, Android!");
   ```

上述代码示例中，我们首先在XML布局文件中添加了一个TextView控件，并为其指定了一个唯一的ID（@+id/myTextView）。然后，在Java代码中，我们使用findViewById()方法通过ID找到TextView控件的实例，并使用setText()方法设置要显示的文本内容。

### 2.1.2 文本大小

使用XML布局文件设置文本大小：

你可以在XML布局文件中使用 `android:textSize` 属性来设置文本的大小。这个属性用于指定文本的字体大小，可以使用不同的单位，如"sp"（缩放独立像素）、"dp"（密度独立像素）、"px"（像素）等。

例如，以下是一个使用XML布局文件设置文本大小的示例：

```xml
<TextView
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Hello, Android!"
    android:textSize="20sp" />
```

上述示例中，`android:textSize` 属性被设置为 "20sp"，这表示文本的字体大小为20缩放独立像素。

使用Java代码设置文本大小：

如果你想在运行时动态地更改文本的大小，你可以在Java代码中获取文本视图的引用，然后使用 `setTextSize()` 方法来设置文本大小。例如：

```java
TextView textView = findViewById(R.id.textViewId); // 替换为你的文本视图的ID
textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24); // 设置文本大小为24sp
```

上述代码中，我们首先获取了文本视图的引用，然后使用 `setTextSize()` 方法来设置文本大小。`TypedValue.COMPLEX_UNIT_SP` 表示我们使用的单位是缩放独立像素（sp），然后指定了字体大小为24。

无论是在XML布局文件中设置文本大小还是在Java代码中设置，都可以根据你的需求来调整文本的显示大小。

### 2.1.3 文本颜色

使用XML布局文件设置文本颜色：

你可以在XML布局文件中使用 `android:textColor` 属性来设置文本的颜色。这个属性可以接受不同的颜色值，包括颜色名称、十六进制颜色代码或资源文件中定义的颜色。

例如，以下是一个使用XML布局文件设置文本颜色的示例：

```xml
<TextView
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Hello, Android!"
    android:textColor="#FF0000" />
```

上述示例中，`android:textColor` 属性被设置为红色，使用的是十六进制颜色代码 "#FF0000"。

使用Java代码设置文本颜色：

如果你想在运行时动态地更改文本的颜色，你可以在Java代码中获取文本视图的引用，然后使用 `setTextColor()` 方法来设置文本颜色。例如：

```java
TextView textView = findViewById(R.id.textViewId); // 替换为你的文本视图的ID
textView.setTextColor(Color.RED); // 设置文本颜色为红色
```

上述代码中，我们首先获取了文本视图的引用，然后使用 `setTextColor()` 方法来设置文本颜色为红色。你可以传递不同的颜色参数给 `setTextColor()` 方法来设置不同的颜色。

## 2.2 视图

### 2.2.0 视图设置自身相对Layout_gravity以及子视图位置gravity

`gravity`属性用于控制视图内部的文本或内容的对齐方式。`gravity`属性可以设置为多个不同的参数，每个参数都表示不同的对齐方式。以下是一些常见的`gravity`参数：



1. **top**：将内容或文本置于视图的顶部。

2. **bottom**：将内容或文本置于视图的底部。

3. **left**：将内容或文本置于视图的左侧。

4. **right**：将内容或文本置于视图的右侧。

5. **center_vertical**：垂直居中对齐内容或文本。

6. **center_horizontal**：水平居中对齐内容或文本。

7. **center**：在水平和垂直方向上都居中对齐内容或文本。

8. **start**：对于从左到右的语言环境，将内容或文本置于视图的起始位置（通常是左侧）；对于从右到左的语言环境，将内容或文本置于视图的结束位置（通常是右侧）。

9. **end**：对于从左到右的语言环境，将内容或文本置于视图的结束位置（通常是右侧）；对于从右到左的语言环境，将内容或文本置于视图的起始位置（通常是左侧）。

10. **fill_vertical**：垂直方向上拉伸内容，使其填充整个视图。

11. **fill_horizontal**：水平方向上拉伸内容，使其填充整个视图。

12. **clip_vertical**：垂直方向上裁剪内容，超出视图边界的部分被裁剪掉。

13. **clip_horizontal**：水平方向上裁剪内容，超出视图边界的部分被裁剪掉。

    

这些参数可以单独使用，也可以组合在一起，以实现所需的文本或内容对齐方式。例如，`android:gravity="center_vertical|end"`将文本垂直居中对齐，并将其放置在视图的结束位置。



`layout_gravity`属性用于控制视图自身在其父容器中的位置。它决定了视图在父容器中的对齐方式。以下是一些常见的`layout_gravity`属性值：

1. **top**：将视图放置在父容器的顶部。

2. **bottom**：将视图放置在父容器的底部。

3. **left**：将视图放置在父容器的左侧。

4. **right**：将视图放置在父容器的右侧。

5. **center_vertical**：垂直居中对齐视图。

6. **center_horizontal**：水平居中对齐视图。

7. **center**：在水平和垂直方向上都居中对齐视图。

8. **start**：对于从左到右的语言环境，将视图放置在父容器的起始位置（通常是左侧）；对于从右到左的语言环境，将视图放置在父容器的结束位置（通常是右侧）。

9. **end**：对于从左到右的语言环境，将视图放置在父容器的结束位置（通常是右侧）；对于从右到左的语言环境，将视图放置在父容器的起始位置（通常是左侧）。

10. **fill_vertical**：垂直方向上拉伸视图，使其填充整个父容器。

11. **fill_horizontal**：水平方向上拉伸视图，使其填充整个父容器。

12. **center_vertical|center_horizontal**：同时在垂直和水平方向上居中对齐视图。

    

### 2.2.1 设置视图宽高

1.**android:layout_width 和 android:layout_height**：这是在XML布局文件中用于指定视图宽度和高度的最常见属性。可以设置为具体的像素值、"wrap_content"（根据内容自动调整大小）或"match_parent"（占满父容器）。

```xml
<Button
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="按钮" />
```

2.**setWidth() 和 setHeight()**：这些是在Java代码中设置视图宽度和高度的方法。可以使用像素值来设置。

```java
View view = findViewById(R.id.myView);
view.setWidth(200); // 设置宽度为200像素
view.setHeight(100); // 设置高度为100像素
```

3.**setLayoutParams()**：可以使用该方法在Java代码中设置视图的宽度和高度，通常与 `LayoutParams` 类的实例一起使用。这使你能够更灵活地设置视图的大小，并可以指定比例、权重等。

```java
View view = findViewById(R.id.myView);
LayoutParams params = new LayoutParams(200, 100); // 设置宽度为200像素，高度为100像素
view.setLayoutParams(params);
```

### 2.2.2 设置视图间距

1. **使用`android:layout_margin`属性**：`android:layout_margin`属性用于设置视图的外边距，即视图周围的空白区域。你可以在XML布局文件中为视图元素设置这个属性，例如：

```xml
<Button
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="按钮"
    android:layout_margin="16dp" />
```

在上面的示例中，按钮的上下左右都有16dp的外边距。

1. **使用`android:layout_padding`属性**：`android:layout_padding`属性用于设置视图的内边距，即视图内部的空白区域。你可以在XML布局文件中为视图元素设置这个属性，例如：

```xml
<LinearLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="vertical"
    android:padding="16dp">
    
    <!-- 这里的子视图会在内部具有16dp的内边距 -->
    
</LinearLayout>
```

### 2.2.3 Linerlayout 线性布局

LinearLayout 是 Android 中一种简单而常用的布局容器，它允许子视图按照水平或垂直方向排列。你可以使用 `android:orientation` 属性来指定 LinearLayout 的方向，可以是 `horizontal`（水平排列）或 `vertical`（垂直排列）。

以下是如何使用 LinearLayout 来布置各个位置的示例：

+ 垂直布局（vertical）

```xml
<LinearLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="顶部" />

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="中间" />

    <ImageView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:src="@drawable/ic_launcher_foreground" />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="底部" />
</LinearLayout>
```

在上面的示例中，`android:orientation="vertical"` 指定了 LinearLayout 的垂直排列方式，子视图依次从上到下排列。

+ 水平布局（horizontal）

```xml
<LinearLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="horizontal">

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="左边" />

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="中间" />

    <ImageView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:src="@drawable/ic_launcher_foreground" />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="右边" />
</LinearLayout>
```

在上面的示例中，`android:orientation="horizontal"` 指定了 LinearLayout 的水平排列方式，子视图依次从左到右排列。

### 2.2.4 RelativeLayout 布局

1.**创建一个 RelativeLayout 布局**：在你的布局文件中，使用 `<RelativeLayout>` 标签来创建一个 RelativeLayout 布局容器。例如：

```xml
<RelativeLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <!-- 这里添加子视图 -->
</RelativeLayout>
```

2.**在 RelativeLayout 中添加子视图**：在 RelativeLayout 中添加要排列的子视图元素。你可以使用各种视图元素，如按钮、文本视图、图像视图等。确保为每个子视图设置唯一的 ID，以便在相对位置属性中引用它们。

```xml
<Button
    android:id="@+id/button1"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="按钮 1" />

<TextView
    android:id="@+id/textView1"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="文本视图 1" />
```

3.例如，以下是如何将一个按钮放置在另一个按钮的下方：

```xml
<Button
    android:id="@+id/button1"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="按钮 1" />

<Button
    android:id="@+id/button2"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="按钮 2"
    android:layout_below="@id/button1" />
```

> ![image-20230910211852118](C:\Users\7878\AppData\Roaming\Typora\typora-user-images\image-20230910211852118.png)

```xml
<RelativeLayout
        android:id="@+id/rel"
        android:layout_width="400dp"
        android:layout_height="400dp"
        android:background="@color/red"
        tools:ignore="MissingConstraints">

        <TextView
            android:id="@+id/textView1"
            android:layout_width="100dp"
            android:layout_height="100dp"
            android:textSize="10dp"
            android:background="@color/black"
            android:textColor="@color/white"
            android:layout_alignParentTop="true"
            android:layout_alignParentLeft="true"
            tools:ignore="ExtraText">左上角</TextView>

        <TextView
            android:id="@+id/textView2"
            android:layout_width="100dp"
            android:layout_height="100dp"
            android:background="@color/white"
            android:textColor="@color/black"
            android:layout_alignParentTop="true"
            android:layout_alignParentRight="true">右上角</TextView>

        <TextView
            android:layout_width="100dp"
            android:layout_height="100dp"
            android:background="@color/white"
            android:textColor="@color/black"
            android:layout_alignParentBottom="true"
            android:layout_alignParentLeft="true">左下角</TextView>

        <TextView
            android:layout_width="100dp"
            android:layout_height="100dp"
            android:background="@color/white"
            android:textColor="@color/black"
            android:layout_alignParentBottom="true"
            android:layout_alignParentRight="true">右下角</TextView>

    </RelativeLayout>
```

> ![image-20230910213413237](C:\Users\7878\AppData\Roaming\Typora\typora-user-images\image-20230910213413237.png)

### 2.2.5 GridLayout 布局

`GridLayout`是Android中的一个布局容器，它允许您以网格形式排列子视图。您可以在`GridLayout`中定义行和列，然后将子视图放置在这些行和列的交汇点上。以下是如何在Android中使用`GridLayout`的基本步骤：

1.在XML布局文件中添加`GridLayout`容器。以下是一个示例：

```xml
<GridLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:rowCount="3"  <!-- 指定行数 -->
    android:columnCount="3"<!-- 指定列数 -->
    android:padding="16dp"> <!-- 可选的内边距 -->
    
    <!-- 在这里添加子视图 -->
    
</GridLayout>
```

在上面的示例中，我们创建了一个3x3的`GridLayout`，指定了行数和列数，并添加了一个可选的内边距。

2.在`GridLayout`中添加子视图。您可以使用`GridLayout`中的`GridLayout.LayoutParams`来设置子视图在网格中的位置。以下是一个示例：

```xml
<!-- 子视图1，位于第一行第一列 -->
<TextView
    android:text="Cell 1"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_row="0"   <!-- 指定行 -->
    android:layout_column="0" <!-- 指定列 -->
    android:layout_gravity="center"/> <!-- 可选的布局位置属性 -->

<!-- 子视图2，位于第一行第二列 -->
<Button
    android:text="Cell 2"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_row="0"
    android:layout_column="1"
    android:layout_gravity="center"/>

<!-- 添加更多子视图 -->
```

在上面的示例中，我们将`TextView`和`Button`放置在`GridLayout`的不同行和列中，并使用`android:layout_row`和`android:layout_column`属性指定它们的位置。

1. 按照需要继续添加更多的子视图，以填充整个`GridLayout`。
2. 可选地，您可以使用`android:layout_gravity`属性来进一步控制子视图在其单元格内的对齐方式。

### 2.2.6 ScrollView布局

在Android中，ScrollView是一个常用的视图容器，用于包装其他视图，并允许用户在需要时滚动查看内容。以下是使用ScrollView的基本步骤：

1. 在XML布局文件中添加ScrollView：

   ```xml
   <ScrollView
       xmlns:android="http://schemas.android.com/apk/res/android"
       android:id="@+id/scrollView"
       android:layout_width="match_parent"
       android:layout_height="match_parent">
   
       <!-- 在ScrollView中添加其他视图，例如LinearLayout或RelativeLayout -->
       <LinearLayout
           android:layout_width="match_parent"
           android:layout_height="wrap_content"
           android:orientation="vertical">
           
           <!-- 添加要滚动的内容视图 -->
           <!-- 这里可以添加文本、图像、按钮等其他视图元素 -->
           
       </LinearLayout>
   </ScrollView>
   ```

   在ScrollView中，通常包含一个垂直方向的线性布局（LinearLayout）或其他布局来放置要滚动的内容。

2. 将内容添加到ScrollView中： 在上述示例中，LinearLayout中的子视图将是要滚动的内容。可以添加文本视图、图像视图、按钮或其他任何视图元素。

3. 配置ScrollView属性： ScrollView有一些常用的属性，可根据需要进行配置，例如：

   - `android:layout_width` 和 `android:layout_height`：定义ScrollView的宽度和高度。
   - `android:scrollbars`：定义滚动条的可见性。
   - `android:fillViewport`：设置为true时，内容视图将填满整个ScrollView的高度。

4. 在Java代码中访问ScrollView： 如果需要在Java代码中与ScrollView交互，可以使用`findViewById`方法来获取ScrollView的引用，并进行相应的操作。例如，你可以在需要时滚动ScrollView或添加新的子视图。

示例代码片段：

```java
ScrollView scrollView = findViewById(R.id.scrollView);
scrollView.scrollTo(0, 100); // 在Java代码中滚动ScrollView
```

以上是使用ScrollView的基本步骤。根据实际需求，你可以在ScrollView中包含复杂的视图层次结构，并通过滚动来查看内容。

## 2.3 button控件

### 2.3.1 点击触发事件

在Android中，Button是一个常用的用户界面元素，用于触发操作或事件。以下是使用Button的基本步骤：

1. 在XML布局文件中添加Button： 在你的XML布局文件中，你可以通过以下方式添加一个Button元素：

   ```xml
   <Button
       android:id="@+id/myButton"
       android:layout_width="wrap_content"
       android:layout_height="wrap_content"
       android:text="Click Me" />
   ```

   在上面的示例中，我们定义了一个Button，设置了其ID、宽度、高度以及显示的文本。

2. 在Java代码中访问Button： 如果你想要在Java代码中与Button交互，需要首先获取Button的引用。你可以使用`findViewById`方法来查找Button的ID，并将其存储在一个变量中：

   ```java
   Button myButton = findViewById(R.id.myButton);
   ```

3. 为Button添加点击事件监听器： 通常，你会希望在用户点击Button时执行特定的操作。==在onCreate方法中添加==。为此，你需要为Button添加一个点击事件监听器。你可以使用`setOnClickListener`方法来实现这一点。以下是一个示例：

   ```java
   myButton.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           // 在这里定义Button被点击时要执行的操作
           // 例如，可以弹出一个Toast消息或执行其他任务
           Toast.makeText(getApplicationContext(), "Button Clicked", Toast.LENGTH_SHORT).show();
       }
   });
   ```

   在上述示例中，当Button被点击时，会弹出一个短暂的Toast消息。

4. 处理Button的点击事件：在点击事件监听器中，你可以定义Button被点击时要执行的操作。这可以包括启动新的活动、执行计算、显示对话框等等，具体取决于你的应用需求。

### 2.3.2 长按事件

要实现按钮的长按触发事件，你可以使用`setOnLongClickListener`方法为按钮设置长按事件监听器。以下是如何编写代码来实现这一功能的示例：

```java
Button myButton = findViewById(R.id.myButton);

myButton.setOnLongClickListener(new View.OnLongClickListener() {
    @Override
    public boolean onLongClick(View v) {
        // 在这里定义长按事件触发时要执行的操作
        // 返回true表示已处理此事件，false表示继续传递事件（通常不需要返回false）
        
        Toast.makeText(getApplicationContext(), "Button Long Pressed", Toast.LENGTH_SHORT).show();
        
        // 如果要阻止触发按钮的点击事件，可以返回true；否则返回false。
        return true;
    }
});
```

上述示例中，我们首先获取了Button的引用 `myButton`，然后使用 `setOnLongClickListener` 方法为按钮设置了一个长按事件监听器。在监听器的 `onLongClick` 方法中，你可以定义长按事件触发时要执行的操作，例如显示一个Toast消息。

在 `onLongClick` 方法内部，你可以选择返回 `true` 或 `false`：

- 如果返回 `true`，表示已处理此事件，按钮的普通点击事件不会触发。这意味着长按事件完全被处理，不会传递给普通的点击事件监听器。
- 如果返回 `false`，表示长按事件会触发，但同时也会触发按钮的普通点击事件监听器（如果有的话）。

通常情况下，如果你只想在长按事件发生时执行特定操作而不触发普通点击事件，你可以返回 `true`。如果你希望在长按事件后继续触发普通点击事件，可以返回 `false`。

### 2.3.3 button使用与禁用

要禁用（disable）和恢复（enable）Android中的Button，你可以使用Button类的`setEnabled`方法。以下是如何实现禁用和恢复按钮的示例代码：

**禁用按钮：**

```java
Button myButton = findViewById(R.id.myButton);

// 禁用按钮
myButton.setEnabled(false);
```

通过调用`setEnabled(false)`方法，你可以禁用按钮。禁用后，按钮将变为灰色，不再响应点击事件。

**恢复按钮：**

```java
Button myButton = findViewById(R.id.myButton);

// 恢复按钮
myButton.setEnabled(true);
```

通过调用`setEnabled(true)`方法，你可以恢复按钮的可用状态，使其再次响应点击事件。

## 2.4 ImageView

### 2.4.1 使用ImageView

`ImageView` 是 Android 中用于显示图像的视图组件。你可以使用 `ImageView` 在你的 Android 应用中显示图片。以下是如何使用 `ImageView` 的一般步骤：

1. 在XML布局文件中添加ImageView：

   首先，在你的XML布局文件中添加一个 `ImageView` 元素，以决定图像在用户界面中的位置和大小。示例如下：

   ```xml
   <ImageView
       android:id="@+id/myImageView"
       android:layout_width="wrap_content"
       android:layout_height="wrap_content"
       android:src="@drawable/your_image_resource" />
   ```

   在上面的示例中，`android:id` 属性用于为 `ImageView` 分配一个唯一的标识符，`android:layout_width` 和 `android:layout_height` 用于指定 `ImageView` 的大小，`android:src` 属性用于指定要显示的图片资源。

2. 在Java代码中获取ImageView的引用：

   在你的 Java 代码中，通过调用 `findViewById` 方法来获取 `ImageView` 的引用，以便在代码中操作它。示例代码如下：

   ```java
   ImageView myImageView = findViewById(R.id.myImageView);
   ```

   请确保使用与 XML 布局文件中定义的 `android:id` 属性相同的 ID。

3. 设置ImageView的图像资源：

   要在 `ImageView` 中显示图像，你可以使用 `setImageResource` 方法，将要显示的图像资源指定为参数。示例代码如下：

   ```java
   myImageView.setImageResource(R.drawable.your_image_resource);
   ```

   这将在 `ImageView` 中显示指定的图像资源。

4. 其他操作：

   除了设置图像资源，你还可以对 `ImageView` 进行其他操作，例如设置缩放类型、设置点击事件监听器等，以根据你的需求自定义图像显示和交互。

通过以上步骤，你可以在你的 Android 应用中使用 `ImageView` 来显示图像。请确保替换示例中的资源引用和属性值以适应你的实际应用需求。

### 2.4.2 设置缩放

在 Android 中，你可以通过设置 `ImageView` 的缩放类型来控制图像在 `ImageView` 中的显示方式。Android 提供了多种缩放类型，可根据需要选择合适的类型。你可以通过 `setScaleType` 方法来设置 `ImageView` 的缩放类型。以下是常用的缩放类型和如何实现它们的示例：

1. **CENTER**: 图像将居中显示，不进行缩放。这是默认的缩放类型。

   ```
   myImageView.setScaleType(ImageView.ScaleType.CENTER);
   ```

2. **FIT_CENTER**: 图像会缩放以适应 `ImageView`，并保持纵横比。如果图像的宽度或高度大于 `ImageView` 的宽度或高度，则图像可能无法填充整个 `ImageView`。

   ```
   myImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
   ```

3. **FIT_XY**: 图像将被拉伸以填充整个 `ImageView`，不保持纵横比。注意，这可能会导致图像变形。

   ```
   myImageView.setScaleType(ImageView.ScaleType.FIT_XY);
   ```

4. **CENTER_INSIDE**: 图像将居中显示，并在保持纵横比的同时尽可能大地显示在 `ImageView` 内部。如果图像小于 `ImageView`，则图像将按原始大小显示。

   ```
   myImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
   ```

5. **CENTER_CROP**: 图像将根据 `ImageView` 的尺寸进行裁剪，以填充整个 `ImageView`，并保持纵横比。

   ```
   myImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
   ```

6. **FIT_START** 和 **FIT_END**: 图像将缩放以适应 `ImageView`，并在左上角（FIT_START）或右下角（FIT_END）对齐。

   ```java
   myImageView.setScaleType(ImageView.ScaleType.FIT_START);
   // 或
   myImageView.setScaleType(ImageView.ScaleType.FIT_END);
   ```

7. **MATRIX**: 你可以使用矩阵来自定义图像的缩放和平移。

   ```java
   myImageView.setScaleType(ImageView.ScaleType.MATRIX);
   // 然后使用 setImageMatrix 方法设置矩阵
   Matrix matrix = new Matrix();
   myImageView.setImageMatrix(matrix);
   ```

根据你的需求，选择合适的缩放类型来控制图像在 `ImageView` 中的显示方式。记得在设置缩放类型后，使用 `setImageResource` 方法设置图像资源，以便显示在 `ImageView` 中。

你可以在 XML 布局文件中设置 `ImageView` 的缩放类型。在 `ImageView` 元素中，可以使用 `android:scaleType` 属性来指定缩放类型。以下是如何在 XML 中设置 `ImageView` 的缩放类型的示例：

```xml
<ImageView
    android:id="@+id/myImageView"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:src="@drawable/your_image_resource"
    android:scaleType="fitCenter" />
```

### 2.4.3 imagebutton

要在Android应用中使用 `ImageButton`，你可以按照以下步骤进行操作：

1. **在XML布局文件中添加ImageButton**：

   首先，在你的XML布局文件中添加一个 `ImageButton` 元素。以下是一个简单的示例：

   ```xml
   <ImageButton
       android:id="@+id/myImageButton"
       android:layout_width="wrap_content"
       android:layout_height="wrap_content"
       android:src="@drawable/your_image_resource"
       android:contentDescription="Button Description" />
   ```

   在上面的示例中，`android:id` 属性用于为 `ImageButton` 分配一个唯一的标识符，`android:layout_width` 和 `android:layout_height` 用于指定按钮的大小，`android:src` 属性用于指定按钮的图像资源，`android:contentDescription` 属性用于提供按钮的文本描述，以改善可访问性。

2. **在Java代码中获取ImageButton的引用**：

   在你的 Java 代码中，通过调用 `findViewById` 方法来获取 `ImageButton` 的引用，以便在代码中操作它。示例代码如下：

   ```java
   ImageButton myImageButton = findViewById(R.id.myImageButton);
   ```

   请确保使用与 XML 布局文件中定义的 `android:id` 属性相同的 ID。

3. **设置点击事件监听器**：

   要使 `ImageButton` 可以响应点击事件，你需要为它设置一个点击事件监听器。示例代码如下：

   ```java
   myImageButton.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           // 在这里执行按钮被点击时的操作
           // 例如，处理点击事件的代码
       }
   });
   ```

   在 `onClick` 方法中，你可以定义按钮被点击时要执行的操作。

4. **其他设置**：

   你还可以为 `ImageButton` 设置其他属性，例如按钮的背景、边框样式等，以满足你的设计需求。

# 3 Activity控制

## 3.1 Activity 跳转

在Android中，`startActivity()`方法用于启动一个新的Activity。它接收一个Intent对象作为参数，指定要启动的目标Activity。

以下是使用`startActivity()`方法的常见用法示例：

```java
Intent intent = new Intent(CurrentActivity.this, TargetActivity.class);
startActivity(intent);
```

在这个示例中，`CurrentActivity`是当前的Activity，`TargetActivity`是要启动的目标Activity。通过创建一个Intent对象，并将目标Activity的类名作为参数传递给Intent构造函数，然后调用`startActivity()`方法来启动目标Activity。

请注意，在使用`startActivity()`方法之前，确保已在AndroidManifest.xml文件中正确注册目标Activity，以便系统能够识别和启动它。



在Android中，`finish()`方法用于关闭当前的Activity。当你调用`finish()`方法时，当前Activity将被销毁并从堆栈中移除。

以下是使用`finish()`方法的示例：

```java
finish();
```

你可以在当前Activity的任何位置调用`finish()`方法，以便在特定条件下关闭Activity。例如，当用户完成某个操作或按下返回按钮时，你可以调用`finish()`方法来关闭当前Activity。

另外，你也可以在启动新的Activity后调用`finish()`方法，以便在启动新Activity后立即关闭当前Activity。这样可以确保用户在返回时不会回到当前Activity。

```java
Intent intent = new Intent(CurrentActivity.this, TargetActivity.class);
startActivity(intent);
finish();
```

在这个示例中，首先启动了目标Activity，然后立即调用`finish()`方法关闭当前Activity。

请注意，当你调用`finish()`方法时，当前Activity的生命周期方法（如`onPause()`、`onStop()`、`onDestroy()`等）将被调用，以便进行必要的清理和资源释放。

总结起来，`finish()`方法用于关闭当前Activity，并在需要时可以在任何位置调用。

## 3.2 生命周期

下面是一个常见的Activity生命周期的顺序和简要描述：

1. `onCreate()`: 当Activity被创建时调用。在这个方法中，你可以进行初始化操作，设置布局和加载资源等。
2. `onStart()`: 在Activity即将变为可见状态之前调用。在这个阶段，Activity仍然不可交互，但它已经可见。
3. `onResume()`: 在Activity变为前台并获得用户焦点时调用。在这个阶段，Activity变得可见且可交互，你可以处理用户交互、启动动画和启动其他线程等。
4. `onPause()`: 当Activity失去焦点并且即将进入后台时调用。在这个阶段，你应该暂停正在进行的操作、保存数据或释放资源。
5. `onStop()`: 当Activity完全不可见时调用。在这个阶段，你可以执行一些清理工作，例如停止动画或释放占用的系统资源。
6. `onDestroy()`: 当Activity即将被销毁时调用。在这个方法中，你可以释放所有的资源、取消注册监听器或保存持久化数据。

另外还有两个方法与生命周期相关：

- `onRestart()`: 当Activity从停止状态重新启动时调用。它会在`onStop()`之后和`onStart()`之前被调用。
- `onSaveInstanceState()`: 当Activity被销毁之前调用，用于保存临时状态数据。你可以使用Bundle对象来保存和恢复数据，以便在Activity重新创建时恢复状态。

需要注意的是，当Activity在后台时，系统可能会销毁它以释放资源。在这种情况下，系统会调用`onSaveInstanceState()`保存状态，并在必要时通过`onCreate()`和`onRestoreInstanceState()`来恢复Activity的状态。

## 3.3 显式与隐式Intent

显式Intent和隐式Intent是Android开发中用于启动组件（如Activity、Service、BroadcastReceiver）的两种不同方式。

1. 显式Intent（Explicit Intent）:
   显式Intent用于明确指定要启动的组件。你需要指定目标组件的类名或包名加类名。例如，如果你要启动一个特定的Activity，你可以使用以下代码：

```java
Intent intent = new Intent(CurrentActivity.this, TargetActivity.class);
startActivity(intent);
```

在这个例子中，你明确指定了要启动的目标Activity的类名。

1. 隐式Intent（Implicit Intent）:
   隐式Intent允许你指定一个动作（Action）和一些可选的数据（Data），而不是明确指定要启动的组件。系统会根据你提供的信息来查找匹配的组件。例如，如果你想要分享一张图片给其他应用，你可以使用以下代码：

```java
Intent intent = new Intent(Intent.ACTION_SEND);
intent.setType("image/jpeg");
intent.putExtra(Intent.EXTRA_STREAM, imageUri);
startActivity(Intent.createChooser(intent, "分享图片"));
```

在这个例子中，你指定了一个分享动作（ACTION_SEND）和图片的数据类型（image/jpeg），系统会弹出一个应用选择对话框，让用户选择要分享的应用。

隐式Intent可以用于启动与你的应用无关的组件，例如启动其他应用的Activity或调用系统服务。它也可以用于在你的应用内部的组件之间进行通信，只要你在组件的声明中指定了相应的过滤器（Intent Filter）。

总结来说，显式Intent用于启动明确指定的组件，而隐式Intent用于根据动作和数据来查找匹配的组件。

![image-20230915170007776](C:\Users\7878\AppData\Roaming\Typora\typora-user-images\image-20230915170007776.png)

## 3.4 传递信息

假设我们有两个Activity：Activity A和Activity B。我们想要在Activity A中传递一个字符串给Activity B。

在Activity A中，我们可以这样实现：

```java
// 在Activity A中创建一个Intent对象
Intent intent = new Intent(ActivityA.this, ActivityB.class);

// 使用putExtra()方法将数据添加到Intent中
String message = "Hello, Activity B!";
intent.putExtra("key", message);

// 启动Activity B，并将Intent作为参数传递
startActivity(intent);
```

然后，在Activity B中，我们可以这样接收传递过来的数据：

```java
// 在Activity B中获取传递过来的Intent
Intent receivedIntent = getIntent();

// 使用getXXXExtra()方法从Intent中获取传递的数据
String receivedMessage = receivedIntent.getStringExtra("key");

// 在Activity B中使用获取到的数据
TextView textView = findViewById(R.id.textView);
textView.setText(receivedMessage);
```

在这个例子中，我们在Activity A中创建了一个Intent对象，并使用`putExtra()`方法将一个字符串数据添加到Intent中，并使用键值对的方式指定了键为"key"。然后，我们通过`startActivity()`方法启动了Activity B，并将Intent作为参数传递给它。

在Activity B中，我们使用`getIntent()`方法获取传递过来的Intent，并使用`getStringExtra()`方法从Intent中获取键为"key"的字符串数据。最后，我们将获取到的数据设置到TextView中显示出来。

这样，我们就成功地在Activity A和Activity B之间传递了一个字符串数据。你可以根据需要传递不同类型的数据，并在目标Activity中使用相应的`getXXXExtra()`方法获取和处理这些数据。

你可以根据需要使用这些方法将不同类型的数据添加到Intent中。如果要传递多个数据项，你可以使用不同的键来标识它们，例如：

```java
Intent intent = new Intent(ActivityA.this, ActivityB.class);
intent.putExtra("key1", value1);
intent.putExtra("key2", value2);
intent.putExtra("key3", value3);
// 添加更多的数据项...
startActivity(intent);
```

在接收数据的Activity中，你可以使用相应类型的`getXXXExtra()`方法来获取传递的数据项：

```java
Intent receivedIntent = getIntent();
int receivedValue1 = receivedIntent.getIntExtra("key1", defaultValue1);
String receivedValue2 = receivedIntent.getStringExtra("key2");
// 获取更多的数据项...
```

通过这种方式，你可以传递多个数据项并在目标Activity中获取和处理它们。请注意，Intent的大小是有限制的，因此如果要传递大量的数据，可能需要考虑其他存储和传递数据的方式，如使用数据库或文件。

## 3.5 利用资源文件配置字符串

在Android中，你可以使用资源文件来配置字符串。这样做的好处是可以将字符串与代码分离，方便进行国际化和本地化，以及在不修改代码的情况下更改字符串的值。

要在资源文件中配置字符串，可以按照以下步骤进行操作：

1. 在`res`目录下创建一个新的目录，命名为`values`（如果已存在，请跳过此步骤）。
2. 在`values`目录下创建一个新的XML文件，命名为`strings.xml`（如果已存在，请打开该文件）。
3. 在`strings.xml`文件中，使用`<string>`标签定义字符串资源，并为每个字符串资源指定一个唯一的名称。例如：

```xml
<resources>
    <string name="app_name">My App</string>
    <string name="welcome_message">Welcome to my app!</string>
</resources>
```

在上面的示例中，我们定义了两个字符串资源：`app_name`和`welcome_message`。

1. 在代码中使用字符串资源。你可以通过资源的名称来引用相应的字符串。例如：

```java
String appName = getString(R.string.app_name);
String welcomeMessage = getString(R.string.welcome_message);
```

在上面的示例中，我们使用`getString()`方法根据资源的名称获取相应的字符串值。

通过将字符串配置在资源文件中，你可以在应用程序的不同部分中重复使用它们，并且可以轻松地更改字符串的值，而无需修改代码。此外，你还可以为不同的语言或区域设置提供不同的字符串值，以实现国际化和本地化。

## 3.6 元数据

在Android中，你可以使用元数据（Metadata）来传递配置信息。元数据是一种用于描述应用程序或组件的附加信息的机制。通过在AndroidManifest.xml文件中定义元数据，你可以在应用程序中访问和使用这些配置信息。

以下是在Android中使用元数据传递配置信息的步骤：

1. 在AndroidManifest.xml文件中的应用程序或组件（如Activity、Service等）的标签中，使用`<meta-data>`标签来定义元数据。例如：

```xml
<application>
    <meta-data
        android:name="com.example.app.API_KEY"
        android:value="your_api_key" />
</application>
```

在上面的示例中，我们定义了一个名为`com.example.app.API_KEY`的元数据，并设置其值为`your_api_key`。

1. 在代码中访问元数据。你可以使用`PackageManager`类和`ApplicationInfo`类来获取元数据的值。例如：

```java
try {
    ApplicationInfo appInfo = getPackageManager().getApplicationInfo(getPackageName(), PackageManager.GET_META_DATA);
    String apiKey = appInfo.metaData.getString("com.example.app.API_KEY");
    // 使用apiKey进行相应的操作
} catch (PackageManager.NameNotFoundException e) {
    e.printStackTrace();
}
```

在上面的示例中，我们使用`getPackageManager()`方法获取`PackageManager`实例，并使用`getApplicationInfo()`方法获取应用程序的`ApplicationInfo`对象。然后，我们可以通过`metaData`属性获取元数据的值，使用元数据的名称作为键。

通过这种方式，你可以在Android应用程序中使用元数据来传递配置信息。元数据可以用于各种用途，例如存储API密钥、配置参数、第三方库的配置等。请注意，元数据的值可以是字符串、整数、布尔值等不同类型的数据。

# 4 中级控件

## 4.1 shape

在Android中，Shape是一种用于定义可绘制图形的XML资源。它可以用于创建各种形状的背景或边框，如矩形、圆角矩形、椭圆、圆形等。Shape资源可以在布局文件或代码中使用，以下是使用Shape的步骤：

1. 创建Shape XML文件：首先，创建一个XML文件，用于定义Shape资源。可以在res/drawable目录下创建一个XML文件，例如`shape_rectangle.xml`。
2. 定义Shape类型：在XML文件中，使用`<shape>`标签来定义Shape的类型。例如，要创建一个矩形形状，可以使用`<shape>`标签，并设置`android:shape`属性为"rectangle"。
3. 设置Shape属性：根据所需的形状，可以设置不同的属性。例如，对于矩形形状，可以设置`android:corners`属性来指定圆角的半径，设置`android:gradient`属性来定义渐变效果，设置`android:padding`属性来设置内边距等。
4. 应用Shape资源：在布局文件或代码中，可以将Shape资源应用于View的背景或边框。在布局文件中，可以使用`android:background`属性或`android:foreground`属性来引用Shape资源。在代码中，可以使用`setBackground()`或`setForeground()`方法来设置Shape资源。

以下是一个示例的Shape XML文件，用于创建一个圆角矩形形状：

```xml
<!-- shape_rectangle.xml -->
<shape xmlns:android="http://schemas.android.com/apk/res/android"
    android:shape="rectangle">
    
    <corners android:radius="10dp" />
    <solid android:color="#FF0000" />
    <stroke
        android:width="2dp"
        android:color="#000000" />
</shape>
```

在布局文件中，可以将该Shape资源应用于一个View的背景，如：

```xml
<View
    android:layout_width="200dp"
    android:layout_height="100dp"
    android:background="@drawable/shape_rectangle" />
```

## 4.2 状态列表

看起来你想要了解在Android中绘制状态列表图形的方法。状态列表图形是Android中用于表示不同视图状态的图形资源，通常用于按钮和其他可交互元素的背景。你可以使用XML文件定义状态列表，然后将它们应用到视图中。以下是一个简单的示例，演示如何创建一个状态列表图形来表示按钮的不同状态（正常、按下、禁用）：

```xml
<!-- res/drawable/button_states.xml -->
<selector xmlns:android="http://schemas.android.com/apk/res/android">
    <!-- 正常状态 -->
    <item android:state_pressed="false" android:state_enabled="true">
        <shape>
            <solid android:color="#FF0000" /> <!-- 正常状态下的背景颜色 -->
        </shape>
    </item>

    <!-- 按下状态 -->
    <item android:state_pressed="true" android:state_enabled="true">
        <shape>
            <solid android:color="#00FF00" /> <!-- 按下状态下的背景颜色 -->
        </shape>
    </item>

    <!-- 禁用状态 -->
    <item android:state_enabled="false">
        <shape>
            <solid android:color="#CCCCCC" /> <!-- 禁用状态下的背景颜色 -->
        </shape>
    </item>
</selector>
```

然后，你可以将这个状态列表图形应用到按钮或其他视图中的背景属性，例如：

```xml
<Button
    android:id="@+id/my_button"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Click Me"
    android:background="@drawable/button_states" />
```

这个示例中，`button_states.xml` 文件定义了按钮的不同状态下的背景颜色。当按钮处于不同状态时，Android会自动选择适当的背景颜色。

## 4.3 复选框 CheckBox

在Android Studio中使用复选框（CheckBox）是相对简单的，复选框是一种常见的用户界面元素，允许用户选择或取消选择一个或多个选项。以下是如何在Android Studio中使用复选框的基本步骤：

1. 在XML布局文件中添加一个复选框元素：

```xml
<CheckBox
    android:id="@+id/my_checkbox"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="选择我" />
```

上面的代码创建了一个简单的复选框，设置了其标识符（ID），宽度、高度和显示文本。

1. 在活动（Activity）或片段（Fragment）的Java代码中获取对复选框的引用：

```java
CheckBox myCheckBox = findViewById(R.id.my_checkbox);
```

1. 设置复选框的监听器（可选）：如果你希望在复选框的状态发生变化时执行特定操作，你可以设置一个监听器。例如：

```java
myCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            // 复选框被选中时执行的操作
        } else {
            // 复选框被取消选中时执行的操作
        }
    }
});
```

1. 处理复选框的状态：你可以使用复选框的方法来检查其当前状态（选中或未选中）或设置其状态。例如：

- 检查复选框的状态：

```java
boolean isChecked = myCheckBox.isChecked(); // 返回true表示已选中，false表示未选中
```

- 设置复选框的状态：

```java
myCheckBox.setChecked(true); // 选中复选框
myCheckBox.setChecked(false); // 取消选中复选框
```

这就是使用复选框的基本步骤。你可以根据需要在布局和代码中进行进一步的自定义和操作，以满足你的应用程序需求。

## 4.4 开关按钮 Switch

1. 在XML布局文件中添加一个Switch元素：

```xml
<Switch
    android:id="@+id/my_switch"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="启用功能" />
```

上面的代码创建了一个简单的Switch，设置了其标识符（ID），宽度、高度和显示文本。

1. 在活动（Activity）或片段（Fragment）的Java代码中获取对Switch的引用：

```java
Switch mySwitch = findViewById(R.id.my_switch);
```

1. 添加Switch的状态改变监听器（可选）：如果你想要在Switch的状态改变时执行特定操作，你可以设置一个监听器。例如：

```java
mySwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            // Switch被打开时执行的操作
        } else {
            // Switch被关闭时执行的操作
        }
    }
});
```

1. 处理Switch的状态：你可以使用Switch的方法来检查其当前状态（打开或关闭）或设置其状态。例如：

- 检查Switch的状态：

```java
boolean isSwitchOn = mySwitch.isChecked(); // 返回true表示Switch打开，false表示Switch关闭
```

- 设置Switch的状态：

```java
mySwitch.setChecked(true); // 打开Switch
mySwitch.setChecked(false); // 关闭Switch
```

## 4.5 单选按钮 RadioButton

在Android中，单选按钮（RadioButton）用于允许用户在一组选项中选择一个选项。通常，单选按钮用于实现单选选项的功能，其中用户只能选择其中一个选项。以下是如何在Android中使用单选按钮的基本步骤：

1. 在XML布局文件中添加一组单选按钮元素：

```xml
<RadioGroup
    android:id="@+id/radio_group"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content">

    <RadioButton
        android:id="@+id/radio_button1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="选项1" />

    <RadioButton
        android:id="@+id/radio_button2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="选项2" />

    <!-- 可以添加更多的RadioButton作为选项 -->

</RadioGroup>
```

上面的代码创建了一个RadioGroup，它是一个容器，包含一组单选按钮RadioButton。RadioGroup确保在同一时间只能选择一个单选按钮。

1. 在活动（Activity）或片段（Fragment）的Java代码中获取对RadioGroup和RadioButton的引用：

```java
RadioGroup radioGroup = findViewById(R.id.radio_group);
RadioButton radioButton1 = findViewById(R.id.radio_button1);
RadioButton radioButton2 = findViewById(R.id.radio_button2);
```

1. 添加单选按钮的选择监听器（可选）：如果你想要在用户选择不同单选按钮时执行特定操作，你可以设置一个监听器。例如：

```java
radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        // 通过checkedId来判断哪个单选按钮被选择
        if (checkedId == R.id.radio_button1) {
            // 选中了选项1
        } else if (checkedId == R.id.radio_button2) {
            // 选中了选项2
        }
    }
});
```

1. 处理单选按钮的选择：用户可以点击单选按钮来选择其中一个选项。单选按钮的选择会自动管理，只有一个单选按钮可以被选中。

你可以在Java代码中使用 `isChecked()` 方法来检查单选按钮的选择状态，或者在XML布局中使用 `android:checked` 属性来初始化默认选择的单选按钮。

```java
boolean isRadioButton1Checked = radioButton1.isChecked(); // 返回true表示选项1被选择
boolean isRadioButton2Checked = radioButton2.isChecked(); // 返回true表示选项2被选择
```

## 4.6 编辑框 EditText

在 Android 中创建编辑框（EditText）是相当常见的，它允许用户输入文本或数字。要在 Android 应用程序中实现编辑框，你可以按照以下步骤进行操作：

1. **在 XML 布局文件中添加编辑框：** 打开你的 XML 布局文件，通常是位于 `res/layout` 目录下的文件，然后添加一个 `<EditText>` 元素来定义编辑框。例如：

```xml
<EditText
    android:id="@+id/editText1"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:hint="请输入文本" />
```

上面的示例中，`android:id` 属性用于标识编辑框，`android:hint` 属性设置了编辑框中的提示文本。

1. **在 Java 代码中引用编辑框：** 打开你的 Java 活动文件（通常是 `MainActivity.java`），在 `onCreate` 方法中使用 `findViewById` 来引用 XML 布局文件中的编辑框。例如：

```java
EditText editText = findViewById(R.id.editText1);
```

1. **处理编辑框的输入：** 你可以在代码中处理编辑框的输入。例如，你可以获取编辑框中的文本，监听文本变化事件，验证输入等。以下是一些常见的操作：

   - 获取编辑框中的文本：

     ```java
     String userInput = editText.getText().toString();
     ```

   - 设置编辑框的文本：

     ```java
     editText.setText("新的文本");
     ```

   - 监听文本变化事件：

     ```java
     editText.addTextChangedListener(new TextWatcher() {
         @Override
         public void beforeTextChanged(CharSequence s, int start, int count, int after) {
             // 在文本变化前执行的操作
         }
     
         @Override
         public void onTextChanged(CharSequence s, int start, int before, int count) {
             // 在文本变化时执行的操作
         }
     
         @Override
         public void afterTextChanged(Editable s) {
             // 在文本变化后执行的操作
         }
     });
     ```

   - 验证输入：

     你可以使用条件语句来验证用户的输入是否符合要求，例如检查文本长度、格式等。

以下是一个示例，演示如何在 `beforeTextChanged` 中实现输入验证：

```java
@Override
public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    // 在文本变化前执行的操作
    String newText = s.toString();
    
    // 进行输入验证，例如检查是否输入了数字
    if (!isValidInput(newText)) {
        // 如果输入不合法，可以阻止文本变化
        editText.setError("输入不合法，请输入数字");
        editText.setText(""); // 清空编辑框
    }
}

// 输入验证方法的示例
private boolean isValidInput(String text) {
    // 在这里实现输入验证的逻辑，例如检查是否是数字
    // 如果合法返回 true，否则返回 false
    return TextUtils.isDigitsOnly(text);
}
```

这个示例中，在文本变化前会检查用户输入的文本是否是数字，如果不是数字，会显示错误提示并清空编辑框。这是 `beforeTextChanged` 方法的一种常见用法。

以下是一个示例，演示如何在 `afterTextChanged` 方法中执行操作：

```java
@Override
public void afterTextChanged(Editable s) {
    // 在文本变化后执行的操作
    String newText = s.toString(); // 获取当前文本内容

    // 可以在这里执行一些后续操作，例如保存用户输入、执行搜索等
    if (newText.length() > 0) {
        // 用户已输入文本，执行搜索操作
        performSearch(newText);
    } else {
        // 用户未输入文本，清空搜索结果
        clearSearchResults();
    }
}
```

在这个示例中，`afterTextChanged` 方法会检查用户是否输入了文本，如果有文本输入，它会执行搜索操作；如果没有文本输入，它会清空搜索结果或采取其他适当的操作。

## 4.7 焦点变更监视器

用焦点变更监听器（Focus Change Listener）来监视 Android 中的焦点变化，你可以遵循以下步骤：

1. **为视图添加焦点变更监听器：** 首先，你需要为你感兴趣的视图（如 EditText、Button 等）添加焦点变更监听器。你可以通过调用视图的 `setOnFocusChangeListener` 方法来实现这一点。例如，如果你想为一个 EditText 监听焦点变化，可以这样做：

   ```java
   EditText editText = findViewById(R.id.editText);
   
   editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
       @Override
       public void onFocusChange(View v, boolean hasFocus) {
           // 在焦点变化时执行的操作
           if (hasFocus) {
               // 获得焦点时的处理
           } else {
               // 失去焦点时的处理
           }
       }
   });
   ```

   在上面的代码中，我们创建了一个焦点变更监听器，并在监听器的 `onFocusChange` 方法中处理焦点变化事件。`hasFocus` 参数表示视图是否获得焦点，如果为 `true`，则表示视图获得焦点，如果为 `false`，则表示失去焦点。

2. **处理焦点变化事件：** 在 `onFocusChange` 方法中，你可以执行与焦点变化相关的操作。通常，这包括根据焦点状态执行不同的逻辑，例如显示/隐藏提示文本、执行输入验证、切换键盘等。

   以下是一个示例，演示了如何在焦点变化时显示/隐藏提示文本：

   ```java
   EditText editText = findViewById(R.id.editText);
   final TextView hintTextView = findViewById(R.id.hintTextView);
   
   editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
       @Override
       public void onFocusChange(View v, boolean hasFocus) {
           // 在焦点变化时执行的操作
           if (hasFocus) {
               // 获得焦点时的处理
               hintTextView.setVisibility(View.VISIBLE); // 显示提示文本
           } else {
               // 失去焦点时的处理
               hintTextView.setVisibility(View.INVISIBLE); // 隐藏提示文本
           }
       }
   });
   ```

   在这个示例中，当 EditText 获得焦点时，显示提示文本；当失去焦点时，隐藏提示文本。

通过使用焦点变更监听器，你可以根据视图的焦点状态执行相应的操作，以实现与用户界面交互相关的功能。这在处理表单输入、键盘切换等方面特别有用。

## 4.8 提醒对话框 AlertDialog

提醒对话框（Alert Dialog）是 Android 应用程序中常用的一种对话框，用于向用户显示信息、警告或要求用户确认某个操作。要使用提醒对话框，你可以按照以下步骤进行操作：

1. **创建 AlertDialog.Builder 对象：** 首先，你需要创建一个 AlertDialog.Builder 对象，用于配置和构建提醒对话框。通常，你会在活动的 Java 代码中执行这个操作。

   ```java
   AlertDialog.Builder builder = new AlertDialog.Builder(this);
   ```

   这里的 `this` 是指当前的 Activity 上下文，你可以根据需要替换成其他上下文。

2. **设置对话框标题和消息：** 使用 `setTitle` 和 `setMessage` 方法来设置对话框的标题和消息内容。

   ```java
   builder.setTitle("提醒");
   builder.setMessage("这是一个简单的提醒对话框示例。");
   ```

3. **添加按钮：** 使用 `setPositiveButton`、`setNegativeButton` 和 `setNeutralButton` 方法来添加对话框中的按钮。通常，`setPositiveButton` 用于表示积极操作（如确认），`setNegativeButton` 用于表示否定操作（如取消），`setNeutralButton` 用于一些中立的操作。

   ```java
   builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
       @Override
       public void onClick(DialogInterface dialog, int which) {
           // 用户点击确定按钮后的操作
       }
   });
   
   builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
       @Override
       public void onClick(DialogInterface dialog, int which) {
           // 用户点击取消按钮后的操作
       }
   });
   ```

   你可以根据需要添加更多的按钮。

4. **创建 AlertDialog 对象：** 调用 `create` 方法来创建实际的 AlertDialog 对象。

   ```java
   AlertDialog alertDialog = builder.create();
   ```

5. **显示对话框：** 最后，使用 `show` 方法来显示提醒对话框。

   ```java
   alertDialog.show();
   ```

这样，你就创建了一个简单的提醒对话框，其中包含了标题、消息和按钮。当用户与按钮交互时，你可以在按钮的点击事件处理程序中执行相应的操作。

以下是一个完整的示例，演示了如何创建和显示一个简单的提醒对话框：

```java
AlertDialog.Builder builder = new AlertDialog.Builder(this);
builder.setTitle("提醒");
builder.setMessage("这是一个简单的提醒对话框示例。");

builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
    @Override
    public void onClick(DialogInterface dialog, int which) {
        // 用户点击确定按钮后的操作
    }
});

builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
    @Override
    public void onClick(DialogInterface dialog, int which) {
        // 用户点击取消按钮后的操作
    }
});

AlertDialog alertDialog = builder.create();
alertDialog.show();
```

这只是提醒对话框的基本用法。你可以根据需要自定义对话框的外观和行为，例如添加列表、单选按钮、多选框等。提醒对话框是一个强大的工具，用于与用户进行交互并显示信息。

## 4.9 日期对话框 DatePickerDialog

在 Android 应用中，你可以使用日期选择对话框（Date Picker Dialog）来允许用户选择日期。通常，日期选择对话框用于选择生日、约会时间等日期相关的信息。以下是如何使用日期选择对话框的基本步骤：

1. **创建日期选择对话框实例：** 首先，你需要创建一个日期选择对话框的实例。可以使用 `DatePickerDialog` 类来创建。

   ```java
   DatePickerDialog datePickerDialog = new DatePickerDialog(this, dateSetListener, year, month, day);
   ```

   - `this` 是当前的 Activity 上下文。
   - `dateSetListener` 是一个监听日期选择的回调监听器，后面将会创建。
   - `year`、`month` 和 `day` 是默认显示的日期。

2. **创建日期选择监听器：** 创建一个 `DatePickerDialog.OnDateSetListener` 监听器来处理用户选择日期的事件。

   ```java
   DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener() {
       @Override
       public void onDateSet(DatePicker view, int selectedYear, int selectedMonth, int selectedDay) {
           // 在用户选择日期后执行的操作
           // selectedYear、selectedMonth 和 selectedDay 是用户选择的日期信息
       }
   };
   ```

   在 `onDateSet` 方法中，你可以获取用户选择的年份、月份和日期，然后执行相应的操作。

3. **显示日期选择对话框：** 最后，通过调用 `show` 方法来显示日期选择对话框。

   ```java
   datePickerDialog.show();
   ```

当用户选择日期后，`onDateSet` 方法中的操作将被触发，你可以在这里处理所选日期的信息。在日期选择对话框中，用户可以通过滚动选择年份、月份和日期，然后点击 "确定" 按钮来确认选择。

以下是一个完整的示例，演示了如何使用日期选择对话框：

```java
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.DatePicker;
import androidx.fragment.app.DialogFragment;
import java.util.Calendar;

public class DatePickerFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // 获取当前日期
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        // 创建日期选择对话框
        DatePickerDialog datePickerDialog = new DatePickerDialog(getActivity(), dateSetListener, year, month, day);

        return datePickerDialog;
    }

    // 创建日期选择监听器
    private DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int selectedYear, int selectedMonth, int selectedDay) {
            // 在用户选择日期后执行的操作
            // selectedYear、selectedMonth 和 selectedDay 是用户选择的日期信息
        }
    };
}
```

这是一个基本的日期选择对话框示例，你可以根据需要自定义日期选择对话框的外观和行为。在实际应用中，你可以在用户选择日期后将所选日期用于相关功能，如保存用户的生日或约会时间。

