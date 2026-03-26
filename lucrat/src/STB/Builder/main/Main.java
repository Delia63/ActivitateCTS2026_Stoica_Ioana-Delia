package STB.Builder.main;

import STB.Builder.clase.AutobuzBuilder;
import STB.Builder.clase.AutobuzLinie;

public class Main {
    static void main(String[] args) {
        AutobuzBuilder builder = new AutobuzBuilder();
        AutobuzLinie autobuz1 = builder.build("MAN","Luca");
        AutobuzLinie autobuz2 = builder.setDeschideUsiAutomat(true).setOpresteLaCapat(true).build("MAN","Maria");

        System.out.println(autobuz1);
        System.out.println(autobuz2);


    }
}
