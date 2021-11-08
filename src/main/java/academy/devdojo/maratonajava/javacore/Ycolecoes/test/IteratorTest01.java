package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {

    public static void main(String[] args) {
        List<Framework> FrameworkJS = new LinkedList<>();
        FrameworkJS.add(new Framework(1L,"React Native",2.22,1));
        FrameworkJS.add(new Framework(2L,"Vue",3.21,1));
        FrameworkJS.add(new Framework(3L,"Next",12.2,1));
        FrameworkJS.add(new Framework(4L,"Angular",8.12,0));
        FrameworkJS.add(new Framework(5L,"TypeScript",3.22,0));

//        Iterator<Framework> frameworkIterator = FrameworkJS.iterator();
//        while(frameworkIterator.hasNext()){
//            Framework framework = frameworkIterator.next();
//            if (framework.getQuantidade() == 0){
//                frameworkIterator.remove();
//            }
//        }
//        System.out.println(FrameworkJS);

        FrameworkJS.removeIf(framework -> framework.getQuantidade() == 0);

        System.out.println(FrameworkJS);
    }
}
