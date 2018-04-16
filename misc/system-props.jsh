// Pass arguments via system properties
// jshell -v -R-Dfile=test.txt system-props.jsh

String fileName = System.getProperty("file")
System.out.println("Input file name is: " + fileName)

/exit
