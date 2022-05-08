//Modify this file to change what commands output to your statusbar, and recompile using the make command.
static const Block blocks[] = {
	/*Icon*/	/*Command*/		/*Update Interval*/	/*Update Signal*/

	{"", "~/.local/bin/hosty", 0, 0},
	{"", "~/.local/bin/brightness", 180, 10},
	{"", "~/.local/bin/volume", 180, 10},
	{"", "~/.local/bin/temp", 1, 0},
	{"", "~/.local/bin/battery", 180, 0},
	{"", "~/.local/bin/datey", 60, 0},
};

//sets delimeter between status commands. NULL character ('\0') means no delimeter.
static char delim[] = " | ";
static unsigned int delimLen = 5;
