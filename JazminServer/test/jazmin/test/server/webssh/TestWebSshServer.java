package jazmin.test.server.webssh;

import jazmin.core.Jazmin;
import jazmin.log.LoggerFactory;
import jazmin.server.console.ConsoleServer;
import jazmin.server.webssh.WebSshServer;

/**
 * 
 * @author yama
 *
 */
public class TestWebSshServer {
	//
	public static void main(String[] args) {
		LoggerFactory.setLevel("DEBUG");
		WebSshServer server=new WebSshServer();
		server.setPort(6666);
		Jazmin.addServer(server);
		Jazmin.addServer(new ConsoleServer());
		Jazmin.start();
	}
}
