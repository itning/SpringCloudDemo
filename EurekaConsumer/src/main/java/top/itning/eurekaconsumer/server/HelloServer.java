package top.itning.eurekaconsumer.server;

/**
 * @author wangn
 */
public interface HelloServer {
    String hello(String msg);

    String helloFallBack(String msg);
}
