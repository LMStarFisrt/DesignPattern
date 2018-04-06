package com.java.designpattrn.pattern.chain.ex3;

/**
 * @author 10308
 * @date 2018/4/6
 */
public abstract class Handler {

    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected abstract Level getHandlerLevel();

    protected abstract Response echo(Request request);

    public final Response handleMessage(Request request) {
        Response response = null;
        if (this.getHandlerLevel().equals(request.getRequestLevel())) {
            response = this.echo(request);
        } else {
            if (this.nextHandler != null) {
                response = this.nextHandler.echo(request);
            } else {

            }
        }
        return response;
    }
}
