package life.givesomeone;

import javax.persistence.Id;

public class Request {

    @Id
    public String id;

    public String requestor;

    public Request() {}

    public Request(String requestor) {
        this.requestor = requestor;
    }

    public String getRequestor() {
        return requestor;
    }

    public void setRequestor(String requestor) {
        this.requestor = requestor;
    }

    @Override
    public String toString() {
        return "Request{" +
                "id='" + id + '\'' +
                ", requestor='" + requestor + '\'' +
                '}';
    }
}
