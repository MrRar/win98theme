"use strict";
const fs = require("fs");
let icons = fs.readdirSync("res/drawable-xxhdpi/");


for(var i in icons) {
	icons[i] = icons[i].slice(0,-4);
}


fs.writeFileSync("res/values/iconpack.xml",`<?xml version="1.0" encoding="utf-8"?>
<resources>
	<string-array name="icon_pack" translatable="false">
`);
for(var icon of icons) {
	fs.appendFileSync("res/values/iconpack.xml",`		<item>${icon}</item>
`);
}
fs.appendFileSync("res/values/iconpack.xml",`	</string-array>
</resources>`,"utf8");



fs.writeFileSync("res/xml/drawable.xml",`<?xml version="1.0" encoding="utf-8"?>
<resources>
    <version>1</version>
`);
for(var icon of icons) {
	fs.appendFileSync("res/xml/drawable.xml",`	<item drawable="${icon}" />
`);
}
fs.appendFileSync("res/xml/drawable.xml",`</resources>`,"utf8");