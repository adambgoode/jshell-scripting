// HTTP Client GET
// jshell --add-modules jdk.incubator.httpclient http-get.jsh
import jdk.incubator.http.*;

var client = HttpClient.newHttpClient();
var request = HttpRequest.newBuilder().uri(new URI("https://medium.com/adambgoode")).build();
var response = client.send(request, HttpResponse.BodyHandler.asString());
System.out.println(response.body());

/exit