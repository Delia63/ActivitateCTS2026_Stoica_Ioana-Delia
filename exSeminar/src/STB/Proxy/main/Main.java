package STB.Proxy.main;

import STB.Proxy.clase.Autobuz;
import STB.Proxy.clase.IAutobuz;
import STB.Proxy.clase.ProxyAutobuz;

public class Main {
    public static void main(String[] args) {
        IAutobuz autobuz1 = new Autobuz(102, "MAN", 10);
        autobuz1.oprireInStatie();
        System.out.println();

        ProxyAutobuz proxyAutobuz1 = new ProxyAutobuz(new Autobuz(101, "MAN", 0));
        proxyAutobuz1.oprireInStatie();
        System.out.println();
        ProxyAutobuz proxyAutobuz2 = new ProxyAutobuz(new Autobuz(44, "MAN", 5));
        proxyAutobuz2.oprireInStatie();
    }
}
