// Base32 from string
// Usage: jshell --class-path ../libs/commons-codec.jar base32.jsh
import java.nio.charset.StandardCharsets
import org.apache.commons.codec.binary.Base32

String base32 = new Base32().encodeAsString("JShell Scripting".getBytes(StandardCharsets.UTF_8))

System.out.println(base32)

/exit