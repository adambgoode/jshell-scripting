// Create and delete directories
// Usage: jshell --class-path ../libs/commons-io.jar work-with-directories.jsh
import org.apache.commons.io.FileUtils

String content = "JShell Scripting";
File file = new File("test.txt");

// Create text file
FileUtils.writeStringToFile(file, content);

// Move text file to newly created folder
File folder = new File("folder")
FileUtils.moveToDirectory(file, folder, true)

// Delete the new Folder again
FileUtils.deleteDirectory(folder)


/exit
