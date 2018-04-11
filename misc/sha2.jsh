// SHA2 from string
// Usage: jshell --class-path ../libs/commons-codec.jar sha2.jsh
import org.apache.commons.codec.digest.DigestUtils

// Hint: Never use a hash like SHA2 to store passwords
// use something like bcrypt, scrypt, PBKDF2 or don't store passwords

String sha256 = DigestUtils.sha256Hex("JShell Scripting")

System.out.println(sha256)

/exit