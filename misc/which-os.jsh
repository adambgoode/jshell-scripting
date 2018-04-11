// Which Operating system is in use?
// Usage: jshell --class-path ../libs/commons-lang3.jar which-os.jsh
import static java.lang.System.out;
import org.apache.commons.lang3.SystemUtils;

if (SystemUtils.IS_OS_WINDOWS) {
    out.println("You are using Windows.");
} else if (SystemUtils.IS_OS_LINUX) {
    out.println("You are using Linux.");
} else if (SystemUtils.IS_OS_MAC_OSX) {
    out.println("You are using macOS");
} else {
    out.println("You are using something truly special and amazing");
}

/exit