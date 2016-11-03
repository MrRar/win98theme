# Win98 theme
![Win98 Theme](https://github.com/mrrar/win98theme/screenshot.png "Win98 Theme!")
[download apk](https://github.com/mrrar/win98theme/master.zip)
## contributing guide lines
### icons
#### size
The icons should be 32 pixels or 48 pixels icons. They should be up scaled to 144 pixels in size.
However 144/32=4.5, so when 32 pixels icons are up scaled to 144 pixels, its pixels are not all perfectly sized.
48 pixel icons are much better as 144/48=3. So if you have a choice go with the 48 pixel icon.
Please don't use 16 pixel icons as they are to small.
#### color depth
The target of this theme is 4bit color, but in the case where no 4bit color icon is available 8bit or mono chrome color icons would be acceptable.
#### content
This theme uses windows 98 icons for most icons but any 90s icons from windows programs are acceptable.
Use icons that match the target application.
In some cases if the application is a 90s Windows program and a modern Android app, you can simply use the application's old 90s icon.
For example Word and Excel.
You can also use an icon that has a similar function or is related to the application you are using it for.
For example the all programs icon is used for the apps button, the Netscape icon is used for Firefox and the IE icon is used for Chrome.
Make sure that the icon you use is unique and not used for any other app.
Only assign icons to very popular apps.
### the app
#### functionality
The app should be easy to use, useful, and non-bloated. 
#### style
Please don't use material design in the app or any other modern design. 
Instead use basic UI or preferably something Windows 98ish.
### make icon lists
If you run `make_icon_lists.js` via node.js it will generate icon lists `drawable.xml` and `iconpack.xml` based on all the icons in the `drawable-xxhdpi` folder.
If you have a windows computer with node.js installed you can merely run `make icon lists.bat`.
Else you can add icons to the two lists manually.