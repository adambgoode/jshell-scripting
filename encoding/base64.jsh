import static java.lang.System.out
import java.nio.charset.StandardCharsets

byte[] encoded = Base64.getEncoder().encode("JShell Scripting".getBytes(StandardCharsets.UTF_8))
out.println(new String(encoded))
byte[] decoded = Base64.getDecoder().decode(encoded)
out.println(new String(decoded, StandardCharsets.UTF_8))

/exit