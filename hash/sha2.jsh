// jshell --add-modules java.xml.bind sha2.jsh
import java.security.MessageDigest
import java.nio.charset.StandardCharsets
import javax.xml.bind.DatatypeConverter;

// Hint: Never use a hash like SHA2 to store passwords
// use something like bcrypt, scrypt, PBKDF2 or don't store passwords

MessageDigest sha256 = MessageDigest.getInstance("SHA-256");        
byte[] sha256Hash = sha256.digest("JShell Scripting".getBytes(StandardCharsets.UTF_8));

System.out.println(DatatypeConverter.printHexBinary(sha256Hash));

/exit