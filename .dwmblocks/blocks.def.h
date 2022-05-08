//Modify this file to change what commands output to your statusbar, and recompile using the make command.
static const Block blocks[] = {
	/*Icon*/	/*Command*/		/*Update Interval*/	/*Update Signal*/

	{"", "hosty", 0, 0},
	{"", "brightness", 180, 10},
	{"", "volume", 180, 10},
	{"", "temp", 1, 0},
	{"", "battery", 180, 0},
	{"", "datey", 60, 0},
};

//sets delimeter between status commands. NULL character ('\0') means no delimeter.
static char delim[] = " | ";
static unsigned int delimLen = 5;
