// Bytes to hex
// Usage: jshell --class-path ../libs/commons-codec.jar hex.jsh
import java.nio.charset.StandardCharsets
import org.apache.commons.codec.binary.Hex

String hex = Hex.encodeHexString("JShell Scripting".getBytes(StandardCharsets.UTF_8));
System.out.println(hex)

/exit