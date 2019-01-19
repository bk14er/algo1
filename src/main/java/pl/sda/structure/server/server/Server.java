package pl.sda.structure.server.server;

import pl.sda.structure.server.request.HttpRequest;
import pl.sda.structure.server.request.Request;
import pl.sda.structure.server.Response;

public abstract class Server<Req extends Request> {

    public Response handleRequest(Req request) {

        if(request instanceof HttpRequest){
            ///
        }

        return new Response("Response dla requesta" + request);
    }

}
