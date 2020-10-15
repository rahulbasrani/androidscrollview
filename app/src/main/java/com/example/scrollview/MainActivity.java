package com.example.scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView mTitleWindow=(TextView)findViewById(R.id.titleWindow);
        TextView mMessageWindow=(TextView)findViewById(R.id.messageWindow);

        StringBuilder stringBuilder=new StringBuilder();

        String someMessage ="Button\n" +
                "Represents a push-button widget that registers when the screen is touched within its bounds.\n" +
                "\n" +
                "ToggleButton\n" +
                "Displays checked/unchecked (or on/off) states using a light indicator.\n" +
                "\n" +
                "CheckBox\n" +
                "A special type of button with a check mark graphic and description text that has two states: checked or unchecked.\n" +
                "RadioButton\n" +
                "The RadioButton has two states: either checked or unchecked. A RadioGroup is used to group one or more RadioButton views, thereby allowing only one RadioButton to be checked within the RadioGroup.\n" +
                "\n" +
                "CheckedTextView\n" +
                "This is basically a TextView that can be checked and is sometimes used in a ListView.\n" +
                "\n" +
                "Spinner\n" +
                "A drop-down menu is called spinner. The SpinnerView displays one item at a time from a list and enables users to choose from them.\n" +
                "\n" +
                "ProgressBar\n" +
                "ProgressBar (Horizontal)\n" +
                "The ProgressBar provides visual feedback about some ongoing tasks, such as when you are performing a task in the background. For example, you might be uploading or downloading a file from the web and need to update the user about the status of the upload or download. In this case, the ProgressBar view is a good choice.\n" +
                "\n" +
                "SeekBar\n" +
                "SeekBar is a user-modifiable ProgressBar. It allows the user to choose a value along a continuous range by sliding a \"thumb\" along a horizontal line. For example, to set the current cursor position in a playing media file or to tweak a volume setting.\n" +
                "\n" +
                "SeekBar (Discrete)\n" +
                "It is just a theme to show the tickbar in SeekBar.\n" +
                "\n" +
                "QuickContactBadge\n" +
                "This view allows you to easily display a contact that can handle various actions when tapped (such as email, text, call, and so on).\n" +
                "\n" +
                "RatingBar\n" +
                "The RatingBar show ratings or getting a rating from a user. By default, this progress bar uses the star paradigm, with five stars by default. A user can drag across this horizontal to set a rating.\n" +
                "\n" +
                "Switch\n" +
                "The Switch has two possible states that can be read and responded to. An obvious use for the Switch widget would be to show and hide something.\n" +
                "\n" +
                "Space\n" +
                "This is a very simple class, the sole purpose of which is to create gaps within layouts.\n" +
                "\n" +
                "Text\n" +
                "Contains predefined text views for different types of text inputs such as label (TextView), password, date, time, number, and e-mail.\n" +
                "\n" +
                "TextView\n" +
                "The TextView is used to display text to the users and this text information can't be edited by the users. This is the most basic view and one that you will frequently use when you develop Android applications." +
                "AutoCompleteTextView\n" +
                "The AutoCompleteTextView is a subclass of EditText, it automatically shows a list of completion suggestions while the user is typing.\n" +
                "\n" +
                "MultiAutoCompleteTextView\n" +
                "There are two forms of autocomplete. One is the more standard style of filling in the entire text entry based on what the user types. If the user begins typing a string that matches a word in a list, the user can choose to complete the word with just a tap. This is done through the AutoCompleteTextView control.\n" +
                "\n" +
                "The second method allows the user to enter a list of items, each of which has autocomplete functionality. These items must be separated in some way by providing a separator (i.e. comma) to the MultiAutoCompleteTextView object that handles this method.\n" +
                "\n" +
                "Layouts\n" +
                "ConstraintLayout\n" +
                "In 2016, Google introduced ConstraintLayout as an alternative to LinearLayout and RelativeLayout. ConstraintLayout requires to use a library and it adds approximately 100KB to the size of your Android app.\n" +
                "\n" +
                "GridLayout\n" +
                "In 2011, Google added GridLayout to setting up complex Android layouts a bit easier. As the name suggests, this class allows child views to be arranged in a grid layout.\n" +
                "\n" +
                "The GridLayout class is optimized specifically for creating grid UI design using a minimal amount of system memory, and can render both horizontal UI element and vertical UI element alignment at the same time in the same UI.\n" +
                "\n" +
                "FrameLayout\n" +
                "The FrameLayout layout is a placeholder on screen that you can use to display a single view. If multiple child views are added they will, by default, appear on top of each other positioned in the top left hand corner of the layout area.\n" +
                "\n" +
                "LinearLayout (Horizontal)\n" +
                "LinearLayout (Vertical)\n" +
                "LinearLayout(Horizontal) and LinearLayout(Vertical) are actually the same layout with one property changed. The LinearLayout arranges views in a single column or a single row depending on the orientation selected.\n" +
                "\n" +
                "RelativeLayout\n" +
                "The RelativeLayout layout enables you to specify how child views are positioned relative to each other. Each view embedded within the RelativeLayout has attributes that enable it to align with another view.\n" +
                "\n" +
                "TableLayout\n" +
                "The TableLayout Layout groups views into rows and columns. You use the <TableRow> element to designate a row in the table. Each row can contain one or more views. Each view you place within a row forms a cell. The width of each column is determined by the largest width of each cell in that column.\n" +
                "\n" +
                "TableRow\n" +
                "The purpose of the TableLayout container view is to allow user interface elements to be organized on the screen in a table format consisting of rows and columns. Each row within a TableLayout is occupied by a TableRow instance, which, in turn, is divided into cells, with each cell containing a single child view (which may itself be a container with multiple view children).\n" +
                "\n" +
                "<fragment>\n" +
                "A fragment is a self-contained, modular section of your app's user interface that you embed inside an activity. You cannot instantiate a fragment as a standalone application element. Think of a fragment as a kind of sub activity that has its own life cycle, behavior, and its own user interface. When you drag <fragment> from the palette, the Android Studio shows a Classes dialog box which holds the available fragments classes:\n" +
                "\n" +
                "DialogFragment\n" +
                "Floats on top of an activity, useful when you need to obtain the user's response before continuing with execution.\n" +
                "\n" +
                "ListFragment\n" +
                "Contains a ListView which displays a list of items from a data source.\n" +
                "\n" +
                "PreferenceFragment\n" +
                "Provide preferences for users to personalize the application.\n" +
                "\n" +
                "WebViewFragment\n" +
                "Hosts a WebView control to easily render Web content.\n" +
                "\n" +
                "Containers\n" +
                "RadioGroup\n" +
                "Multiple radio buttons can be grouped together into a RadioGroup, which allows only one radio button of the group to be selected at a time.\n" +
                "\n" +
                "ListView\n" +
                "To display a list of items, Android provides ListView and Spinner. The ListView displays a long list of items in a vertically scrolling list.\n" +
                "\n" +
                "GridView\n" +
                "The GridView shows items in a two-dimensional scrolling grid. You can use the GridView together with an ImageView to display a series of images.\n" +
                "\n" +
                "ExpandableListView\n" +
                "ExpandableListView is a subclass of ListView, that supports a two-level list hierarchy: lists and sub-lists. ExpandableListActivity allows an item within a list to expand and present a sub-list of items.\n" +
                "\n" +
                "ScrollView\n" +
                "A ScrollView is a special type of FrameLayout in that it enables users to scroll through a list of views that occupy more space than the physical display. The ScrollView can contain only one child view or ViewGroup, which normally is a LinearLayout.\n" +
                "\n" +
                "HorizontalScrollView\n" +
                "Android also has HorizontalScrollView, which works like ScrollView... just horizontally.\n" +
                "\n" +
                "TabHost\n" +
                "A TabHost is a container for a tabbed window view, where each tab can contain a View (such as a layout / container) and the user selects a tab to see its contents.\n" +
                "\n" +
                "Note: A tabbed window consists of a TabActivity (deprecated) and a TabHost. In most cases using tabs in the app bar (or action bar) would be preferable.\n" +
                "\n" +
                "WebView\n" +
                "The WebView enables you to embed a web browser in your activity. This is very useful if your application needs to embed some web content, such as maps from some other providers, and so on. The following Try It Out shows how you can programmatically load the content of a web page and display it in your activity.\n" +
                "\n" +
                "SearchView\n" +
                "In Android 3.0, Google introduced the SearchView, which can be included as a menu item when creating a menu. With this view, an expandable search area can easily be added to the app bar (action bar).\n" +
                "\n" +
                "ViewPager\n" +
                "The ViewPager helps developers to design a multi-panel side-to-side swipeable horizontal UI that allows users to flip between different View objects. Later, you'll learn, how to create a slideshow using the ViewPager.\n" +
                "\n" +
                "Images\n" +
                "ImageButton\n" +
                "Works similar to the Button view, except that it also displays an image. The ImageButton class is a subclass of the ImageView class.\n" +
                "\n" +
                "ImageView\n" +
                "The ImageView is a view that shows images on the device screen.\n" +
                "\n" +
                "VideoView\n" +
                "VideoView helps you to display videos on the device screen. The VideoView class has a wide range of methods to manage the playback of video.\n" +
                "\n" +
                "Date\n" +
                "TimePicker\n" +
                "The TimePicker view enables users to select a time of the day, in either 24-hour mode or AM/PM mode.\n" +
                "\n" +
                "DatePicker\n" +
                "Using the DatePicker view widget, users can select any date conveniently from the activity.\n" +
                "\n" +
                "CalendarView\n" +
                "This view, added in API Level 11, lets you easily display dates to users and allow them to select dates.\n" +
                "\n" +
                "Chronometer\n" +
                "This view inherits from TextView and encapsulates the functionality of a running clock. For example, denoting elapsed time of some operation.\n" +
                "\n" +
                "TextClock\n" +
                "This view, added in API Level 17, is a compact text display of the current time in standard numeric format. It is a TextView, allows you to format the display of the date and/or time. In addition, the TextClock allows you to display the time in 12-hour mode or 24-hour mode and even allows you to set the time zone.\n" +
                "\n" +
                "Transitions\n" +
                "ImageSwitcher\n" +
                "We use ImageView to display an image. However, sometimes we don't want an image to appear abruptly when the user opens the view. For example, we might want to apply some animation to an image when it transitions from one image to another. In this case, we need to use the ImageSwitcher.\n" +
                "\n" +
                "AdapterViewFlipper\n" +
                "AdapterViewFlipper works like a ViewFlipper, allowing you to toggle between various children with only one visible at a time. However, whereas with ViewFlipper all children are fully-instantiated View objects held by the ViewFlipper parent, AdapterViewFlipper uses the Adapter model, so only a small number of actual View objects are held in memory, no matter how many potential children there are.\n" +
                "\n" +
                "StackView\n" +
                "StackView is an AdapterView. It was added in API Level 11 to provide a \"stack of cards\" UI. Just as ListView shows a handful of rows, StackView shows a handful of swipeable cards.\n" +
                "\n" +
                "TextSwitcher\n" +
                "Switches between two TextViews. This is really just a ViewSwitcher with a few helper methods.\n" +
                "\n" +
                "ViewAnimator\n" +
                "Base class for a FrameLayout, switches among views, using an animation.\n" +
                "\n" +
                "ViewFlipper\n" +
                "Simple ViewAnimator that will animate between two or more views that have been added to it. Only one child is shown at a time. If requested, can automatically flip between each child at a regular interval.\n" +
                "\n" +
                "ViewSwitcher\n" +
                "Another ViewAnimator that contains only two child views and only one of those is shown at a time. It switches between the two, animating as it does so. Primarily, the ImageSwitcher and TextSwitcher objects are used.\n" +
                "\n" +
                "Advanced\n" +
                "<include>\n" +
                "Allows you to encapsulate a widget or a collection of widgets that you want to reuse across multiple layout XML resources. Simply create a dedicated layout XML resource that contains the widgets to reuse, then add them to your main layouts via an <include>.\n" +
                "\n" +
                "<requestFocus>\n" +
                "You can give a widget focus via requestFocus. For example, a Button has a <requestFocus> child element, indicating to Android that this widget should get the focus first when display the launcher activity.\n" +
                "\n" +
                "<view>\n" +
                "It is the basic building block for user interface. A view occupies a rectangular area on the screen and is responsible for drawing and event handling. A view is used for drawing a shape like circle, rectangle, or ovals etc.\n" +
                "\n" +
                "ViewStub\n" +
                "Allows you to add views to a layout during runtime as they are needed, rather than building them directly into your layouts.\n" +
                "\n" +
                "TextureView\n" +
                "Introduced in API level 14. TextureView is used for displaying hardware-accelerated content streams such as video or OpenGL. The TextureView is similar to the SurfaceView but carries the distinction of being tied directly to hardware acceleration.\n" +
                "\n" +
                "SurfaceView\n" +
                "The SurfaceView is used when rendering custom visuals to the screen, primarily for content that is frequently changing. Basic or simple games can use SurfaceView to display the graphics with efficiency.\n" +
                "\n" +
                "NumberPicker\n" +
                "It is very similar to the TimePicker. NumberPicker allow users to choose a number from a pre-defined range.\n" +
                "\n" +
                "Google\n" +
                "AdView\n" +
                "The View to display banner ads.\n" +
                "\n" +
                "MapView\n" +
                "Displays a location with Google Maps.\n" +
                "\n" +
                "Design\n" +
                "CoordinatorLayout\n" +
                "CoordinatorLayout is a subclass of FrameLayout, designed specifically for coordinating the appearance and behavior of the app bar (action bar) across the top of an application screen with other view elements.\n" +
                "\n" +
                "AppBarLayout\n" +
                "App Bar displays the title for the activity on one side and an overflow menu on the other. AppBarLayout is a vertical LinearLayout which implements many of the features of material designs app bar concept, namely scrolling gestures.\n" +
                "\n" +
                "TabLayout\n" +
                "TabLayout provides a horizontal layout to display tabs.\n" +
                "\n" +
                "TabItem\n" +
                "Allows you to add items to Tablayout\n" +
                "\n" +
                "NestedScrollView\n" +
                "It is just like ScrollView, but it supports acting as both a nested scrolling parent and child on both new and old versions of Android.\n" +
                "\n" +
                "FloatingActionButton\n" +
                "Floating action button, or FAB, is round button, usually floating towards the bottom of the screen over top of the main UI.\n" +
                "\n" +
                "TextInputLayout\n" +
                "It is a way of implementing the floating label pattern. It is a ViewGroup, wrapped around the EditText that provides the floating label pattern. For example, it is useful to show hint or error if the user enters the invalid value.\n" +
                "\n" +
                "AppCompat\n" +
                "AppCompat is a support library that emulates many of the features of later versions of Android on earlier versions. Using the support library provides the greatest device compatibility as it allows the use of latest features on older versions of the Android OS. For example, a navigation drawer view, floating labels for EditText, floating action button (FAB), snackbar, CoordinatorLayout and AppBarLayout, the Toolbar instead of the Action Bar, the RecyclerView instead of the ListView, etc.\n" +
                "\n" +
                "CardView\n" +
                "A FrameLayout with rounded corner card-like appearance. It is one of the most recognizable material design components.\n" +
                "\n" +
                "GridLayout\n" +
                "As the name suggests, this class allows child views to be arranged in a grid layout.\n" +
                "\n" +
                "RecyclerView\n" +
                "In 2014, Google released RecyclerView. It is much like the ListView class, the purpose of the RecyclerView is to allow information to be presented to the user in the form of a scrollable list. The RecyclerView, however, provides a number of advantages over the ListView. The RecyclerView and CardView work together to provide scrollable lists of information to the user in which the information is presented in the form of individual cards.";

            stringBuilder.append(someMessage);


        mMessageWindow.setText(stringBuilder.toString());
    }
}