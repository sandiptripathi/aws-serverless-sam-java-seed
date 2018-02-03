package ${groupId}.function;

 import java.io.PrintWriter;
 import java.io.StringWriter;
 import com.amazonaws.services.lambda.runtime.Context;
 import com.amazonaws.services.lambda.runtime.RequestHandler;
 import ${groupId}.model.ServerlessInput;
 import ${groupId}.model.ServerlessOutput;

public class HelloWorld implements RequestHandler<ServerlessInput, ServerlessOutput> {
    @Override
    public ServerlessOutput handleRequest(ServerlessInput serverlessInput, Context context) {
        ServerlessOutput output = new ServerlessOutput();
        try {
            String content = "{ \"test\": \"hello body\"}";
            output.setStatusCode(200);
            output.setBody(content);
        } catch (Exception e) {
            output.setStatusCode(500);
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            output.setBody(sw.toString());
        }
        return output;
    }
}
